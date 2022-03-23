public class LeituraEntradaTeclado implements IEntradaDados {

    private LeituraEntradaTecladoUtil entradaDeDadosTecladoUtil;

    public LeituraEntradaTeclado() {
        this.entradaDeDadosTecladoUtil = new LeituraEntradaTecladoUtil();
    }

    @Override
    public String lerValorTexto(String nomeCampo, String textoInformativo) {
        System.out.println(textoInformativo);
        return entradaDeDadosTecladoUtil.lerDadosTextoTeclado(nomeCampo);
    }

    @Override
    public int lerValorInteiro(String nomeCampo, String textoInformativo) {
        System.out.println(textoInformativo);
        return entradaDeDadosTecladoUtil.lerDadosInteiroTeclado(nomeCampo);
    }

    @Override
    public float lerValorFloat(String nomeCampo, String textoInformativo) {
        System.out.println(textoInformativo);
        return entradaDeDadosTecladoUtil.lerDadosFloatTeclado(nomeCampo);
    }

}
