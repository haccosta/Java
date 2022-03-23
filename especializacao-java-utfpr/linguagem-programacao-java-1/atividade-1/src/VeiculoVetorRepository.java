public class VeiculoVetorRepository implements IVeiculoRepository {

    private static int TAMANHO_VETOR_VEICULOS = 5;
    Veiculo[] veiculos;

    public VeiculoVetorRepository() {
        this.veiculos = new Veiculo[TAMANHO_VETOR_VEICULOS];
    }

    @Override
    public int retornarTotal() {
        return this.veiculos.length;
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        int totalPosicoesUsadas = 0;
        for (int i = 0; i < TAMANHO_VETOR_VEICULOS; i++) {
            if (this.veiculos[i] != null) {
                totalPosicoesUsadas++;
            }
        }

        if (totalPosicoesUsadas == TAMANHO_VETOR_VEICULOS) {
            throw new RuntimeException("Vetor sem posições vazias!");
        }

        veiculos[totalPosicoesUsadas] = veiculo;
    }

    @Override
    public void listarVeiculo() {
        System.out.println("Imprimindo os Valores: ");
        System.out.println("*****************************************************");

        if (veiculos.length == 0) {
            System.out.println("Veículo nao preenchidos");
        } else {
            for (int i = 0; i < veiculos.length; i++) {
                if (veiculos[i] != null) {
                    System.out.println(veiculos[i].toString());
                    System.out.println("*****************************************************");
                }

            }
        }
    }
}
