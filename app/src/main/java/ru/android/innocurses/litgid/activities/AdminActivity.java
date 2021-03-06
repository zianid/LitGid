package ru.android.innocurses.litgid.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import ru.android.innocurses.litgid.R;

public class AdminActivity extends Activity {
    private Button bUserList;
    private Button bCategoryList;
    private Button bWritingList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);


        bUserList = (Button) findViewById(R.id.bUsers);
        bUserList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),UserListActivity.class));
            }
        });

        bCategoryList = (Button) findViewById(R.id.bCategory);
        bCategoryList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), CategoryListActivity.class));
            }
        });

        bWritingList = (Button) findViewById(R.id.bWritings);
        bWritingList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), WritingListActivity.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_preferences, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.preferences:
                Intent intent = new Intent(this, PreferencesActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
