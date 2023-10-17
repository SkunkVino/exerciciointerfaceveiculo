public class Carro implements Veiculo {

    private int quilometragem;
    private int anoFabricacao;
    private int maxPassageiros;

    public Carro(int quilometragem, int anoFabricacao, int maxPassageiros){
        this.quilometragem = quilometragem;
        this.anoFabricacao = anoFabricacao;
        this.maxPassageiros = maxPassageiros;
    }
    
    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getMaxPassageiros() {
        return maxPassageiros;
    }

    public void setMaxPassageiros(int maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }

    @Override
    public boolean podeCarregar(int qtPassageiros) {
         if(qtPassageiros > maxPassageiros){
            return false;
       }else{
            return true;
       }
    }

}
