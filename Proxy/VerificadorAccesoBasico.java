public class VerificadorAccesoBasico implements VerificadorAcceso {
    private final String usuarioAdmin;

    public VerificadorAccesoBasico(String usuarioAdmin) {
        this.usuarioAdmin = usuarioAdmin;
    }

    @SuppressWarnings("unused")
    public VerificadorAccesoBasico() {
        // Proporcione un valor predeterminado si es necesario
        this.usuarioAdmin = "admin";
    }

    @Override
    public boolean tieneAcceso(String usuario) {
        return usuarioAdmin.equals(usuario);
    }
}
