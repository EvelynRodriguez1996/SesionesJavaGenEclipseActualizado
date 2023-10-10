package Persona;

public class Usuario {

    //Atributos
    private String userType;
    private String username;
    private String password;

    //Crear un nuevo usuario (constructor)
    public Usuario (String tipoUsuario, String nombreUsuario, String contraseña) {
        this.userType = tipoUsuario;
        this.username = nombreUsuario;
        this.password = contraseña;
    }
    
    
    //Recuerar contraseña (getter)
    public String getPassword() {
        //Si el usuario registrado coincide con el usuario que pasó como parámetro, entonces obtengo la contraseña
        return password;
    }

    //Cambiar contraseña (setter)
    //Si la nueva contraseña es diferente a una cadena vacía y es diferenet ea la contraseña anterior...
    public void setPassword(String newPassword) {
        //...entonces reemplazo la contraseña anterior
    	if( (newPassword.toString() != "") && !(newPassword.equals(password)) ) {
            password = newPassword;
            System.out.println("Contraseña cambiada correctamente");
        }else {
            System.out.println("Lo siento, no puedo cambiar la contraseña");
        }
    }

//
//    System.out.println(password);
//    System.out.println((Object)password.getClass().getSimpleName());
//    System.out.println(newPassword);
//    System.out.println((Object)newPassword.getClass().getSimpleName());

} //Clase Usuario