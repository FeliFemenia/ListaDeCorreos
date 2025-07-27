package dds.listaDeCorreo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

  List<Miembro> miembros = new ArrayList<Miembro>();
  ModoDeSuscripcion modoDeSuscripcion;
  MailSender mailSender;
  ValidadorDeEnvio validadorDeEnvio;

  Lista(ModoDeSuscripcion modoDeSuscripcion, MailSender mailSender, ValidadorDeEnvio validadorDeEnvio) {
    this.modoDeSuscripcion = modoDeSuscripcion;
    this.mailSender = mailSender;
    this.validadorDeEnvio = validadorDeEnvio;
  }

  public void suscribir(Miembro miembro) {
    modoDeSuscripcion.suscribir(miembro, this);
  }

  public void enviarMensaje(Post post) {
    validadorDeEnvio.validarEnvio(post, this);
    mailSender.enviarMail(
        new Mail(
            post.remitente.email,
            this.getDestinatarios(post),
            post.titulo,
            post.texto
        )
    );
  }

  public String getDestinatarios(Post post) {
    return miembros.stream()
        .filter(miembro -> miembro != post.remitente)
        .map(miembro -> miembro.email)
        .collect(Collectors.joining(", "));
  }
}
