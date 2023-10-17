public class TesteVeiculo {
    public static void main (String argumentos[]){
        Carro fusca = new Carro(20000, 1973, 5);
        System.out.println("O carro foi fabricado em "+ fusca.getAnoFabricacao() +
        " e tem " + fusca.getQuilometragem() + " quilometros rodados.");
        System.out.println("O carro pode carregar 4 passsageiros? " +
        fusca.podeCarregar(4));
        System.out.println("O carro pode carregar 10 passageiros? " +
        fusca.podeCarregar(10));
        Bicicleta caloi10 = new Bicicleta(10, 1);
        System.out.println("A bicileta tem " + caloi10.getQtMarchas() +
        " marchas.");
        System.out.println("A bicileta pode carregar 4 passageiros? "+ caloi10.podeCarregar(4));
        System.out.println("Marcha atual: " + caloi10.getMarchaAtual()); 
        caloi10.aumentarMarcha();caloi10.aumentarMarcha();caloi10.aumentarMarcha();
        caloi10.aumentarMarcha();caloi10.aumentarMarcha();caloi10.aumentarMarcha();
        System.out.println("Marcha atual: "+ caloi10.getMarchaAtual());
        caloi10.aumentarMarcha();caloi10.aumentarMarcha();caloi10.aumentarMarcha();
        System.out.println("Marcha atual: "+ caloi10.getMarchaAtual());
        caloi10.diminuirMarcha();
        System.out.println("Marcha atual: " + caloi10.getMarchaAtual());
    }
}
