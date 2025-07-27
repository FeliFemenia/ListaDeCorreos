package dds.listaDeCorreo.model;

import java.util.stream.Collectors;

public class AdapterMailSender implements EnvioDeMensaje {

  private MailSender mailSender;

  public AdapterMailSender(MailSender mailSender) {
    this.mailSender = mailSender;
  }

  public void enviarMensaje(Post post, Lista listaDeCorreos) {
    this.mailSender.enviarMail(
        new Mail(
            post.remitente.email,
            this.getDestinatarios(post, listaDeCorreos),
            post.titulo,
            post.texto
        )
    );
  }

  public String getDestinatarios(Post post, Lista listaDeCorreos) {
    return listaDeCorreos.getDestinatarios(post)
        .stream()
        .map(miembro -> miembro.email)
        .collect(Collectors.joining(", "));
  }
}
