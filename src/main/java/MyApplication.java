import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;



@ApplicationPath("/")
public class MyApplication extends Application {
//Eu não sei oq é essa porra aqui, mas faz pegar, então...
    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>();
        classes.add(MyApplicationController.class);
        return classes;
    }
}
