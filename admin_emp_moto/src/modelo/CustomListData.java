package modelo;

import java.awt.Color;

public class CustomListData
    {
        private Color circleColor;
        private int newMessages;
        private String name;

        public CustomListData ( Color circleColor, int newMessages, String name )
        {
            super ();
            this.circleColor = circleColor;
            this.newMessages = newMessages;
            this.name = name;
        }

        public Color getCircleColor ()
        {
            return circleColor;
        }

        public int getNewMessages ()
        {
            return newMessages;
        }

        public String getName ()
        {
            return name;
        }
    }
