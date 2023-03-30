package com.prabs.travelasha;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MonthActivity extends AppCompatActivity {

    CompactCalendarView compactCalender;
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM-yyyy", Locale.getDefault());
    private TextView monthView;
    private String monthSel;
    private Button domesticButton;
    private Button internationalButton;
    private TextView descText;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);

        monthView = (TextView)findViewById(R.id.monthView);

        domesticButton = (Button)findViewById(R.id.domesticButton);
        internationalButton = (Button)findViewById(R.id.internationalButton);

        descText = (TextView)findViewById(R.id.descText);
        if (Build.VERSION.SDK_INT >= 26) {
            descText.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);

        }



        Button planButton = (Button)findViewById(R.id.planButton);
        Button contactButton = (Button)findViewById(R.id.contactButton);
        Button homeButton = (Button)findViewById(R.id.homeButton);


        planButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MonthActivity.this,EnquiryActivity.class);
                startActivity(intent);

            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MonthActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MonthActivity.this,ContactActivity.class);
                startActivity(intent);

            }
        });



        Bundle extras = getIntent().getExtras();
        monthSel = extras.getString("Month");
        monthView.setText(monthSel + " 2022");


        domesticButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MonthActivity.this,DestinationActivity.class);
                intent.putExtra("Month", monthSel);
                intent.putExtra("Destination", "domestic");
                startActivity(intent);
            }
        });

        internationalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(MonthActivity.this,DestinationActivity.class);
                intent.putExtra("Month", monthSel);
                intent.putExtra("Destination", "international");
                startActivity(intent);

            }
        });


        CalendarSetup();











    }




    public void CalendarSetup(){

        compactCalender = (CompactCalendarView)findViewById(R.id.compactcalendar_view);


        switch (monthSel){

            case "January": compactCalender.setCurrentDate(new Date((2022-1900),00,01));
                break;
            case "February": compactCalender.setCurrentDate(new Date((2022-1900),01,01));

                descText.setText("February is still winter in the Northern hemisphere and the last month of summer in Southern Hemisphere. Although the shortest month of the year, it’s a good time to visit many destinations across the globe. Love is in the air around Valentine’s Day on 14th February. So, plan your romantic getaway");

                break;
            case "March": compactCalender.setCurrentDate(new Date((2022-1900),02,01));

                descText.setText("The month of March marks the end of winter and the beginning of Spring. It is equivalent of September in Southern Hemisphere. In most parts of the world the days are warm with cool winds and loads of sunshine in the warmer regions of the world. You can be part of local festivals at different destinations. Great time to travel with a wide choice of destinations to choose from");
                break;
            case "April": compactCalender.setCurrentDate(new Date((2022-1900),03,01));

                descText.setText("April means Spring, warmth and colour. The sky is bright, the grass is getting greener, sunny beach sides, mountains with some snow still – it’s the best of both worlds. This month stands out for the traditional New Year and harvest festivals in different parts of India celebrated as Baisakhi, Ugadi, Gudi Padwa, Bihu. April is also the start of the holy month of Ramadan. Pleasant weather from South America to South Africa, Japan to Jordan makes this an ideal month to enjoy your holiday.");
                break;
            case "May": compactCalender.setCurrentDate(new Date((2022-1900),04,01));

                descText.setText("May is a month of change, a month of transition, no matter which part of the globe you are visiting. Winter is long gone in the Northern hemisphere and its bright and sunny whereas, in the South it’s the end of Autumn and a step closer to welcoming winters. May is also hot and almost peak summer in Arabian Peninsula and most parts of India. A Great time to visit Europe before the mad summer rush.");
                break;
            case "June": compactCalender.setCurrentDate(new Date((2022-1900),05,01));

                descText.setText("Its June and its summer time. Time to stay outdoors as much as possible, soak up the Sun, head to the beaches and holiday time for children. So, its family time too. Its start of peak tourist season in Europe, North America, Turkey and most of the Northern hemisphere. If you prefer the summer landscapes and the warmth, then this is the time to head to the destinations closer to the North Pole – Greenland, Iceland and the Nordic countries.");
                break;
            case "July": compactCalender.setCurrentDate(new Date((2022-1900),06,01));

                descText.setText("Summer holiday season extends into July for Europe and North America. This is generally the hottest month in the North and the coldest month for the Southern regions of the globe. In India with the onset of monsoon and academic sessions resuming this is off season for tourism and hence you can look for some great deals in hotels and resorts.");
                break;
            case "August": compactCalender.setCurrentDate(new Date((2022-1900),07,01));

                descText.setText("August is summer and holiday season at its peak in Europe and North America. Europe is packed this time of the year with everyone soaking in the Sun and thronging to the beaches. July through September is also the time of the Wild Beast (Wildebeest) Migration in Kenya and Tanzania. So, you know where to head this August. The destinations closer to the Artic are warm and beckoning adventure seekers and those wanting to explore distant lands.");
                break;
            case "September": compactCalender.setCurrentDate(new Date((2022-1900),8,01));

                descText.setText("September is shoulder season with summer on the wane and winter not set in yet in the North and vice versa for the South. With people back to schools, colleges and work, most places are not crowded and so this is a time to enjoy a quiet holiday. South America is blooming in September. You have a wide choice for relaxed September travel, be it South East Asia, the Mediterranean, North and Central America or Europe");
                break;
            case "October": compactCalender.setCurrentDate(new Date((2022-1900),9,01));

                descText.setText("October is many things to many regions. Its Autumn in Europe and North America, its Spring in South America, Australia and South Africa. It’s the start of the festive season in India that extends till New Year and most destinations in India boast of best weather and the higher altitudes too are comfortable for treks.");
                break;
            case "November": compactCalender.setCurrentDate(new Date((2022-1900),10,01));

                descText.setText("November is almost the end of Fall and Spring and signals the onset of winter in the Northern regions and a month of many festivals and fairs across the globe. The chances of catching the Northern Lights in Iceland and other parts near the Arctic and Yukon in Northern Canada become brighter in November. For warmth and mild weather for your holiday you could head to the islands of the Caribbean or destinations in North and Central Africa.");
                break;
            case "December": compactCalender.setCurrentDate(new Date((2022-1900),11,01));

                descText.setText("December is a month when people are in a holiday mood. Taking an off to begin the coming year on a hopeful note is a must. Its peak tourist season at most of the popular destinations, be it heading to the warmer places for some sunshine and relaxing by the beaches or heading to colder places for some fun in the snow, skiing, shopping at Christmas markets and taking in the beautifully lit up and decorated streets of cities in Europe, USA and many popular destinations. Sun or Snow – take your pick this December");
                break;
        }






        compactCalender.shouldScrollMonth(false);
        compactCalender.setUseThreeLetterAbbreviation(true);

        final Event evJanSun1 = new Event(Color.RED, 1641061800728L, "Sunday");
        final Event evJanSun2 = new Event(Color.RED, 1641666600728L, "Sunday");
        final Event evJanSun3 = new Event(Color.RED, 1642271400000L, "Sunday");
        final Event evJanSun4 = new Event(Color.RED, 1642876200000L, "Sunday");
        final Event evJanSun5 = new Event(Color.RED, 1643481000000L, "Sunday");

        final Event evfebSun1 = new Event(Color.RED, 1644085800000L, "Sunday");
        final Event evfebSun2 = new Event(Color.RED, 1644690600000L, "Sunday");
        final Event evfebSun3 = new Event(Color.RED, 1645295400000L, "Sunday");
        final Event evfebSun4 = new Event(Color.RED, 1645900200000L, "Sunday");

        final Event evMarchSun1 = new Event(Color.RED, 1646505000000L, "Sunday");
        final Event evMarchSun2 = new Event(Color.RED, 1647109800000L, "Sunday");
        final Event evMarchSun3 = new Event(Color.RED, 1647714600000L, "Sunday");
        final Event evMarchSun4 = new Event(Color.RED, 1648319400000L, "Sunday");

        final Event evAprilSun1 = new Event(Color.RED, 1648990080000L, "Sunday");
        final Event evAprilSun2 = new Event(Color.GREEN, 1649529000000L, "Sunday");
        final Event evAprilSun3 = new Event(Color.GREEN, 1650133800000L, "Sunday");
        final Event evAprilSun4 = new Event(Color.RED, 1650738600000L, "Sunday");

        final Event evMaySun1 = new Event(Color.RED, 1651409280000L, "Sunday");
        final Event evMaySun2 = new Event(Color.RED, 1651948200000L, "Sunday");
        final Event evMaySun3 = new Event(Color.RED, 1652553000000L, "Sunday");
        final Event evMaySun4 = new Event(Color.RED, 1653157800000L, "Sunday");
        final Event evMaySun5 = new Event(Color.RED, 1653762600000L, "Sunday");

        final Event evJunSun1 = new Event(Color.RED, 1654367400000L, "Sunday");
        final Event evJunSun2 = new Event(Color.RED, 1654972200000L, "Sunday");
        final Event evJunSun3 = new Event(Color.RED, 1655577000000L, "Sunday");
        final Event evJunSun4 = new Event(Color.RED, 1656181800000L, "Sunday");

        final Event evJulySun1 = new Event(Color.RED, 1656786600000L, "Sunday");
        final Event evJulySun2 = new Event(Color.RED, 1657391400000L, "Sunday");
        final Event evJulySun3 = new Event(Color.RED, 1657996200000L, "Sunday");
        final Event evJulySun4 = new Event(Color.RED, 1658601000000L, "Sunday");
        final Event evJulySun5 = new Event(Color.RED, 1659205800000L, "Sunday");

        final Event evAugSun1 = new Event(Color.RED, 1659810600000L, "Sunday");
        final Event evAugSun2 = new Event(Color.RED, 1660415400000L, "Sunday");
        final Event evAugSun3 = new Event(Color.RED, 1661020200000L, "Sunday");
        final Event evAugSun4 = new Event(Color.RED, 1661625000000L, "Sunday");

        final Event evSeptSun1 = new Event(Color.RED, 1662229800000L, "Sunday");
        final Event evSeptSun2 = new Event(Color.RED, 1662834600000L, "Sunday");
        final Event evSeptSun3 = new Event(Color.RED, 1663439400000L, "Sunday");
        final Event evSeptSun4 = new Event(Color.RED, 1664044200000L, "Sunday");

        final Event evOctSun1 = new Event(Color.GREEN, 1664649000000L, "Sunday");
        final Event evOctSun2 = new Event(Color.GREEN, 1665253800000L, "Sunday");
        final Event evOctSun3 = new Event(Color.RED, 1665858600000L, "Sunday");
        final Event evOctSun4 = new Event(Color.GREEN, 1666463400000L, "Sunday");
        final Event evOctSun5 = new Event(Color.GREEN, 1667068200000L, "Sunday");

        final Event evNovSun1 = new Event(Color.RED, 1667673000000L, "Sunday");
        final Event evNovSun2 = new Event(Color.RED, 1668277800000L, "Sunday");
        final Event evNovSun3 = new Event(Color.RED, 1668882600000L, "Sunday");
        final Event evNovSun4 = new Event(Color.RED, 1669487400000L, "Sunday");

        final Event evDecSun1 = new Event(Color.RED, 1670092200000L, "Sunday");
        final Event evDecSun2 = new Event(Color.RED, 1670697000000L, "Sunday");
        final Event evDecSun3 = new Event(Color.RED, 1671301800000L, "Sunday");
        final Event evDecSun4 = new Event(Color.GREEN, 1671906600000L, "Sunday");




        final Event evJanLohri = new Event(Color.GREEN, 1642012200000L, "Lohri");
        final Event evJanMakar = new Event(Color.GREEN, 1642098600000L, "Makar Sankranti/Pongal");
        final Event ev3 = new Event(Color.GREEN, 1643135400000L, "Republic Day");
        final Event ev4 = new Event(Color.GREEN, 1644777000000L, "Valentines Day");

        final Event evMarchMahashivratri = new Event(Color.GREEN, 1646073000000L, "Mahashivratri");
        final Event evMarchHoli = new Event(Color.GREEN, 1647628200000L, "Holi");

        final Event evAprilGoodFriday = new Event(Color.GREEN, 1649961000000L, "Good Friday");
        final Event evAprilEaster = new Event(Color.GREEN, 1650133800000L, "Easter");
        final Event evAprilGudiPadwa = new Event(Color.GREEN, 1648837800000L, "Gudi Padwa/Ugadi");
        final Event evAprilAmbedkar = new Event(Color.GREEN, 1649874600000L, "Ambedkar Jayanti/Baisakhi");
        final Event evAprilRamnavami = new Event(Color.GREEN, 1649529000000L, "Ramnavami");

        final Event evMayEid = new Event(Color.GREEN, 1651429800000L, "Eid Ul Fitr/Ramadan");
        final Event evMayBudh = new Event(Color.GREEN, 1652639400000L, "Buddha Purnima");

        final Event evJulyBakrid = new Event(Color.GREEN, 1657305000000L, "Bakrid");
        final Event evJulyGuru = new Event(Color.GREEN, 1657650600000L, "Guru Purnima");

        final Event evAugIndependence = new Event(Color.GREEN, 1660501800000L, "Independence Day");
        final Event evAugMuharram = new Event(Color.GREEN, 1659119400000L, "Muharram");
        final Event evAugOnam = new Event(Color.GREEN, 1661797800000L, "Onam");
        final Event evAugRaksha = new Event(Color.GREEN, 1660156200000L, "Raksha Bandhan");
        final Event evAugJanmashtami = new Event(Color.GREEN, 1660761000000L, "Janmashtami");

        final Event evSeptGanesh = new Event(Color.GREEN, 1661884200000L, "Ganesh Chaturthi");

        final Event evOctGandhi = new Event(Color.GREEN, 1664649000000L, "Gandhi Jayanti");
        final Event evOctAshTami = new Event(Color.GREEN, 1664735400000L, "Ashtami");
        final Event evOctNavami = new Event(Color.GREEN, 1665685800000L, "Navami");
        final Event evOctDusshera = new Event(Color.GREEN, 1664908200000L, "Dusshera");
        final Event evOctMilad = new Event(Color.GREEN, 1665081000000L, "Milad Un Nabi/Eid E Milad");
        final Event evOctValmiki = new Event(Color.GREEN, 1665253800000L, "Valmiki Jayanti");

        final Event evNovDhanteras = new Event(Color.GREEN, 1666463400000L, "Dhanteras");
        final Event evNovDiwali = new Event(Color.GREEN, 1666549800000L, "Diwali");
        final Event evNovGoverdhan = new Event(Color.GREEN, 1666722600000L, "Govardhan Puja");
        final Event evNovBhai = new Event(Color.GREEN, 1666809000000L, "Bhai Dooj");
        final Event evNovChhath = new Event(Color.GREEN, 1667068200000L, "Chhath Puja");
        final Event evNovChildren = new Event(Color.GREEN, 1668364200000L, "Children's Day");
        final Event evNovGurunanak = new Event(Color.GREEN, 1667845800000L, "Gurunanak Jayanti");

        final Event evDecChris = new Event(Color.GREEN, 1671906600000L, "Christmas");




        compactCalender.addEvent(evJanSun1);
        compactCalender.addEvent(evJanSun2);
        compactCalender.addEvent(evJanSun3);
        compactCalender.addEvent(evJanSun4);
        compactCalender.addEvent(evJanSun5);

        compactCalender.addEvent(evfebSun1);
        compactCalender.addEvent(evfebSun3);
        compactCalender.addEvent(evfebSun4);
        compactCalender.addEvent(evfebSun2);

        compactCalender.addEvent(evMarchSun1);
        compactCalender.addEvent(evMarchSun3);
        compactCalender.addEvent(evMarchSun4);
        compactCalender.addEvent(evMarchSun2);

        compactCalender.addEvent(evAprilSun1);
        compactCalender.addEvent(evAprilSun2);
        compactCalender.addEvent(evAprilSun3);
        compactCalender.addEvent(evAprilSun4);

        compactCalender.addEvent(evMaySun1);
        compactCalender.addEvent(evMaySun2);
        compactCalender.addEvent(evMaySun3);
        compactCalender.addEvent(evMaySun4);
        compactCalender.addEvent(evMaySun5);

        compactCalender.addEvent(evJunSun1);
        compactCalender.addEvent(evJunSun3);
        compactCalender.addEvent(evJunSun4);
        compactCalender.addEvent(evJunSun2);

        compactCalender.addEvent(evJulySun1);
        compactCalender.addEvent(evJulySun3);
        compactCalender.addEvent(evJulySun4);
        compactCalender.addEvent(evJulySun2);
        compactCalender.addEvent(evJulySun5);

        compactCalender.addEvent(evAugSun1);
        compactCalender.addEvent(evAugSun2);
        compactCalender.addEvent(evAugSun3);
        compactCalender.addEvent(evAugSun4);

        compactCalender.addEvent(evSeptSun1);
        compactCalender.addEvent(evSeptSun3);
        compactCalender.addEvent(evSeptSun4);
        compactCalender.addEvent(evSeptSun2);

        compactCalender.addEvent(evOctSun1);
        compactCalender.addEvent(evOctSun2);
        compactCalender.addEvent(evOctSun3);
        compactCalender.addEvent(evOctSun4);
        compactCalender.addEvent(evOctSun5);

        compactCalender.addEvent(evNovSun1);
        compactCalender.addEvent(evNovSun2);
        compactCalender.addEvent(evNovSun3);

        compactCalender.addEvent(evDecSun1);
        compactCalender.addEvent(evDecSun3);
        compactCalender.addEvent(evDecSun4);
        compactCalender.addEvent(evDecSun2);



        compactCalender.addEvent(evJanLohri);
        compactCalender.addEvent(evJanMakar);
        compactCalender.addEvent(ev3);
        compactCalender.addEvent(ev4);


        compactCalender.addEvent(evMarchMahashivratri);
        compactCalender.addEvent(evMarchHoli);

        compactCalender.addEvent(evAprilGoodFriday);
        compactCalender.addEvent(evAprilAmbedkar);
        //compactCalender.addEvent(evAprilEaster);
        compactCalender.addEvent(evAprilGudiPadwa);
        //compactCalender.addEvent(evAprilRamnavami);

        compactCalender.addEvent(evMayEid);
        compactCalender.addEvent(evMayBudh);

        compactCalender.addEvent(evJulyBakrid);
        compactCalender.addEvent(evJulyGuru);

        compactCalender.addEvent(evAugIndependence);
        compactCalender.addEvent(evAugJanmashtami);
        compactCalender.addEvent(evAugMuharram);
        compactCalender.addEvent(evAugOnam);
        compactCalender.addEvent(evAugRaksha);

        compactCalender.addEvent(evSeptGanesh);

        compactCalender.addEvent(evOctAshTami);
        compactCalender.addEvent(evOctDusshera);
        //compactCalender.addEvent(evOctGandhi);
        compactCalender.addEvent(evOctMilad);
        compactCalender.addEvent(evOctNavami);
        //compactCalender.addEvent(evOctValmiki);

        compactCalender.addEvent(evNovBhai);
        //compactCalender.addEvent(evNovChhath);
        compactCalender.addEvent(evNovChildren);
        //compactCalender.addEvent(evNovDhanteras);
        compactCalender.addEvent(evNovDiwali);
        compactCalender.addEvent(evNovGoverdhan);
        compactCalender.addEvent(evNovGurunanak);

        //compactCalender.addEvent(evDecChris);



        compactCalender.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Log.d("testMssg", String.valueOf(dateClicked.getTime()));
                Log.d("testMssg",dateClicked.toString());

                if(dateClicked.toString().compareTo("Wed Jan 26 00:00:00 GMT+05:30 2022") == 0){
                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), ev3.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Mon Feb 14 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), ev4.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Thu Jan 13 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evJanLohri.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Fri Jan 14 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evJanMakar.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Tue Mar 01 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evMarchMahashivratri.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Sat Mar 19 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evMarchHoli.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Fri Apr 15 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evAprilGoodFriday.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Sun Apr 17 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evAprilEaster.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Sat Apr 02 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evAprilGudiPadwa.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Thu Apr 14 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evAprilAmbedkar.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Sun Apr 10 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evAprilRamnavami.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Mon May 16 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evMayBudh.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Mon May 02 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evMayEid.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Sat Jul 09 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evJulyBakrid.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Wed Jul 13 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evJulyGuru.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Mon Aug 15 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evAugIndependence.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Thu Aug 18 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evAugJanmashtami.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Thu Aug 11 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evAugRaksha.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Tue Aug 30 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evAugOnam.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Sat Jul 30 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evAugMuharram.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Wed Aug 31 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evSeptGanesh.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Mon Oct 03 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evOctAshTami.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Fri Oct 14 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evOctNavami.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Wed Oct 05 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evOctDusshera.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Fri Oct 07 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evOctMilad.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Sun Oct 09 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evOctValmiki.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Sun Oct 02 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evOctGandhi.getData().toString(), Toast.LENGTH_SHORT).show();
                } else if(dateClicked.toString().compareTo("Thu Oct 27 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evNovBhai.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Sun Oct 30 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evNovChhath.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Mon Nov 14 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evNovChildren.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Sun Oct 23 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evNovDhanteras.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Mon Oct 24 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evNovDiwali.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Wed Oct 26 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evNovGoverdhan.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Tue Nov 08 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evNovGurunanak.getData().toString(), Toast.LENGTH_SHORT).show();
                }else if(dateClicked.toString().compareTo("Sun Dec 25 00:00:00 GMT+05:30 2022") == 0){

                    Log.d("testMssg","yoooo");
                    Toast.makeText(getApplicationContext(), evDecChris.getData().toString(), Toast.LENGTH_SHORT).show();
                }



            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {


            }
        });
    }
}