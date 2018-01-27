package com.wmt.gbhujan.tablerowview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] list_names = { "8137", "1834", "2679", "8334", "3250", "5005", "4649", "7237", "9277", "8000", "3831", "5241", "3931", "6949", "7082", "9136", "9008", "5961", "5407" };
    String[] list_descriptions = {"2f3d9b534d726b2d921451852adedb0c", "d757719ed7c2b66dd17dcee2a3cb29f4", "9813b270ed0288e7c0388f0fd4ec68f5", "df0b8fb21c53254b7afa62e020447c81", "326fb04c3abf030fe3f4e341f39b573f", "1d6408264d31d453d556c60fe7d0459e", "205c3608ecb984c1f5f5d2f52c934428", "742141ceda6b8f6786609d31c8ef129f", "90b9ec1e25ed6705ac341eb17690d55c", "67ff32d40fb51f1a2fd2c4f1b1019785", "cac8e13055d2e4f62b6322254203b293", "d14fe370bdf1664c34b258d65f8d3507", "acff1af62d0f91f4be73f4857552d70c", "f3be5eb7ff15f2013a3b65fbca4bf864", "3bf29f38421bc1764e6f1d1545479f93", "28891cb4ab421830acc36b1f5fd6c91e", "a1324603d9b1a22277809229934a36fd", "094366eaa7a4b5d7f9ed227f212b3649", "110209d8fae7417509ba71ad97c17639" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.id_listView);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return list_names.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.custom_layout,null);
            TextView text_view_name = (TextView) convertView.findViewById(R.id.id_text_title);
            TextView text_view_description = (TextView) convertView.findViewById(R.id.id_text_description);

            text_view_name.setText(list_names[position]);
            text_view_description.setText(list_descriptions[position]);

            return convertView;
        }
    }
}
