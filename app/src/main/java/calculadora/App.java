/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculadora;

public class App {
    

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println("CALCULADORA BÁSICA");
        System.out.println("------------------");

        System.out.println("2+3="+c.suma(2, 3));
    }
}
