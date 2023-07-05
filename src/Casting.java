public class Casting {

    public static void main(String[] args) {
        //En un año ubicar 30 perritos
        // cuantos perritos ubiqué en hogares al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;

        //división de enteros, solo muestra la parte entera de la división
        System.out.println("Sin casteo: "+(a/b));

        //Este tipo de casteo, captura la parte decimal de una división de enteros
        System.out.println("casteando: "+(double)a/b);

        double c = a/b;
        System.out.println(c);

        double d = (double) a/b;
        System.out.println(d);

        /**
         * Char
         * @author: by Luis Burgos
         * */
        char n = '@';
        int nI = n;

        System.out.println(nI);


        short nS = (short) n;
        System.out.println(nS);


    }

}
