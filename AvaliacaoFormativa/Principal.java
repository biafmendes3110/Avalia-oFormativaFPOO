package AvaliacaoFormativa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario(1, "Beatriz", 3110, "Permitido", "normal");
		System.out.println("id: "+usuario.getId());
		System.out.println("nome: " +usuario.getNome());
		System.out.println("password:"+usuario.getPassword());
		System.out.println("permissao: "+usuario.getPermissao());
		System.out.println("usuario: "+usuario.getUsuario());
	}
}