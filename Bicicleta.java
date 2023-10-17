public class Bicicleta implements Veiculo{

    private int qtMarchas;
    private int maxPassageiros;
    private int marchaAtual;

    public int getMarchaAtual() {
        return marchaAtual;
    }

     public int getMaxPassageiros() {
        return maxPassageiros;
    }

    public Bicicleta(int qtMarchas, int maxPassageiros){
        this.qtMarchas = qtMarchas;
        this.maxPassageiros = maxPassageiros;
    }

    public int getQtMarchas() {
        return qtMarchas;
    }

    public void aumentarMarcha(){
         marchaAtual++;
    }

    public void diminuirMarcha(){
        marchaAtual--;
    }


    @Override
    public boolean podeCarregar(int qtPassageiros) {
        if(qtPassageiros > maxPassageiros){
            return false;
       }else{
            return true;
       }
    }


    public void setQtMarchas(int qtMarchas) {
        this.qtMarchas = qtMarchas;
    }

    public void setMaxPassageiros(int maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }
}
