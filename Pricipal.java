package Testes;
public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Ana";
        p1.idade = 20;
        p1.caminhar();
        p1.dormir();

        Pessoa p2 = new Pessoa();
        p2.nome = "Bruno";
        p2.idade = 30;

        Pessoa p3 = new Pessoa();
        p3.nome = "Carla";
        p3.idade = 25;
        p3.caminhar();
        p3.dormir();
    }
}
