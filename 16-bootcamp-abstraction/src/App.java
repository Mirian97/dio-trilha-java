import java.time.LocalDate;

import com.dio.challenge.domain.Bootcamp;
import com.dio.challenge.domain.Course;
import com.dio.challenge.domain.Developer;
import com.dio.challenge.domain.Mentorship;

public class App {
    public static void main(String[] args) throws Exception {
        Course java = new Course("Java");
        java.setDescription("Descriction Java Course");
        java.setWorkload(8);

        Course javascript = new Course("Javascript");
        javascript.setDescription("Descriction Javascript Course");
        javascript.setWorkload(8);

        Mentorship javaMentorship = new Mentorship("Java Mentorship");
        javaMentorship.setDescription("Description Java Mentorship");
        javaMentorship.setMentorshipDate(LocalDate.now());

        // System.out.println(java);
        // System.out.println(javascript);
        // System.out.println(javaMentorship);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitle("Bootcamp Java Developer");
        bootcamp.getContents().add(javaMentorship);
        bootcamp.getContents().add(java);
        bootcamp.getContents().add(javaMentorship);

        Developer devMirian = new Developer();
        devMirian.setName("Mirian Quispe");
        devMirian.subscribeBootcamp(bootcamp);
        System.out.println(devMirian.getSubscribedContents());
        devMirian.progress();
        System.out.println(devMirian.getSubscribedContents());
        System.out.println("Total de XP: " + devMirian.calculateTotalXp());


        Developer devHamed = new Developer();
        devHamed.setName("Hamed Panjeh");
        devHamed.subscribeBootcamp(bootcamp);
        System.out.println(devHamed.getSubscribedContents());
        devHamed.progress();
        devHamed.progress();
        devHamed.progress();
        System.out.println(devHamed.getSubscribedContents());
        System.out.println("Total de XP: " + devHamed.calculateTotalXp());
    }
}
