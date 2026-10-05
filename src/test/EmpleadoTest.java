package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sesion2B.Empleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//TEST DE NOMINAS BRUTAS (METODO DE NOMINAS BRUTAS)
	

    @Test
    void testNominaBrutaVentas0() {
        Empleado empleado = new Empleado();
        // Fíjate que ahora usamos Empleado.TipoEmpleado.VENDEDOR
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.VENDEDOR, 0, 0);
        assertEquals(2000, resultado);
    }

    @Test
    void testNominaBrutaVentas999() {
        Empleado empleado = new Empleado();
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.VENDEDOR, 999, 0);
        assertEquals(2000, resultado);
    }

    @Test
    void testNominaBrutaVentas1000() {
        Empleado empleado = new Empleado();
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.VENDEDOR, 1000, 0);
        assertEquals(2100, resultado);
    }

    @Test
    void testNominaBrutaVentas1499() {
        Empleado empleado = new Empleado();
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.VENDEDOR, 1499, 0);
        assertEquals(2100, resultado);
    }

    @Test
    void testNominaBrutaVentas1500() {
        Empleado empleado = new Empleado();
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.VENDEDOR, 1500, 0);
        assertEquals(2200, resultado);
    }

    @Test
    void testNominaBrutaEncargadoConHorasExtra() {
        Empleado empleado = new Empleado();
        // Probamos el encargado, que tiene 2500 de base + 2 horas extra (60€)
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.ENCARGADO, 0, 2);
        assertEquals(2560, resultado);
    }

    
    // TEST DE NOMINAS NETAS (METODO NOMINAS NETAS)
    
    @Test
    void testNominaNeta2000() {
        Empleado empleado = new Empleado();
        float resultado = empleado.calculoNominaNeta(2000);
        assertEquals(2000, resultado);
    }

    @Test
    void testNominaNeta2099() {
        Empleado empleado = new Empleado();
        float resultado = empleado.calculoNominaNeta(2099);
        assertEquals(2099, resultado);
    }

    @Test
    void testNominaNeta2100() {
        Empleado empleado = new Empleado();
        float resultado = empleado.calculoNominaNeta(2100);
        assertEquals(1785, resultado);
    }

    @Test
    void testNominaNeta2499() {
        Empleado empleado = new Empleado();
        // Usamos el delta (0.01f) para evitar fallos por los decimales de Java
        float resultado = empleado.calculoNominaNeta(2499);
        assertEquals(2124.15f, resultado, 0.01f); 
    }

    @Test
    void testNominaNeta2500() {
        Empleado empleado = new Empleado();
        float resultado = empleado.calculoNominaNeta(2500);
        assertEquals(2050, resultado);
    }

    
    
	
	
	//@Test
	/*void test() {
		fail("Not yet implemented");
	}
*/
}
