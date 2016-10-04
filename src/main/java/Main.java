import com.itea.spring.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);

        System.out.println("\n" + "--------------");

        TextEditorImp te = ctx.getBean(TextEditorImp.class);
        te.spellCheck("SpellChecker");

        TextEditorImp te1 = ctx.getBean(TextEditorImp.class); //
        te1.DoIt();                                           //@Autowired
                                                              //

        System.out.println(" ---- Singleton : ");

        TextEditorImp te2 = ctx.getBean(TextEditorImp.class); //
        te2.setS("2");                                        // Spope singleton
        System.out.println(te2.getS());                       //
        System.out.println(te1.getS());                       //

        System.out.println(" ---- Prototype : ");

        SpellChecker2Imp sp1 = new SpellChecker2Imp();         //
        SpellChecker2Imp sp2 = new SpellChecker2Imp();         //
        sp2.setS("2");                                         // Scope prototype
        System.out.println(sp1.getS());                        //
        System.out.println(sp2.getS());                        //

    }
}
