import java.util.HashMap;

public class Words {
    public static void main(String[] args) {
        String[] words = {"Дуб", "Клен", "Липа", "Дуб", "Береза", "Дуб", "Дуб", "Тополь", "Клен", "Дуб", "Тополь", "Липа"};
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            Integer word = hm.get(words[i]);
            hm.put(words[i], word == null ? 1 : word + 1);
        }
        System.out.println(hm);
    }
}
