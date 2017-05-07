
package u05s03ex02;

public class Cadena {

    public static void main(String[] args) {
        String s = "hola";
        System.out.println(s + ":");
        s+="adios";
        System.out.println(s + ":");
        System.out.println(s.charAt(1));
        
        String s1 = "Una cadena";
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        char [] v = new char [20];
        s1.getChars(4, 6, v, 3);
        
        for (int i =0; i<10;i++){
            System.out.println("v ["+i+"]= " + v[i]);
        }
        
        String s2 = new String(v);
    }
    
}
