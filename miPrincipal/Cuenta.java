package miPrincipal;

// Cuenta.java
// Clase para implementar una Cuenta y su saldo

public class Cuenta
{
	// Atributos
    private String titular;
    private double saldo;

	// Constructores
	public Cuenta( String titular, double saldo )
	{
		// Mandar llamar los metodos set de los atributos
	}

	public Cuenta( String titular )
	{
		// Mandar llamar al constructor con todos los atributos
	}

	// Metodos set/get
    public void setTitular( String titular )
    {
        // El titular no se valida
    }

    public void setSaldo( double saldo )
    {
        // El saldo debe ser mayor o igual que 0
    }

    public String getTitular()
    {
        return "";
    }

    public double getSaldo()
    {
        return 0.0;
    }

    // Metodo de instancia
    public void ingresar(double cantidad)
    {
        // Si la cantidad es positiva, sumar al saldo
        // si la cantidad es negativa, no hacer nada
    }

    public void retirar( double cantidad )
    {
        // Restar cantidad al saldo
        // Si el saldo se convierte en negativo, hacer saldo igual a cero
    }
    // Sobreescribir metodo toString()
	public String toString()
	{
		String resultado = String.format("");
		return resultado;
	}
}