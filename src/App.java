public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();

        cliente.setNome("teste");

        System.out.println(cliente.getNome());
    }
}
