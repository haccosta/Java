import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeituraEntradaTecladoUtil {

    private InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    private BufferedReader entradaDados;

    public String lerDadosTextoTeclado(String nomeCampo){
        this.entradaDados = new BufferedReader(this.inputStreamReader);
        try {
            return entradaDados.readLine();
        } catch (IOException e) {
            throw new IllegalArgumentException("Erro no preenchimento do " + nomeCampo);
        }
    }

    public int lerDadosInteiroTeclado(String nomeCampo){
        this.entradaDados = new BufferedReader(this.inputStreamReader);
        try {
            return Integer.parseInt(entradaDados.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Formato inteiro invalido do " + nomeCampo);
        } catch (IOException e) {
            throw new IllegalArgumentException("Erro no preenchimento do " + nomeCampo);
        }
    }

    public float lerDadosFloatTeclado(String nomeCampo){
        this.entradaDados = new BufferedReader(this.inputStreamReader);
        try {
            return Float.parseFloat(entradaDados.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Formato float invalido do " + nomeCampo);
        } catch (IOException e) {
            throw new IllegalArgumentException("Erro no preenchimento do " + nomeCampo);
        }
    }
}
