public class TestaVeiculo {

    public static void main(String[] args) {
        CadastroVeiculoCommander cadastroVeiculo = new CadastroVeiculoCommander(new VeiculoVetorRepository(), new LeituraEntradaTeclado());
        cadastroVeiculo.execute();
    }
}
