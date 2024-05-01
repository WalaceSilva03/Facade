public class Combo {

    private Burger b;
    private Sobremesa s;
    private Bebida a;

    public Combo() {
        Burger b = new Burger();
        Sobremesa s = new Sobremesa();
        Bebida a = new Bebida();
    }

    public void CriarCombo(int x){

        switch (x) {
            case 1:
                b.Descricao("Hambuguer Maneiro");
                b.Preco(10.50);
                s.Descricao("Soverte Legal");
                s.Preco(5.50);
                a.Descricao("Refrigerante cancerigeno");
                a.Preco(6.0);
            break;

            case 2:
                b.Descricao("Hambuguer Interessante");
                b.Preco(10.50);
                s.Descricao("Soverte também cancerigeno");
                s.Preco(5.50);
                a.Descricao("Suco não tão cancerigeno");
                a.Preco(6.0);
                break;

            default:
                System.out.println("Não há essa opção.");
        }
    }
}
