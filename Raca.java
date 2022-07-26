package br.com.apiracas.apiracas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CollectionRacasPerigosas")
public class Raca {
    @Id
    private String id;
    private String raca;
    private String url_imagem;
    private String rankingProibidas;



    public Raca() {
    }


    public Raca(String id, String raca, String url_imagem, String rankingProibidas) {
        this.id = id;
        this.raca = raca;
        this.url_imagem = url_imagem;
        this.rankingProibidas = rankingProibidas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getUrl_imagem() {
        return url_imagem;
    }

    public void setUrl_imagem(String url_imagem) {
        this.url_imagem = url_imagem;
    }

    public String getRankingProibidas() {
        return rankingProibidas;
    }

    public void setRankingProibidas(String rankingProibidas) {
        this.rankingProibidas = rankingProibidas;
    }
}
