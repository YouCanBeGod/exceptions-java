import javax.swing.*;
import java.io.*;

public class CheckedExceptions {

    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-crouch.txt";

        try {
            imprimirArquivoConsole(nomeDoArquivo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo." + e.getCause());
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
