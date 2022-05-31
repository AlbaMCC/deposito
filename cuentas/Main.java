package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 200);
    }

    /**
     * Opera sobre la cuenta con la cantidad establecida, realizando un retiro
     * y posteriormente un ingreso con la misma cantidad
     *
     * @param cuenta   La cuenta sobre la que se realiza la operación
     * @param cantidad La cantidad con la que se va a operar sobre la cuenta
     */
    private static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual = cuenta.saldo();
        System.out.println("El saldo actual es : " + saldoActual);

        try {
            System.out.println("Retiro en cuenta de : " + cantidad);
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta de : " + cantidad);
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}
