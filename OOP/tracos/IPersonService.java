public interface IPersonService {

    default public void doSomething(){
        System.out.println("doing something ...");
    }
}
