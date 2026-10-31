public class Main {

    public static void main(String[] args) {
        System.out.println("=== Operação Crachá Geek: participantes cadastrados ===\n");

        // Objeto 1: cadastrado pelo construtor
        Participante p1 = new Participante(1, "Ana", "ana@email.com", "Cosplay");

        // Objeto 2: cadastrado pelo construtor
        Participante p2 = new Participante(2, "Bruno", "bruno@email.com", "Campeonato");

        // Objeto 3: criado vazio e cadastrado pelo método cadastrar()
        Participante p3 = new Participante();
        p3.cadastrar(3, "Carla", "carla@email.com", "Palestra");

        // Exibe os três cadastros
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}
