import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	@Test
	public void testAddOne(){
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();
		// Act
		sut.add(1);
		// Assert
		assertEquals("0+1 = 1", 1, sut.getState());
	}

	@Test
	public void testMultOneByTwo(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(2);
		assertEquals("1*2 = 2", 2, sut.getState());
	}
	@Test
	public void testAdd2(){
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();
		// Act
		sut.add(2147483647);
		// Assert
		assertEquals("0+2147483647 = 2147483647", 2147483647, sut.getState());
	}
	@Test
	public void testM0(){
		Calculator sut = new Calculator();
		sut.setState(0);
		sut.mult(5);
		assertEquals("0*5 = 0", 0, sut.getState());
	}
	@Test
	public void testD0(){
		Calculator sut = new Calculator();
		sut.setState(5);
		sut.divide(0);
		assertEquals("0*5 = 0", 5, sut.getState());
	}
	@Test
	public void testSUb2(){
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();
		// Act
		sut.sub(2147483647);
		// Assert
		assertEquals("0+2147483647 = 2147483647", -2147483647, sut.getState());
	}
}
