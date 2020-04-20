import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.List;

public class sla {
    public String criptografar(String texto) {
        List<Character> alfabeto = alfabeto();
        String[] chars_texto = texto.toLowerCase().toCharArray();

        System.out.println(alfabeto);
        System.out.println(chars_texto);
//        int index, index_criptografado;
//        String texto_criptografado = null;
//
//        for(String letra :chars_texto){
//            index = alfabeto.indexOf(letra);
//            if(index != -1) {
//                if (index + 3 > alfabeto.size() - 1) {
//                    index_criptografado = index - (alfabeto.size() - 1);
//                } else index_criptografado = index + 3;
//
//                texto_criptografado += alfabeto.get(index_criptografado);
//            }
//            else texto_criptografado += letra;
//        }
        String a;
        a = null;
        return a;
    }

    private List<Character> alfabeto(){
        List<Character> alfabeto = new ArrayList<>();

        // Gera o alfabeto pela tabela ASCII
        for(char ch = 'a'; ch <= 'z'; ch++){
            alfabeto.add(Character.valueOf(ch));
        }

        return alfabeto;
    }
}
