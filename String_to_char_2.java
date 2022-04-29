package Conversiones;

public class String_to_char_2 {

    public static void main(String args[]) {
        String s = "Hola";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("Posicion: " + i + " Char: " + c);
        }
    }
}
