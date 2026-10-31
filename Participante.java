public class Participante {

    // Atributos privados: só podem ser acessados por métodos da própria classe
    private int id;
    private String nome;
    private String email;
    private String tipoParticipacao;

    // Construtor vazio (permite criar o objeto e cadastrar os dados depois)
    public Participante() {
    }

    // Construtor completo (cadastra os dados já na criação do objeto)
    public Participante(int id, String nome, String email, String tipoParticipacao) {
        cadastrar(id, nome, email, tipoParticipacao);
    }

    // Método de cadastro: recebe os dados e guarda nos atributos
    public void cadastrar(int id, String nome, String email, String tipoParticipacao) {
        this.id = id;
        setNome(nome);
        setEmail(email);
        setTipoParticipacao(tipoParticipacao);
    }

    // Getters: permitem consultar os valores
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoParticipacao() {
        return tipoParticipacao;
    }

    // Setters: permitem alterar os valores, com validação simples
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("E-mail inválido.");
        }
    }

    public void setTipoParticipacao(String tipoParticipacao) {
        this.tipoParticipacao = tipoParticipacao;
    }

    // Exibe as informações do participante no console
    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Tipo de participação: " + tipoParticipacao);
        System.out.println();
    }
}
