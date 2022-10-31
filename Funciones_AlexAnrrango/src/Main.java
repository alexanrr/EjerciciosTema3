// Ejercicios tema 3 - Alex Anrrango
public class Main {
    public static void main(String[] args) {
        //Primera Parte
        int suma = sumaTres(10,20,35);
        System.out.print("La suma de los tres parametros es: ");
        System.out.println(suma);

        //Segunda Parte
        Coche miCoche= new Coche();
        miCoche.AumentarPuertas();
        System.out.print("El numero de puertas es: ");
        System.out.println(miCoche.nPuertas);
    }


    //Primera Parte
    public static int sumaTres(int a, int b, int c){

        return a+b+c;
    }
}

//Segunda Parte
class Coche{
    public int nPuertas= 0;

    public void AumentarPuertas(){

        this.nPuertas++;
    }

}