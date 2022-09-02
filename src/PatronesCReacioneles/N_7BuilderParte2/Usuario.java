package PatronesCReacioneles.N_7BuilderParte2;

public class Usuario {
    private String nombre;
    private  String apellido;
    private  String email;
    private String telefono;
    private String direccion;
    private boolean medioContacto;

    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.medioContacto = false;
        this.email = "";
        this.telefono = "";
        this.direccion = "";
    }

    public BuilderUsuario setMedioContacto(boolean medioContacto){
        if (!medioContacto){
            throw  new IllegalArgumentException("No es pocible asignar una valor falso a medio de contacto");
        }
        this.medioContacto = medioContacto;
        return new BuilderUsuario(this);
    }
    public static Usuario Make(String nombre, String apellido){
        return new Usuario(nombre, apellido);
    }
    public Usuario Build(){
        return this;
    }

    @Override
    public String toString() {
        return  " " + this.nombre +
                " " + this.apellido +
                " " + this.email +
                " " + this.telefono +
                " " + this.direccion;
    }

    public static class  BuilderUsuario {
        private Usuario usuario;
        private boolean isTrue;
        private String metodoPago;
        private String token;


        public BuilderUsuario(Usuario usuario) {
            this.usuario = usuario;
            this.isTrue = false;
        }

        public BuilderPagar setMedioPago(boolean isTrue) {
            if (!isTrue) {
                throw new IllegalArgumentException("No es pocible asignar una paltaforma de pago");
            }
            this.isTrue = isTrue;
            return new BuilderPagar(this);

        }


        public BuilderUsuario setEmail(String email) {
            usuario.email = email;
            return this;
        }

        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        public BuilderUsuario setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this;
        }

        public Usuario Build() {
            return usuario;
        }

        @Override
        public String toString() {
            return  " " + this.metodoPago+ " " +
                    " " + this.token ;
        }

        public static class BuilderPagar {
            private BuilderUsuario builderUsuario;

            public BuilderPagar(BuilderUsuario builderUsuario) {
                this.builderUsuario = builderUsuario;
            }

            public BuilderPagar setMetodoPago(String plataforma) {
                builderUsuario.metodoPago = plataforma;
                return this;
            }

            public BuilderPagar setToken(String token) {
                builderUsuario.token = token;
                return this;
            }

            public BuilderUsuario Build() {
                return builderUsuario;
            }
        }
    }
}
