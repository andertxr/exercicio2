package one.digitalinovation.basecamp;

public class Main {

        public static void main(String [] args) {

            byte b1 = 10;
            byte b2 = 20;

            short s1 = 20000;
            //short s2 = 40000; ultrapassa o limite maximo de valor aceito pelo short

            //int i1 = -10000000000; ultrapassa o limite negativo maximo  acito pelo int
            int i2 = 20000;

            long l1 = 1000000000000000000L;
            long l2 = 2000000000000000000L;

            //float f1 = 4.5; sem o f no final o sistema reconhece como double
            float f2 = 10.68f;

            double d1 = 85.69;
            double d2 = 99.04d;

            char c1 = 'W';
            //char c2 = 'Tw'; aceita apenas 1 caracter
            char c3 = '\u0057';

            String st1 = "fulano";
            String st2 = "cicrano";
            String st3 = "Beltrano @#$%&*¨%$# fdjfhdjkfghdj";

            //String dt1 = "19/10/1981"; nao e interessante utilizar string para datas

            boolean bo1 = true;
            boolean bo2 = false;

            System.out.println(b1);
            System.out.println(b2);
            System.out.println(s1);
            System.out.println(i2);
            System.out.println(l1);
            System.out.println(l2);
            System.out.println(f2);
            System.out.println(d1);
            System.out.println(d2);
            System.out.println(c1);
            System.out.println(c3);
            System.out.println(st1);
            System.out.println(st2);
            System.out.println(st3);
            System.out.println(bo1);
            System.out.println(bo2);



        }
    }

