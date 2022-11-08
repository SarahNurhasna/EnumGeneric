/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumgeneric;

/**
 *
 * @author Asus
 */
public class EnumTest {
    enum Size {
      SMALL,
      MEDIUM,
      LARGE
  }
  public static void main(String[] args) { 
    
    Size mySize = Size.SMALL;

    switch(mySize) {
      case SMALL:
        System.out.println("My clothes size is small");
        break;
      case MEDIUM:
         System.out.println("The color is medium");
        break;
      case LARGE:
        System.out.println("The color is large");
        break;
    }
  }    
}
