class GerenciandoContas{
  public static void main(String[] args){
    Conta c1 = new Conta();
    Data data = new Data();
    c1.dataAbertura = data;
    c1.titular = "Joao";
    c1.agencia = "Itau";
    c1.numero = 12345;
    c1.dataAbertura.dia = 04;
    c1.dataAbertura.mes = 02;
    c1.dataAbertura.ano = 1991;
    c1.saldo = 100;

    Conta c2 = new Conta();
    c2.titular = "Margarida";
    c2.saldo = 100;
    System.out.println(c1.recuperaDadosParaImpressao());

    /*
    *criando novas contas
    *
    */
  }
}
