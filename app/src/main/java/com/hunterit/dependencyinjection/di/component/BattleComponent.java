package com.hunterit.dependencyinjection.di.component;

import com.hunterit.dependencyinjection.data.model.Boltons;
import com.hunterit.dependencyinjection.data.model.Cash;
import com.hunterit.dependencyinjection.data.model.Starks;
import com.hunterit.dependencyinjection.data.model.War;
import com.hunterit.dependencyinjection.di.module.BraavosModule;

import dagger.Component;

@Component(modules = {BraavosModule.class})
public interface BattleComponent {
    War getWar();
    Boltons getBoltons();
    Starks getStarks();
    Cash getCash();
}
