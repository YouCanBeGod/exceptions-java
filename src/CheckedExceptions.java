import java.io.*;

public class CheckedExceptions {

    public static void main(String[] args) throws IOException {
        String nomeDoArquivo = "romances-blake-crouch.txt";
        imprimirArquivoConsole(nomeDoArquivo);

        System.out.println("Apesar da exeption ou não, o programa continua...");
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
