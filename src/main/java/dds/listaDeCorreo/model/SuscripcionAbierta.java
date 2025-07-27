package dds.listaDeCorreo.model;

public class SuscripcionAbierta implements ModoDeSuscripcion {
  public void suscribir(Miembro miembro, Lista lista) {
    lista.miembros.add(miembro);
  }
}
