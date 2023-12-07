public class ClassesHerois {

    
    String name;
    int idade;
    String tipoClasse;

    public ClassesHerois(String name, int idade, String tipoClasse){
        this.name = name;
        this.idade = idade;
        this.tipoClasse = tipoClasse;

    }


    public String atacar (String name, String tipoClasse){
        String tipoAtaque = "";

        if (tipoClasse.equals("mago")) {
            tipoAtaque = "magia";
         }else 
                if (tipoClasse.equals("guerreiro")){
                 tipoAtaque = "espada";

             }else 
                    if(tipoClasse.equals("ninja")){
                             tipoAtaque = "shuriken";

                    } else
                        if(tipoClasse.equals("monge")){
                                 tipoAtaque = "artes marciais";
    
                        }

              return tipoAtaque;
        

    }





}