public class Concessionaria {
    private String nome; 
    private String marca;
    private Boolean testando;
    
    
    public void Concessionaria(){
        this.testando();
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeCarro) {
        this.nome = nomeCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marcaCarro) {
        this.marca = marcaCarro;
    }

  public void testando (){
      this.testando = false;
  }

public void status () {
    System.out.println("O veiculo se encontra parado? " + this.testando);
}
  
}
