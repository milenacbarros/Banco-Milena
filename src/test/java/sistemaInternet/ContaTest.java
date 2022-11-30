package sistemaInternet;

import org.junit.After;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import user.Conta;

public class ContaTest {
  private Conta conta;

  @Before
  public void setUp(){
    this.conta = new Conta("0123", "Maria");
  }

  @After
  public void sysoutInfo(){
    System.out.println("Conta : saldo - "+conta.getBalance());
  }

  @Ignore
  public void depositoEmContaTest(){
    //Conta conta = new Conta("0123", "Maria");
    conta.deposit(100.0);
    Assert.assertEquals(100.0, conta.getBalance(), 0.0);
  }

  @Test
  public void saqueEmContaTeste(){
    //Conta conta = new Conta("0123", "Maria");
    conta.deposit(100.0);
    conta.withdraw(50.0);
    Assert.assertEquals(50.0, conta.getBalance(), 0.0);
  }

  @Test
  public void falhaSaqueEmContaTeste(){
    //Conta conta = new Conta("0123", "Maria");
    conta.deposit(40.0);
    Assume.assumeTrue(conta.getBalance() >= 45.0);
    conta.withdraw(45.0);
    Assert.assertEquals(40.0, conta.getBalance(), 0.0);
  }

}
