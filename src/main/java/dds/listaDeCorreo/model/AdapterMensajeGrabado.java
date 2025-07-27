package dds.listaDeCorreo.model;

public class AdapterMensajeGrabado implements EnvioDeMensaje {

  private PhoneVoiceSender phoneVoiceSender;

  public AdapterMensajeGrabado(PhoneVoiceSender phoneVoiceSender) {
    this.phoneVoiceSender = phoneVoiceSender;
  }

  public void enviarMensaje(Post post, Lista listaDeCorreos) {
    listaDeCorreos.getDestinatarios(post).forEach(miembro -> {
      this.phoneVoiceSender.sendMessage(
          post.remitente.telefono,
          post.texto,
          post.velocidad
      );
    });
  }
}
