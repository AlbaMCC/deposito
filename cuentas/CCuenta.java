package cuentas;

public class CCuenta {

    /**
     * Nombre del usuario de la cuenta
     */
    private String nombre;

    /**
     * Número de cuenta
     */
    private String cuenta;

    /**
     * Saldo disponible en la cuenta
     */
    private double saldo;

    /**
     * Tipo de interés aplicado
     */
    private double tipoInterés;

    /**
     * Constructor por defecto
     */
    public CCuenta() {
    }

    /**
     * Constructor parametrizado
     *
     * @param nom  Nombre del usuario
     * @param cue  Número de cuenta
     * @param sal  Saldo disponible de la cuenta
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipo = tipo;
    }

    /**
     * Método para ingresar una cantidad en la cuenta
     *
     * @param cantidad La cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar una cantidad de la cuenta
     *
     * @param cantidad La cantidad a extraer
     * @throws Exception Si la cantidad a retirar es negativa o el saldo es insuficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (saldo() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    public String nombre() {
        return nombre;
    }

    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    public String cuenta() {
        return cuenta;
    }

    public void cuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double saldo() {
        return saldo;
    }

    public void saldo(double saldo) {
        this.saldo = saldo;
    }

    public double tipo() {
        return tipoInterés;
    }

    public void tipo(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
