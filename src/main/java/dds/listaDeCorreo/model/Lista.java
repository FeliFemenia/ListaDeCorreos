package dds.listaDeCorreo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

  List<Miembro> miembros = new ArrayList<Miembro>();
  ModoDeSuscripcion modoDeSuscripcion;
  ValidadorDeEnvio validadorDeEnvio;

  Lista(ModoDeSuscripcion modoDeSuscripcion, ValidadorDeEnvio validadorDeEnvio) {
    this.modoDeSuscripcion = modoDeSuscripcion;
    this.validadorDeEnvio = validadorDeEnvio;
  }

  public void suscribir(Miembro miembro) {
    modoDeSuscripcion.suscribir(miembro, this);
  }

  public void enviarMensaje(Post post, EnvioDeMensaje envio) {
    validadorDeEnvio.validarEnvio(post, this);
    envio.enviarMensaje(post, this);
  }

  public List<Miembro> getDestinatarios(Post post) {
    return miembros.stream()
        .filter(miembro -> miembro != post.remitente)
        .collect(Collectors.toList());
  }
}
