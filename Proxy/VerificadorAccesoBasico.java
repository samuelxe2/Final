public class VerificadorAccesoBasico implements VerificadorAcceso {
    private String usuarioAdmin;

    public VerificadorAccesoBasico(String usuarioAdmin) {
        this.usuarioAdmin = usuarioAdmin;
    }

    public VerificadorAccesoBasico() {

    }

    @Override
    public boolean tieneAcceso(String usuario) {
        return usuarioAdmin.equals(usuario);
    }
}
