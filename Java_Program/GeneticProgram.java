// This is Genetic Program.
public class GeneticProgram<T> {
    private T t, k;
    public void add(T t, T k) {
        this.t = t;
        this.k = k;
    } 
    public T get() {
        return t;
    }
    public T getGeneticProgram() {
          return k;  
    }
    public static void main(String[] args) {
        GeneticProgram<Integer> obj = new GeneticProgram<Integer>();
        obj.add(10, 20);
       System.out.println( obj.get());
       System.out.println( obj.getGeneticProgram());
    }
}
