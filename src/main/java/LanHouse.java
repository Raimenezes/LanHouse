public class LanHouse {

    private LanHouse() {};
    private static LanHouse instance = new LanHouse();
    public static LanHouse getInstance() {
        return instance;
    }

    private String nomePc;
    private String nomeUsuario;

    public String getNomePc() {
        return nomePc;
    }

    public void setNomePc(String nomePc) {
        this.nomePc = nomePc;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

}