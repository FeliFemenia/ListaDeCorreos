package dds.listaDeCorreo.model;

import java.util.ArrayList;
import java.util.List;

public class SuscripcionCerrada implements ModoDeSuscripcion {

  List<Miembro> miembrosPendientes = new ArrayList<Miembro>();

  public void suscribir(Miembro miembro, Lista lista) {
    miembrosPendientes.add(miembro);
  }

  public void aceptarSuscripcion(Miembro miembro, Lista lista) {
    miembrosPendientes.remove(miembro);
    lista.miembros.add(miembro);
  }

  public void rechazarSuscripcion(Miembro miembro) {
    miembrosPendientes.remove(miembro);
  }
}
