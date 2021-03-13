class Conta{
  String titular;
  int numero;
  String agencia;
  double saldo;
  Data dataAbertura;

  // metodos
  boolean saca(double valor){
    if(this.saldo < valor){
      return false;
    }else{
      this.saldo = this.saldo - valor;
      return true;
    }
  }
  void deposita(Conta c, double valor){
    if (this.saca(valor)){
      c.saldo = c.saldo + valor;
    }else{
      System.out.println("Não possui saldo em conta!");
    }
  }
  double calculaRendimento(){
    return this.saldo * 0.1;
  }
  String recuperaDadosParaImpressao(){
    String dados = "Titular: " + this.titular;
    dados += "\nAgencia: " + this.agencia;
    dados += "\nConta numero: " + this.numero;
    dados += "\nSaldo: " + this.saldo;
    dados += "\nDia: " + this.dataAbertura.dia;
    dados += "\nMes: " + this.dataAbertura.mes;
    dados += "\nAno: " + this.dataAbertura.ano;
    return dados;
  }
}
