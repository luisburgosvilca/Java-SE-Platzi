public class MathematicOperation {

    public static void main(String[] args) {

        double x = 2.1;
        double y = 3;

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.ceil(x));//redondeo superior
        System.out.println(Math.floor(x));//redondeo inferior
        System.out.println(Math.pow(y,2));//Potencia
        System.out.println(Math.max(x,y));//muestra el número mayor entre 2 números
        System.out.println(Math.abs(-x));//retorna el valor absoluto del valor ingresado
        System.out.println(Math.sqrt(y));//raíz cuadrada
        System.out.println(Math.PI*Math.pow(y,2));//área de un círculo de área 5
        //área de esfera: 4*PI*r2
        System.out.println(4*Math.PI*Math.pow(y,2));//área de esfera de radio 5

        //volumen de una esfera: 4/3 * Pi * r3
        System.out.println((4/3)*Math.PI * Math.pow(y,3));//volumen de esfera radio 3

    }

}
