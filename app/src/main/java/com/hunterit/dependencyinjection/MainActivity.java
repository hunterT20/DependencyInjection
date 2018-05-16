package com.hunterit.dependencyinjection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hunterit.dependencyinjection.data.model.Cash;
import com.hunterit.dependencyinjection.data.model.Soldiers;
import com.hunterit.dependencyinjection.data.model.War;
import com.hunterit.dependencyinjection.di.component.BattleComponent;
import com.hunterit.dependencyinjection.di.component.DaggerBattleComponent;
import com.hunterit.dependencyinjection.di.module.BraavosModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BattleComponent component = DaggerBattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.report();

        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();

        component = DaggerBattleComponent
                .builder().braavosModule(new BraavosModule(cash, soldiers)).build();
        war = component.getWar();
        war.prepare();
        war.report();
        //using cash and soldiers
        component.getCash();
    }
}
