public class DataType {

    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 12345678901L;

        double nD = 123.456;
        float nF = 123.456F;

        var salary = 1000.0;
        //pensión 3%
        var pension = salary * 0.03;
        var total_salary = salary - pension;

        System.out.println("pensión: " + pension);
        System.out.println("Total Salario: " + total_salary);

        var employeeName = "Luis Burgos";
        System.out.println("Employe: "+employeeName + "Salaty: "+total_salary);

    }

}
