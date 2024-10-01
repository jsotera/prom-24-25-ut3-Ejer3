public class VerificarNumero {

    int numero;

    public VerificarNumero(int numero){
        this.numero = numero;
    }

    public void verificar(){
        if(this.numero > 0){
            System.out.println("El numero es positivo");
        } else if (this.numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero cero");
        }
    }

}
