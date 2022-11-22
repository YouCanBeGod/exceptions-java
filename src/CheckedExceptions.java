import javax.swing.*;
import java.io.*;

public class CheckedExceptions {

    public static void main(String[] args) {
        String nomeDoArquivo = "romancesblake-crouch.txt";

        try {
            imprimirArquivoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo. " + e.getCause());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, entre em contato com o suporte! " + e.getCause());
            e.printStackTrace();
        }

        System.out.println("Apesar da exeption o programa continua...");
    }

    public static void imprimirArquivoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line= br.readLine();
        } while (line !=null);
        bw.flush();
        bw.close();
    }
}
