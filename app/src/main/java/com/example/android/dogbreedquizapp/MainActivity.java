package com.example.android.dogbreedquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void evaluateBreed(View view) {

        TextView breedText = (TextView) findViewById(R.id.breed_text);
        RadioGroup food = (RadioGroup) findViewById(R.id.foodGroup);
        RadioGroup career = (RadioGroup) findViewById(R.id.careerGroup);
        RadioGroup phone = (RadioGroup) findViewById(R.id.phoneGroup);
        RadioGroup car = (RadioGroup) findViewById(R.id.carGroup);

        if (food.getCheckedRadioButtonId() == -1 || career.getCheckedRadioButtonId() == -1 || phone.getCheckedRadioButtonId() == -1 || car.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), "Please answer all questions. WOOF!", Toast.LENGTH_LONG).show();
        }
            // get selected radio button from radioGroup
            int foodId = food.getCheckedRadioButtonId();
            int careerId = career.getCheckedRadioButtonId();
            int phoneId = phone.getCheckedRadioButtonId();
            int carId = car.getCheckedRadioButtonId();

            // find the radiobutton by returned id
            RadioButton selectedFoodRadioButton = (RadioButton) findViewById(foodId);
            RadioButton selectedCareerRadioButton = (RadioButton) findViewById(careerId);
            RadioButton selectedPhoneRadioButton = (RadioButton) findViewById(phoneId);
            RadioButton selectedCarRadioButton = (RadioButton) findViewById(carId);

            //Header image
            ImageView header = (ImageView) findViewById(R.id.header_image);

            if (selectedFoodRadioButton.getId() == 1) {
                if (selectedCareerRadioButton.getId() == 5) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih); 
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab); 
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi); 
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz); 
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 6) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Unicorn!"); header.setImageResource(R.drawable.unicorn);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Pig!"); header.setImageResource(R.drawable.pig);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug); 
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack); 
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 7) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 8) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        }
                    }
                }
            } else if (selectedFoodRadioButton.getId() == 2) {
                if (selectedCareerRadioButton.getId() == 5) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 6) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 7) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 8) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        }
                    }
                }
            } else if (selectedFoodRadioButton.getId() == 3) {
                if (selectedCareerRadioButton.getId() == 5) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {

                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 6) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 7) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 8) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        }
                    }
                }
            } else if (selectedFoodRadioButton.getId() == 4) {
                if (selectedCareerRadioButton.getId() == 5) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 6) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 7) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Japanese Spitz!"); header.setImageResource(R.drawable.spitz);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Poodle!"); header.setImageResource(R.drawable.poodle);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        }
                    }
                } else if (selectedCareerRadioButton.getId() == 8) {
                    if (selectedCareerRadioButton.getId() == 9) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Jack Russel!"); header.setImageResource(R.drawable.jack);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 10) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a German Sheperd!"); header.setImageResource(R.drawable.german);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Corgi!"); header.setImageResource(R.drawable.corgi);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 11) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Pug!"); header.setImageResource(R.drawable.pug);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Labrador!"); header.setImageResource(R.drawable.lab);
                        }
                    } else if (selectedPhoneRadioButton.getId() == 12) {
                        if (selectedCarRadioButton.getId() == 13) {
                            breedText.setText("You're a Siberian Husky!"); header.setImageResource(R.drawable.husky);
                        } else if (selectedCarRadioButton.getId() == 14) {
                            breedText.setText("You're a Shiba Inu!"); header.setImageResource(R.drawable.shibe);
                        } else if (selectedCarRadioButton.getId() == 15) {
                            breedText.setText("You're a Golden Retriever!"); header.setImageResource(R.drawable.golden);
                        } else if (selectedCarRadioButton.getId() == 16) {
                            breedText.setText("You're a Shih Tzu!"); header.setImageResource(R.drawable.shih);
                        }
                    }
                }
            }


    }
}


