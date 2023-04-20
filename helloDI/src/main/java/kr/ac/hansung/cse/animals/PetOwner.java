package kr.ac.hansung.cse.animals;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PetOwner {

    public AniType animal;

//    public PetOwner(AniType animal) {
//        this.animal = animal;
//    }

    public void play() {
        animal.sound();
    }

}
