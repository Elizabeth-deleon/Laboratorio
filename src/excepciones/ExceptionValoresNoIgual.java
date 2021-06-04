package excepciones;

/**
 *
 * @author Grupo#3
 */
public class ExceptionValoresNoIgual extends RuntimeException{
    private static final long serialVersionUID = 990731230389028792L;

    public ExceptionValoresNoIgual(String message) {
        super(message);
    }    
}
