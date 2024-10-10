public class Main {
    public static void main(String[] args) {
        Funciones clase = new Funciones();
        double [][] arrayBi = clase.cargaArrayBi();
        double [] arrayUni = clase.sumaFilas(arrayBi);
        clase.mostrarMatrizBi(arrayBi,2);
        clase.mostrarMatrizUni(arrayUni,4);
        double [][] arrayBiDos = clase.matrizCinco(arrayUni);
        clase.mostrarMatrizBi(arrayBiDos,6);
        clase.sumaPuntoCinco(arrayBiDos);
    }
}
