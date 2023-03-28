package com.creativexs.pcaia;




public class ArraysImagesAndWords {

    static String words1[] = {"Regularly and thoroughly clean your hands, ",
            "Avoid close contact with people as possible, ",
            "Avoid touching eyes and nose and mouth, ",
            "Keep your respiratory hygiene and avoid any thing that harm your respiratory health, ",
            "In case of fever and cough and difficulty breathing ask for medical care early, ",
            "Stay informed and follow advice given by your health care provider, "};


    static Integer images1[] = {R.drawable.image_11, R.drawable.image_12,
            R.drawable.image_13, R.drawable.image_14, R.drawable.image_15, R.drawable.image_16};


    static String[] getWordsSubs(int wordsPosition){

        String[] wordsSubs = null;

        switch (wordsPosition) {

            case 0:
                wordsSubs = new String[]{"Soap and water,You can use soap and water. ", "Hand wash,You can also use hand wash carefully.",
                        "Alcohol-based, You can also use an alcohol-based hand rub.",
                        "Warm water,It's good to use warm water also with any washing."};
                break;
            case 1:
                wordsSubs = new String[]{"Avoid crowded,As possible it's very necessary to avoid crowded places which have high chance to contain a sick person.",
                        "Social distance,Stay away as possible from anyone coughing or sneezing 1 meter at least.",
                        "Avoid greeting,Avoid hugging and kissing when greeting as possible.",
                        "Shaking hands,Avoid shaking hands with people as possible.",
                        "Close contact,Avoid close contacting or close speaking with people as possible.",
                        "Stay home,It's better to stay home at all time if possible or trying to stay home most of your time and take all necessary" +
                                "precautions if you must go to anywhere."
                };
                break;
            case 2:
                wordsSubs = new String[]{"Touching NOSE,As possible Avoid touching your NOSE all time.",
                        "Touching MOUTH,As possible Avoid touching your MOUTH all time.",
                        "Touching EYES,As possible Avoid touching your EYES all time.",
                        "Touching face,If possible try to not touching whole face since you can't be sure what place exactly you touch.",
                        "Wear mask,It's better to wear mask as much time as possible especially if you have to get out home." ,
                        "Touching surfaces,As possible try to avoid touching surfaces(metallic, wood and ...et) and try to regularly and thoroughly " +
                                "clean surfaces in your home."};
                break;
            case 3:
                wordsSubs = new String[]{"Tissue sneezing,Use tissue when sneezing then dispose of the used tissue immediately and wash your hands.",

                        "Bent elbow sneezing,You can also use your bent elbow when sneezing",

                        "Avoid Smoking,As possible avoid smoking and its similars because smoking have a destroyed effects on your respiratory system which will weaken" +
                                "your respiratory immune system against respiratory diseases.",

                        "Avoid too much eating,Too much eating have bad effects on your respiratory system which may weaken " +
                                "your respiratory immune system against respiratory diseases.",

                        "Avoid allergic,If you have respiratory allergy," +
                                " as possible avoid things that cause allergy to you because allergic may weaken " +
                                "your respiratory immune system against respiratory diseases.",

                        "Well-balanced diet,Eating a well-balanced diet is good for health and immune(Explained in Food and immune list).",

                        "Avoid negativity,Avoiding negative emotions is good for health and immune(Explained in Food and immune list).",

                        "Breathing fresh air,Breathing fresh air is good for health, for respiratory system and for mood. Breathing fresh air " +
                                "make you less stressed and give you a positive energy. It's also necessary for making respiratory system works as normal." +
                                "Being isolated not meaning don't breath fresh air or see the sun. Just open the window (if you have to stay home all time) and " +
                                "breath fresh air and see the sun. It's very good for your health, feelings and immune" +
                                " especially for respiratory immune system against respiratory diseases."};
                break;
            case 4:
                wordsSubs = new String[]{"Fever,If you have fever ask for medical care early.",
                        "Cough,If you have cough ask for medical care early.",
                        "Difficulty breathing,If you have difficulty breathing ask for medical care early.",

                        "Medical care,If you have fever, cough Ask, difficulty breathing  or any other symptoms, " +
                                "ask for medical care early. It's better to not go to hospital directly if you don't have a strong and several symptoms." +
                                " Call your health provider or your doctor first and tell him/her about what symptoms you have " +
                                "and he/she will tell you about what you should do."};
                break;

            case 5:
                wordsSubs = new String[]{"Precautions news,Try to follow precautions news to know more information about diseases and to know " +
                        "the new precautions ways that may be invented.",

                        "Medical resources,Follow and be informed a trusted national medical resources to know all the correct information that they" +
                                "provided about diseases and avoid social posts and information because it's may be incorrect." +
                                "Avoid rumors and gossip about diseases. If you hear a new medical information check it from trusted national medical resources" +
                                "or from your health provider or your doctor.",

                        "Health provider,Be informed and follow your health provider or your doctor. Follow his/her advices, information and recommendations.",

                        "Hopeful and quiet,You should be hopeful and quiet. That's because being nervous and hopeless won't do anything except harm you." +
                                "Extreme fear and hopeless may cause hallucination which can make you feel that you have any disease and even " +
                                "cause some of its symptoms."};
                break;

        }

        return wordsSubs;
    }


