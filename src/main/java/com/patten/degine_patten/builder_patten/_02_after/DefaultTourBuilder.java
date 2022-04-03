package com.patten.degine_patten.builder_patten._02_after;

import com.patten.degine_patten.builder_patten._01_before.DetailPlan;
import com.patten.degine_patten.builder_patten._01_before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 구현체 생성
 */
public class DefaultTourBuilder implements TourPlanBuilder {

    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;

    /**
     * this를 리턴한다는 것은 DefaultTourBulder가 리턴이 된다는 뜻
     * @param nights
     * @param days
     * @return
     */
    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }

        this.plans.add(new DetailPlan(day, plan));
        return this;
    }


    /**
     * 마지막에 인스턴스를 생성한다.
     * @return
     */
    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, nights, days, startDate, whereToStay, plans);
    }
}
