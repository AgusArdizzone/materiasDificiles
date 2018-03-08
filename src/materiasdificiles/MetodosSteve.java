package materiasdificiles;

import java.util.Scanner;

/**
 *
 * @author steve-urbit
 */
public abstract class MetodosSteve {
    
    public static int tomarInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static float tomarFloat(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
    
    public static double tomarDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    
    public static char tomarChar(){
        Scanner scanner = new Scanner(System.in);
        return (char) scanner.next().charAt(0) ;
    }
    
    public static long tomarLong(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }
    
    public static short tomarShort(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextShort();
    }
    
    public static byte tomarByte(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextByte();
    }
    
    public static String tomarString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    
    public static void imprimir(Object object){
        System.out.println(object.toString());
    }
}