    static Integer[] getImagesSubs(int imagesPosition) {
        Integer[] imagesSubs = null;

        switch (imagesPosition) {
            case 0:
                imagesSubs = new Integer[]{R.drawable.image_11_1, R.drawable.image_11_2, R.drawable.image_11_3, R.drawable.image_11_4};
                break;
            case 1:
                imagesSubs = new Integer[]{R.drawable.image_12_1, R.drawable.image_12_2, R.drawable.image_12_3, R.drawable.image_12_4,
                        R.drawable.image_12_5, R.drawable.image_12_6};
                break;
            case 2:
                imagesSubs = new Integer[]{R.drawable.image_13_1, R.drawable.image_13_2, R.drawable.image_13_3, R.drawable.image_13_4,
                        R.drawable.image_13_5, R.drawable.image_13_6};
                break;
            case 3:
                imagesSubs = new Integer[]{R.drawable.image_14_1, R.drawable.image_14_2, R.drawable.image_14_3, R.drawable.image_14_4,
                        R.drawable.image_14_5, R.drawable.image_14_6, R.drawable.image_14_7, R.drawable.image_14_8};
                break;
            case 4:
                imagesSubs = new Integer[]{R.drawable.image_15_1, R.drawable.image_15_2, R.drawable.image_15_3, R.drawable.image_15_4};
                break;
            case 5:
                imagesSubs = new Integer[]{R.drawable.image_16_1, R.drawable.image_16_2, R.drawable.image_16_3, R.drawable.image_16_4};
                break;
        }
        return imagesSubs;
    }

    private static Integer foodImages[];

    static  Integer [] getFoodImages() {

            foodImages = new Integer[]{R.drawable.image_211, R.drawable.image_212, R.drawable.image_213, R.drawable.image_214, R.drawable.image_215,
            R.drawable.image_216, R.drawable.image_217, R.drawable.image_218, R.drawable.image_219,

            R.drawable.image_221, R.drawable.image_222, R.drawable.image_223, R.drawable.image_224, R.drawable.image_225, R.drawable.image_226,
            R.drawable.image_227, R.drawable.image_228, R.drawable.image_229, R.drawable.image_2210,

            R.drawable.image_231, R.drawable.image_232, R.drawable.image_233, R.drawable.image_234, R.drawable.image_235, R.drawable.image_236,
            R.drawable.image_237, R.drawable.image_238, R.drawable.image_239,

            R.drawable.image_241, R.drawable.image_242, R.drawable.image_243, R.drawable.image_244, R.drawable.image_245, R.drawable.image_246,
            R.drawable.image_247, R.drawable.image_248, R.drawable.image_249,

            R.drawable.image_251, R.drawable.image_252, R.drawable.image_253, R.drawable.image_254, R.drawable.image_255, R.drawable.image_256,
            R.drawable.image_257, R.drawable.image_258, R.drawable.image_259, R.drawable.image_2510,

            R.drawable.image_2e1, R.drawable.image_2e2, R.drawable.image_2e3, R.drawable.image_2e4, R.drawable.image_2e5, R.drawable.image_2e6,
            R.drawable.image_2e7, R.drawable.image_2e8, R.drawable.image_2e9


    };

            return foodImages;
}

    private static String foodWords[];

