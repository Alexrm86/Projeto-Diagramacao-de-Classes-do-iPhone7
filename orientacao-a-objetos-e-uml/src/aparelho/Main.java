package aparelho;

public class Main {

  public static void main(String[] args) {
    AparelhoMultiuso aparelho = new AparelhoMultiuso();

    System.out.println("------------->");
    aparelho.selecionarMusica("Nickelback");
    aparelho.tocar();
    aparelho.pausar();

    System.out.println("------------->");
    aparelho.atender();
    aparelho.iniciarCorreioVoz();
    aparelho.ligar(99147569);

    System.out.println("------------->");
    aparelho.exibirPagina();
    aparelho.atualizarPagina();
    aparelho.adicionarNovaAba();

    System.out.println("------------->");
  }

}
