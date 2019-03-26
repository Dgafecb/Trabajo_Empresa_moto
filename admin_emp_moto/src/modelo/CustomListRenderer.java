package modelo;

import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.SwingUtilities;

public class CustomListRenderer extends DefaultListCellRenderer{
    
    private static final ImageIcon crossIcon = new ImageIcon ( CustomListRenderer.class.getResource ( "back.png" ) );


    private CustomLabel renderer;


    public CustomListRenderer ( final JList list )
    {
        super();
        renderer = new CustomLabel ();

        list.addMouseListener ( new MouseAdapter ()
        {
            @Override
            public void mouseReleased ( MouseEvent e )
            {
                if ( SwingUtilities.isLeftMouseButton ( e ) )
                {
                    int index = list.locationToIndex ( e.getPoint () );
                    if ( index != -1 && list.isSelectedIndex ( index ) )
                    {
                        Rectangle rect = list.getCellBounds ( index, index );
                        Point pointWithinCell = new Point ( e.getX () - rect.x, e.getY () - rect.y );
                        Rectangle crossRect = new Rectangle ( rect.width - 9 - 5 - crossIcon.getIconWidth () / 2,
                                rect.height / 2 - crossIcon.getIconHeight () / 2, crossIcon.getIconWidth (), crossIcon.getIconHeight () );
                        if ( crossRect.contains ( pointWithinCell ) )
                        {
                            DefaultListModel model = ( DefaultListModel ) list.getModel ();
                            model.remove ( index );
                        }
                    }
                }
            }
        } );
    }

    /**
     * Returns custom renderer for each cell of the list.
     *
     * @param list         list to process
     * @param value        cell value (CustomData object in our case)
     * @param index        cell index
     * @param isSelected   whether cell is selected or not
     * @param cellHasFocus whether cell has focus or not
     * @return custom renderer for each cell of the list
     */
    @Override
    public Component getListCellRendererComponent ( JList list, Object value, int index, boolean isSelected, boolean cellHasFocus )
    {
        renderer.setSelected ( isSelected );
        renderer.setData ( ( CustomData ) value );
        return renderer;
    }

}
