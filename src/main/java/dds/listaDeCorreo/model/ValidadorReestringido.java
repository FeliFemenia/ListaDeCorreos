package dds.listaDeCorreo.model;

public class ValidadorReestringido implements ValidadorDeEnvio {
  public void validarEnvio(Post post, Lista listaDeCorreos) {
    if(!listaDeCorreos.miembros.contains(post.remitente)) {
      throw new RuntimeException("El remitente debe pertencer a la lista de correos");
    }
  };
}
