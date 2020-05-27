
package informacion;


public class Credenciales extends datos{
    public String Usuario="onix";
    private String Contrasena="1423";
    private String NIP="14";
    
    
    
   public Credenciales(){
        String US= this.Usuario;
   }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    
    @Override
    public String datos(){
        return null;
    }

    @Override
    public String usuario() {
        return null;
    }

    @Override
    public void privacidad() {
    }
    
    
    
}
