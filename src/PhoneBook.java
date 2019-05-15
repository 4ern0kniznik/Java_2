import java.util.*;

public class PhoneBook {
    private HashMap<String, String> hm;

    private PhoneBook(){
        this.hm = new HashMap<>();
    }

    private void add(String name, String num){
        hm.put(num, name);
    }

    private void get(String name){
        for(Map.Entry entry : hm.entrySet()){
            if(entry.getValue().equals(name)){
                System.out.println(name + " = " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Иванов", "8(495)586-45-25");
        book.add("Петров", "8(495)835-86-23");
        book.add("Козлов", "8(495)356-86-35");
        book.add("Иванов", "8(495)375-53-74");
        book.add("Петров", "8(495)580-83-85");
        book.add("Иванов", "8(495)346-37-53");

        book.get("Иванов");
        book.get("Петров");

    }
}
