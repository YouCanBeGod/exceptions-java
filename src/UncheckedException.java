import javax.swing.*;

public class UncheckedException {

    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            //Imprimindo mensagem de orientação + mensagem do erro (nem sempre recomendado)
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
            //e.printStackTrace(); //caso queira imprimir StackTrace
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
        } finally {
            System.out.println("Chegou no finally"); //Opcional
        }

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
