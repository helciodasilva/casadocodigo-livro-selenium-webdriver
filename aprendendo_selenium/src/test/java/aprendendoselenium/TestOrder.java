package aprendendoselenium;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class TestOrder {
	
	@Test
	public void teste1() {
		System.out.println("Eu sou o teste1");
	}

	@Test
	public void teste3() {
		System.out.println("Eu sou o teste3");
	}

	@Test
	public void teste5() {
		System.out.println("Eu sou o teste5");
	}

	@Test
	public void teste2() {
		System.out.println("Eu sou o teste2");
	}

	@Test
	public void teste4() {
		System.out.println("Eu sou o teste4");
	}

}
