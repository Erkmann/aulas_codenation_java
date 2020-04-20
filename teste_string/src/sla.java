import java.util.ArrayList;
import java.util.List;

public class sla {

    public static void main(String[] args) {
        System.out.println(criptografar("eu nao sei x 1"));
    }

    public static String criptografar(String texto) {
        if (texto != "") {
            List<Character> alfabeto = alfabeto();
            char[] chars_texto = texto.toLowerCase().toCharArray();
            int index, index_criptografado;
            String texto_criptografado = "";

            for (char letra : chars_texto) {
                index = alfabeto.indexOf(letra);
                if (index != -1) {
                    if (index + 3 > alfabeto.size() - 1) {
                        index_criptografado = (index + 3) - (alfabeto.size() - 1);
                    } else index_criptografado = index + 3;

                    texto_criptografado += alfabeto.get(index_criptografado);
                } else texto_criptografado += letra;
            }

            return texto_criptografado;
        }
        else throw new IllegalArgumentException("Cannot be null!");
    }

    private static List<Character> alfabeto(){
        List<Character> alfabeto = new ArrayList<>();

        // Gera o alfabeto pela tabela ASCII
        for(char ch = 'a'; ch <= 'z'; ch++){
            alfabeto.add(Character.valueOf(ch));
        }

        return alfabeto;
    }

}
