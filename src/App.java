public class App {
    public static void main(String[] args) throws Exception {
        Matter newMatter = new Matter();
        newMatter.setName("Matemática");
        newMatter.subject.setName("Matrizes");
        System.out.println(newMatter.getName());
        System.out.println(newMatter.subject.getName());
    }
}
