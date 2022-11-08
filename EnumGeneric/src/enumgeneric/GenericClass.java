/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumgeneric;

/**
 *
 * @author Asus
 */
public class GenericClass<T> {
    // variable of T type
  private T data;

  public GenericClass(T data) {
    this.data = data;
  }
  // method that return T type variable
  public T getData() {
    return this.data;
  }
}
