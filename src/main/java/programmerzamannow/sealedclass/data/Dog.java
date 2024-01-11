package programmerzamannow.sealedclass.data;

public record Dog() implements SayHello {
  @Override
  public String hello() {
    return "guk";
  }
}
