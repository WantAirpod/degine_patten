package com.patten.degine_patten.builder_patten._02_after;

import com.patten.degine_patten.builder_patten._01_before.TourPlan;

/**
 * dirctor를 통해서 빌더를 간다.
 */
public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}
