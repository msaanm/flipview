package com.wajahatkarim3.easyflipview.demo;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sachin Varma on 18-12-2017.
 */

public class RecyclerViewFlipActivity extends AppCompatActivity {
  private static final String TAG = "RecyclerViewFlipActivit";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recyclerview_flip);
    List<TestModel> list = new ArrayList<>();
    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    final RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
    recyclerView.setLayoutManager(layoutManager);
    for (int i = 0; i < 20; i++) {
      TestModel model = new TestModel();
      model.isFlipped = false;
      list.add(model);
    }
    recyclerView.setAdapter(new SampleAdapter(list));
    LinearSnapHelper linearSnapHelper = new SnapHelperOneByOne();
    linearSnapHelper.attachToRecyclerView(recyclerView);
  }
}
