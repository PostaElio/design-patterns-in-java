package creational.object.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class Article {
    private Long id;
    private String name;
    private List<Long> phones;
    private String reference;
    private String description = "anyDescriptionDefault";
    private BigDecimal retailPrices;
    private int stock;
    private List<String> tags;
    private BigDecimal wholesalePrice;

    public Article(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //definimos nuestro methodo builder
    public static ArticleBuilder builder(Long id, String name) {
        return new ArticleBuilder(id, name);
    }

    //Definimos ArticleBuilder
    public static class ArticleBuilder {
        private Article article;
        //Atributos de Article que son requeridos, creados a partir de ArticleBuilder
        public ArticleBuilder(Long id, String name) {
            this.article = new Article(id, name);
        }
        //Methodos para setarle valores a un Articulo
        public ArticleBuilder phone(Long phone) {
            //more logic
            if (article.phones == null) {
                article.phones = new ArrayList<>();
            }
            this.article.phones.add(phone);
            return this;
        }
        public ArticleBuilder tag(String tag) {
            //more logic
            if (article.tags == null) {
                article.tags = new ArrayList<>();
            }
            this.article.tags.add(tag);
            return this;
        }
        public ArticleBuilder reference(String reference) {
            //more logic
            this.article.setReference(reference);
            return this;
        }
        public ArticleBuilder name(String name) {
            //more logic
            this.article.setName(name);
            return this;
        }
        //Faltan mas methodos...
        public Article build() {
            //more logic
            return this.article;
        }
    }
}


