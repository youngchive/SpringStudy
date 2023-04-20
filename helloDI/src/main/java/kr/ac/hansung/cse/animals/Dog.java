package kr.ac.hansung.cse.animals;

import lombok.Setter;

@Setter
public class Dog implements AniType {

    String myName;

//    public void setMyName(String myName) {
//        this.myName = myName;
//    }

    @Override
    public void sound() {
        System.out.println("Dog name " + myName + ": " + "Bow Wow");

    }
}
