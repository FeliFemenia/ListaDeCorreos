package dds.listaDeCorreo.model;

public class Post {
  Miembro remitente;
  String titulo;
  String texto;

  public Post(Miembro remitente, String titulo, String texto) {
    this.remitente = remitente;
    this.titulo = titulo;
    this.texto = texto;
  }
}
