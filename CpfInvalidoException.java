
public class CpfInvalidoException extends Exception {

    public String getMessage() {
        return "\nCPF deve ter 11 dígitos";
    }
}
