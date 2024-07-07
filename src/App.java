public class App {
    public static void main(String[] args) {

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocarMusica("Céu azul - Charlie Brown Jr.");
        reprodutor.pausarMusica();
        reprodutor.selecionarMusica("Macaé - Clarisse Falcão.");

        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        aparelho.ligar("+558499999-9999");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("https://www.navegador.com.br");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
