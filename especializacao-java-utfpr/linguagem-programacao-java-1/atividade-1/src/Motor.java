public class Motor {
    private int qtdPistao;
    private int qtdPotencia;

    public Motor(){
        this.qtdPistao = 0;
        this.qtdPotencia = 0;
    }

    public void setQtdPotencia(int qtdPotencia) {
        this.qtdPotencia = qtdPotencia;
    }

    public void setQtdPistao(int qtdPistao) {
        this.qtdPistao = qtdPistao;
    }

    public int getQtdPistao(){
        return this.qtdPistao;
    }
    public int getQtdPotencia(){
        return this.qtdPotencia;
    }

    public String toString(){
        return " Motor: [Potência: " + this.qtdPotencia + " Pistão: " + this.qtdPistao + "]";
    }

    public void preencherDadosMotor(int qtdPistao, int qtdPotencia){
        this.qtdPistao = qtdPistao;
        this.qtdPotencia = qtdPotencia;
    }

}
