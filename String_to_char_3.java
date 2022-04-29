package Conversiones;

public class String_to_char_3 {

    public static void main(String args[]) {
        String s1 = "Hola";
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println("Posicion: " + i + " Char: " + ch[i]);
        }
    }
}
