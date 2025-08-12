public class Main{

    public static void main(String[] args) {


        //iniciando os objetos carros ( fusca e celta )
        Carro carro1 = new Carro("Fusca" , "Volksvagem" , 1);
        Carro carro2 = new Carro("Celta" , "Chevrolet " ,  6 );

        //aumentando a velocidade dos dois objetos para 80 km/h
        carro1.aumentarVelocidade(80);
        carro2.aumentarVelocidade(80);

        //Mostrando as informações do Objeto carro1
        System.out.println("===Carro 1===");
        carro1.mostarInfos();

        //mostrando as informações do objeto carro2
        System.out.println("===Carro 2===");
        carro2.mostarInfos();

        //verificação para ver qual Carro realmente é mais rápido
        if (carro1.getVelocidade() > carro2.getVelocidade()) {
            System.out.println("\nCarro 1 é mais rápido!");
        } else if (carro2.getVelocidade() > carro1.getVelocidade()) {
            System.out.println("\nCarro 2 é mais rápido!");
        } else {
            System.out.println("\nAmbos os carros estão na mesma velocidade!");
        }

    }
}