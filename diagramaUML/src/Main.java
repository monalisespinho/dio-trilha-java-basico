public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        //ReprodutorMusical
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Love me Again");

        //AparelhoTelefonico
        iPhone.ligar("(51)999999999");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        //NavegadorInternet
        iPhone.exibirPagina("www.google.com");
        iPhone.atualizarPagina();
        iPhone.adicionarNovaAba();
    }
}