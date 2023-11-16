package AvaliacaoFormativa;

public class PrincipalPessoaFisica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fisica fisica = new Fisica("Beatriz", "5033778786", "844384947585");
		System.out.println("id: "+fisica.getNome());
		System.out.println("nome: " +fisica.getCpf());
		System.out.println("password:"+fisica.getRg());
	}

}
