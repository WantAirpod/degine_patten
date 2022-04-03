package com.patten.degine_patten.builder_patten._02_after;

import com.patten.degine_patten.builder_patten._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    /**
     * 데이터 검증을 할 수 있음.
     * nights, days 중 하나만 들어갔다던지, 근교여행인데 굳이 필요없는 값이 들어간건 아닌지
     * @return
     */
    TourPlan getPlan(); //데이터 검증
}
