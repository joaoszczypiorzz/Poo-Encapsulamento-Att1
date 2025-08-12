class Carro {
    //Atributos privados (ninguém pode mexer diretamente neles)
    private int velocidade;
    private String marca;
    private String modelo;
    private int idade;


    //Construtor para criar as informações dos carros
    public Carro( String marca , String modelo , int idade ){
        this.marca = marca;
        this.modelo = modelo;
        this.idade = idade;
        this.velocidade =  0; //começando em 0
    }

    //método para retornar a velocidade
    public int getVelocidade(){
        return velocidade;
    }

//método para aumentar a velocidade do Carro
    public void aumentarVelocidade(int desejada){
        int velocidadeReal = desejada - idade;

        if(velocidadeReal < 0){
            velocidadeReal = 0;
        }
        this.velocidade = velocidadeReal;
    }

    //método para retornar as informações dos objetos carros
    public void mostarInfos(){
        System.out.println("Carro: " + marca + " " + modelo);
        System.out.println("Idade: " + idade + " Anos");
        System.out.println("Velocidade: " + velocidade + "Km/h");
    }


}