package Trabajos;

public class Tarea1
{
    public static void main (final String[] args) {
        int n1 = 0;
        int n2 = 1; 
        final int iteraciones = 10;
        System.out.println(n1);
        System.out.println(n2);
        int x = 0;
        do 
        {

            int n3 = n1 + n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
           x++;
        }
        while(x<iteraciones);
    }
}

