package com.example.groupproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.groupproject.Fragment.DetailedFragment;

import java.util.Calendar;

public class booking_seat extends AppCompatActivity {

    Button exit,confirm;
    Button clear;
    TextView value,selectedSeat,movieTitle;
    int counter = 0;

    ToggleButton buttons [][] = new ToggleButton [6][8];
    String time;
    String dateTime;
    String price;
    String seat="";
    String tempseat;
    String totalTicket;
    String title,company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_seat);

        exit = findViewById(R.id.exit);
        confirm= findViewById(R.id.confirm);
        value = findViewById(R.id.value);
        clear = findViewById(R.id.clear);
        selectedSeat = findViewById(R.id.tv_selectedseat);
        movieTitle = findViewById(R.id.tv_movietitle);


        for(int i=0;i<6;i++){
            for(int j=0;j<8;j++){
                String buttonID = "button_" + i + (j+1);
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttons[i][j] = findViewById(resID);
                buttons[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tempseat = SeatNumber(v.getId());
                        if(seat.isEmpty()){
                            seat += tempseat;
                            counter++;
                        }else{
                            if(counter>0) {
                                if (seat.contains(tempseat)) {
                                    counter--;
                                    seat = seat.substring(0, seat.length() - 3);
                                } else {
                                    seat += tempseat;
                                    counter++;
                                }
                            }
                        }
                        selectedSeat.setText("Seats(s) : "+seat);
                        value.setText(Integer.toString(counter));
                    }
                });
            }
        }

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                value.setText(Integer.toString(counter));
                for(int i=0;i<6;i++){
                    for(int j=0;j<8;j++){
                        String buttonID = "button_" + i + (j+1);
                        int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                        buttons[i][j] = findViewById(resID);
                        buttons[i][j].setChecked(false);
                    }
                }
                seat="";
                selectedSeat.setText("Seat(s) : " + seat);
            }
        });
        //totalTicket = String.valueOf(counter);
        fetchInfo();

        exit.setOnClickListener((v -> {
            Intent intent = new Intent(booking_seat.this, DetailedFragment.class);
            startActivity(intent);
        }));

        confirm.setOnClickListener((v -> {
            Intent intent = new Intent(booking_seat.this, booking_food.class);
            intent.putExtra("movietitle",title);
            intent.putExtra("company",company);
            intent.putExtra("date",dateTime);
            intent.putExtra("time", time);
            intent.putExtra("price", price);
            intent.putExtra("seat", seat);
            intent.putExtra("totalseat", counter);
            //intent.putExtra("totalseat",totalTicket);
            startActivity(intent);
        }));
    }


    public void fetchInfo(){
        TextView date = findViewById(R.id.tvDate);
        Intent intent = getIntent();
        title = intent.getStringExtra("movietitle");
        movieTitle.setText(title);
        company = intent.getStringExtra("company");
        Calendar calendar = Calendar.getInstance();
        time = intent.getStringExtra("bookingtime");
        dateTime = intent.getStringExtra("date");
        date.setText(dateTime + " " +time);
        price = intent.getStringExtra("price");
    }

    public String SeatNumber(Integer btn_id){
        String targetSeat="";
        switch (btn_id){
            case R.id.button_01 :
                targetSeat = "A1 ";
                break;
            case R.id.button_02 :
                targetSeat = "A2 ";
                break;
            case R.id.button_03 :
                targetSeat = "A3 ";
                break;
            case R.id.button_04 :
                targetSeat = "A4 ";
                break;
            case R.id.button_05 :
                targetSeat = "A5 ";
                break;
            case R.id.button_06 :
                targetSeat = "A6 ";
                break;
            case R.id.button_07 :
                targetSeat = "A7 ";
                break;
            case R.id.button_08 :
                targetSeat = "A8 ";
                break;
            case R.id.button_11 :
                targetSeat = "B1 ";
                break;
            case R.id.button_12 :
                targetSeat = "B2 ";
                break;
            case R.id.button_13 :
                targetSeat = "B3 ";
                break;
            case R.id.button_14 :
                targetSeat = "B4 ";
                break;
            case R.id.button_15 :
                targetSeat = "B5 ";
                break;
            case R.id.button_16 :
                targetSeat = "B6 ";
                break;
            case R.id.button_17 :
                targetSeat = "B7 ";
                break;
            case R.id.button_18 :
                targetSeat = "B8 ";
                break;
            case R.id.button_21 :
                targetSeat = "C1 ";
                break;
            case R.id.button_22 :
                targetSeat = "C2 ";
                break;
            case R.id.button_23 :
                targetSeat = "C3 ";
                break;
            case R.id.button_24 :
                targetSeat = "C4 ";
                break;
            case R.id.button_25 :
                targetSeat = "C5 ";
                break;
            case R.id.button_26 :
                targetSeat = "C6 ";
                break;
            case R.id.button_27 :
                targetSeat = "C7 ";
                break;
            case R.id.button_28 :
                targetSeat = "C8 ";
                break;
            case R.id.button_31 :
                targetSeat = "D1 ";
                break;
            case R.id.button_32 :
                targetSeat = "D2 ";
                break;
            case R.id.button_33 :
                targetSeat = "D3 ";
                break;
            case R.id.button_34 :
                targetSeat = "D4 ";
                break;
            case R.id.button_35 :
                targetSeat = "D5 ";
                break;
            case R.id.button_36 :
                targetSeat = "D6 ";
                break;
            case R.id.button_37 :
                targetSeat = "D7 ";
                break;
            case R.id.button_38 :
                targetSeat = "D8 ";
                break;
            case R.id.button_41 :
                targetSeat = "E1 ";
                break;
            case R.id.button_42 :
                targetSeat = "E2 ";
                break;
            case R.id.button_43 :
                targetSeat = "E3 ";
                break;
            case R.id.button_44 :
                targetSeat = "E4 ";
                break;
            case R.id.button_45 :
                targetSeat = "E5 ";
                break;
            case R.id.button_46 :
                targetSeat = "E6 ";
                break;
            case R.id.button_47 :
                targetSeat = "E7 ";
                break;
            case R.id.button_48 :
                targetSeat = "E8 ";
                break;
            case R.id.button_51 :
                targetSeat = "F1 ";
                break;
            case R.id.button_52 :
                targetSeat = "F2 ";
                break;
            case R.id.button_53 :
                targetSeat = "F3 ";
                break;
            case R.id.button_54 :
                targetSeat = "F4 ";
                break;
            case R.id.button_55 :
                targetSeat = "F5 ";
                break;
            case R.id.button_56 :
                targetSeat = "F6 ";
                break;
            case R.id.button_57 :
                targetSeat = "F7 ";
                break;
            case R.id.button_58 :
                targetSeat = "F8 ";
                break;
        }
        return targetSeat;
    }
}