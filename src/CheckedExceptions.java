import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

public class CheckedExceptions {

    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-couch.txt";
        imprimirArquivoConsole(nomeDoArquivo);

        System.out.println("Apesar da exeption ou não, o programa continua...");
    }

    public static void imprimirArquivoConsole(String nomeDoArquivo) {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(System.out);

        do {
            bw.write(line);
            bw.newLine();
            line= br.readLine();
        } while (line !=null);
        bw.flush();
        bw.close();
    }
}
