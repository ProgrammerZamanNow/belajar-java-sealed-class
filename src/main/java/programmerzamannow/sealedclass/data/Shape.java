package programmerzamannow.sealedclass.data;

public sealed interface Shape permits Circle, Rectangle, Triangle{

  Long area();
}
