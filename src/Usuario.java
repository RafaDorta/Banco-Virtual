import javax.swing.JOptionPane;

public abstract class Usuario {
	
	protected String login;
	protected String senha;
	
	public String getLogin() {
		return login;
	}

	public abstract void setLogin(String login);

	public String getSenha() {
		return senha;
	}

	public abstract void setSenha(String senha);
	
	public void alteraSenha(String senhaAntiga, String senhaNova) {
        if(senhaAntiga==senha)
        {
            senha=senhaNova;
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
        }
        else
        	JOptionPane.showMessageDialog(null, "Dados inválidos","BANCO JURA",JOptionPane.ERROR_MESSAGE);
    }
}
