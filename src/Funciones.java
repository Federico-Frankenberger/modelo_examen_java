import java.util.Scanner;
public class Funciones {
    static Scanner sc = new Scanner(System.in);
    private static double [][]matriz;
    private int m;
    private int n;

    public double[][] cargaArrayBi() {
        do{
            System.out.println("------------------------------------------------------------------");
            System.out.println("Ingrese un valor entero para M (Filas) y N (Columnas) de la matriz");
            System.out.print("M: ");
            m = sc.nextInt();
            System.out.print("N: ");
            n = sc.nextInt();
            if(m<3 || n<2){
                System.out.println("ERROR valores mínimos permitidos M>=3 e N>=2");
            }
        }while (m<3 || n<2);
        matriz = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor de la pos " +"[" +i +"]" +"[" +j +"]");
                matriz[i][j] = sc.nextDouble();
            }
        }
        return matriz;
    }

    public void mostrarMatrizBi(double claseBi [][],int numero) {
            System.out.println("------------");
            System.out.println("---MATRIZ BIDIMENCIONAL EJERCICIO "+numero+" ---");
            if(numero==6){
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j <2; j++) {
                        System.out.print(String.format("%8.0f",claseBi[i][j]) + " "+ "\t"  +"\t");
                    }
                    System.out.println();
                }
                System.out.println("------------");
            }else {
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j <n; j++) {
                        System.out.print(String.format("%8.0f",claseBi[i][j]) + " " +"\t");
                    }
                    System.out.println();
                }
                System.out.println("------------");
            }

    }

    public void mostrarMatrizUni(double claseUni [], int numero) {
        System.out.println("------------");
        System.out.println("---MATRIZ UNIDIMENCIONAL EJERCICIO "+numero+" ---");
        for (int i = 0; i < claseUni.length; i++) {
            System.out.println(String.format("%8.0f",claseUni[i])+ "\t");
        }
        System.out.println("------------");
    }

    public double[] sumaFilas(double clase [][]) {
        double [] arrayUni= new double [m];
        for (int i = 0; i < m; i++) {
            double sumaFilas = 0;
            for (int j = 0; j < n; j++) {
              sumaFilas += clase[i][j];
            }
            arrayUni[i] = sumaFilas;
        }
        return arrayUni;
    }

    public double[][] matrizCinco(double claseUni[]){
        double [][] arrayCinco= new double [m][2];
        double [] arrayUniOrden= claseUni.clone();
        insercionBase(arrayUniOrden);
        int [] arrayIndice= new int [claseUni.length];
        for (int i=0; i< claseUni.length; i++) {
            for (int j=0; j< claseUni.length;j++) {
                if (arrayUniOrden[i]==claseUni[j]){
                    arrayIndice[i]=j+1;
                }
            }
        }
        for (int i = 0; i < claseUni.length; i++) {
            arrayCinco[i][0] = arrayUniOrden[i];
            arrayCinco[i][1] = arrayIndice[i];
        }

        return arrayCinco;
    }

    private static double[] insercionBase(double[] cadena) {
        double [] copia = cadena;
        for (int i = 0; i < copia.length; i++) {
            double valor = copia[i];
            int j = i - 1;
            while (j >= 0 && copia[j] < valor) {
                copia[j + 1] = copia[j];
                j--;
            }
            copia[j + 1] = valor;
        }
        return copia;
    }

    public  double sumaPuntoCinco (double[][] cadena){
        double sumaTotal = 0;
        for (int i = 0; i < cadena.length; i++) {
            sumaTotal += cadena[i][0];
        }
        System.out.println("------------");
        System.out.println("------EJERCICIO 7------");
        System.out.println("La suma de elementos columna 1 es: " + String.format("%8.0f",sumaTotal));
        System.out.println("------------");
        return sumaTotal;
    }




}
