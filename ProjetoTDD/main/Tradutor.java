import java.util.HashMap;
import java.util.Map;

public class Tradutor {
    
    private HashMap<String, String> traducoes = new HashMap<String, String>() {};

    public String traduzir(String palavra) {
        return traducoes.get(palavra);
    }
    
    public void adicionarTraducao(String palavra, String traducao) {
        traducoes.put(palavra, traducao);
    }

    public boolean estaVazio() {
        return traducoes.isEmpty();
    }
    
    public void limparDicionario() {
        
    }
}