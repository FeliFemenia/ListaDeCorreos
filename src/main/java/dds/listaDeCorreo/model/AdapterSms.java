package dds.listaDeCorreo.model;

public class AdapterSms implements EnvioDeMensaje {
  private PhoneTextSender phoneTextSender;

  public AdapterSms(PhoneTextSender phoneTextSender) {
    this.phoneTextSender = phoneTextSender;
  }

  public void enviarMensaje(Post post, Lista listaDeCorreos) {
    listaDeCorreos.getDestinatarios(post)
        .forEach(destinatario -> {this.phoneTextSender.sendMessage(
            destinatario.telefono,
            post.texto
        );});
  }
}
