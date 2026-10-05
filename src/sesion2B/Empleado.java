package sesion2B;

public class Empleado {

	
	public enum TipoEmpleado {VENDEDOR, ENCARGADO};
	
    public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {

        float salarioBase;

        if (tipo == TipoEmpleado.VENDEDOR) {
            salarioBase = 2000;
        } else {
            salarioBase = 2500;
        }

        float prima = 0;

        if (ventasMes >= 1500) {
            prima = 200;
        } else if (ventasMes >= 1000) {
            prima = 100;
        }

        return salarioBase + prima + (horasExtra * 30);
    }

    public float calculoNominaNeta(float nominaBruta) {

        float retencion;

        if (nominaBruta < 2100) {
            retencion = 0;
        } else if (nominaBruta < 2500) {
            retencion = 0.15f;
        } else {
            retencion = 0.18f;
        }

        return nominaBruta * (1 - retencion);
    }
}