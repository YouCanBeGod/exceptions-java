package TratamentoExceptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {

    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2!= 0) throw new DivisaoNaoExataExcetion("Divisão não exata", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataExcetion e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Não é possível realizar divisão por 0. ");
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Existem mais denominadores que numeradores.");
            }
        }

        System.out.println("O programa continua..");

    }
}


