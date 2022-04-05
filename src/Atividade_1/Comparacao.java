package Atividade_1;

public class Comparacao {

    int quantidadepessoamais50;
    double media;
    double porcetagem;



    public Comparacao(int quantidadepessoamais50, double media, double porcetagem) {
        this.quantidadepessoamais50 = quantidadepessoamais50;
        this.media = media;
        this.porcetagem = porcetagem;
    }

    public int getQuantidadepessoamais50() {
        return quantidadepessoamais50;
    }

    public void setQuantidadepessoamais50(int quantidadepessoamais50) {
        this.quantidadepessoamais50 = quantidadepessoamais50;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getPorcetagem() {
        return porcetagem;
    }

    public void setPorcetagem(double porcetagem) {
        this.porcetagem = porcetagem;
    }
}
