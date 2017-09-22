package koi.com.limitrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] countries = {
            "United States of America", " Afghanistan", " Albania", " Algeria", " Andorra", " Angola", " Antigua & Deps",
            " Argentina", " Armenia", " Australia", " Austria", " Azerbaijan", " Bahamas", " Bahrain", " Bangladesh", " Barbados",
            " Belarus", " Belgium", " Belize", " Benin", " Bhutan", " Bolivia", " Bosnia Herzegovina", " Botswana", " Brazil", " Brunei",
            " Bulgaria", " Burkina", " Burma", " Burundi", " Cambodia", " Cameroon", " Canada", " Cape Verde", " Central African Rep",
            " Chad", " Chile", " People's Republic of China", " Republic of China", " Colombia", " Comoros", " Democratic Republic of the Congo",
            " Republic of the Congo", " Costa Rica", "", " Croatia", " Cuba", " Cyprus", " Czech Republic", " Danzig", " Denmark", " Djibouti",
            " Dominica", " Dominican Republic", " East Timor", " Ecuador", " Egypt", " El Salvador", " Equatorial Guinea", " Eritrea", " Estonia",
            " Ethiopia", " Fiji", " Finland", " France", " Gabon", " Gaza Strip", " The Gambia", " Georgia", " Germany", " Ghana", " Greece",
            " Grenada", " Guatemala", " Guinea", " Guinea-Bissau", " Guyana", " Haiti", " Holy Roman Empire", " Honduras", " Hungary",
            " Iceland", " India", " Indonesia", " Iran", " Iraq", " Republic of Ireland", " Israel", " Italy", " Ivory Coast", " Jamaica",
            " Japan", " Jonathanland", " Jordan", " Kazakhstan", " Kenya", " Kiribati", " North Korea", " South Korea", " Kosovo",
            " Kuwait", " Kyrgyzstan", " Laos", " Latvia", " Lebanon", " Lesotho", " Liberia", " Libya", " Liechtenstein", " Lithuania",
            " Luxembourg", " Macedonia", " Madagascar", " Malawi", " Malaysia", " Maldives", " Mali", " Malta", " Marshall Islands",
            " Mauritania", " Mauritius", " Mexico", " Micronesia", " Moldova", " Monaco", " Mongolia", " Montenegro", " Morocco", " Mount Athos",
            " Mozambique", " Namibia", " Nauru", " Nepal", " Newfoundland", " Netherlands", " New Zealand", " Nicaragua", " Niger", " Nigeria",
            " Norway", " Oman", " Ottoman Empire", " Pakistan", " Palau", " Panama", " Papua New Guinea", " Paraguay", " Peru", " Philippines",
            " Poland", " Portugal", " Prussia", " Qatar", " Romania", " Rome", " Russian Federation", " Rwanda", " St Kitts & Nevis", " St Lucia",
            " Saint Vincent & the", " Grenadines", " Samoa", " San Marino", " Sao Tome & Principe", " Saudi Arabia", " Senegal", " Serbia",
            " Seychelles", " Sierra Leone", " Singapore", " Slovakia", " Slovenia", " Solomon Islands", " Somalia", " South Africa", " Spain",
            " Sri Lanka", " Sudan", " Suriname", " Swaziland", " Sweden", " Switzerland", " Syria", " Tajikistan", " Tanzania", " Thailand",
            " Togo", " Tonga", " Trinidad & Tobago", " Tunisia", " Turkey", " Turkmenistan", " Tuvalu", " Uganda", " Ukraine",
            " United Arab Emirates", " United Kingdom", " Uruguay", " Uzbekistan", " Vanuatu", " Vatican City", " Venezuela", " Vietnam",
            " Yemen", " Zambia", " Zimbabwe"};

    List<counteryListData> counteryList;
    RecyclerView recyclerView;
    ListAdapter mAdapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counteryList = new ArrayList<>();

        int i = 1;
        for (String x : countries) {
            x = x.trim();
            counteryListData data = new counteryListData(i + ". " + x, x);
            counteryList.add(data);
            i++;
        }

        recyclerView = (RecyclerView) findViewById(R.id.recycler);


        mAdapter = new ListAdapter(counteryList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }


}
