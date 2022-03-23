public class CadastroVeiculoCommander {
    private IVeiculoRepository veiculoRepository;
    private IEntradaDados entradaDados;
    private Veiculo veiculo;
    private int totalDeVeiculosDesejadosParaCadastro;

    public CadastroVeiculoCommander(IVeiculoRepository veiculoRepository, IEntradaDados entradaDados) {
        this.veiculoRepository = veiculoRepository;
        this.entradaDados = entradaDados;
        this.totalDeVeiculosDesejadosParaCadastro = 0;
    }

    public void execute() {
        System.out.println("Bem vindo ao cadastro de veículos!");
        System.out.println("*****************************************************");

        entradaQuantidadeParaCadastro();
        validarEntradaQuantidadeVeiculoCadastrado();
        preencherDadosVeiculo();
        listarTodosVeiculosCadastrados();
    }

    private void entradaQuantidadeParaCadastro() {
        this.totalDeVeiculosDesejadosParaCadastro = entradaDados.lerValorInteiro("", "Informe a quantidade de veículos que deseja cadastrar");
    }

    private boolean isQuantidadeVeiculoValida(int totalDigitadoUsuario) {
        return totalDigitadoUsuario <= veiculoRepository.retornarTotal();
    }

    private void validarEntradaQuantidadeVeiculoCadastrado() {
        while (!isQuantidadeVeiculoValida(this.totalDeVeiculosDesejadosParaCadastro)) {
            System.out.println("O limite para criação de veiculos e: " + veiculoRepository.retornarTotal());
            entradaQuantidadeParaCadastro();
            System.out.println("*****************************************************");
        }
    }

    private void preencherDadosVeiculo() {

        boolean coletarDados = true;

        int totalEntradaDeVeiculo = 0;
        while (coletarDados) {


            String campoPlaca = entradaDados.lerValorTexto("Placa", "Informe a placa do veículo:");
            String campoModelo = entradaDados.lerValorTexto("Modelo", "Informe a modelo do veículo:");
            String campoMarca = entradaDados.lerValorTexto("Marca", "Informe a placa do marca:");
            int campoVelocMaxima = entradaDados.lerValorInteiro("Veloc. Maxima", "Informe a velocidade maxima do veículo:");
            int campoPistoes = entradaDados.lerValorInteiro("Pistoes", "Informe a quantidade de pistões do veículo:");
            int campoPotencia = entradaDados.lerValorInteiro("Potencia", "Informe a quantidade de potencia do veiculo");

            this.veiculo = new Veiculo();
            this.veiculo.preencherDados(campoPlaca, campoModelo, campoMarca, campoVelocMaxima, campoPistoes, campoPotencia);

            this.veiculoRepository.adicionarVeiculo(this.veiculo);

            totalEntradaDeVeiculo++;

            if (totalEntradaDeVeiculo == this.totalDeVeiculosDesejadosParaCadastro) {
                coletarDados = false;
            }

        }
    }

    private void listarTodosVeiculosCadastrados() {
        this.veiculoRepository.listarVeiculo();
    }
}