    static String[] getFoodWords(){

        foodWords=new String []{
            "Crimini Mushrooms (Exposed to UV Light),Crimini mushrooms very very rich of vitamin D which may helps strengthen your immune system's ability to fight diseases." +
                    "Mushrooms create vitamin D from sunlight much like our bodies. Placing any mushroom under the sun for 20 minutes will boost its vitamin D level." +
                    "There are more Mushrooms Exposed to Sunlight High in Vitamin D like portabellas(also contain Potassium), maitakes, white button mushrooms(also contains Potassium), " +
                    "morels, chantarelles, shiitakes(also contain Zinc) and ...etc" +
                    "Crimini Mushrooms also contains Potassium which also may helps strengthen your immune system's ability to fight diseases. " +
                    "Mushrooms also contain about 12 mcg of selenium in a 100-gram serving",


                    "Eat fish (Salmon),Salmon very rich of Vitamin D which may helps strengthen your immune system's ability to fight diseases. " +
                            "There are more Fish High in Vitamin D like canned salmon, smoked whitefish, swordfish fillet, rainbow trout fillet, canned sardines," +
                            " tilapia fillet(also contains Potassium), halibut fillet and ....etc." +
                            "Salmon also contains Potassium which helps strengthen your immune system's ability to fight diseases. ",


                    "Fortified Breakfast Cereal,Which rich of Vitamin D which may helps strengthen your immune system's ability to fight diseases.",


                    "Fortified Tofu,Which contains Vitamin D which may helps strengthen your immune system's ability to fight diseases.",


                    "Eggs,Which contains Vitamin D which may helps strengthen your immune system's ability to fight diseases." +
                            "There are other eggs High in Vitamin D like chopped hard-boiled eggs and scambled eggs. "+"" +
                            "One hard-boiled egg also provides about 20 mcg of selenium. Don’t like hard-boiled? No worries, go for eggs cooked any way you like, " +
                            "and you’ll still get a dose of selenium.",


                    "Fortified Yogurt,Which contains Vitamin D which may helps strengthen your immune system's ability to fight diseases.",


                    "Fortified Milk,Which contains Vitamin D which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Dairy High in Vitamin D like low-fat milk, dehydrated milk, buttermilk, queso fresco and ...etc.",


                    "Fortified Milk Substitutes (Soy Milk),Which contains Vitamin D which may helps strengthen your immune system's ability to fight diseases." +
                            "There are other Fortified Milk Substitutes High in Vitamin D like almond milk, rice milk and coconut milk",


                    "Fortified Orange Juice,Which contains Vitamin D which may helps strengthen your immune system's ability to fight diseases.",





                    "Guavas,Guavas extreme rich of Vitamin C which may helps strengthen your immune system's ability to fight diseases." +
                            "Guavas also contains Potassium which also may helps strengthen your immune system's ability to fight diseases.",

                    "Bell Peppers,Bell Peppers very very rich of Vitamin C which may helps strengthen your immune system's ability to fight diseases.",

                    "Kiwifruit,Kiwifruit very rich of Vitamin C which may helps strengthen your immune system's ability to fight diseases" +
                            "Kiwifruit also contains Potassium which also helps strengthen your immune system's ability to fight diseases.",

                    "Broccoli,Broccoli very rich of Vitamin C which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Brassica Vegetables High in Vitamin C like brussels sprouts, cauliflower and cabbage." +
                            "Broccoli also contains Vitamin A which also may helps strengthen your immune system's ability to fight diseases.",

                    "Papaya,Papaya rich of Vitamin C which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Tropical Fruits High in Vitamin C like pineapple, cantaloupe melon(also contains Potassium), sliced mango and honeydew melon.",

                    "Snow Peas,Snow Peas rich of Vitamin C which may helps strengthen your immune system's ability to fight diseases.",

                    "Strawberries,Strawberries rich of Vitamin C which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Berries High in Vitamin C like raspberries, blackberries and blueberries.",

                    "Oranges,Oranges rich of Vitamin C which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Citrus Fruit High in Vitamin C like pummelo(which extreme rich of Vitamin C), grapefruit," +
                            "clementine and lemon.",

                    "Tomato,Tomato contains Vitamin C which may helps strengthen your immune system's ability to fight diseases." +
                            "Tomato also contains Potassium which also helps strengthen your immune system's ability to fight diseases.",

                    "Kale,Kale contains Vitamin C which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Green Leafy Vegetables High in Vitamin C like turnip greens, swiss chard and spinach.",





                    "Oysters,Oysters extreme rich of Zinc which may helps strengthen your immune system's ability to fight diseases." +
                            "There are other Seafood High in Zinc like a king crab leg, small clams, canned blue crab, serving of lobster," +
                            "serving of octopus and ...etc.",

                    "Beef (Chuck Steak),Which very very rich of Zinc which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Red Meat High in Zinc like ribeye steak, chuck beef roast, hamburger patty, ground buffalo," +
                            " lamb shank and ...etc.",

                    "Chicken ,Chicken Leg contains Zinc which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Poultry High in Zinc like roast duck, roast turkey and chicken drumstick (leg). "+"" +
                            "Chicken also will give you about 22 to 25 mcg of selenium per 85g of white meat. This translates to a serving that’s " +
                            "similar in size to a deck of cards, making it an easy way to add some selenium to your diet.",

                    "Firm Tofu,Firm Tofu contains Zinc which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Soy Products High in Zinc like natto, green soybeans and tempeh.",

                    "Hemp Seeds,Hemp Seeds very rich of Zinc which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Nuts and Seeds High in Zinc like handful of squash/pumpkin seeds, pine nuts and cashews.",

                    "Lentils,Lentils contains Zinc which may helps strengthen your immune system's ability to fight diseases." +
                            "There are other beans High in Zinc like garbanzo beans (chickpeas), large white beans, black-eyed peas," +
                            " navy beans, black beans and ...etc." +
                            "Lentils also contains Potassium which also may helps strengthen your immune system's ability to fight diseases. " +
                            "A cup of cooked lentils also provides about 6 mcg of selenium, plus a healthy dose of protein and fiber. " +
                            "You can add them to a soup with mushrooms for a vegan-friendly meal full of selenium.",

                    "Low-Fat Yogurt,Which contains Zinc which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Dairy Foods High in Zinc like milk, low-fat ricotta, Swiss cheese, grated parmesan, Gouda " +
                            "and ...etc." +
                            "Low-Fat Yogurt also contains Potassium which also may helps strengthen your immune system's ability to fight diseases. " +
                            "Yogurt also contains about 8 mcg of selenium per cup, or 11 percent of your needs per day.",

                    "Oatmeal,Oatmeal contains Zinc which may helps strengthen your immune system's ability to fight diseases." +
                            "You can use Fortified breakfast cereals which can provide 170% DV zinc per serving. " +
                            "One cup of regular oatmeal, cooked, will give you also 13 mcg of selenium. " +
                            "You can also enjoy it for breakfast with two eggs to get 53 mcg of selenium.",

                    "Shiitake Mushrooms,Which contains Zinc which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Vegetables High in Zinc like green peas, cooked spinach, lima beans and ...etc." +
                            "Shiitake Mushrooms also contains vitamin D which may also helps strengthen your immune system's ability to fight diseases. " +
                            "Mushrooms also contain about 12 mcg of selenium in a 100-gram serving",




                    "Sweet Potato,Sweet Potato very very rich of Vitamin A which may helps strengthen your immune system's ability to fight diseases." +
                            "You can use a medium-sized baked sweet potato which provides 122% DV of vitamin A." +
                            "Sweet Potato(with skin) also contains Potassium which may also helps strengthen your immune system's ability to fight diseases.",

                    "Carrots,Carrots very rich of Vitamin A which may helps strengthen your immune system's ability to fight diseases." +
                            "A medium sized carrot provides 44% DV of vitamin A.",

                    "Tuna,Tuna very rich of Vitamin A which may helps strengthen your immune system's ability to fight diseases." +
                            "There are other Fish and Seafood High in Vitamin A like fillet of eel, cod liver oil, clams, cooked mackerel" +
                            " and ...etc.",

                    "Butternut Squash,Which rich of Vitamin A which may helps strengthen your immune system's ability to fight diseases." +
                            "There are other Squash High in Vitamin A like canned pumpkin, hubbard squash, average winter squash and acorn squash.",

                    "Spinach,Spinach rich of Vitamin A which may helps strengthen your immune system's ability to fight diseases." +
                            "There are other Dark Leafy Greens High in vitamin A like cooked kale, cooked mustard greens, cooked collards," +
                            " cooked Swiss chard and cooked bok choy. " +
                            "A spinach, cooked from frozen, will also provide you with about 11 mcg of selenium per cup. " +
                            "It’s also packed full of folic acid and vitamin C.",

                    "Cantaloupe,Cantaloupe contains Vitamin A which may helps strengthen your immune system's ability to fight diseases." +
                            "There are other Fruits High in Vitamin A like apricots, sliced mango, sliced papaya and ...etc" +
                            "Cantaloupe also contains Potassium which may also helps strengthen your immune system's ability to fight diseases.",

                    "Lettuce,Lettuce rich of Vitamin A which may helps strengthen your immune system's ability to fight diseases.",

                    "Red Bell Peppers,Which contains Vitamin A which may helps strengthen your immune system's ability to fight diseases." +
                            "Cooked Green Bell Peppers provide 3% DV of Vitamin A per cup cooked.",

                    "Grapefruit,Grapefruit contains Vitamin A which may helps strengthen your immune system's ability to fight diseases." +
                            "Grapefruit also rich of Vitamin C which may help strengthen your immune system's ability to fight diseases.",




                    "Beet Greens,Which contains Potassium which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Greens High in Potassium like cooked Swiss chard, cooked spinach, cooked kale and ...etc",

                    "Snapper Fillet,Which contains Potassium which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Fish High in Potassium like Salmon(also rich of Vitamin D), mahi-mahi fillet, " +
                            "tilapia fillet(also rich of Vitamin D) and ...etc",

                    "Large White Beans,Which contains Potassium which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Beans High in Potassium like lima beans(also contains Zinc), navy beans, lentils and ...etc." +
                            "Large White Beans also contains Zinc which may also helps strengthen your immune system's ability to fight diseases. " +
                            "You can also enjoy a cup of baked beans and you’ll get about 13 mcg of selenium along with some important fiber.",

                    "Avocados,Avocados contains Potassium which may helps strengthen your immune system's ability to fight diseases." +
                            "Avocados is also incredibly nutritious. Avocados contains Vitamin K, Folate, Vitamin C, Potassium, Vitamin B5, " +
                            "Vitamin B6 and Vitamin E. It also contains small amounts of magnesium, manganese, copper, iron, zinc, phosphorous " +
                            "and vitamins A, B1 (thiamine), B2 (riboflavin) and B3 (niacin). This is coming with 160 calories, 2 grams of protein " +
                            "and 15 grams of healthy fats. Although it contains 9 grams of carbs, 7 of those are fiber, " +
                            "so there are only 2 net carbs, making this a low-carb friendly plant food." +
                            "Avocados do not contain any cholesterol or sodium and are low in saturated fat. " +
                            "This is why they are favored by some experts who believe these substances are harmful." +
                            "Avocados contain much Potassium. Potassium is an important mineral that most people don't get enough of. Avocados are very high in potassium, " +
                            "which should support healthy blood pressure levels." +
                            "Avocado Is Loaded With Heart-Healthy Monounsaturated Fatty Acids. Avocados and avocado oil are high in monounsaturated oleic acid, a heart-healthy fatty acid " +
                            "that is believed to be one of the main reasons for the health benefits of olive oil." +
                            "Avocados Are Loaded With Fiber. Avocados tend to be rich in fiber — about 7% by weight, which is very high compared to most other foods. " +
                            "Fiber may have important benefits for weight loss and metabolic health." +
                            "Eating Avocados Can Lower Cholesterol and Triglyceride Levels. Numerous studies have shown that eating avocado can improve heart disease risk factors like total, " +
                            "“bad” LDL and “good” HDL cholesterol, as well as blood triglycerides." +
                            "People Who Eat Avocados Tend to Be Healthier. One dietary survey found that people who ate avocados had a much higher nutrient intake and a lower risk of metabolic syndrome." +
                            "Their Fat Content May Help You Absorb Nutrients From Plant Foods. Studies have shown that eating avocado or avocado oil with vegetables can dramatically increase the number of antioxidants you take in." +
                            "Avocados Are Loaded With Powerful Antioxidants That Can Protect Your Eyes. Avocados are high in antioxidants, including lutein and zeaxanthin. These nutrients are very important for eye health and lower your risk of macular degeneration and cataracts." +
                            "Avocado May Help Prevent Cancer. Some test-tube studies have shown that nutrients in avocados may have benefits in preventing prostate cancer and lowering side effects of chemotherapy. However, human-based research is lacking." +
                            "Avocado Extract May Help Relieve Symptoms of Arthritis. Studies have shown that avocado and soybean oil extracts can significantly reduce symptoms of osteoarthritis." +
                            "Eating Avocado May Help You Lose Weight. Avocados may aid weight loss by keeping you full longer and making you eat fewer calories. They're also high in fiber and low in carbs, which may promote weight loss." +
                            "Avocado Is Delicious and Easy to Incorporate in Your Diet. Avocados have a creamy, rich, fatty texture and blend well with other ingredients. Therefore, it’s easy to add this fruit to your diet. Using lemon juice may prevent cut avocados from browning quickly." +
                            "That's all make Avocados very recommended fruit in all time especially to strengthen your immune system during the pandemic.",

                    "Potatoes,Potatoes contains Potassium which may helps strengthen your immune system's ability to fight diseases." +
                            "Warning: Potatoes are high in simple carbohydrates and not recommended for people with diabetes. " +
                            "Sweet potatoes are actually better for regulating blood sugar, " +
                            "an average baked sweet potato with skin (180g) provides 18%DV of potassium.",

                    "Acorn Squash,Which contains Potassium which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Squash High in Potassium like hubbard squash, butternut squash and zucchini" +
                            "Squash also rich of Vitamin A and Zinc which may also help strengthen your immune system's ability to fight diseases.",

                    "Milk,Milk contains Potassium which may helps strengthen your immune system's ability to fight diseases." +
                            "There are More Dairy High in Potassium like low-fat yogurt, gjetost cheese, low fat buttermilk and ...etc" +
                            "Milk also contains Zinc which may also helps strengthen your immune system's ability to fight diseases. " +
                            "Milk also contain about 8 mcg of selenium per cup, or 11 percent of your needs per day. " +
                            "You can also add some milk to your enriched cereal to up your intake.",

                    "White Button Mushrooms,Which contains Potassium which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Mushrooms High in Potassium like crimini mushrooms, oyster mushrooms and portabellas" +
                            "White Button Mushrooms also contains vitamin D which may also helps strengthen your immune system's ability to fight diseases. " +
                            "Mushrooms also contain about 12 mcg of selenium in a 100-gram serving",


                    "Bananas,Bananas contains Potassium which may helps strengthen your immune system's ability to fight diseases." +
                            "There are more Fruits High in Potassium like guavas, kiwifruit, cantaloupe and ...etc. " +
                            "A cup of chopped banana also offers 2 mcg of selenium, or 3 percent of your daily " +
                            "recommended intake. Again, this might not seem like much, but most fruits offer " +
                            "only minimal traces of selenium or none at all. " +
                            "You can add bananas to a smoothie with yogurt or your favorite oatmeal for more selenium.",

                    "Cherry Tomatoes,Which contains Potassium which may helps strengthen your immune system's ability to fight diseases." +
                            "There are other tomatoes high in Potassium like Tomato(also contains Vitamin C) and average tomato",






                "Honey,Honey help strengthen your immune system at all which may help to fight diseases.\n" +
                        "That's because Honey’s antioxidant and antibacterial properties help improve the digestive " +
                        "system and boost immunity. It is also a powerhouse of antioxidants, which are very effective for " +
                        "the removal of free radicals from the body. “Start your day by adding a spoonful of honey and lemon " +
                        "juice (from half a lemon) to a cup of warm water. Drink this cleansing tonic before breakfast to " +
                        "reap the benefits”, says Delhi-based Nutritionist Anshul Jaibharat.\n" +
                        "Honey also have many benefits like Natural Energy Booster, Treats Cough, Improves Sleep, Treats Wounds And Burns," +
                        "Cures Hangover (Just a few tablespoons of honey will help speed up your body’s metabolism and help you combat that hangover, since fructose helps speed up the oxidation of alcohol by the liver.)," +
                        "Prevents Heart Diseases (Consumption of natural honey increases polyphonic antioxidants in the blood which helps prevent heart diseases. It can also help lower cholesterol levels.), " +
                        "weight losing ( honey helps control your appetite. If you consume honey before bed, the body begins to burn more fat during those early hours of sleep), " +
                        "Fabulous Skin (Honey is a fantastic moisturiser and works wonders on patches of dry skin. You can use it to soften up your knees and elbows, even chapped lips.), " +
                        "Treats Dandruff (honey can bring temporary relief to the scalp by targeting dandruff.), Silky Hair (Honey acts as a natural agent for moisturising hair and cleansing the scalp, leaving you with silk smoothy hair without stripping away any natural oils.) " +
                        "and ....etc.",



                "Black seed,Black seed has many medical benefits. it helps strengthen your immune system at all which may help to fight diseases.\n" +
                        "Also Enerex Black Seed Oil offers well-researched antioxidant benefits. " +
                        "Studies have found that Black Seed’s effects on the immune system’s natural killer cells may reduce liver infection; " +
                        "and in one study, cancer tumor growth was reduced by 50% due to Black Seed’s effects on immune cells. It is Black Seed’s " +
                        "unique ingredients called crystalline nigellone and thymoquinone that knock out invading diseases and destructive renegade " +
                        "molecules that may cause diseases from cancer to arthritis.\n " +
                        "Also Enerex Black Seed Oil is a powerful antiviral and antibacterial remedy," +
                        " with several recent studies showing that Black Seed can reduce even virulent strains of Salmonella " +
                        "and other bacteria that are becoming resistant to antibiotics. It may also be helpful for viral illnesses " +
                        "as serious as HIV. This potent oil even has a patent for its antibacterial effects, which are said to be due to " +
                        "its unique ingredient called thymoquinone.\n" +
                        "Black Seed is quickly becoming the herbal oil to watch with its anti-inflammatory compounds to " +
                        "reduce symptoms of asthma, hay fever and eczema. This unique oil even has a medical patent for its " +
                        "asthma benefits. Enerex Black Seed Oil offers an easy way to take the herbal remedy " +
                        "to reduce symptoms of allergic reactions that are shown on the skin or in the respiratory system." +
                        "\nIt has many other benefits (like helping for lose weight) which makes it very recommended every day " +
                        "with safe amount for sure.",




                "Olive oil, Olive oil has many medical benefits and one of them strengthen your immune system at all which may help to fight diseases.\n" +
                        "Two or three tablespoons of extra-virgin olive oil each day can provide an immune system boost because " +
                        "olive oil has anti-inflammatory properties and is a good source of antioxidants. Look for extra-virgin olive oil," +
                        " the first press of the olives with the highest concentration of antioxidants. Drizzle it on salads or over your steamed veggies," +
                        " and use it in recipes instead of saturated fats like butter.\n" +
                        "-Olive oil is also rich in monounsaturated oleic acid. This fatty acid is " +
                        "believed to have many beneficial effects and is a healthy choice for cooking.\n" +
                        "-Olive Oil Contains Large Amounts of Antioxidants. These antioxidants are biologically active and may " +
                        "reduce your risk of chronic diseases. They also fight inflammation and help protect your blood cholesterol from " +
                        "oxidation — two benefits that may lower your risk of heart disease.\n" +
                        "-Olive oil contains nutrients that fight inflammation. These include oleic acid as well as the antioxidant " +
                        "oleocanthal.\n" +
                        "-Several large studies demonstrate that people who consume olive oil have a much lower risk of stroke, " +
                        "the second biggest killer in developed countries.\n" +
                        "-Extra virgin olive oil has numerous benefits for heart health. It lowers blood pressure, protects “bad” LDL cholesterol " +
                        "particles from oxidation and improves the function of blood vessels.\n" +
                        "-Consuming olive oil does not appear to increase the likelihood of weight gain. Moderate intake may even aid weight loss.\n" +
                        "-Some studies suggest that olive oil may combat Alzheimer's disease, but more research is needed.\n" +
                        "-Both observational studies and clinical trials suggest that olive oil, combined with a Mediterranean diet," +
                        " can reduce your risk of type 2 diabetes.\n" +
                        "-The Antioxidants in Olive Oil Have Anti-Cancer Properties. Preliminary evidence suggests that olive oil " +
                        "may reduce cancer risk, but further studies are needed.\n" +
                        "-Olive oil can help reduce joint pain and swelling from rheumatoid arthritis. " +
                        "The beneficial effects are greatly increased when combined with fish oil.\n" +
                        "-Extra virgin olive oil has antibacterial properties and has been found to be particularly effective against " +
                        "Helicobacter pylori, a type of bacterium that can cause stomach ulcers and stomach cancer.\n" +
                        "At the end, Make Sure to Get the Right type. Buying the right kind (Extra virgin olive oil) of " +
                        "olive oil is extremely important.",




                "Avoid Alcohol,Alcohol and drugs weaken immune system at all especially against respiratory diseases." +
                        "Alcohol can affect your health in many different ways. Most people are aware that " +
                        "excessive drinking can damage your liver and cardiovascular system. It can also damage your digestive system, " +
                        "leading to malnutrition and even increasing your risk of cancer. Many people see these conditions " +
                        "as problems for the distant future. You may be less aware that alcohol also damages your immune system, " +
                        "increasing your risk of potentially fatal illnesses such as pneumonia. There are a number of ways alcohol " +
                        "impairs your immune system, making you more likely to get sick. First, it’s important to know that the microbes " +
                        "living in your intestines, your gut’s microbiome, plays an important role in fighting diseases. " +
                        "This happens in many ways that we’re just beginning to understand. When you drink a lot of alcohol, " +
                        "it has many negative effects on your digestive system. It damages the epithelial cells in your intestines, " +
                        "making it harder to absorb many nutrients. It also severely disturbs your gut’s microbiome, " +
                        "significantly altering the balance of healthy and unhealthy bacteria. Alcohol affects the way health gut microbes" +
                        " interact with the immune system. Alcohol also disrupts the gut barrier, allowing more bacteria to pass into " +
                        "the blood. These rogue bacteria can cause inflammation in the liver and may lead to liver damage. " +
                        "Alcohol doesn’t just affect the function of the digestive tract. It also affects the respiratory system and much more destroying effects." +
                        "It's clear that alcohol and drugs have destroying effects on body at all and specially on respiratory immune system. So it's better to" +
                        "fully avoiding them if possible.",





                "Diet rich,Eating diet rich in vegetables, fruit and lean protein which may help strengthen your immune system's ability to fight diseases." +
                            "\nBest lean protein:\nWhite-Fleshed Fish, Plain Greek Yogurt," +
                            "Beans, Peas and Lentils, Skinless, White-Meat Poultry, Low-Fat Cottage Cheese, Lite Tofu, Lean Beef, Powdered Peanut Butter," +
                            "Low-Fat Milk, Frozen Shrimp, Egg Whites and Bison.\n" +
                            "Best vegetables for that:\n" +
                            "Spinach And Other Leafy Greens, Mushrooms, Cauliflower And Broccoli, Chillies, Pumpkin, Carrots, Beans, Asparagus and Cucumbers\n" +
                            "Best fruits for that:\n" +
                            "Grapefruit, Apples, Berries, Stone Fruits, Passion Fruit, Rhubarb, Kiwifruit, Melons, Oranges, " +
                            "Bananas and Avocados.",




                "Lose weight,If you have an obesity problem it's better to try lose weight. That's because " +
                            "obesity can weaken the body's immune system and reduce its ability to fight off infections, according to scientists.\n" +
                            "\n" +
                            "Previous studies have hinted at a link between obesity and increased risk of bacterial infections, but there has been little research into how serious the effects are.\n" +
                            "\n" +
                            "It is a pressing issue because obesity has reached epidemic proportions. In the UK, more than a fifth of adults are obese and of the remaining population half of men and a third of women are overweight.\n" +
                            "Get Society Weekly: our newsletter for public service professionals\n" +
                            "Read more\n" +
                            "\n" +
                            "Worldwide, there are an estimated 300 million obese people and obesity is already linked to heart disease, diabetes and premature death.\n" +
                            "\n" +
                            "In their experiment, researchers led by Salomon Amar at Boston University infected obese mice with bacteria which cause gum disease. They found that compared with lean mice, the obese mice showed a 40% greater increase in tooth decay and loss of bone 10 days after being infected.\n" +
                            "\n" +
                            "Writing in the Proceedings of the National Academy of Sciences yesterday, the Boston researchers found that the obese mice also had more bacteria around their gums compared with lean mice, concluding that this was due to their inability to mount a proper immune attack on the bugs. This meant the bacteria could linger in the mouth and cause more damage.\n" +
                            "\n" +
                            "Though it is unclear exactly what causes obesity to affect the immune response, the researchers suggested that gaining weight might upset a mechanism in the body that reacts to foreign organisms. They added that the effect would have implications for many bacterial infections." +
                            "\nFrom above it's clear that if you have obesity problem you should try to lose weight which may help strengthen your immune system's ability to fight diseases.",






                    "Exercises,Regularly exercises and sports help strengthen your immune system at all which may help to fight diseases.\n" +
                            "It's not needing for long time or hard exercises, 15-30 minutes of easy exercises every day may be enough " +
                            "like walking and breathing fresh air (if allowable).\n" +
                            "Being in isolation without access to gyms and sports clubs should not mean people stop exercising," +
                            " according to a new study. Keeping up regular, daily exercise at a time when much of " +
                            "the world is going into isolation will play an important role in helping to maintain a healthy immune system.\n" +
                            "Epidemiological evidence suggests a link between the intensity of the exercise and the occurrence of infections " +
                            "and diseases. The innate immune system appears to respond to chronic stress of intensive exercise " +
                            "by increased natural killer cell activity and suppressed neutrophil function. The measured effects of" +
                            " exercise on the innate immune system are complex and depend on several factors: the type of exercise, " +
                            "intensity and duration of exercise, the timing of measurement in relation to the exercise session, " +
                            "the dose and type of immune modulator used to stimulate the cell in vitro or in vivo, " +
                            "and the site of cellular origin.\n" +
                            "There are many studies prove that the immune system affects by exercises even if the effect is not huge but exercises still have many benefits" +
                            "(also giving positive emotions).",



                "Avoid negativity,Negative emotions like anger, depression, sadness, stress, fright, frustration, worry and ...etc can weaken immune system at all which also weaken it against" +
                        " diseases.\n" +
                        "Researchers have found a wealth of evidence that positive emotions can enhance the immune system, while negative emotions can suppress it. For example, individuals can take up to a year to recover a healthy immune system following the death of their spouse, and long-term caregivers have suppressed immune systems compared with persons in the general population.\n" +
                        "\n" +
                        "\n" +
                        "Studies on survivors of sexual abuse and those with post-traumatic stress disorder suggest they have elevated levels of stress hormones, as do students at exam time. In these groups of people and others experiencing loneliness, anger, trauma and relationship problems, infections last longer and wounds take longer to heal. However, having fun with friends and family seems to have the opposite effect on our immune systems. Social contact and laughter have a measurable effect for several hours. Relaxation through massage or listening to music also reduces stress hormones.\n" +
                        "\n" +
                        "The reasons for this link remain unclear, but the brain appears to have a direct effect on stress hormones such as adrenaline and cortisol, which have wide-ranging effects on the nervous and immune systems. In the short term, they benefit us with heightened awareness and increased energy, but when prolonged, the effects are less helpful. They lead to a profound change in the immune system, making us more likely to pick up a bug.\n" +
                        "\n" +
                        "Stress also can overactivate the immune system, resulting in an increased risk of autoimmune diseases such as arthritis and multiple sclerosis. Skin conditions such as psoriasis, eczema, hives and acne also may worsen, and stress can trigger asthma attacks.\n" +
                        "So that as possible it's better to smile, being hopeful and being quiet",



                    "Sleeping,Sufficient sleeping help strengthen your immune system at all which may help to fight diseases.\n" +
                            "When it comes to your health, sleep plays an important role. While more sleep won’t necessarily " +
                            "prevent you from getting sick, skimping on it could adversely affect your immune system.\n" +
                            "Without sufficient sleep, your body makes fewer cytokines, a type of protein that targets " +
                            "infection and inflammation, effectively creating an immune response. Cytokines are both produced and " +
                            "released during sleep, causing a double whammy if you skimp on shut-eye.  Chronic sleep loss even makes " +
                            "the vaccines less effective by reducing your body’s ability to respond.\n" +
                            "To stay healthy get the recommended seven to eight hours of sleep a night. " +
                            "This will help keep your immune system in fighting shape, and also protect you from other" +
                            " health issues including heart disease, diabetes, and obesity.  If your sleep schedule is interrupted " +
                            "by a busy workweek or other factors, try to make up for the lost rest with naps. Taking two naps that " +
                            "are no longer than 30 minutes each —one in the morning and one in the afternoon—has been shown to help " +
                            "decrease stress and offset the negative effects that sleep deprivation has on the immune system.  " +
                            "If you can’t swing a half-hour nap during the workday, try grabbing a 20-minute siesta on your lunch hour, " +
                            "and another right before dinner."

        };

        return foodWords;

        }

   static  boolean willShow(){

          int will=(int)(Math.random()*10);
        return will%2==0 && will!=10 && will!= 0;
   }


    static String [] textSplitter(String text){
        return text.split(",",2);
    }


}
