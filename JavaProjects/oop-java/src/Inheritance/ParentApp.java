package Inheritance;

public class ParentApp {
    public static void main(String[] args) {
      Child  child = new Child();
      child.nama ="Fajar";
      child.doIt();
      System.out.println(child.nama);

      Parent parent = (Parent) child;
      parent.doIt();
    }
}
