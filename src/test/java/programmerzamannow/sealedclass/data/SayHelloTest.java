package programmerzamannow.sealedclass.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SayHelloTest {

  @Test
  void reflection() {
    assertTrue(SayHello.class.isSealed());

    Class<?>[] subclasses = SayHello.class.getPermittedSubclasses();
    assertEquals(3, subclasses.length);

    assertEquals(Human.class, subclasses[0]);
    assertEquals(Dog.class, subclasses[1]);
    assertEquals(Cat.class, subclasses[2]);
  }
}
