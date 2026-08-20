public class Principal {
    public static void main(String[] args) {
        Banco b1 = new Banco("José", "000", 15);
        Banco b3 = new Banco("Vapor", "0001", 5);
        System.out.println(b3.getNome());
        b3.setNome("Joaquim");
        System.out.println(b3.getNome());
    }
}