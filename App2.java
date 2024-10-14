import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App2 {
    
    public static void main(String[] args) throws Exception 
    {
        Logger logger = Logger.getLogger("be.iramps.calculator");
        logger.setLevel(Level.FINE);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);
        Calculator.fuzzyMonkey(5, 100, 0, 5);
    }
}
