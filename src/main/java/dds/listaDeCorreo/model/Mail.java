package dds.listaDeCorreo.model;

public class Mail {
  String remitente;
  String destinatario;
  String titulo;
  String texto;

  public Mail(String remitente, String destinatario, String titulo, String texto) {
    this.remitente = remitente;
    this.destinatario = destinatario;
    this.titulo = titulo;
    this.texto = texto;
  }
}
