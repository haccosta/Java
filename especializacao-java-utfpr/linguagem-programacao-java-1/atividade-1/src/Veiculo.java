public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private float velocMax;
    private Motor motor;
    private String cor;
    private int qtdadeRodas;

    public Veiculo() {
        this.placa = "";
        this.modelo = "";
        this.marca = "";
        this.velocMax = 0;
        this.motor = new Motor();
        this.cor = "";
        this.qtdadeRodas = 0;


    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String toString() {
        return "[Modelo: " + this.modelo + " Marca: " + this.marca + " Placa: " + this.placa + " Velocidade Max:  " + this.velocMax +
                " " + this.motor.toString() + "]";
    }

    public void preencherDados(String placa, String modelo, String marca, float velocMax, String cor, int qtdadeRodas, int qtdePistoes, int qtdePotencia){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocMax = velocMax;
        this.cor = this.cor;
        this.qtdadeRodas = qtdadeRodas;
        this.motor.preencherDadosMotor(qtdePistoes, qtdePotencia);
    }
}
