public class App {
    public static void main(String[] args) throws Exception {
        Concessionaria meuCarro = new Concessionaria();    
              
        meuCarro.setNome( "Volvo XC60" );
        System.out.println(meuCarro.getNome());
    
        meuCarro.setMarca("Volvo");
        System.out.println(meuCarro.getMarca());
    
        meuCarro.status();
    }
}
