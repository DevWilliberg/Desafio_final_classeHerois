public class App {
    public static void main(String[] args) throws Exception {
    
        
        ClassesHerois ch = new ClassesHerois("RYYUB", 21, "mago");
        ClassesHerois cheroi = new ClassesHerois("NUTI", 21, "ninja");
        
        System.out.println("O "+ ch.tipoClasse + " atacou usando "+ ch.atacar(ch.name,ch.tipoClasse));
        System.out.println("O "+ cheroi.tipoClasse + " atacou usando "+ cheroi.atacar(cheroi.name,cheroi.tipoClasse));
        

    }
}
