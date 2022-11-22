package TratamentoExceptions;

public class DivisaoNaoExataExcetion extends Exception {

    private final int NUMERADOR;
    private final int DENOMINADOR;

    public DivisaoNaoExataExcetion(String message, int numerador, int denominador) {
        super(message);
        this.NUMERADOR = numerador;
        this.DENOMINADOR = denominador;
    }
}
