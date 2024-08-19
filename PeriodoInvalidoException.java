public class PeriodoInvalidoException extends Exception {
    public String getMessage() {
        return "\nO periodo esta igual a zero, erro corrigir periodo";
    }
}
