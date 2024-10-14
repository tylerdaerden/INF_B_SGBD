import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {

    public static Logger logger = Logger.getLogger("be.iramps.calculator");

    public static int addition(int nombre1, int nombre2) {
        return nombre1 + nombre2;
    }

    public static int soustraction(int nombre1, int nombre2) {
        return nombre1 - nombre2;
    }

    public static int multiplication(int nombre1, int nombre2) {
        return nombre1 * nombre2;
    }

    public static int division(int nombre1, int nombre2) {
        return nombre1 / nombre2;
    }

    public static void fuzzyMonkey(int base, int nbreIteration, int limiteMin, int limiteMax) {
        int operation = 0;
        int nombre2 = 0;
        for (int i = 0; i < nbreIteration; i++) {
            operation = (int) (Math.random() * 4 + 1);
            nombre2 = (int) (Math.random() * limiteMax + limiteMin);
             nombre2 = (int) (Math.random() * limiteMax + limiteMin);
             logger.log(Level.FINE,"Parametres utilises pour fuzzyMonkey: " + operation + " " + "toutletutti" );
            //  System.out.println(new StringBuilder("Parametres utilises pour fuzzyMonkey: ").append("Operation type:").append(operation)
            //  .append(" Nombre 1: ").append(base)
            //  .append(" Nombre 2:").append(nombre2)
            //  .append(" Minimum:").append(limiteMin)
            //  .append(" Maximum: ").append(limiteMax)
            //  );
            switch (operation) {
                case 1:
                    Calculator.addition(base, nombre2);
                    break;
                case 2:
                    Calculator.soustraction(base, nombre2);
                    break;
                case 3:
                    Calculator.multiplication(base, nombre2);
                    break;
                case 4:
                    Calculator.division(base, nombre2);
                    break;
            }
        }
    }
}



