package com.flipkart.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.flipkart.recyclerviewdemo.adapters.SimpleContactsViewAdapter;
import com.flipkart.recyclerviewdemo.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        /**
         * Get the reference of the {@link RecyclerView } inside {@link R.layout.activity_recycler_view}
         */
        RecyclerView contactsRecyclerView = (RecyclerView) findViewById(R.id.list_view);


        if (contactsRecyclerView != null) {

            // create a list of contacts that needs to be displayed
            List<Contact> contacts = getContacts();

            /**
             * Create an {@link Adapter} to control {@link contactsRecyclerView}
             */
            SimpleContactsViewAdapter contactsAdapter = new SimpleContactsViewAdapter(contacts);

            /**
             * Set the {@link Adapter} to {@link contactsRecyclerView}
             */
            contactsRecyclerView.setAdapter(contactsAdapter);

            // WILL EXPLAIN LATER
            contactsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }

    }

    public List<Contact> getContacts() {
        String[] names = new String[]{"Lorelei Leng",
                "Erick Elmer",
                "Bettye Brownstein",
                "Rayford Ruble",
                "Joesph Jonson",
                "Shaun Stanforth",
                "Dennis Dunigan",
                "Jaqueline Johns",
                "Tai Tester",
                "Jovita Joubert",
                "Maple Mallery",
                "Latashia Locklin",
                "Nicole Nowicki",
                "Penelope Piraino",
                "Eddie Ehrlich",
                "Loise Laber",
                "Lilly Lex",
                "Irina Isaman",
                "Debbi Degraffenreid",
                "Ronald Reck"};

        String[] number = new String[]{"(701) 906-6051",
                "(937) 919-1875",
                "(954) 262-2131",
                "(799) 924-7190",
                "(903) 940-9496",
                "(470) 746-4127",
                "(131) 706-1440",
                "(168) 420-9263",
                "(726) 978-9410",
                "(720) 489-3709",
                "(400) 665-8483",
                "(773) 417-6753",
                "(771) 972-3908",
                "(534) 743-5996",
                "(500) 489-9171",
                "(979) 447-2780",
                "(254) 634-3315",
                "(337) 881-8488",
                "(579) 947-8603",
                "(358) 623-0176"};
        String[] email = new String[]{"stone@meekness.com",
                "ca-tech@dps.centrin.net.id",
                "trinanda_lestyowati@telkomsel.co.id",
                "asst_dos@astonrasuna.com",
                "amartabali@dps.centrin.net.id",
                "achatv@cbn.net.id",
                "bali@tuguhotels.com",
                "baliminimalist@yahoo.com",
                "bliss@thebale.com",
                "adhidharma@denpasar.wasantara.net.id",
                "centralreservation@ramayanahotel.com",
                "apribadi@balimandira.com",
                "cdagenhart@ifc.org",
                "dana_supriyanto@interconti.com",
                "dos@novotelbali.com",
                "daniel@hotelpadma.com",
                "daniel@balibless.com",
                "djoko_p@jayakartahotelsresorts.com",
                "expdepot@indosat.net.id",
                "feby.adamsyah@idn.xerox.com"};

        List<Contact> contacts = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            contacts.add(new Contact(names[i], number[i], email[i]));
        }

        return contacts;
    }
}
