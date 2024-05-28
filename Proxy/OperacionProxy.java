public class OperacionProxy<T> implements Operacion<T> {
    private OperacionReal<T> operacionReal;
    private String usuario;
    private VerificadorAcceso verificadorAcceso;

    public OperacionProxy(String usuario, VerificadorAcceso verificadorAcceso) {
        this.usuario = usuario;
        this.verificadorAcceso = verificadorAcceso;
    }

    @Override
    public void ejecutar(T dato) {
        if (verificadorAcceso.tieneAcceso(usuario)) {
            if (operacionReal == null) {
                operacionReal = new OperacionReal<>();
            }
            operacionReal.ejecutar(dato);
        } else {
            throw new SecurityException("Acceso denegado: el usuario " + usuario + " no tiene permiso para ejecutar esta operación.");
        }
    }
}