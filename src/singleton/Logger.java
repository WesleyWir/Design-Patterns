package singleton;

/**
 *
 * @author wesle
 */
public class Logger {
    private static Logger instance;
    public String mensagem;
    
    private Logger(){
        // TODO
        System.out.println("Instance");
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        
        return instance;
    }
    
    public void printar(String message){
        System.out.println(message);
    }
}
