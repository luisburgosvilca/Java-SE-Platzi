public class HomeWork2 {

    public static void main(String[] args) {

        /*
        char c = ‘z’; conviertelo a int
        int i = 250; conviertelo a long y luego de long a short
        double d = 301.067; conviertelo a long
        int i = 100; súmale 5000.66 y conviertelo a float
        int i = 737; multiplícalo por 100 y conviertelo a byte
        double d = 298.638; divídelo entre 25 y conviertelo a long
        */

        char c = 'z';
        int iC = (int) c;

        System.out.println("El valor de char 'c' es igual a: "+c);
        System.out.println("c, convertido a int, es: "+iC);

        System.out.println("==========");

        Integer i = 250;
        //long iL = Long.parseLong(String.valueOf(i));
        //long iL = 250L;
        //long iL = i;
        Long iL = (long) i;
        //short sIL = Short.parseShort(String.valueOf(iL));
        Short iLS = (short) iL;

        System.out.println(i + " es " + i.getClass().getSimpleName());
        System.out.println(iL + " es " + iL.getClass().getSimpleName());
        System.out.println("El valor del long anterior, convertido a Short es: "+sIL);

        double d = 301.067;
        int i2 = 100; //su

    }

}
