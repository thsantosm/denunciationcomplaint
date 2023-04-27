package domain;
import java.io.Serializable;

public class denuncia implements Serializable {
    private Long id;
    private String denuncia;
    private String tipoDenuncia;
    private String cidadao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(String denuncia) {
        this.denuncia = denuncia;
    }

    public String getTipoDenuncia() {
        return tipoDenuncia;
    }

    public void setTipoDenuncia(String tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public String getCidadao() {
        return cidadao;
    }

    public void setCidadao(String cidadao) {
        this.cidadao = cidadao;
    }
}