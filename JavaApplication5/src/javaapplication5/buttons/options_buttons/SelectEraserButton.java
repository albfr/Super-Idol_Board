package javaapplication5.buttons.options_buttons;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class SelectEraserButton extends JButton {
   public SelectEraserButton() {
      // this.setSize(50, 50);
      this.setBackground(Color.lightGray);
      this.setText("Select Eraser");
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}