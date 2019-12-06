package PacoteJarel;

public class LoginBean {

    private String nome;
    private String senha;

    public LoginBean() {

    }

    public LoginBean(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean login(String nome, String senha) {

        if (nome.equals("Jarel") && senha.equals("123")) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }

}
