public class ArraysDeUnaDimension {
    public static void main(String[] args) {
        String diasDeLaSemana[] = new String[7];
        diasDeLaSemana[0] = "lunes";
        diasDeLaSemana[1] = "martes";
        diasDeLaSemana[2] = "miercoles";
        diasDeLaSemana[3] = "jueves";
        diasDeLaSemana[4] = "viernes";
        diasDeLaSemana[5] = "sabado";
        diasDeLaSemana[6] = "domingo";


        int numeros[] = {8,9,0,85, -6};
        int minimo, maximo;
        minimo = maximo = numeros[0];

        for (int i = 0; i<=numeros.length -1; i++){
            if(numeros[i]>maximo) maximo = numeros[i];
            if(numeros[i]<minimo) minimo = numeros[i];
        }
        System.out.println("el valor minimo del array es " + minimo + " El valor maximo es " + maximo);
        System.out.println("hgola");
        double[] miArrayDeDoubles = {2.3, 6.0, 25, 8.36};
    }
}
