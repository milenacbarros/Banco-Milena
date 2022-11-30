package user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import user.Conta;

public class ContaTest {

  @Test
  public void depositoContaTest(){
    Conta conta = new Poupanca("0123", "João");
    conta.deposit(500.0);
    Assertions.assertEquals(500.0, conta.getBalance());
  }

  @Test
  public void saqueContaTest(){
    Conta conta = new Conta("0123", "João");
    conta.deposit(500.0);
    conta.withdraw(100.0);
    Assertions.assertEquals(400.0, conta.getBalance());
  }

}
