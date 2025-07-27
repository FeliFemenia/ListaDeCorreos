package dds.listaDeCorreo.model;

public class Post {
  Miembro remitente;
  String titulo;
  String texto;
  Integer velocidad;

  public Post(Miembro remitente, String titulo, String texto, Integer velocidad) {
    this.remitente = remitente;
    this.titulo = titulo;
    this.texto = texto;
    this.velocidad = velocidad;
  }
}
