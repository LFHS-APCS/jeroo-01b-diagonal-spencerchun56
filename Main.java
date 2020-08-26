/**
 * Write code in runJerooCode() to have a single Jeroo 
 * put a flower at (0,0), (1,1), (2,2) and (3,3).
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *      turn(LEFT)
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        new JerooGUI();
        runJerooCode();
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
     Jeroo spencer= new Jeroo(0,0,SOUTH,5);
  spencer.plant();
  spencer.hop();
  spencer.turn(LEFT);
  spencer.hop();
  spencer.plant();
  spencer.hop();
  spencer.turn(RIGHT);
  spencer.hop();
  spencer.plant();
  spencer.hop();
  spencer.turn(LEFT);
  spencer.hop();
  spencer.plant();
  spencer.hop();
    }

}
