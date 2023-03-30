package com.prabs.travelasha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.Button;

public class DestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);



        Button planButton = (Button)findViewById(R.id.planButton);
        Button contactButton = (Button)findViewById(R.id.contactButton);
        Button homeButton = (Button)findViewById(R.id.homeButton);


        planButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DestinationActivity.this,EnquiryActivity.class);
                startActivity(intent);

            }
        });



        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DestinationActivity.this,ContactActivity.class);
                startActivity(intent);
            }
        });
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DestinationActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });




        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setNestedScrollingEnabled(false);


        Bundle extras = getIntent().getExtras();
        switch (extras.getString("Destination")){

            case "international":

                switch(extras.getString("Month")){

                    case "January":

//                        String otherPicks = "SRILANKA – Great Winter month. Dry and sunny days with little rain. Moderate temperature\n\nRIO DE JANEIRO, BRAZIL – Though the hottest month of the year, its peak tourist season.Loads of sunshine, hot days and cool and humid nights \n\nARGENTINA – Summer time and wet season too. Good time for the beaches and to visit the Iguazu falls\n\nCAPE TOWN, SOUTH AFRICA – Warm summer and sunshine month. High season\n\nMALDIVES – Warm, tropical and little rain and plenty of sunshine. Calm and clear waters\n\nHONG KONG – January is the driest and the coldest month but its still very mild and a good time to visit\n\nPHILIPPINES – Dry season with easy access to even remote islands. Days are warm and sunny";
//
//                        SpannableString ss = new SpannableString(otherPicks);
//                        StyleSpan bold = new StyleSpan(Typeface.BOLD);
//                        StyleSpan bold1 = new StyleSpan(Typeface.BOLD);
//                        StyleSpan bold2 = new StyleSpan(Typeface.BOLD);
//                        StyleSpan bold3 = new StyleSpan(Typeface.BOLD);
//                        StyleSpan bold4 = new StyleSpan(Typeface.BOLD);
//                        StyleSpan bold5 = new StyleSpan(Typeface.BOLD);
//                        StyleSpan bold6 = new StyleSpan(Typeface.BOLD);
//                        ss.setSpan(bold,0,8,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//                        ss.setSpan(bold1,25,48,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//                        ss.setSpan(bold2,68,78,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//                        ss.setSpan(bold3,109,133,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//                        ss.setSpan(bold4,154,163,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//                        ss.setSpan(bold5,196,207,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//                        ss.setSpan(bold6,241,252,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                        String othertops1 = "SRILANKA – Great Winter month. Dry and sunny " +
                                "days with little rain. Moderate temperature\n\n" +
                                "RIO DE JANEIRO, BRAZIL – Though the " +
                                "hottest month of the year, its peak tourist season. " +
                                "Loads of sunshine, hot days and cool and humid " +
                                "nights\n\n" +
                                "ARGENTINA – Summer time and wet season too. " +
                                "Good time for the beaches and to visit the Iguazu falls\n\n" +
                                "CAPE TOWN, SOUTH AFRICA – Warm " +
                                "summer and sunshine month. High season\n\n" +
                                "MALDIVES – Warm, tropical and little rain and " +
                                "plenty of sunshine. Calm and clear waters\n\n" +
                                "HONG KONG – January is the driest and the " +
                                "coldest month but its still very mild and a good time " +
                                "to visit\n\n" +
                                "PHILIPPINES – Dry season with easy access to " +
                                "even remote islands. Days are warm and sunny";

                        SpannableString ss = new SpannableString(othertops1);


                        String  thailand = "The country offers urban delights, theme parks, a vibrant nightlife, idyllic beaches, lush green tropical forests, varied and sumptuous cuisine, exquisite temples, budget shopping – all on a platter";
                        SpannableString ssthailand = new SpannableString(thailand);

                        String dubai  = "Climb on top of the tallest building Burj Khalifa, bask in the glitz and glamour of luxurious malls, have loads of fun at theme parks, desert safaris, high adrenaline adventures and unlimited shopping at the Dubai Shopping Festival";
                        SpannableString ssdubai = new SpannableString(dubai);

                        String combodia  = "Cambodia is best known for the legendary ancient temple complex of Angkor Wat. The Tonle Sap (the Great Lake), the city of Phnom Penh and the Pagodas and so much more to explore. You can combine your trip with a visit to neighbouring Vietnam around the same time with many cities in Vietnam well connected by short flights from Cambodia. Long stretches of beaches and beach resorts, busy and historic cities, the popular Halong Bay for its limestone cliffs, caves and islands scattered around – Vietnam is a complete package.";
                        SpannableString sscombodia = new SpannableString(combodia);

                        MyMovieData[] myMovieData = new MyMovieData[]{
                                new MyMovieData("THAILAND",ssthailand,R.drawable.thailandonefin,R.drawable.thailandtwofin),
                                new MyMovieData("DUBAI",ssdubai,R.drawable.dubaionefin,R.drawable.dubaitwofin),
                                new MyMovieData("CAMBODIA & VIETNAM",sscombodia,R.drawable.cambodiaonefin,R.drawable.vietnamtwofin),
                                new MyMovieData("OTHER DESTINATIONS", ss,R.drawable.janintonefin,R.drawable.janinttwofin),

                        };

                        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter);
                        recyclerView.invalidate();

                        break;
                    case "February":

                        String  brazil = "A country that’s home to great cities, spectacular beaches, the Amazon jungle, Iguazu falls, a vibrant culture and varying climates across regions. Visit Rio for the annual Rio Carnival in February and fun time on the beaches. The giant statue of Christ the Redeemer overlooking the city of Rio de Janeiro is the best known landmark of the popular city and the country. Learn some cool Samba moves on your trip. If visiting Amazon is on your mind then plan a trip around July or August which is the dry season there.";
                        SpannableString ssbrazil = new SpannableString(brazil);

                        String  srilanka = "Called the Pearl of the Indian Ocean Sri Lanka is a tear drop shaped island nation that’s a perfect mix of nature, culture and history. The country has unending stretches of beaches on the East coast and the West Coast lined with beach resorts and hotels. Its a great place for watersports and scuba diving. Sri lanka is known as a shopping destination too. Besides apparel, shop for spices, tea and semi precious stones. There are several Buddhist temples and ancient cities, some of them UNESCO World Heritage sites strewn across the country. Wildlife enthusiasts will be spoilt for choice with so many Wildlife reserves and parks.";
                        SpannableString ssShrilanka = new SpannableString(srilanka);

                        String  hongkong = "A destination for all seasons, Hong Kong has a vibrant and fast paced urban life, interspersed with ancient religious and cultural sites. It’s a shoppers’ paradise with markets that cater to people with varied budgets from international designer boutiques to high street fashion to cheap bargains at local markets and lip smacking delicacies served at a variety of restaurants. Shop for electronics, jade, souvenirs, apparel and accessories. The views of the city from the Victoria peak are stunning. The place has theme parks for the young and old alike. Combine a trip to Hong Kong with a visit and stay at Macau too that’s a short ferry ride from Hong Kong";
                        SpannableString ssHongkong = new SpannableString(hongkong);

                        String OtherTop = "CAMBODIA – Clear skies and sunshine welcomes you to explore Cambodia\n\n" +
                                "VIETNAM – Be a part of Tet, the Vietnamese New Year Celebrations. Also " +
                                "perfect beach weather\n\n" +
                                "PHILLIPINES – Mild weather, easy access to most islands, festival time and " +
                                "typhoons nowhere in sight – thats Philippines in February for you\n\n" +
                                "MALDIVES – Enjoy loads of sunshine and crystal clear waters for snorkelling " +
                                "and diving. The best romantic getaway\n\n" +
                                "ARGENTINA – Warm weather and dry season makes this a good month and " +
                                "you have access to all the attractions from December to March\n\n" +
                                "BOLIVIA – The wet season of January to March is best if you want to see the " +
                                "giant mirror effect on the Uyuni salt flats\n\n" +
                                "DUBAI – Sunny days and cool nights, it cant get any better.\n\n" +
                                "CAPE TOWN, SOUTH AFRICA – Warm and dry February is an ideal time " +
                                "for a quiet beach holiday with most holiday crowds gone\n\n" +
                                "THAILAND – It’s a month of celebrations – Chinese New Year and Valentine’s " +
                                "Day. So, lot of fun and crowds too !";

                        SpannableString ssOtherPicks = new SpannableString(OtherTop);


                        MyMovieData[] myMovieData1 = new MyMovieData[]{
                                new MyMovieData("BRAZIL",ssbrazil,R.drawable.brazilone,R.drawable.braziltwo),
                                new MyMovieData("SRI LANKA",ssShrilanka,R.drawable.srilankaone,R.drawable.srilankatwo),
                                new MyMovieData("HONG KONG",ssHongkong,R.drawable.hongkongone,R.drawable.hongkongtwo),
                                new MyMovieData("OTHER DESTINATIONS", ssOtherPicks,R.drawable.febintone,R.drawable.febinttwo),

                        };

                        MyMovieAdapter myMovieAdapter1 = new MyMovieAdapter(myMovieData1,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter1);
                        recyclerView.invalidate();
                        break;
                    case "March":

                        String  maldives = "The island nation in the Indian ocean off the south western coast of India is known for its luxury resorts, crystal clear turquoise waters, idyllic unspoilt beaches for that luxurious laid back beach and island holiday. Access to the islands are by speed boat or sea plane or limited domestic flights. Relax and pamper yourself or enjoy water sports and under water adventures. A stay at the over water villas made on stilts on water is a unique experience.";
                        SpannableString ssMaldives = new SpannableString(maldives);

                        String  caribbean = "Cruise to the Caribbean or fly down to one or a few of the many islands of the Caribbean for that ultimate island holiday. Enjoy swimming in the shallow waters, snorkel to see the captivating corals, dive to discover the treasures of the ocean, trek through the jungles or explore ancient ruins, relish local food and party hard. It’s hard to choose and so one trip will not suffice – Cozumel, Jamaica, Grand Cayman, St. Kitts, Bahamas, Antigua, Haiti and the list goes on. Weather wise, its hard to beat March in the Caribbean. Warm ocean waters and very pleasant day and night temperatures.";
                        SpannableString ssCaribbean = new SpannableString(caribbean);

                        String  singapore = "A tiny sovereign island city state, Singapore is a prosperous nation and the largest and busiest port in South East Asia. It’s a melting pot of Malay, Chinese, Arab and Indian cultures and British influence. Its urban landscape is dotted with a variety of man-made tourist attractions and theme parks. It’s an all weather tourist destination for all age groups. Gardens by the Bay, Singapore Flyer, the iconic Merlion park, Singapore Zoo, Jurong Bird Park, Universal Studios, SEA Aquarium, adventure rides and shows at Sentosa Island are some of the main attractions.";
                        SpannableString ssSingapore = new SpannableString(singapore);

                        String  otherTop2 = "PHILIPPINES – Moderate temperatures, cool mountains and breezy beaches " +
                                "makes March a good month to visit Philippines\n\n" +
                                "MALAYSIA –The spring month of March is calm with slight wind blowing and " +
                                "makes for perfect beach weather\n\n" +
                                "NEW ZEALAND – Warm weather in North and a little cooler in the South, " +
                                "temperatures are moderate and it isn’t a very wet month. March is a month of " +
                                "transition from Summer to Winter and a good time to visit\n\n" +
                                "EGYPT – Pleasantly warm weather makes it comfortable to explore the " +
                                "pyramids or for beach activities.\n\n" +
                                "SEYCHELLES – Loads of sunshine, warm temperatures and occasional " +
                                "short showers makes this a good time\n\n" +
                                "BRAZIL – The summer is coming to an end. You can expect a few days of " +
                                "rainfall. But warm sea waters for swimming, comfortable night temperatures and " +
                                "breezy evenings\n\n" +
                                "JORDAN – March marks the end of winters and the onset of Spring. A very " +
                                "enjoyable month to visit Jordan to witness a burst of wildflowers blooming. " +
                                "Tourist high season is about to begin soon.\n\n" +
                                "NEPAL – Plenty of sunshine, clear visibility of the mountains and great time " +
                                "for treks with slightly chilly nights";
                        SpannableString ssOtherTop2 = new SpannableString(otherTop2);


                        MyMovieData[] myMovieData2 = new MyMovieData[]{
                                new MyMovieData("Maldives",ssMaldives,R.drawable.maldivesone,R.drawable.maldivestwo),
                                new MyMovieData("CARIBBEAN",ssCaribbean,R.drawable.caribbeanone,R.drawable.caribbeantwo),
                                new MyMovieData("SINGAPORE",ssSingapore,R.drawable.singaporeone,R.drawable.singaporetwo),
                                new MyMovieData("OTHER DESTINATIONS", ssOtherTop2,R.drawable.marchintone,R.drawable.marchinttwo),

                        };

                        MyMovieAdapter myMovieAdapter2 = new MyMovieAdapter(myMovieData2,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter2);
                        recyclerView.invalidate();

                        break;
                    case "April":

                        String  japan = "The land of the rising Sun, Japan has a distinct culture and way of life. During a visit to Japan you will be awed by the strikingly beautiful parks, natural beauty of mountains and rivers, a highly advanced urban landscape and technology, delicious cuisine, dance forms and music. April is a month of festivals and considered one of the best months to visit Japan as it is the cherry blossom season. Spring means a burst of color, sunny afternoons and cool evenings for outdoor adventures. Besides cherry blossom, you can also enjoy viewing Wisteria and Tulips in many parts of Japan. The cherry blossom bloom peaks at different times in different regions – starting from January and extending till May. You can take the bullet trains from Tokyo to Osaka and fly down to Hiroshima.";
                        SpannableString ssJapan = new SpannableString(japan);

                        String  bhutan = "Nestled in the Himalayas, this Buddhist Kingdom is known for its monasteries, breath taking natural beauty of hills and valleys, trekking trails and the efforts made by the government and its people to conserve the environment and preserve their distinct culture. You can fly into Paro, the international airport or reach Bhutan through land route from West Bengal or Sikkim. The Paro Taktsang monastery popularly known as the Tiger’s nest, the various Dzongs near Thimpu and in Punakha are a must visit. March and April are ideal months to visit Bhutan for clear skies and pleasant weather";
                        SpannableString ssBhutan = new SpannableString(bhutan);

                        String  china = "The most populous country of the world, China is very vast with varied landscapes and multitude of cities and towns. There’s so much more to China than the most famous Great Wall and the Forbidden City. Walk along the Bund, eat and shop at Shanghai, take in the sight of the Terracotta warriors and the city walls of Xian, cruise on Yangtse river and see the stunning three gorges, the beautiful city of Guangzhou, watching Giant Pandas at the Chengdu Panda Base are a few things to be included in your tour itinerary. The cities are well connected by domestic flights. April is Spring time and a good time to visit the country";
                        SpannableString ssChina = new SpannableString(china);

                        String  otherTop = "AUSTRALIA – April is Fall season and warm across most of the country. Best " +
                                "for Coastal walks and white water rafting.\n\n" +
                                "NEW ZEALNAD – This is the middle of Autumn in New Zealand. Air is crisp " +
                                "and cold with orange leaves in some parts of the country while in the North it is " +
                                "warm.\n\n" +
                                "BALI – With the average temperature of 27 degrees Celsius, the sea is warm, " +
                                "very little rain and loads of sunshine, you can head to Bali\n\n" +
                                "JORDAN – April is high season in Jordan as visitors flock to the country to " +
                                "experience Spring and take advantage of the best weather\n\n" +
                                "NEPAL – The most popular month with prime weather for outdoor adventure " +
                                "and the trekking routes are at their best and busiest\n\n" +
                                "SEYCHELLES – Beautifully warm weather, with short and sharp showers " +
                                "and so great time to be on the beach in the islands\n\n" +
                                "MOROCCO – Spring season in Morocco and tourists start flocking to the " +
                                "country. Warm days and cool nights.\n\n" +
                                "MIAMI, FLORIDA & HAWAII, USA – Lovely sea temperature for " +
                                "swimming and loads of sunshine marred only by a couple of days of showers\n\n" +
                                "SOUTH KOREA – Spring time with cherry blossoms and pleasant weather to " +
                                "visit South Korea";
                        SpannableString ssOtherTop1 = new SpannableString(otherTop);


                        MyMovieData[] myMovieData3 = new MyMovieData[]{
                                new MyMovieData("JAPAN",ssJapan,R.drawable.japanone,R.drawable.japantwo),
                                new MyMovieData("BHUTAN",ssBhutan,R.drawable.bhutanone,R.drawable.bhutantwo),
                                new MyMovieData("CHINA",ssChina,R.drawable.chinaone,R.drawable.chinatwo),
                                new MyMovieData("OTHER DESTINATIONS", ssOtherTop1,R.drawable.aprilintone,R.drawable.aprilinttwo),

                        };

                        MyMovieAdapter myMovieAdapter3 = new MyMovieAdapter(myMovieData3,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter3);
                        recyclerView.invalidate();
                        break;
                    case "May":

                        String  thailand1 = "";
                        SpannableString ssthailand1 = new SpannableString(thailand1);


                        String  netherlands = "The land of Tulips, Netherlands' (Holland) capital Amsterdam attracts a lot of tourists and is famous for its gabled buildings, network of canals, the Windmills and museums. Although Spring is March and April, these months witness many days of rainfall and the temperatures are on the lower side. The summer months of May, June and July are great months to visit Amsterdam and its country side. If you are keen on seeing Tulips in full bloom, then plan your trip in the first week of May and head to the Kuekenhof Tulip gardens that is open from 20 th March till 9 th May in 2021. The best known attractions are the windmills of Zaanse Schans or Kinderdijk, the Van Gogh Museum, the Rijkmuseum, Anne Frank house, the Dam square, the fishing village of Marken and the town of Volendam and the list goes on…";
                        SpannableString ssNetherlands = new SpannableString(netherlands);

                        String  usa = "Covering a large portion of North America with 50 states - Alaska on the North, varied landscapes from Atlantic East Coast to Pacific West Coast and extending till the Gulf of Mexico in the South and Hawaiian islands in the pacific, exploring destinations in the USA at the best time of the year would mean making multiple trips to these places at different times of the year. It’s a land that never ceases to amaze visitors and has so much to offer in the form of natural landscapes, great cities, extreme adventure, entertainment and history. Embark on an Alaska cruise, visit the US side of the thundering Niagara falls, be mesmerized by the scale and pace of New York, feel the power of the most powerful nation at Washington DC, have some fun at sin city Las Vegas, be star struck at Hollywood or enjoy the joy rides at the various theme parks on the East and West Coast. The summer months from May to September are warm and great for the outdoors.";
                        SpannableString ssUSA = new SpannableString(usa);

                        String  italy = "Located in Southern Europe, Italy is a popular tourist destination with a long Mediterranean coast line and the Alps in the North. Italy is renowned for its cuisine that’s a favourite with people across the globe; wine, gelato, glorious history and accomplishments in the fields of arts, architecture, science, fashion and sports. Situated within the capital city of Rome is the Vatican. The list of must visit destinations in Italy is pretty long – Milan, Florence, Venice, Pisa, the Amalfi Coast, Naples, Rome. Summer months witnesses a flood of tourists and overcrowding of the touristy areas. You can avoid the really hot months of July and August. The months of May/June and September/October are ideal to enjoy a trip to Italy";
                        SpannableString ssItaly = new SpannableString(italy);

                        String  otherTops1 = "MOROCCO – Expect warm and fairly dry and windy days and cooler evenings. " +
                                "Spring time with green foliage in the mountains. Great time for outdoors.\n\n" +
                                "SOUTH KOREA – One of the busy holiday months with pleasant weather. Spring " +
                                "time flowers in bloom.\n\n" +
                                "UZBEKISTAN – With temperature in the range of 14 to 28 degrees Celsius, this is " +
                                "the perfect time to explore the cities along the silk road – Samarkhand, Bukhara, " +
                                "Tashkent, Khiva and also outdoor activities.\n\n" +
                                "AZERBAIJAN – Dry weather and pleasant temperatures to visit the many " +
                                "attractions old and new of the city of Baku and the burning mountains\n\n" +
                                "BHUTAN – Pre monsoon summer month that’s suited for trekking and outdoors\n\n" +
                                "BALI – Wonderfully dry month and beautiful warm weather for the hills and beaches\n\n" +
                                "SPAIN & PORTUGAL – With winter having ended, the days are longer with " +
                                "plenty of Sunshine\n\n" +
                                "PERU – May signals the end of rains in the Sacred Valley. Perfect dry weather to " +
                                "visit Cusco and Machu Pichu and Peruvian Amazon forests\n\n" +
                                "AUSTRALIA & NEW ZEALAND – End of Autumn and beginning of early " +
                                "winter. Moderate day time temperatures. Coastal areas are comparatively warmer than " +
                                "the interiors.";
                        SpannableString ssOthertops1 = new SpannableString(otherTops1);

                        MyMovieData[] myMovieData4 = new MyMovieData[]{
                                new MyMovieData("NETHERLANDS",ssNetherlands,R.drawable.netherlandsone,R.drawable.netherlandstwo),
                                new MyMovieData("UNITED STATES OF AMERICA",ssUSA,R.drawable.americaone,R.drawable.americatwo),
                                new MyMovieData("ITALY",ssItaly,R.drawable.italyone,R.drawable.italytwo),
                                new MyMovieData("OTHER DESTINATIONS", ssOthertops1,R.drawable.mayintone,R.drawable.mayinttwo),

                        };

                        MyMovieAdapter myMovieAdapter4 = new MyMovieAdapter(myMovieData4,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter4);
                        recyclerView.invalidate();

                        break;
                    case "June":

                        String  france = "Paris, the capital city of France is one of the most visited European cities by tourists. With its iconic Eiffel Tower, the Louvre museum and its famous exhibit of Mona Lisa, the Notre Dame Cathedral, the Champs Elysees and the fashionable boutiques that line the avenue, the palace of Versailles on the outskirts, tourists have a busy schedule in Paris. France is also known for the French Riviera with its beaches and lux lifestyle of its residents. The country produces the best known wines, champagne and perfumes.";
                        SpannableString ssFrance = new SpannableString(france);

                        String  germany = "One of the best European countries for city breaks as well as picture perfect country side and quaint towns along the German side of Alps. Summer is a good time to enjoy sunshine and explore the varied landscapes of the country. From historic and cosmopolitan cities of Berlin, Frankfurt and Munich that boast of history, architecture, busy squares and festivals to laid back towns of Black Forest, picturesque towns and villages of Bavaria bordering Austria, Germany has a lot to offer. The Rhine river cruises, the fairy tale Neuschwanstein castle, Europa Park and other theme parks or an unforgettable self drive trip along the 350 km romantic road are some of the things you must include in your itinerary.";
                        SpannableString ssGermany = new SpannableString(germany);

                        String  switzerland = "A very popular summer tourist destination, Switzerland is a must on every honeymooner’s wish list. Located in the Alps, the mountains and towns turn into a winter wonderland during winters, fully covered in snow. The landscape changes dramatically to lush green valleys with snow only on the higher reaches of the Alps during Summer. Depending on your holiday preference, you could plan your Swiss tour. The cities and towns of Zurich, Geneva, Lausanne, Lucerne, Interlaken, Bern, Basel, Grindelwald, St Moritz, Zermatt are all well connected through a highly efficient Swiss rail network. They are also well connected with neighbouring countries of Germany, Italy and France. Scale the peaks of Jungfrau, Mt Rigi, Mt Pilatus, Matterhorn and many more by hill railway or cable cars";
                        SpannableString ssSwitzerland = new SpannableString(switzerland);

                        String  otherTop6 = "PERU – Perfect time to visit the interiors, the Cusco region and Machu Pichu as this " +
                                "is dry season of the year\n\n" +
                                "TURKEY – Lovely dry summer for visiting Istanbul, Cappadocia and the " +
                                "Mediterranean coast before the holiday crowds start pouring in during July and " +
                                "August\n\n" +
                                "UZBEKISTAN – Comfortable weather with high day temperatures and winds. " +
                                "Comparatively dry month to explore\n\n" +
                                "AZERBAIJAN – Blue skies, dry weather and pleasant temperatures makes this a " +
                                "great month to visit Baku and nearby attractions\n\n" +
                                "ISRAEL – Beginning of Summer, dry weather and clear skies. Sunniest and popular " +
                                "month to visit Israel\n\n" +
                                "GREECE – Not peak summer yet. The moderate temperature is ideal for beaches " +
                                "and open air dining\n\n" +
                                "BALI – Warm and dry month with average temperature of 27 degrees celcius with lot " +
                                "of sunshine and ideal sea temperature for swimming and water sports\n\n" +
                                "SPAIN & PORTUGAL – Lots of sunshine, warm temperature and mild seas and " +
                                "very dry month. Portugal has beautiful summer sunshine with lot of festivals\n\n" +
                                "SCANDINAVIA – Beginning of summer with long days and short nights and " +
                                "pleasant temperature on land and sea. Plan a trip to Norwary, Sweden and Denmark\n\n" +
                                "AMALFI COAST, ITALY – Summer has officially arrived and beaches fill with " +
                                "people, boats and yachts and festive summer atmosphere everywhere";
                        SpannableString ssOtherTop6 = new SpannableString(otherTop6);


                        MyMovieData[] myMovieData6 = new MyMovieData[]{
                                new MyMovieData("FRANCE",ssFrance,R.drawable.franceone,R.drawable.francetwo),
                                new MyMovieData("GERMANY",ssGermany,R.drawable.germanyone,R.drawable.germanytwo),
                                new MyMovieData("SWITZERLAND",ssSwitzerland,R.drawable.switzerlandone,R.drawable.switzerlandtwo),
                                new MyMovieData("OTHER DESTINATIONS", ssOtherTop6,R.drawable.juneintone,R.drawable.juneinttwo),

                        };

                        MyMovieAdapter myMovieAdapter6 = new MyMovieAdapter(myMovieData6,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter6);
                        recyclerView.invalidate();


                        break;
                    case "July":

                        String  canada = "The second largest country in the world in terms of area and located in the northern part of North America, Canada stretches from the Atlantic Ocean in the East to the Pacific Ocean in the West. It’s a country of dense forests, pristine lakes, tall mountains, big cities and diverse cultures. Visit the Canadian side of the Niagara falls, enjoy the sights of the city of Toronto and its suburbs, the capital of Ottawa, embark on a scenic train trip on the Rocky Mountaineer, take in the jaw dropping landscapes of Banff National park or stroll through the best urban parks of the city of Vancouver. Summers are a good time to visit Canada considering that the country being close to Arctic has a cold climate. Visit Yukon, Muncho Lake National Park or Yellowknife to catch the Northern lights in the winter months from October to March.";
                        SpannableString ssCanada = new SpannableString(canada);

                        String  greece = "The name Greece, evokes images of whitewashed low rise buildings with electric blue doors and windows on hill slopes and looking down on crystal blue waters of the ocean below. Besides Athens located in mainland Greece, the country is made up of several small and big islands in the Ionian sea and Aegean sea. Greece is often called the cradle of Western Civilization. The historical ruins spread across the country from the Acropolis in Athens, to the temple of Apollo, the ruins of Delos blur the lines between mythology and history. The popular Greek islands are Mykonos, Santorini, Naxos, Rhodes and Crete. The islands are well connected by fast ferries and short domestic flights.";
                        SpannableString ssGreece = new SpannableString(greece);

                        String  turkey = "A country where East meets West, literally, Turkey is an interesting mix of history and culture with a modern outlook. In the historic city of Istanbul, the erstwhile Constantinople, one can cruise on river Bosphorous and hop between the two continents of Europe and Asia. The Blue Mosque, Hagia Sofia, Topkapi palace, the Grand Bazaar, Taksim square are the best known attractions of the city. Take a short flight to Cappadocia and Pamukkale to take in some breath-taking landscapes and natural cave formations. A hot air balloon ride is a must do here. The coastal cities of Izmir, Kusadasi and Antalya along the Aegean sea and Mediterranean have some stunning beaches and water sports during the summer months.";
                        SpannableString ssTurkey = new SpannableString(turkey);

                        String  otherTop7 = "KENYA – This is the month to visit Kenya if you want to witness the famous river " +
                                "crossing or the great migration of wild beasts and gazelle as the first batch of these " +
                                "animals arrive at the Masai Mara in July\n\n" +
                                "TANZANIA – Winter continues with constant clear skies and warm days and the " +
                                "driest month and good for visiting game reserves\n\n" +
                                "ISRAEL – Hottest month of the year in Jerusalem with average temperature of 23 " +
                                "degrees Celsius. Bright summer month with long days and clear skies\n\n" +
                                "CROATIA/ SLOVENIA – Summers are great for a trip to Croatia and Slovenia " +
                                "but also high tourist season. Stunningly beautiful landscapes and national parks, " +
                                "deep blue waters of the Adriatic sea and historic cities. Lake Bled in Slovenia, Zagreb, " +
                                "Plitvice lakes national park, Dubrovnik, Split and Hvar are the more popular tourist " +
                                "places.\n\n" +
                                "EASTERN EUROPE – Summer is in full swing and so are the crowds that flock " +
                                "to these places. Pick one country for spending the summer or you could combine a " +
                                "couple of neighbouring places. Czech Republic, Hungary, Poland, Bulgaria, Romania " +
                                "are all great in July\n\n" +
                                "GERMANY/ AUSTRIA – The sunniest month in these parts of the world with " +
                                "cool evenings to enjoy the landscapes under clear blue skies or stroll down the " +
                                "cobbled streets of historic squares in the cities. Be a part of the Salzburg Festival this " +
                                "month.\n\n" +
                                "THE AMAZON, BRAZIL/ BOLIVIA/ PERU – The dry season (or less wet " +
                                "season) from June/July and extending upto October in the Amazon rainforest makes " +
                                "cruising down the Amazon river a pleasure and spotting wildlife easy in Peru, Brazil " +
                                "or Bolivia";
                        SpannableString ssOtherTop7 = new SpannableString(otherTop7);

                        MyMovieData[] myMovieData7 = new MyMovieData[]{
                                new MyMovieData("CANADA",ssCanada,R.drawable.canadaone,R.drawable.canadatwo),
                                new MyMovieData("GREECE",ssGreece,R.drawable.greeceone,R.drawable.greecetwof),
                                new MyMovieData("TURKEY",ssTurkey,R.drawable.turkeyone,R.drawable.turkeytwo),
                                new MyMovieData("OTHER DESTINATIONS", ssOtherTop7,R.drawable.julyintone,R.drawable.julyinttwo),

                        };

                        MyMovieAdapter myMovieAdapter7 = new MyMovieAdapter(myMovieData7,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter7);
                        recyclerView.invalidate();


                        break;
                    case "August":


                        String  kenya = "The name of this East African country is synonymous with African wildlife safari. The country has a beautiful coastline with the Indian Ocean and beach resorts at Mombasa. The Masai Mara Reserve is known for its annual Wildebeest migration during the months of July and August. The Amboseli National Park, Lake Naivasha, Lake Nakuru are all great places to discover wild life in their natural habitats and for stunning landscapes. The capital city of Nairobi is a gateway to the other destinations in the country.";
                        SpannableString ssKenya  = new SpannableString(kenya);

                        String  bali = "An island destination in Indonesia, Bali is known for its ancient Hindu temples set against jaw dropping backdrops like the Uluwatu, Tanah Lot, Bedugul and many more. Being an island destination, it has long stretches of beautiful beaches, cliffs overlooking the beautiful ocean, water sports including surfing, undersea walk, diving, para sailing and so much more. Views of the famed rice terraces of Bali, great fun on a dinner cruise, early morning trek to the volcano, shopping and dining await you at Bali. You could choose to stay either at regular hotels or resorts or exclusive luxury villas either in the hills or close to the beaches.";
                        SpannableString ssBali = new SpannableString(bali);

                        String  uk = "When you plan a holiday to the UK, you will need to choose one or a few destinations because it is practically impossible to cover the whole of UK in one trip. The UK includes England, Scotland, Wales and Northern Ireland and a few overseas territories not anywhere close to the UK geographically. Visit London for its historical monuments, forts, palaces, squares, gardens and shopping streets. The London Eye, change of guard at the Buckingham Palace, Picadilly Square, The Tower of London, the Tower Bridge, Thames River cruise are some of the most popular places and activities with the tourists. You could also do a day trip or drive down to Stonehenge and Bath and explore the picturesque Jurassic Coast. Edinburgh, the capital of Scotland is a short flight journey from London. Besides exploring the historic city, a trip to the Highlands of Scotland will surely be memorable.";
                        SpannableString ssUk = new SpannableString(uk);

                        String  otherTop8 = "MAURITIUS – Enjoy the mild winters, sunny days and almost no rain\n\n" +
                                "TANZANIA – Warm dry days and cool nights makes August and September ideal " +
                                "months for safaris in the National parks or for climbing Mt. Kilimanjaro\n\n" +
                                "ISRAEL – August is the warmest month with average high temperature of 30 " +
                                "degrees Celsius. Best suited for sightseeing and water activities\n\n" +
                                "CROATIA/ SLOVENIA – Its still peak season, the weather is hot, perfect for " +
                                "beach days and sailing ventures, and to be part of many festivals and parties\n\n" +
                                "EASTERN EUROPE – Its almost the end of the peak season. Enjoy plenty of " +
                                "sunshine, warm weather and music and food festivals in Krakow (Poland), Warsaw, " +
                                "Budapest, Prague and other countries\n\n" +
                                "RUSSIA – August is the last month of Summer and hot with temperature highs of " +
                                "30 degrees Celsius. Good time to visit St Petersburg, Moscow and also travel on the " +
                                "Trans Siberian Railway\n\n" +
                                "IRELAND – The average temperature during July/ August is between 16 - 20°C " +
                                "This is Ireland’s driest season and has long hours of sunshine, almost 18 hours. So, " +
                                "enjoy your evenings and the mild summers";
                        SpannableString ssOtherTop8 = new SpannableString(otherTop8);


                        MyMovieData[] myMovieData8 = new MyMovieData[]{
                                new MyMovieData("KENYA",ssKenya,R.drawable.kenyaone,R.drawable.kenyatwo),
                                new MyMovieData("BALI",ssBali,R.drawable.balione,R.drawable.balitwo),
                                new MyMovieData("UNITED KINGDOM",ssUk,R.drawable.ukone,R.drawable.uktwo),
                                new MyMovieData("OTHER DESTINATIONS", ssOtherTop8,R.drawable.augintone,R.drawable.auginttwo),

                        };

                        MyMovieAdapter myMovieAdapter8 = new MyMovieAdapter(myMovieData8,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter8);
                        recyclerView.invalidate();

                        break;
                    case "September":


                        String  croatia = "A hidden gem of Europe, Croatia along with Lake Bled region of Slovenia are waiting to be explored. They are perfect mix of unparalleled scenic beauty combined with great historic cities. The picture perfect Lake Bled in Slovenia is one of the best options for a relaxed holiday in the lap of nature. Explore the nearby Vintgar Gorge and Postojna caves. The neighbouring Croatia has the charming capital city of Zagreb and cities and towns along the Dalmatian coast like Split, Zadar and Dubrovnik. The cascading waterfalls and trails of Plitvice Lakes National Park is a sight to behold. One must see it to believe it. Cruise to different small and big islands in the deep blue Adriatic sea to dive, swim or just soak in the freshness and warmth of these beautiful islands.";
                        SpannableString ssCroatia = new SpannableString(croatia);

                        String  russia = "The enigmatic land of rich cultural heritage and extreme climatic conditions is the largest country in the world and a country that has been a witness and party to major historic events that have changed the course of world history. After discovering the best attractions of St Petersburg - State Hermitage Museum, Peter and Paul Fortress, Palace Square, Peterhof Palace, Nevsky Avenue, hop on the high speed Sapsan train to reach Moscow. Hang around the Red Square and admire the onion shaped domes of the Basil Cathedral, explore the Kremlin, take a ride on the Moscow Metro that has grand stations called peoples palaces. To experience Russia outside the big cities, a journey on the Trans Siberian railways is a good idea. Summers starting from June till September are warm months to travel across the country comfortably.";
                        SpannableString ssRusia = new SpannableString(russia);

                        String  ee = "Culturally rich with history dating back to Medieval ages and beyond, Eastern Europe loosely refers to several countries in this region of formidable castles, vast rivers, magical mountains, great cities and age old traditions. Poland, Hungary, Czech republic, Slovakia, Bulgaria, Romania are some of the popular destinations. With good rail and air connectivity you could choose your mode of transport. The Prague Castle, the Astronomical clock, Charles Bridge at Prague, the towns of Karlovy Vary and Cesky Krumlow near Prague, the iconic parliament building at Budapest, the thermal spas the city is known for, Danube river cruise in Budapest, the romantic and mysterious fortresses and castles of Transylvania in Romania, the Sofia Cathedral – the list is very long and it’s a tough choice to make if the time you have is short";
                        SpannableString ssEe = new SpannableString(ee);

                        String  othertop10 = "BALI – Sunny days filled with cool breezes, little or no rain and the holiday crowds " +
                                "have disappeared. So, spend some quiet and memorable time here\n\n" +
                                "CANADA – Moderate temperatures and spectacular fall foliage. Excellent time for " +
                                "hiking, boating and camping\n\n" +
                                "JORDAN – Perfect day temperatures almost throughout the country is best suited " +
                                "for sightseeing and warm sea is tempting too. September and October months " +
                                "therefore see visitors returning to the country after the scorching summers are over.\n\n" +
                                "AUSTRALIA – Its warm enough to hit the beaches and cool enough to tour the " +
                                "interiors. A great month to explore Australia\n\n" +
                                "NEW ZEALAND – Good month to experience a mixture of summer and winter. " +
                                "Cool days, cooler nights and bright fresh weather to enjoy the many festivals and " +
                                "events during this Spring season.\n\n" +
                                "HAWAII, USA – The months of September and October are reasonably good " +
                                "months to visit the islands of Hawaii with Summer having come to an end and its " +
                                "comparatively dry still\n\n" +
                                "MOROCCO – Weather is warm but pleasant. Summer heat has mellowed down " +
                                "and evenings are cool. October too is a good time to visit Morocco for a memorable " +
                                "vacation\n\n" +
                                "SOUTH AFRICA - An ideal destination this month since it is still dry season and " +
                                "so great for wildlife viewing and Safaris. Besides wildlife enjoy spring time in the " +
                                "Cape in September and October. Apart from the big-name game parks like Kruger " +
                                "South Africa is home to some of the world's most luxurious private game reserves " +
                                "and lodges for the Big Five : lion, buffalo, leopard, rhino, and elephant";
                        SpannableString ssOtherTop10 = new SpannableString(othertop10);



                        MyMovieData[] myMovieData9 = new MyMovieData[]{
                                new MyMovieData("CROATIA & SLOVENIA",ssCroatia,R.drawable.croatiaone,R.drawable.croatiatwo),
                                new MyMovieData("RUSSIA",ssRusia,R.drawable.russiaone,R.drawable.russiatwo),
                                new MyMovieData("EASTERN EUROPE",ssEe,R.drawable.eeone,R.drawable.eetwo),
                                new MyMovieData("OTHER DESTINATIONS", ssOtherTop10,R.drawable.septintone,R.drawable.septinttwo),

                        };

                        MyMovieAdapter myMovieAdapter9 = new MyMovieAdapter(myMovieData9,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter9);
                        recyclerView.invalidate();


                        break;
                    case "October":

                        String  australia = "A country and a continent, Australia is vast and diverse in its topography and climatic conditions. There are lush green tropical forests, stark deserts and very long coastline of beaches and rocky cliffs. Most popular destinations are the city of Sydney for its Opera House, Bondi Beach, Harbour bridge, the Blue Mountains, the city of Melbourne and its famous streets, stadiums and markets, the Great Ocean Road and twelve apostles, loads of adventure and fun at Gold Coast, the Great Barrier Reef and the underwater treasures, to name a few. Brisbane, Adeleide, the Red Centre of Australia (Uluru) are other destinations. There are numerous wildlife reserves and national parks to observe wildlife native to Australia like the Kangaroos and Koala bears.";
                        SpannableString ssAustralia = new SpannableString(australia);

                        String  newzealand = "An island country in the Pacific Ocean consisting of two land masses – the North and South Island and several smaller islands. New Zealand’s climate varies widely. The average New Zealand temperature decreases as you travel south. January and February are the warmest months, and July is the coldest month of the year. If you would prefer to enjoy sunny days, but with fewer crowds, the best time to go to New Zealand is in autumn - from March to May when the weather is still reasonably warm – particularly in the north – but the crowds have thinned out. Spring arrives in September and lasts until November and it’s an incredibly picturesque time. Auckland and Wellington in the North Island and Christchurch and Queenstown in South are the major cities. New Zealand represents natural beauty at its best. Tongariro National Park, sailing along the Bay of Islands, the Rotorua geothermal springs, Coromandel peninsula, Abel Tasman National Park, Fiordland National park, Waitomo Glow worm caves are extraordinary in natural beauty. Self drive trips at your own pace are recommended";
                        SpannableString ssNewzealand = new SpannableString(newzealand);

                        String  SCANDINAVIA = "The countries of Denmark, Norway and Sweden in Northern Europe share close geographic and cultural ties and are together called Scandinavia. Finland and Iceland are also included in the Scandinavian region most of the times. This region is known for untouched Artic wilderness, mountains and fjords and the captivating Northern Lights during the winter months. The land of the Vikings, the land of the Midnight Sun, you could choose to visit one or more countries in this region during the winter months by braving the extreme cold and embark on chasing the Northern lights and lose yourself in the white winter wonderlands that these places become. If you prefer seeing lush green landscapes under clear blue skies then pick the summer months. Copenhagen, Stockholm, Oslo and Bergen and the main cities connected by road, rail and air.";
                        SpannableString ssSCANDINAVIA = new SpannableString(SCANDINAVIA);

                        String  otherpics11 = "SOUTH KOREA – One of the best months to enjoy the glorious colors of Autumn. " +
                                "A visit to Jeju Island will be particularly interesting\n\n" +
                                "CHINA – Most parts of China enjoy sunny and cool autumn weather and so " +
                                "October is a popular month to visit the country\n\n" +
                                "MAURITIUS – October is the driest and sunniest month with enjoyable weather and " +
                                "sees an uptick in tourist arrivals\n\n" +
                                "BRAZIL – End of winter. Weather is warming up and days are sunny and dry. " +
                                "September and October are good time and shoulder period for visiting Brazil\n\n" +
                                "EGYPT – Temperatures are cooler yet pleasantly warm for sightseeing and staying " +
                                "outdoors\n\n" +
                                "BHUTAN – One of the best months to visit Bhutan. Sunny skies, pleasant weather " +
                                "and start of Autumn\n\n" +
                                "SOUTH AFRICA - Spring time in the Cape and you can enjoy the great weather in " +
                                "Cape Town and reasonably good time to visit other cities and game reserves too";
                        SpannableString ssOtherTop11 = new SpannableString(otherpics11);



                        MyMovieData[] myMovieData10 = new MyMovieData[]{
                                new MyMovieData("AUSTRALIA",ssAustralia,R.drawable.ausone,R.drawable.austwo),
                                new MyMovieData("NEW ZEALAND",ssNewzealand,R.drawable.newzeone,R.drawable.newzetwo),
                                new MyMovieData("SCANDINAVIA",ssSCANDINAVIA,R.drawable.scanone,R.drawable.scantwo),
                                new MyMovieData("OTHER DESTINATIONS", ssOtherTop11,R.drawable.octintone,R.drawable.octinttwo),

                        };

                        MyMovieAdapter myMovieAdapter10 = new MyMovieAdapter(myMovieData10,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter10);
                        recyclerView.invalidate();


                        break;
                    case "November":


                        String  iceland = "A Nordic island nation in the North Atlantic, Iceland is called the land of fire and ice. A country of extraordinary and exceptionally beautiful landscapes both during winters and summers. It’s a volcanic island with several dormant and some recently active volcanoes. Vast stretches are uninhabited and inhospitable. Be spellbound by the dance of the Northern Lights from November to March, snowmobile adventures, glacier treks, majestic waterfalls, black lava beaches, whale watching, the geothermal parks and geysers, encounters with Icelandic horses and a taste of local cuisine. The winters are bone chilling but the winter sights are simply out of the world";
                        SpannableString ssIceland = new SpannableString(iceland);

                        String  Mauritius = "An island nation in the Indian Ocean off the South East coast of Africa, Mauritius is a honeymooner’s paradise with idyllic beaches and an ideal destination for nature lovers with its rainforests and waterfalls, wildlife reserves, hiking trails and flora and fauna unique to this island. Visit to Chamarel Seven Colored earth, the Pamplemousses Gardens, Ile Aux Cerfs island and the capital city of Port Louis. Just chilling by the beach or enjoying water sports makes Mauritius an ideal destination for all ages. The crystal clear turquoise waters of the ocean are alluring";
                        SpannableString ssMauritius = new SpannableString(Mauritius);

                        String  egypt = "Located in North East Africa, Egypt is synonymous with the ancient pyramids, the Nile valley and the tales of the Pharaohs who ruled ancient Egypt. There are several populous cities along the fertile Nile valley like the capital Cairo, Luxor and Aswan. The cities are connected by air and train. Most visitors include a Nile river cruise spanning 3 or 4 days in their itinerary. Sharm El Sheikh is a popular beach resort situated close to the Arabian Peninsula. Camping in the white desert with amazing rock formations will be a memorable experience.";
                        SpannableString ssEgypt = new SpannableString(egypt);

                        String  othertop12 = "HONG KONG – November is one of the best months to visit Hong Kong because " +
                                "the weather is warm and sunny with low humidity\n\n" +
                                "PATAGONIA, ARGENTINA – November’s mild temperatures are ideal for " +
                                "outdoor activities and camping in Patagonia\n\n" +
                                "CUBA – November is warm and sunny to visit this country that is still in a romantic " +
                                "time warp.\n\n" +
                                "MYANMAR – End of monsoon and summer, the pleasant weather in November " +
                                "kicks in the peak season. Visit the hundreds of red brick temples of Bagan, the Inle " +
                                "Lake region, the pagodas of Yangon are a few of the places you could visit\n\n" +
                                "PORTUGAL – Temperatures are cooler yet pleasantly warm for sightseeing and " +
                                "staying outdoors\n\n" +
                                "YUKON, CANADA – The chances of catching the Northern Lights are " +
                                "comfortably high as the Aurora season starts in Yukon in November. Temperatures " +
                                "are a high of -4 degrees and a low of -20 degrees Celsius\n\n" +
                                "DUBAI, UAE - Great weather attracts people to Dubai in November. Warm " +
                                "afternoons and cool evenings";
                        SpannableString ssOtherTop12 = new SpannableString(othertop12);


                        MyMovieData[] myMovieData11 = new MyMovieData[]{
                                new MyMovieData("ICELAND",ssIceland,R.drawable.iceone,R.drawable.icetwo),
                                new MyMovieData("MAURITIUS",ssMauritius,R.drawable.mauone,R.drawable.mautwo),
                                new MyMovieData("EGYPT",ssEgypt,R.drawable.egyptone,R.drawable.egypttwo),
                                new MyMovieData("OTHER DESTINATIONS", ssOtherTop12,R.drawable.novintone,R.drawable.novinttwo),

                        };

                        MyMovieAdapter myMovieAdapter11 = new MyMovieAdapter(myMovieData11,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter11);
                        recyclerView.invalidate();


                        break;
                    case "December":


                        String  PHILIPPINES = "An island nation in the Pacific Ocean which is also the largest Archipelago nation with more than 7000 islands, Philippines is a contrast of bustling cities and serene islands with palm fringed white sandy beaches. Boracay is the most popular touristy island. The landscape is a mix of mountains and volcanoes, lush green rice terraces, tropical forests and rivers and some very unique attractions like the hanging coffins of Sagada. Philippines is best avoided between June to September if you don’t want your travel plans to go awry due to Typhoons.";
                        SpannableString ssPHILIPPINES = new SpannableString(PHILIPPINES);

                        String  finland = "One of the Nordic countries it is characterised by endless sunshine of summer and dark winters lit up by the magical Northern Lights. Explore the capital city of Helsinki – the rock church, the Suomenlinna fortress, Sibelius monument, market square, Uspensky cathedral or get an authentic Finnish spa experience. Board the Santa Claus Express to reach the town of Rovaniemi in the Finnish Lapland that is home to the original Santa Claus. Book your stay well in advance to spend your Christmas with Santa at his home. Meet the Santa in person, enjoy reindeer sleigh rides or the thrill of husky sledding. Ride a Snow mobile or an ATV into the wilderness to catch the swaying bands of colour that light up the night sky. Book an unforgettable stay in a glass igloo in the Arctic wilderness.";
                        SpannableString ssFinlad = new SpannableString(finland);

                        String  argentina = "Sought after by tourists for its geographical diversity of pampa grasslands, Patagonian panoramas, Iguazú Falls, high peaks of Andes, penguin islands and unusual rock formations, Argentina is much more than its astonishing landscapes. It’s a place where you stay a while and experience the culture and its people. Must visit attractions definitely are Perito Moreno Glacier, the Valdés Peninsula, Ushuaia - The End of the World and enjoying street Tango in Buenos Aires.";
                        SpannableString ssArg = new SpannableString(argentina);

                        String  othertop13 = "THAILAND – One of the best months. Temperatures have cooled and the rains " +
                                "have stopped. Since its high season, hotels and flights are likely to be on the " +
                                "expensive side\n\n" +
                                "MAURITIUS – December is a Summer month and warm. Its never too hot in " +
                                "Mauritius. Its peak holiday season too\n\n" +
                                "SRILANKA – Fantastic time to travel to Srilanka. Weather is cool, dry and sunny\n\n" +
                                "PENANG & LANGKAWI, MALAYSIA – These island destinations in Malaysia " +
                                "have the best weather in December. Lots of sunshine, clear blue skies and very little " +
                                "rain\n\n" +
                                "DUBAI, UAE - Cool and pleasant weather. Super peak tourist season with crowds " +
                                "thronging to the city for Christmas break and to ring in the New Year with fireworks";
                        SpannableString ssOtherTop13 = new SpannableString(othertop13);



                        MyMovieData[] myMovieData12 = new MyMovieData[]{
                                new MyMovieData("PHILIPPINES",ssPHILIPPINES,R.drawable.philone,R.drawable.philtwo),
                                new MyMovieData("FINLAND",ssFinlad,R.drawable.finone,R.drawable.fintwo),
                                new MyMovieData("ARGENTINA",ssArg,R.drawable.argone,R.drawable.argtwo),
                                new MyMovieData("OTHER DESTINATIONS", ssOtherTop13,R.drawable.decintone,R.drawable.decinttwo),

                        };

                        MyMovieAdapter myMovieAdapter12 = new MyMovieAdapter(myMovieData12,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter12);
                        recyclerView.invalidate();


                        break;


                }

                break;

            case "domestic":

                switch(extras.getString("Month")){


                    case "January":


                        String  himachal = "This hill state in the Himalayas offers a chance to enjoy some fresh snow of the season at its famed hill stations Shimla, Manali, Kasol, Kasauli and many more";
                        SpannableString ssHimachal = new SpannableString(himachal);

                        String kerala  = "The exotic land of spices with lush green tropical forests and unending paddy fields, lakes, rivers, backwaters and the Arabian sea and a long coconut palm fringed coastline. Don’t miss the unique experience of cruising the backwaters and staying on board the houseboats.";
                        SpannableString ssKerela = new SpannableString(kerala);

                        String otherTop  = "HYDERABAD, TELANGANA - January means pleasant " +
                                "winter weather for outdoor activities and sightseeing\n\n" +
                                "GOA - Very comfortable winter month for water " +
                                "sports, sunny days and no rain\n\n" +
                                "CHENNAI, MADURAI, RAMESHWARAM in " +
                                "TAMIL NADU – January is a delightful winter " +
                                "month for an otherwise tropical hot and humid " +
                                "destination. Cool winds and comfortable day and " +
                                "night temperatures\n\n" +
                                "PONDICHERRY – Dry, cool winter weather for " +
                                "seaside adventures.\n\n" +
                                "MUMBAI, MAHARASHTRA – Most pleasant " +
                                "winter month to visit the bustling coastal Metropolis\n\n" +
                                "MYSORE, HAMPI – Mild and comfortable winter " +
                                "temperatures makes exploring the palace, temples " +
                                "and architectural marvels a pleasure\n\n" +
                                "AULI, UTTARAKHAND – The best time to ski at " +
                                "the best ski destination in India\n\n" +
                                "LAKSHADWEEP – High season, cool breeze, " +
                                "moderate temperatures for watersports makes this a " +
                                "great time to visit\n\n" +
                                "ANDAMAN & NICOBAR ISLANDS – Calm " +
                                "and clear Ocean, sunny days and cool nights. Warm " +
                                "winter";

                        SpannableString ssOtherTop = new SpannableString(otherTop);



                        MyMovieData[] myMovieData = new MyMovieData[]{
                                new MyMovieData("HIMACHAL PRADESH",ssHimachal,R.drawable.himachalonef,R.drawable.himachaltwof),
                                new MyMovieData("KERALA",ssKerela,R.drawable.keralaonett,R.drawable.keralatwott),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTop ,R.drawable.jandomonef,R.drawable.jandomtwof),
                        };

                        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter);
                        recyclerView.invalidate();
                        break;
                    case "February":

                        String  karnataka = "The state of Karnataka lies in the South West of India with a coastline formed by the Arabian sea on the West. The capital city of Bangalore, also called the Hi tech city is a bustling metropolis with moderate and cool weather all year round. The State is endowed with natural beauty and has many wildlife reserves and parks, cascading water falls, lush green coffee plantations and a long stretch of beautiful beaches. You can also visit the medieval ruins of Hampi and other historical places of Bijapur, Badami and Bidar. The towering monolithic statue of Bahubali at Shravanabelagola is an important place of Jain pilgrimage and a tourist attraction. The historic city of Mysore is famous for the Mysore palace and the Dussehra celebrations.";
                        SpannableString ssKarnataka = new SpannableString(karnataka);

                        String  gujarat = "Moderate day and night temperatures makes this an ideal month to visit the historic city of Ahmedabad, the temples at Dwarka and Somnath or stop to visit Mahatma Gandhi’s home at Porbandar. Watch the Asiatic Lions in their natural habitat at Gir National Park. Do not miss the Modhera Sun temple and Rani Ki Vav that are ancient architectural marvels. Self drive road trips are the best way to explore this State. Do book a slot in a luxury tent at the Rann Utsav before it comes to an end in February and be awed by the endless expanse of the white salt desert – the Rann of Kutch";
                        SpannableString ssGujarat = new SpannableString(gujarat);

                        String otherTop1 = "ANDAMAN & NICOBAR ISLANDS – Its not late for a trip to the " +
                                "Andamans. Hot Summers have not arrived yet. Warm weather and calm warm " +
                                "waters for a great holiday\n\n" +
                                "GOA - Warm weather but not hot yet, relax as the crowds start to vanish and " +
                                "be a part of the Goa Carnival Celebrations\n\n" +
                                "ORISSA – Comfortable and mild winter month. The Konark Dance Festival is a " +
                                "highlight of the month\n\n" +
                                "AURANGABAD & NASHIK, MAHARASHTRA – At the cusp of winter " +
                                "and summer, weather is ideal for a visit to the Ajanta and Ellora caves, several " +
                                "temples in and around Nashik.\n\n" +
                                "BODH GAYA & NALANDA, BIHAR – Pleasant and ideal time for " +
                                "sightseeing before the approaching hot summers\n\n" +
                                "LAKSHADWEEP – Fly from Cochin or set sail on a ship to one or more " +
                                "remote islands in the Indian Ocean far from the madding crowds. February, like " +
                                "January is a dry and comfortable month.";
                        SpannableString ssOtherTop1 = new SpannableString(otherTop1);

                        MyMovieData[] myMovieData2 = new MyMovieData[]{
                                new MyMovieData("KARNATAKA",ssKarnataka,R.drawable.karnatakaone,R.drawable.karnatakatwo),
                                new MyMovieData("GUJARAT",ssGujarat,R.drawable.gujaratone,R.drawable.gujarattwo),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTop1 ,R.drawable.febdomone,R.drawable.febdomtwo),
                        };

                        MyMovieAdapter myMovieAdapter2 = new MyMovieAdapter(myMovieData2,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter2);
                        recyclerView.invalidate();


                        break;
                    case "March":

                        String  maharashta = "This vast western state of India has a lot to offer to visitors to suit varied tastes and preferences from those wanting to embark on a pilgrimage to those who are looking for an adrenaline rush or for a relaxed family holiday by a beach. Mumbai the financial capital of the country never ceases to amaze its visitors by its pace and spirit. There are hill stations like Mahabaleshwar, Lonavla, Panchgani to escape the pressures of a hectic urban life. Popular pilgrimage sites include Shirdi, Nashik, Ganpatiphule. The state is home to the UNESCO world heritage Ajanta and Ellora caves and historical cities like Pune";
                        SpannableString ssMaharashtra = new SpannableString(maharashta);

                        String  assam = "The Northeastern state of Assam is known for its wildlife, archeological sites and tea plantations. The Kaziranga National park is home to the largest population of one horned Rhino besides other wildlife. The tea estates that produce the famed Assam Tea is a must visit on any visitor’s itinerary. Guwahati, the largest city of Assam is situated on the banks of the river Brahmaputra and can be made the base to travel to other far flung North eastern states. The Kamakhya temple in Guwahati, the Majuli river island for its flora and fauna, Manas National Park are few of the many attractions that awaits you in Assam";
                        SpannableString ssAssam = new SpannableString(assam);

                        String  otherTop3 = "NORTH EASTERN STATES – Take your pick from Meghalaya, Arunachal " +
                                "Pradesh, Nagaland, Manipur or Mizoram. With dry and pleasant temperatures " +
                                "offering good visibility to enjoy the breathtakingly beautiful hills and waterfalls, " +
                                "flowers in full bloom, it's a good time for some trekking adventures\n\n" +
                                "COORG, BANGALORE & MYSORE, KARNATAKA - While the " +
                                "Northern parts of Karnataka are sweltering, the Southern parts enjoy pleasant " +
                                "weather. Clear blue skies and sunshine.\n\n" +
                                "RAJASTHAN – Sunny days and cool nights, this is one of the best months " +
                                "to visit the state of Rajasthan including Jaisalmer\n\n" +
                                "GOLDEN TRIANGLE (DELHI, AGRA, JAIPUR) – Neither hot nor cold, " +
                                "take a short break to visit the three gems of North India – Delhi, Jaipur and Agra " +
                                "that forms the Golden Triangle and spend as much time as you wish outdoors " +
                                "enjoying the weather.\n\n" +
                                "OOTY & KODAIKANAL, TAMIL NADU – March marks the beginning of " +
                                "Summers in these hill stations. You can enjoy the mild weather in peace before " +
                                "the peak season starts from April.";
                        SpannableString ssOtherTop3 = new SpannableString(otherTop3);



                        MyMovieData[] myMovieData3 = new MyMovieData[]{
                                new MyMovieData("MAHARASHTRA",ssMaharashtra,R.drawable.maharashtraone,R.drawable.maharashtratwo),
                                new MyMovieData("ASSAM",ssAssam,R.drawable.assamone,R.drawable.assamtwo),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTop3 ,R.drawable.marchdomone,R.drawable.marchdoomtwo),
                        };

                        MyMovieAdapter myMovieAdapter3 = new MyMovieAdapter(myMovieData3,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter3);
                        recyclerView.invalidate();


                        break;
                    case "April":

                        String  nagaland = "One of the North Eastern states of India, Nagaland is steeped in culture, history and blessed with impeccable natural beauty. It’s a blend of age old customs and yet very modern. The capital city of Kohima, the city of Dimapur, nature lover’s paradise Longkhum are some of the popular tourist destinations. Nagaland is home to several indigenous tribes and a visit to the state gives you a peek into their history and customs";
                        SpannableString ssNagaland = new SpannableString(nagaland);

                        String  mizoramandmanipur = "The land of the Mizos, Mizoram is a mountainous state at the southern tip of the North East of India with its capital at Aizawl. Besides the city of Aizawl you could Walk In The Clouds at Phawngpui Peak – the blue mountains of Mizoram, visit Dampa Tiger Reserve or experience Mizo lifestyle at Falkawn village. Combine a visit with a trip to the neighbouring state of Manipur called the Jewel of India, with its capital at Imphal and sharing a border with Myanmar. It’s a nature lover’s delight with scenic hills and valleys, caves and waterfalls, streams, gorges and rivers. The main destinations are Loktak Lake, Bishnupur temple, Ukhrul among others.";
                        SpannableString ssMizoramManipur = new SpannableString(mizoramandmanipur);

                        String  otherTops = "ARUNACHAL PRADESH – Head to Arunachal for respite from the " +
                                "summer heat of the cities. Enjoy clear skies and warm summer breeze\n\n" +
                                "COORG KABINI, KARNATAKA - Sunny days, little rain and cool " +
                                "evenings makes this a good time to escape to Coorg and Kabini\n\n" +
                                "CHANDIGARH & AMRITSAR – This is the beginning of Summer season " +
                                "and not very hot yet. Witness the colorful Baisakhi celebrations during mid April\n\n" +
                                "DELHI/AGRA – Almost no rain and low humidity with a transition from " +
                                "Winter to Summer. Period from beginning of the month to mid April is a good " +
                                "time to visit both the cities and to explore outdoors.\n\n" +
                                "RISHIKESH, UTTARAKHAND – a warm month before peak Summer. " +
                                "Great time for a short camping break and river rafting\n\n" +
                                "JIM CORBETT, UTTARAKHAND – since this is the beginning of " +
                                "Summer, temperatures are not scorching and it’s a good time to spot wildlife\n\n" +
                                "OOTY & KODAIKANAL, TAMIL NADU – This is high season in the hills " +
                                "with people flocking here during the Summer break in the South of India and " +
                                "also for some respite from the heat of the plains\n\n" +
                                "SIKKIM – Spring flowers are blooming. You can see hills covered with " +
                                "Rhododendron blooms and Yumthang valley becomes a carpet of flowers.\n\n" +
                                "JAMMU – A dry month with moderate day and night temperatures. Pleasant " +
                                "for sightseeing. Head to Patnitop for cooler weather and some adventure";
                        SpannableString ssOtherTops = new SpannableString(otherTops);


                        MyMovieData[] myMovieData4 = new MyMovieData[]{
                                new MyMovieData("NAGALAND",ssNagaland,R.drawable.nagalandone,R.drawable.nagalandtwo),
                                new MyMovieData("MIZORAM AND MANIPUR",ssMizoramManipur,R.drawable.mizoramone,R.drawable.mizoramtwo),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTops ,R.drawable.aprildomone,R.drawable.aprildomtwo),
                        };

                        MyMovieAdapter myMovieAdapter4 = new MyMovieAdapter(myMovieData4,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter4);
                        recyclerView.invalidate();

                        break;
                    case "May":


                        String  meghalaya = "A state in Northeastern India, Meghalaya was carved out of Assam and is predominantly hilly comprising the Garo hills, Khasi hills and the Jaintia hills. The living root bridge, Mawlynnong that earned the title of being the cleanest village in Asia, the clear emerald waters of Umngot river, Cherrapunji, amazing waterfalls, caves and the charming city of Shillong are the main attractions of the state";
                        SpannableString ssMeghalaya = new SpannableString(meghalaya);

                        String  arunachalpradesh = "The largest and remotest North Eastern State of India, Arunachal Pradesh is a mountainous land of exquisite beauty. It has several tourist circuits to choose from. There are several monasteries, misty mountains for trekking and great views, National parks, gushing rivers for rafting and other adventure sport. Bombdila, Pasighat, Tawang, Namdhapa, Bhalukpong are the popular destinations. Homestay accommodations give you an opportunity to experience the ethnic lifestyles and local culture. Many areas experience snowfall from end December till February with sub zero temperatures. The snowed out hills are as beautiful as they are when they turn lush green during the summer months.";
                        SpannableString ssArunachalpradesh = new SpannableString(arunachalpradesh);

                        String  otherTop5 = "The month of May being peak Summer month in India, pack your bags and head " +
                                "to the hills for some cool comfort\n\n" +
                                "KULLU/ MANALI, HIMACHAL PRADESH – temperatures ranging from " +
                                "8 degrees to 28 degrees Celsius and lush green mountains and valleys welcome " +
                                "visitors\n\n" +
                                "SHIMLA, HIMACHAL PRADESH – a dry and warm month that’s ideal for " +
                                "camping and trekking\n\n" +
                                "DHARAMSHALA/ MC LEODGANJ, HIMACHAL PRADESH – " +
                                "Delightful mid summer month for some respite from the heat\n\n" +
                                "GULMARG & PAHALGAM, KASHMIR - Lush green valley of Pahalgam " +
                                "and the meadows of flowers will welcome you . Gulmarg is cooler and you could " +
                                "find snow at upper reaches.\n\n" +
                                "LADAKH – Marks the beginning of Summer. Days are warmer as compared to " +
                                "the evenings that are expected to be cold\n\n" +
                                "NAINITAL & RANIKHET, UTTARAKHAND – This is peak season for " +
                                "the hills of Uttarakhand. Hot days and cool nights. Typical summer hill station " +
                                "climate.\n\n" +
                                "SIKKIM – High season when Spring blends into Summer with flowers still in " +
                                "bloom. You can expect some showers in some parts. But good time to visit " +
                                "North and West Sikkim";
                        SpannableString ssOtherTop5 = new SpannableString(otherTop5);



                        MyMovieData[] myMovieData5 = new MyMovieData[]{
                                new MyMovieData("MEGHALAYA",ssMeghalaya,R.drawable.meghalayaone,R.drawable.meghalayatwo),
                                new MyMovieData("ARUNACHAL PRADESH",ssArunachalpradesh,R.drawable.arunachalone,R.drawable.arunachaltwo),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTop5 ,R.drawable.maydomone,R.drawable.maydomtwo),
                        };

                        MyMovieAdapter myMovieAdapter5 = new MyMovieAdapter(myMovieData5,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter5);
                        recyclerView.invalidate();
                        break;
                    case "June":

                        String  sikkim = "A part of the Himalayas, this state in North East of India has border with Bhutan and Nepal. Sikkim is known for its dramatic landscapes and has India’s highest Himalayan peak of Kanchenjunga. The capital city of Gangtok forms the base to explore the breath taking North Sikkim to visit Gurdongmar (the frozen lake), Yumthang valley (a valley of flowers) and Zero point. The famous Nathula Pass border with China is also a day trip from Gangtok. Visit Pelling in West Sikkim or set out on a Kanchenjunga trek from Yuksom. Spend some quiet moments in the grand monasteries of Sikkim at Rumtek, Enchey or Ralang.";
                        SpannableString ssSikkim = new SpannableString(sikkim);

                        String  uttarakhand = "Also called Dev Bhumi, Uttarakhand is a holy land in the Himalayas with many dhams and temple towns. The Char Dham pilgrimage is popular and includes a trip to Kedarnath, Badrinath, Yamunotri and Gangotri. The holy rivers of Ganga and Yamuna originate in the state of Uttarakhand. The other holy towns of Guptkashi, Rishikesh, Haridwar are other popular pilgrimage towns. Adventure and wildlife enthusiasts can head to Rishikesh for white water rafting in the gushing Ganges and embark on a Jeep or Canter safari in the Jim Corbett National Park or choose from the many trekking trails like the Valley of flowers, Nag Tibba, Chandrasila, Gaumukh Tapovan, Pindari Glacier among others. The famed ski destination of Auli is also in Uttarakhand.";
                        SpannableString ssUttarakhand = new SpannableString(uttarakhand);

                        String  othertop6 = "The month of June is still peak Summer month in North of India and monsoon " +
                                "sets in the Eastern states and the Southern States.\n\n" +
                                "HIMACHAL PRADESH – Very pleasant warm temperatures for family " +
                                "outing or adventure treks, this summer month is great to visit hill stations of " +
                                "Dalhousie, Kasauli/Narkanda, Kinnaur and Kasol\n\n" +
                                "KASHMIR - this is the time of sparkling and clear lakes, sunshine and green " +
                                "valleys and meadows. You can spot snow at higher altitudes.\n\n" +
                                "LADAKH – Snow clears from valleys and meadows and it’s a month of " +
                                "sunshine with crispy breeze and warm afternoons\n\n" +
                                "LAHAUL SPITI – The Spiti valley is accessible by both the routes from " +
                                "Shimla and Manali and internal routes are also thrown open. Beginning of " +
                                "pleasant summer\n\n" +
                                "COORG/ MADIKERI – Its monsoon magic in Coorg from mid June. The " +
                                "hills are lush green and the temperatures are moderate to enjoy a monsoon trip " +
                                "to Coorg\n\n" +
                                "WAYANAD, KERALA – With the onset of monsoon, the trees are green, air " +
                                "is fresh and the hills are misty. Waterfalls are best enjoyed during monsoon\n\n" +
                                "DARJEELING, WEST BENGAL – It’s the beginning of rainy season but " +
                                "temperature is very comfortable and on most days the weather remains clear for " +
                                "great views";
                        SpannableString ssOtherTop6 = new SpannableString(othertop6);



                        MyMovieData[] myMovieData6 = new MyMovieData[]{
                                new MyMovieData("SIKKIM",ssSikkim,R.drawable.sikkimone,R.drawable.sikkimtwo),
                                new MyMovieData("UTTARAKHAND",ssUttarakhand,R.drawable.uttarakhandone,R.drawable.uttarakhandtwo),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTop6 ,R.drawable.junedomone,R.drawable.junedomtwo),
                        };

                        MyMovieAdapter myMovieAdapter6 = new MyMovieAdapter(myMovieData6,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter6);
                        recyclerView.invalidate();


                        break;
                    case "July":

                        String kashmir = "A land blessed with unparalled natural beauty that has earned it the name of ‘Paradise on Earth’ is now a Union Territory and the Northern most part of India. The iconic Dal Lake and Shikara ride or a stay at one of the beautifully decorated house boats on Dal Lake or Nagin lake is a dream of many people wanting to visit Kashmir. The famed Mughal Gardens, Shankaracharya hills, Hazratbal mosque, shopping and savouring local cuisine are must do while you are in Srinagar. A visit to Kashmir is incomplete without either a day trip or stay at Pahalgam for its meadows and valleys, Gulmarg for some snow and Gondola ride and Sonmarg for the breathtaking views. Srinagar is the main airport and other places are well connected by roads. Its an eternal summer destination. If you want to enjoy the sights of Tulips in full bloom, then plan a trip between mid March and mid April when the Tulip gardens are open to visitors";
                        SpannableString ssKashmir = new SpannableString(kashmir);

                        String  ladakh = "Often called Little Tibet and a Cold Desert, Ladakh is mountainous with barren mountains and stark contrasting landscapes and extremely cold winters. Hence Summer is a good time to visit Ladakh. The capital city Leh is well connected by flights and also by road. A trip to Ladakh requires acclimatisation for visitors to get used to the high altitude and low oxygen levels. It’s a land of ancient monasteries perched precariously on hill tops, serene lakes of Pangongtso and Tsomoriri, mountain passes and valleys. The Sindhu Darshan festival held in June and the Hemis monastic festival in July are full of music and color";
                        SpannableString ssLadakh = new SpannableString(ladakh);

                        String  othertop7 = "Travel during monsoon months has its own charm. Rather than counting the " +
                                "number of activities and attractions visited, it’s the experience of being there " +
                                "that matters\n\n" +
                                "LAHAUL SPITI, HIMACHAL PRADESH – July is the best time to visit " +
                                "Lahaul and Spiti with all the interiors accessible and ideal weather for trekking " +
                                "and camping\n\n" +
                                "VALLEY OF FLOWERS, UTTARAKHAND – A trip to the Valley of " +
                                "Flowers in July until mid August is like seeing a beautiful dream come true with " +
                                "the flowers in full bloom\n\n" +
                                "KHAJURAHO, MP – The temple town of Khajurao can be accessed by " +
                                "road/rail or flight. The monsoons makes the exquisitely carved temples and their " +
                                "backdrops even more appealing\n\n" +
                                "ORCHCHA, MP - A historic town with its fort, temple and cenotaphs tells " +
                                "you the story of the glorious Bundelas. The rains only enhance the beauty of the " +
                                "place\n\n" +
                                "PANCHGANI, MAHARASHTRA – Head to Panchgani or the more " +
                                "touristy Mahabaleshwar for views of lush green hills from various view points, " +
                                "the Table land and waterfalls.\n\n" +
                                "LONAVLA, MAHARASHTRA – A short drive from Mumbai or Pune, " +
                                "Lonavla during Monsoons has a different charm – the green landscapes and " +
                                "fresh air will enthral you.\n\n" +
                                "WAYANAD, KERALA – With the rains, you can experience Wayanad in a " +
                                "different way – all green and fresh. Some outdoor activities could be restricted " +
                                "on days of heavy rain but its definitely worth a visit during monsoons";
                        SpannableString ssOtherTop7 = new SpannableString(othertop7);

                        MyMovieData[] myMovieData7 = new MyMovieData[]{
                                new MyMovieData("KASHMIR",ssKashmir,R.drawable.kashmirone,R.drawable.kashmirtwo),
                                new MyMovieData("LADAKH",ssLadakh,R.drawable.ladakhone,R.drawable.ladakhtwo),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTop7 ,R.drawable.julydomone,R.drawable.julydontwo),
                        };

                        MyMovieAdapter myMovieAdapter7 = new MyMovieAdapter(myMovieData7,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter7);
                        recyclerView.invalidate();


                        break;
                    case "August":

                        String  telangana = "The newest state and 29 th state of India carved out in 2014 from Andhra Pradesh, the capital city of Hyderabad has several attractions to visit. The famed Charminar, Salarjung Museum, Qutub Shahi Tombs, Golconda Fort, Tank Bund, Birla Mandir, Ramoji Film city are some of the places to visit besides shopping for pearls, bangles and traditional sarees. Relish authentic and spicy Hyderabadi cuisine in Hyderabad and other parts of the State. You can also visit the historic city of Warangal and its fort that’s not too far form Hyderabad. From Hyderabad you can fly or take a train to destinations in Andhra Pradesh like Vijayawada, Tirupati, Papikonda, Srisailam, Gandikota, Vishakhapatnam or Lepakshi";
                        SpannableString ssTelangana = new SpannableString(telangana);

                        String  up = "The state of Uttar Pradesh has many tourist destinations as well as important places of pilgrimage. The world-renowned and iconic Taj Mahal is in the historic city of Agra established by the Lodhis and an important seat of power during Mughal rule. Agra has the Agra Fort and Fatehpur Sikri on the outskirts of the city. Other popular destinations like Mathura and Vrindavan, Varanasi and Sarnath, Ayodhya, Prayagraj  are places of pilgrimage too. The capital city of Lucknow, called the city of Nawabs has many historical attractions and is known for its cuisine.";
                        SpannableString ssUp = new SpannableString(up);

                        String  othertop9 = "VALLEY OF FLOWERS, UTTARAKHAND – August is also an " +
                                "excellent month for a trip to the Valley of flowers to see the flowers. Trek from " +
                                "Govindghat on the route to Hemkund Sahib for an unforgettable experience\n\n" +
                                "ALLEPPEY & COCHIN, KERALA – The Nehru Trophy boat race at " +
                                "Alleppey is an annual event held this month and watching the boat race is an " +
                                "exhilarating experience. You could combine this monsoon holiday with a few " +
                                "days in Cochin\n\n" +
                                "UDAIPUR, RAJASTHAN - A few showers bring relief from the Summer " +
                                "heat and fills up the lakes for a great experience. The surrounding hills are " +
                                "greener and you could look for some off season discounts\n\n" +
                                "VADODARA, GUJARAT – After visiting the attractions in the city of " +
                                "Vadodara, a day trip to Champaner and  Pavagadh hill  is a good option during " +
                                "the monsoons. Don’t miss to visit the Statue of Unity and Narmada Dam as it is a " +
                                "spectacle to watch the rain washed vistas, overflowing dam and lush green " +
                                "environs all around.\n\n" +
                                "AGUMBE, KARNATAKA – Fondly called the Chirapunjee of the South, " +
                                "this hill station in Shimoga district of Karnataka has several waterfalls including " +
                                "the Jomlu Theertha falls, Barkana falls that come alive during monsoons. Also " +
                                "the place where R K Narayan’s Malgudi days is based";
                        SpannableString ssOtherTop9 = new SpannableString(othertop9);


                        MyMovieData[] myMovieData8 = new MyMovieData[]{
                                new MyMovieData("TELANGANA",ssTelangana,R.drawable.telone,R.drawable.teltwo),
                                new MyMovieData("UTTAR PRADESH",ssUp,R.drawable.upone,R.drawable.uptwo),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTop9 ,R.drawable.augdomone,R.drawable.augdomtwo),
                        };

                        MyMovieAdapter myMovieAdapter8 = new MyMovieAdapter(myMovieData8,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter8);
                        recyclerView.invalidate();

                        break;
                    case "September":

                        String  punjab = "Located in North western part of India bordering Pakistan, Punjab is known for its rich culture and cuisine. Being primarily an agricultural state, the beauty of the state lies in its villages with vast stretches of fertile fields. The city of Amritsar and Wagah Border with Pakistan that lies not very far from the city are a major tourist draw. The Golden Temple attracts pilgrims and tourists alike in droves. Chandigarh, the capital city is also a huge draw for stop on their way to and from other states or to relax by the Lakes and gardens of the city";
                        SpannableString ssPunjab = new SpannableString(punjab);

                        String  delhi = "The city state serves as a gateway to other Northern and North Western states for international tourists and also domestic tourists coming from other parts of the country. It has British, Mughal and pre Mughal monuments and sites – the India Gate, Red Fort, Qutub Minar, to name a few. More recent additions like the Lotus Temple, Akshardham too are must visit attractions. Shopping and Dining are an integral part of a trip to Delhi. The state is known for delicious street food and outstanding Mughlai delicacies";
                        SpannableString ssDelhi = new SpannableString(delhi);

                        String  othertop10 = "DEHRADUN/ MUSSOORIE, UTTARAKHAND –Nice weather during " +
                                "the month. Being the last month of monsoon, there could be some days with " +
                                "moderate rainfall. Overall its a lush green and beautiful natural landscape.\n\n" +
                                "NAINITAL / RANIKHET, UTTARAKHAND – If you want to avoid the " +
                                "very cold winters, then September is a good month with milder temperatures to " +
                                "enjoy these hill stations\n\n" +
                                "OOTY, TAMIL NADU - It’s a mix of monsoon and winter weather with " +
                                "occasional shower and cool weather and enough sunshine\n\n" +
                                "GWALIOR/ JHANSI, M.P & UP – Last month of monsoon. Expect few " +
                                "moderate rainy days. Nice sunny days and cooler evenings. Good time to visit " +
                                "various forts, local markets and enjoy local cuisine\n\n" +
                                "DALHOUSIE/ KHAJJIAR, HIMACHAL PRADESH –People looking at " +
                                "enjoying the wonderful natural locales of Himachal at these two places would " +
                                "find this month a perfect time with lush greenery all around and nice sunny days " +
                                "with occasional mild drizzles. Also being off season, lesser crowds make it a " +
                                "very enjoyable experience overall.";
                        SpannableString ssOtherTop10 = new SpannableString(othertop10);


                        MyMovieData[] myMovieData9 = new MyMovieData[]{
                                new MyMovieData("PUNJAB",ssPunjab,R.drawable.punjabone,R.drawable.punjabtwo),
                                new MyMovieData("DELHI",ssDelhi,R.drawable.delhione,R.drawable.delhitwo),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTop10 ,R.drawable.septdomone,R.drawable.septdomtwo),
                        };

                        MyMovieAdapter myMovieAdapter9 = new MyMovieAdapter(myMovieData9,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter9);
                        recyclerView.invalidate();



                        break;
                    case "October":


                        String  rajasthan = "The Land of the Kings, ancient forts and ornate palaces, it is popular among foreign and domestic tourists alike. The cities of Jaipur, Jodhpur, Udaipur, Bikaner and smaller towns have many imposing forts and grand palaces. Some of the palaces have been converted into heritage luxury hotels. The Amer Fort, City Palace, Hawa Mahal, Jantar Mantar at Jaipur, the Umaid Bhavan Palace and Mehrangarh fort at Jodhpur, the City Palace and lake Pichola at Udaipur are top rated attractions in the state. Rajasthan also has sand dunes and desert camps in the Thar Desert on the outskirts of the city of Jaisalmer. Colorful handlooms, handicrafts, folk music and dance makes this vibrant and colorful state very attractive to visitors";
                        SpannableString ssRajasthan = new SpannableString(rajasthan);

                        String  mp = "This large state located in Central India has several national parks like Bhandhavgarh and Kanha national park for wildlife spotting. The temple towns of Ujjain, Omkareshwar and Maheshwar attract pilgrims from all parts of the country. The capital city of Bhopal has a rich history and culture and same is the case with Gwalior and Indore. The marble mountains and Bedaghat falls near Jabalpur are worth a visit. The exquisitely carved temple complex at Khajuraho are easily accessible from Delhi";
                        SpannableString ssMp = new SpannableString(mp);

                        String  othertop11 = "MYSORE, KARNATAKA –Weather is mild and pleasant for visiting Mysore " +
                                "Palace, Brindavan Gardens, Chamundi Hills. Dushera in Mysore is very famous " +
                                "and do plan to be here around this time if possible.\n\n" +
                                "DEHRADUN/ MUSSOORIE, UTTARAKHAND – Its autumn and the " +
                                "beginning of winter and one of the best time to be here\n\n" +
                                "SUNDERBANS, WEST BENGAL – Comfortable warm winter weather for " +
                                "enjoying boat safari and spotting wild life. Do expect some showers in the " +
                                "month of October\n\n" +
                                "LUCKNOW, UP – Days are sunny but not very hot and perfect for visiting " +
                                "sightseeing spots like Bada Imambara, Chota Imambara, Rumi Darwaza and " +
                                "Hazratganj Market. Evenings are cool and best time to relish the most famous " +
                                "Lucknowi Kebabs and Biryani\n\n" +
                                "DAMAN & DIU - One of the best beach locations in the " +
                                "western part of India, winters are ideal for relaxing on the clean beaches and, " +
                                "visiting several tourist places such as Mirasol lake Garden, St Jerome Fort, " +
                                "Daman Lighthouse in Daman and Naida Caves, Diu Fort, St Paul Church in Diu. " +
                                "Daman also offers good Casino options\n\n" +
                                "ORISSA – Weather wise October is a very good time to visit the state of " +
                                "Orissa. Temperature is moderate and tropical. It is the end of Monsoon and " +
                                "beginning of winters. Visit Bhubaneshwar, Udaygiri caves, the Sun temple at " +
                                "Konark and Puri for its temple and the beaches";
                        SpannableString ssOtherTop11 = new SpannableString(othertop11);


                        MyMovieData[] myMovieData10 = new MyMovieData[]{
                                new MyMovieData("RAJASTHAN",ssRajasthan,R.drawable.rajasthanone,R.drawable.rajasthantwo),
                                new MyMovieData("MADHYA PRADESH",ssMp,R.drawable.mpone,R.drawable.mptwo),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTop11 ,R.drawable.octdomone,R.drawable.octdomtwo),
                        };

                        MyMovieAdapter myMovieAdapter10 = new MyMovieAdapter(myMovieData10,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter10);
                        recyclerView.invalidate();


                        break;
                    case "November":

                        String  andaman = "A group of around 300 islands in the Bay of Bengal, only a few are inhabited. Some of the remote islands are still inhabited by indigenous islanders who shun all outside contact. Called ‘kalapani’ that evokes a sense of fear, the capital city Port Blair has the Cellular jail that housed many freedom fighters during the British rule in India. Other islands of Ross and Viper were also seats of British Administration. There are cruises and government ferries that operate between the islands of Havelock (Swaraj dweep)and Neil (Shaheed dweep). These islands are perfect for the idyllic beach vacations with water sports like snorkelling, scuba diving and under sea walk thrown in. The winter months starting October till February is the tourist season in these islands";
                        SpannableString ssAndaman = new SpannableString(andaman);

                        String  wb = "Located in the Eastern part of India, West Bengal is a land of misty mountains, large river delta, varied wildlife, lush green tea estates and busy cities. Kolkata, the capital city is a bustling metropolis and an important part of British Indian history. The people of Bengal take great pride in their language, traditions and culture. The Durga Pooja celebrations during the festival of Dussehra in the month of October is the most important festival for the people of Bengal. From the hills of Darjeeling and Siliguri in the North to the Sundarbans in the South and the city of Kolkata with its historical monuments and temples, West Bengal is an important tourist destination in India. Shopping for leather, textiles and gold is a pleasure. The cuisine of Bengal is very distinct with fish forming an important part of it";
                        SpannableString ssWb = new SpannableString(wb);

                        String  othertop12 = "CHENNAI / MAHABALIPURAM, TAMIL NADU – Its autumn and days " +
                                "are sunny but not hot and evenings are cooler. Tourists can enjoy visiting " +
                                "several sight seeing locations including the famous Monuments/Temples at " +
                                "Mahabalipuram and  Marina Beach in Chennai besides shopping and relishing " +
                                "authentic South Indian delicacies.\n\n" +
                                "AJANTA & ELLORA CAVES, MAHARASHTRA – Its the best time " +
                                "and also the month when the famous annual Ajanta-Ellora dance and music " +
                                "festival is held. Temperature of 28 / 16 C makes it ideal time\n\n" +
                                "GAYA & NALANDA, BIHAR - Its autumn time and one of the best time to " +
                                "visit. Bodhgaya is known for spiritual retreats and tourists from across the globe " +
                                "come here for spiritual odyssey.  Nalanda is around an hour and half drive from " +
                                "Gaya\n\n" +
                                "CHILIKA LAKE, ORISSA – November to February is considered good for " +
                                "a trip to Chilika lake to watch the migratory birds. Pleasant winter weather is " +
                                "great for spending time at the beach at Gopalpur too\n\n" +
                                "HAMPI, KARNATAKA – Moderately cool and perfect for exploring World " +
                                "Heritage Site and various other sightseeing locations. Vijaya Utsav or Festival " +
                                "of Hampi is celebrated for 3 days in this month.\n\n" +
                                "RANTHAMBORE, RAJASTHAN - Monsoon is over and winters are to " +
                                "begin. One of the most pleasant time to visit. The famous National park opens to " +
                                "public from this month. Enjoy the moderately chilly evening with various " +
                                "outdoor group activities in the resort.\n\n" +
                                "BHANGARH/ CHAND BAORI, RAJASTHAN – Explore the mysterious " +
                                "fort at Bhangarh at leisure and relish the brilliant architecture of the stepwell at " +
                                "Chand Baori. If you can plan in early October, you can be part of the Abhaneri " +
                                "festival inside Chand Baori.";
                        SpannableString ssOtherTop12 = new SpannableString(othertop12);


                        MyMovieData[] myMovieData11 = new MyMovieData[]{
                                new MyMovieData("ANDAMAN & NICOBAR ISLANDS",ssAndaman,R.drawable.andamanone,R.drawable.andamantwo),
                                new MyMovieData("WEST BENGAL",ssWb,R.drawable.wbone,R.drawable.wbtwo),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTop12 ,R.drawable.novdomone,R.drawable.novdomtwo),
                        };

                        MyMovieAdapter myMovieAdapter11 = new MyMovieAdapter(myMovieData11,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter11);
                        recyclerView.invalidate();


                        break;
                    case "December":


                        String  goa = "A preferred destination for domestic and international tourists alike, Goa is at its best during the winter months starting from October till February. The crowds, the beach shacks, nightlife and festivities are in full swing during these months. Get some Sun, party hard during weekends, gorge on the delicious sea food, try your luck at the Casinos or get an adrenaline rush kayaking, parasailing or jet skiing. December is peak tourist season. If you like to be in the middle of all the action then opt for a stay in North Goa. If a laid back beach holiday is what you are looking for, then head to one of the South Goa resorts. There are plenty of self drive options available to explore Goa on bikes or cars or SUVs. You could also make a trip to Dudhsagar falls in the state.";
                        SpannableString ssGoa = new SpannableString(goa);

                        String  tn = "The Southern state of Tamil Nadu is famed for its Dravidian style ancient temples with tall ‘Gopurams’, rich culture, delectable cuisine, beaches and hill stations. The temple town of Mahabalipuram is known for its stunning beaches besides the ancient ruins, the other temple towns of Madurai, Rameswaram, Kanchipuram, Tanjavur, Tirunelveli are all important pilgrimage destinations. Kanyakumari is a very important tourist and pilgrimage destination owing to its location and the ancient temple. Tamil Nadu also boasts of the Nilgiri mountain ranges with beautiful hill stations of Ooty, Kodaikanal and Yercaud. Enjoy the winters by the beaches and head to the hills to escape the summer heat. Pondicherry, a Union territory is close to Chennai and a few hours drive. Spend a few days experiencing the French connection and heritage of Puducherry, the lovely beaches and find peace introspecting at the Aurobindo Ashram and Auroville.";
                        SpannableString ssTn = new SpannableString(tn);

                        String  othertop13 = "THE RANN OF KUTCH, GUJARAT – Book your luxury tent at the Rann " +
                                "Utsav in the white Rann of Kutch.   Watching the white rann spread under a full " +
                                "moon is simply out of the world. Enjoy the adventure activities, cultural " +
                                "programmes and lip smacking Gujarati delicacies\n\n" +
                                "NAGALAND – Hornbill Festival that’s called the Festival of Festivals is held " +
                                "in December. Its cold in most parts of the state\n\n" +
                                "VISHAKHAPATNAM, ANDHRA PRADESH – known as the Jewel of " +
                                "East Coast, winters starting this month are the best time to visit. The place is " +
                                "particularly known for its beaches, Borra Caves, Katiki Falls, Kursura Submarine " +
                                "Museum and Araku Valley\n\n" +
                                "KONARK/ PURI, ORISSA - Sea temperature is just perfect to explore " +
                                "waters for swimming and other activities. Best time for sight seeing and is also " +
                                "the month of world famous Konark Dance festival that’s held over 5 days.\n\n" +
                                "BANDHAVGARH, MADHYA PRADESH - Tiger enthusiasts wouldn’t " +
                                "want to miss this wonderful national park in the state of Madhya Pradesh. Home " +
                                "to several Bengal Tigers, this is the best time to visit in the year for an " +
                                "exhilarating experience of the national park and forest flora and fauna.\n\n" +
                                "HYDERABAD, TELANGANA – Explore the city that offers perfect mix of " +
                                "both historical and modern. From visiting the ancient Golconda and Charminar, " +
                                "Lumbini park and a boat ride to Buddha Statue in Tank Bund, the weather is " +
                                "simply great during the winter months. Eat, shop and repeat is the best thing to " +
                                "do";
                        SpannableString ssOtherTop13 = new SpannableString(othertop13);


                        MyMovieData[] myMovieData13 = new MyMovieData[]{
                                new MyMovieData("GOA",ssGoa,R.drawable.goaone,R.drawable.goatwo),
                                new MyMovieData("TAMIL NADU & PONDICHERRY",ssTn,R.drawable.tnone,R.drawable.tntwo),
                                new MyMovieData("OTHER DESTINATIONS",ssOtherTop13 ,R.drawable.decdomone,R.drawable.decdomtwo),
                        };

                        MyMovieAdapter myMovieAdapter13 = new MyMovieAdapter(myMovieData13,DestinationActivity.this);
                        recyclerView.setAdapter(myMovieAdapter13);
                        recyclerView.invalidate();

                        break;



                }

                break;



        }









    }
}