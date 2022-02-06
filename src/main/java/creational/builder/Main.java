package creational.builder;

public class Main {

    public static void main(String[] args){
        //Lobok
        Person person = Person.builder("firstnameRequired","lastnameRequired")
                .age(10).hobby("sing")
                .hobby("play video games")
                .build();

        System.out.println(person.toString());
        //Custom
        Article article = Article.builder(1L,"firstArticle")
                .reference("AnyReference")
                .phone(1321L)
                .tag("anyTag")
                .tag("anyOtherTag")
                .name("UpdateName")
                .build();

        System.out.println("First Article: "+article.toString());

        Article article1 = Article.builder(2L,"firstArticle")
                .reference("AnyReference")
                .phone(1321L)
                .phone(123123L)
                .phone(32131313L)
                .build();

        System.out.println("Second Article: "+article1.toString());

    }


}
