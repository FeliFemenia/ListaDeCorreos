package dds.listaDeCorreo.model;

public interface PhoneVoiceSender {
  void sendMessage(String telefono, String texto, Integer velocidad);
}
