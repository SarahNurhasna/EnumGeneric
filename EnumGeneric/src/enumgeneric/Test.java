/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumgeneric;

/**
 *
 * @author Asus
 */
public class Test {
  public static void main(String[] args) { 
    //Print Enum
    Enum mySize = Enum.SMALL;

    switch(mySize) {
      case SMALL:
        System.out.println("My clothes size is small");
        break;
      case MEDIUM:
         System.out.println("My clothes size is medium");
        break;
      case LARGE:
        System.out.println("My clothes size is large");
        break;
    }
    
   //Print Generic Class
    GenericClass<Integer> intObj = new GenericClass<>(38);
    System.out.println("My shoes size is " + intObj.getData());

    GenericClass<String> stringObj = new GenericClass<>("Blue");
    System.out.println("My favorite color is " + stringObj.getData());
    
    //Print Generic Method
    GenericMethods tes = new GenericMethods();
    tes.<String>genericMethod("Sarah Nurhasna Khairunnisa");
  }
}    

