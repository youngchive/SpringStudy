package kr.ac.hansung.cse;

import kr.ac.hansung.cse.animals.PetOwner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class  App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf/animal.xml");

        PetOwner person = (PetOwner) context.getBean("petOwnerId");
        person.play();

        context.close();
    }
}
