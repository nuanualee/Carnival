package SongCollection.Song.All;


import com.example.music_carnival.R;

public class SongCollection {
//SongCollection class will call constructor, song instant will create instances.
    //Song instances will be pushed into arrays.
    //Class going to have functionaliities, e.g. searching for songs



    public Song[] songs = new Song[57];

    public SongCollection() {
        Song fineLine = new Song("btnMain",
                "Fine Line",
                "Harry Styles",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Harry%20Styles%20-%20Fine%20Line%20(Official%20Audio).mp3?alt=media&token=8443598d-8e5b-4af0-882b-a71de1d859fc",
                2.87,
                R.drawable.harrystyles);
        Song angelsLikeYou = new Song("txtAngelsLikeYou",
                "Plastic Hearts",
                "Miley Cyrus",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Miley%20Cyrus%20-%20Angels%20Like%20You%20(Audio).mp3?alt=media&token=8aa1b5c5-2845-4be6-a0ea-2c419eb26bc2",
                3.27,
                R.drawable.plastichearts);
        Song prisoner = new Song("btnMain3",
                "Relax & Chill",
                "Nissy",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Nissy%20-%20%E3%83%88%E3%83%AA%E3%82%B3%20(toriko)(Prisoner)%20(Color%20Coded%20Lyrics%20KanRomEng).mp3?alt=media&token=4e3d9df6-8b7c-4263-b6c6-8c4638ad9092",
                3.87,
                R.drawable.relaxandchill);

        Song allIKnowSoFarText = new Song("txtAllIKnowSoFar",
                "All I Know So Far",
                "P!nk",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/P!NK%20-%20All%20I%20Know%20So%20Far%20(Audio).mp3?alt=media&token=78727ba4-5eb7-4178-964a-214a1f4ae96b",
                4.62,
                R.drawable.alliknowsofar);
        Song signOfTheTimes = new Song ("txtSignOfTheTimes",
                "Sign Of The Times",
                "Harry Styles",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Harry%20Styles%20-%20Sign%20Of%20The%20Times%20(LYRICS).mp3?alt=media&token=e1cf0321-565e-4500-ae57-3701c7c09bcf",
                3.27,
                R.drawable.signofthetimes);




        //GENRES
        //hip hop
        Song superBass = new Song("txtSB",
                "Super Bass",
                "Nicki Minaj",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Nicki%20Minaj-Super%20Bass(lyrics)%202011(NEW).mp3?alt=media&token=552d2c3b-1050-4cbe-bbf5-39d9094c9f39",
                3.23,
                R.drawable.superbass);
        Song walkMeHome = new Song("txtWMH",
                "Walk Me More",
                "P!nk",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/P!nk%20-%20Walk%20Me%20Home%20(Lyrics).mp3?alt=media&token=e6cdeae7-32df-461d-a2aa-8c358ccfdc6e",
                2.57,
                R.drawable.hurt2bhuman);
        Song mothersDaughter = new Song("txtMD",
                "Mother's Daughter",
                "Miley Cyrus",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Miley%20Cyrus%20-%20Mother's%20Daughter%20(Audio).mp3?alt=media&token=83984147-728b-4643-94bf-e4e1b82cbe53",
                3.40,
                R.drawable.mothersdaughter);
        Song glassOfHeart = new Song("txtHOG",
                "Heart Of Glass",
                "Miley Cyrus",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Miley%20Cyrus%20-%20Heart%20Of%20Glass%20(Live%20from%20the%20iHeart%20Festival).mp3?alt=media&token=b9c129ff-4958-463f-8265-13478a821602",
                3.35,
                R.drawable.heartofglass);

        Song sunflower = new Song("txtSunflower",
                "Sunflower",
                "Post Malone & Swae Lee",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Sunflower%20-%20Post%20Malone%20feat%20Swae%20Lee%20(Spider-Man%20Into%20The%20Spider-Verse)%20SOUNDTRACK.mp3?alt=media&token=2d5bd6d8-9edf-40d9-9205-7b7508f80252",
                2.38,
                R.drawable.n_sunflower);

        Song seeYouAgain = new Song("txtSYA",
                "See You Again",
                "Wiz Khalifa & Charlie Puth",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/See%20You%20Again%20(feat.%20Charlie%20Puth).mp3?alt=media&token=bb314af3-c758-4a75-ba8f-4b9e74d722df",
                3.49,
                R.drawable.n_seeyouagain);

        Song circles = new Song("txtCircles",
                "Circles",
                "Post Malone",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Post%20Malone%20-%20Circles%20(Official%20Audio).mp3?alt=media&token=2ae3d648-ac4d-4880-8fec-3a45e9dfa597",
                3.35,
                R.drawable.n_hollywoodbleeding);

        Song oneDance  = new Song("txtOneDance",
                "One Dance",
                "Drake, Wizkid & Kayla",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/One%20Dance-Drake%20(feat.%20Wizkid%20%26%20Kyla).mp3?alt=media&token=6573ceb4-3ad5-4579-b3ee-bc6bfa7e3052",
                2.55,
                R.drawable.n_onedancec);

        Song roxanne = new Song("txtROXANNE",
                "ROXANNE",
                "Arizona Zervas",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/ROXANNE.mp3?alt=media&token=6f8e9411-8938-4d51-b782-fbf667a8e9ce",
                2.42,
                R.drawable.n_roxanne);

        Song peaches = new Song("txtPeaches",
                "Peaches",
                "Justine Bieber, Daniel Caesar & Giveon ",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Peaches.mp3?alt=media&token=cd1575dc-2c70-4de9-81b4-288fb2404e48",
                3.18,
                R.drawable.n_peaches);


        //dance
        Song whoDoYouLove = new Song("txtWDYL",
                "Who Do You Love",
                "The Chainsmokers",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/The%20Chainsmokers%2C5%20Seconds%20Of%20Summer%20-%20Who%20Do%20You%20Love%20(Audio).mp3?alt=media&token=925a5f5b-9b66-4906-aaad-993f68d7b34d",
                3.46,
                R.drawable.whodoyoulove);
        Song timber = new Song("txtTimber",
                "Timber",
                "Pitbull & Kesha",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Pitbull%20-%20Timber%20(Audio)%20ft.%20Ke%24ha.mp3?alt=media&token=26f57d8a-f2da-4b46-905e-8719b362ed88",
                3.25,
                R.drawable.pbmeltdown);
        Song weCantStop = new Song("txtWCS",
                "We Can't Stop",
                "Sorry",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Miley%20Cyrus%20-%20We%20Can't%20Stop%20(Audio).mp3?alt=media&token=fad70633-18e7-4dcf-8416-1ce5f923bcae",
                3.53,
                R.drawable.bangerz);
        Song sorry = new Song("txtSorry",
                "Sorry",
                "Alan Walker",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Alan%20Walker%20%26%20IS%C3%81K%20-%20Sorry%20(Audio).mp3?alt=media&token=a5991a0f-bc43-41bd-9e10-e2a95ea76143",
                2.45,
                R.drawable.sorry);


        Song allFallsDown = new Song("txtAFD",
                "All Falls Down",
                "Alan Walker, Noah Cyrus &\n" +
                        "Digital Farm Animals \n",
                "",
                3.87,
                R.drawable.n_allfallsdown);

        Song allWeKnow = new Song("txtAWK",
                "All We Know",
                "The Chainsmokers & Phoebe Ryan",
                "",
                3.87,
                R.drawable.n_allweknow);

        Song layItAllOnMe = new Song("txtLIAOM",
                "Lay It All On Me",
                "Rudimental & Ed Sheeran",
                "",
                3.87,
                R.drawable.n_layitallonme);

        Song oneKiss = new Song("txtOk",
                "One Kiss",
                "Calvin Harris & Dua Lipa",
                "",
                3.87,
                R.drawable.n_onekiss);

        Song allForLove = new Song("txtAFL",
                "All For Love",
                "Tungevaag & Raaban",
                "",
                3.87,
                R.drawable.n_allforlove);

        Song allMyLove = new Song("txtAML",
                "All My Love",
                "Cash Cash & Conor Maynard",
                "",
                3.87,
                R.drawable.n_allmylove);





        //r&b soul
        Song malibu = new Song("txtMalibu",
                "Malibu",
                "Miley Cyrus",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Miley%20Cyrus%20-%20Malibu.mp3?alt=media&token=90df0bb5-8fba-42ee-9f92-7daca0115407",
                3.48,
                R.drawable.younger_now);
        Song lightsUp = new Song("txtLU",
                "Lights Up",
                "Harry Styles",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Harry%20Styles%20-%20Lights%20Up%20(Audio).mp3?alt=media&token=623375b3-d806-47bb-ae5b-77fb7e38e936",
                2.52,
                R.drawable.harrystyles);
        Song justGiveMeAReason = new Song("txtJGMAR",
                "Just Give Me A Reason",
                "P!nk & Nate Ruess",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/P!nk%20-%20Just%20Give%20Me%20A%20Reason%20(Official%20Lyric%20Video).mp3?alt=media&token=a80ef544-0993-42e5-8c9f-60d52eaa7e8b",
                3.87,
                R.drawable.truthaboutlove);
        Song leaveTheDoorOpen = new Song("txtLTDO",
                "Leave The Door Open",
                "P!nk & Nate Ruess",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Bruno%20Mars%2C%20Anderson%20.Paak%20-%20Leave%20The%20Door%20Open%20(Lyrics).mp3?alt=media&token=30255434-245e-4d62-a93c-510578a14f5a",
                4.02,
                R.drawable.leavethedooropen);

        Song wastingTime = new Song("txtWasting",
                "Wasting Time",
                "Brent Faiyaz & Drake",
                "",
                3.87,
                R.drawable.n_wastingtime);

        Song tragic = new Song("",
                "Tragic",
                "Jazmine Sullivan",
                "",
                3.87,
                R.drawable.n_tragic);

        Song outtaTime = new Song("",
                "Outta Time",
                "Bryson Tiller & Drake",
                "",
                3.87,
                R.drawable.n_outtatime);

        Song notAnotherLoveSong = new Song("",
                "Not Another Love Song",
                "Ella Mai",
                "",
                3.87,
                R.drawable.n_notanotherlovesong);

        Song byYourself = new Song("",
                "By Yourself",
                "Ty Dolla $ign, Bryson Tiller, \n" +
                        "Jhene Aiko & Mustard\n",
                "",
                3.87,
                R.drawable.n_byyourself);

        Song myAffection = new Song("",
                "My Affection",
                "Summer Walker & \n" +
                        "PARTYNEXTDOOR",
                "",
                3.87,
                R.drawable.n_myaffection);


        //alternative
        Song shyAway = new Song("txtSA",
                "Shy Away",
                "Twenty One Pilots",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Twenty%20One%20Pilots%20-%20Shy%20Away%20(Lyric%20Video).mp3?alt=media&token=7164dd22-46f1-4376-8194-409213a57b78",
                3.87,
                R.drawable.shyaway);
        Song peopleHelpThePeople = new Song("txtPHTP",
                "People Help The People",
                "Cherry Ghost",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Cherry%20Ghost%20-%20People%20help%20the%20people%20%5BLyrics%5D.mp3?alt=media&token=99cf3a4a-922f-4d50-8920-b4231e864f64",
                3.87,
                R.drawable.peoplehelpthepeople);
        Song heartbreakAnniversary = new Song("txtHB",
                "Heartbreak Anniversary",
                "Giveon",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Giveon%20-%20Heartbreak%20Anniversary%20(Lyrics).mp3?alt=media&token=825f6502-ac5c-4acf-bb86-965847579a24",
                3.87,
                R.drawable.heartbreakann);
        Song magic24k = new Song("txtMagic",
                "24k Magic",
                "Bruno Mars",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Bruno%20Mars%20-%2024K%20Magic%20(Lyrics).mp3?alt=media&token=b9a97761-38d3-41e1-a877-53062309b972",
                3.77,
                R.drawable.magic24k);

        Song goodGrief = new Song("",
                "Good Grief",
                "Bastille",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Bastille%20-%20Good%20Grief%20(Lyrics).mp3?alt=media&token=6aaaf3ac-98f3-4a47-923e-87cd5e3b0460",
                3.30,
                R.drawable.n_goodgrief);

        Song broken = new Song("",
                "",
                " ",
                "",
                3.87,
                R.drawable.n_broken);

        Song someoneNew = new Song("",
                "",
                " ",
                "",
                3.87,
                R.drawable.n_someonenew);

        Song moralOfTheStory = new Song("",
                "",
                " ",
                "",
                3.87,
                R.drawable.n_moralofthestory);

        Song mountainSound = new Song("",
                "",
                " ",
                "",
                3.87,
                R.drawable.n_mountainsound);

        Song hoHey = new Song("",
                "",
                " ",
                "",
                3.87,
                R.drawable.n_hohey);

        //j-pop
        Song napori = new Song("txtNapori",
                "napori",
                "Vaundy",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/napori.mp3?alt=media&token=acaf899a-e20a-48de-92e4-d9ae99f1f394",
                3.40,
                R.drawable.napori);
        Song toriko = new Song("txtToriko",
                "Toriko",
                "Nissy",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Nissy%20-%20%E3%83%88%E3%83%AA%E3%82%B3%20(toriko)(Prisoner)%20(Color%20Coded%20Lyrics%20KanRomEng).mp3?alt=media&token=e8bc68bf-dd22-46f8-b065-ed46c24b3830",
                3.87,
                R.drawable.relaxandchill);
        Song standByMeYou = new Song("txtStand",
                "Stand By me, stand by you.",
                "HIRAIDAI",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/%E5%B9%B3%E4%BA%95%20%E5%A4%A7%20Stand%20by%20me%2C%20Stand%20by%20you.Lyric%20Video.mp3?alt=media&token=09517a97-d2ea-4c7d-9bb2-3d29c5924fd9",
                3.22,
                R.drawable.standbymeyou);
        Song dryFlower = new Song("txtDry",
                "Dry Flower",
                "Yuuri",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/%E5%84%AA%E9%87%8C%20%E3%83%89%E3%83%A9%E3%82%A4%E3%83%95%E3%83%A9%E3%83%AF%E3%83%BC%20Official%20Music%20Video%20-%E3%83%87%E3%82%A3%E3%83%AC%E3%82%AF%E3%82%BF%E3%83%BC%E3%82%BA%E3%82%AB%E3%83%83%E3%83%88ver.-.mp3?alt=media&token=24fa163e-3e11-42ae-a77e-f5b965646ea4",
                4.76,
                R.drawable.dryflower);

       Song viewOfLife = new Song("txtVOL",
                "View of Life",
                "Tokyo Incidents",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/View%20of%20Life.mp3?alt=media&token=c0c87ccc-c512-47a9-8f1d-59b75d178902",
                2.56,
                R.drawable.n_viewoflife);

        Song konomama = new Song("txtKono",
                "konomama",
                "DOBERMAN INFINITY",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/doberman-infinitykonomamaofficial-music-video_EQOne4fE.mp3?alt=media&token=db5745ba-0b30-403e-9471-a4ef025ecf0d",
                3.35,
                R.drawable.n_konomama);


        Song summer = new Song("txtSummer",
                "Summer Samasama",
                "7ORDER",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Summer%20Samasama.mp3?alt=media&token=387e5ff5-4377-44e2-b78c-8a762b78fd34",
                3.09,
                R.drawable.n_summersamasama);


        Song benefits= new Song("txtBenefits",
                "Benefits",
                "Vaundy",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Vaundy%20benefits%20%E5%92%8C%E8%A8%B3%E6%96%B0%E6%9B%B2.mp3?alt=media&token=210f8eab-b8b9-47c8-bcc0-8f5a4b7b2e65",
                4.10,
                R.drawable.n_benefits);


        Song taketen = new Song("txtTaketen",
                "Taketen",
                "GReeeeN",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/%5B%E0%B9%81%E0%B8%9B%E0%B8%A5%E0%B9%84%E0%B8%97%E0%B8%A2%5D%20Taketen%20-%20%E3%81%9F%E3%81%91%E3%81%A6%E3%82%93GReeeeN.mp3?alt=media&token=d56561e0-fef8-4879-83d3-9400232b0cb1",
                3.52,
                R.drawable.n_taketen);


        Song perfectWorld = new Song("txtPerfect",
                "Perfect World",
                "TWICE",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/TWICE%20Perfect%20World%20Lyrics%20(Color%20Coded%20Lyrics%20EngRomKan).mp3?alt=media&token=3225de9b-abc6-4d63-a545-dca58f52c7df",
                3.41,
                R.drawable.n_perfectworld);




        //k-pop
        Song butter = new Song("txtButter",
                "Butter",
                "BTS",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/BTS%20Butter%20Lyrics%20(Color%20Coded%20Lyrics).mp3?alt=media&token=6befa52a-b96e-4090-ae87-83e292830c89",
                2.76,
                R.drawable.butter);
        Song howYouLikeThat = new Song("txtHYLT",
                "How You Like That",
                "Blackpink",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/BLACKPINK%20-%20'How%20You%20Like%20That'%20(Official%20Audio).mp3?alt=media&token=5c14f3ed-6003-465b-8274-65be3f4c46bb",
                3.02,
                R.drawable.howyoulikethat);
        Song loveScenario = new Song("txtLS",
                "Love Scenario",
                "iKON",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/iKON%20(%EC%95%84%EC%9D%B4%EC%BD%98)%20-%20Love%20Scenario%20(%EC%82%AC%EB%9E%91%EC%9D%84%20%ED%96%88%EB%8B%A4)%20(Color%20Coded%20Lyrics%20EngRomHan).mp3?alt=media&token=f65b5047-4469-4452-b2b7-80e0d199b119",
                3.49,
                R.drawable.lovescenario);
        Song monster = new Song("txtM",
                "Monster",
                "EXO",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Monster.mp3?alt=media&token=8c709435-cea9-456b-a6c4-12aafa955cc2",
                3.69,
                R.drawable.monster);




        //contemp
        Song ifTheWorldWasEnding = new Song("txtITWWE",
                "If The World Was Ending",
                "JP Saxe & Julia Micheals",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Jp%20Saxe%20-%20If%20The%20World%20Was%20Ending%20(Lyrics)%20Ft.%20Julia%20Michaels.mp3?alt=media&token=e0c33556-1089-4ebb-81ec-913afc0e8ba9",
                3.48,
                R.drawable.iftheworldwasending);

        Song contempAngelsLikeYou = new Song("txtCTALY",
                "Plastic Hearts",
                "Miley Cyrus",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Miley%20Cyrus%20-%20Angels%20Like%20You%20(Audio).mp3?alt=media&token=8aa1b5c5-2845-4be6-a0ea-2c419eb26bc2",
                3.27,
                R.drawable.plastichearts);

        Song adoreYou = new Song("txtAdore",
                "Adore You",
                "Harry Styles",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Harry%20Styles%20-%20Adore%20You%20(Official%20Audio).mp3?alt=media&token=242502d9-e2ac-4acf-90a8-8c0898d68a7c",
                3.45,
                R.drawable.harrystyles);
        Song youSay = new Song("txtYS",
                "You Say",
                "Lauren Daigle",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Lauren%20Daigle%20-%20You%20Say%20(Lyrics).mp3?alt=media&token=9a48ed23-0eb5-4470-bb44-1ffe6860dbee",
                4.58,
                R.drawable.yousay);


        //rap
        Song sickoMode = new Song("txtSM",
                "SICKO MODE",
                "Travis Scott",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Travis%20Scott%20-%20SICKO%20MODE%20(Audio).mp3?alt=media&token=66e54f0b-1897-4250-a9d9-2086aea3ccaa",
                5.21,
                R.drawable.yousay);
        Song ourTimeTogether = new Song("txtOTT",
                "Our Time Together",
                "Ivan B & Marie Elizabeth",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Ivan%20B%20-%20Our%20Time%20Together%20(ft.%20Marie%20Elizabeth)%20(Prod.%20Kevin%20Peterson).mp3?alt=media&token=4c26ff54-50a7-40c4-9c37-3ab42305f1e3",
                4.35,
                R.drawable.ourtimetogether);
        Song seventhDay = new Song("txtSD",
                "7th Day",
                "Token",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/7th%20Day.mp3?alt=media&token=c7e2c32c-b52d-4a71-b371-7d084a0f46b2",
                4.06,
                R.drawable.seventhday);
        Song comingInHot = new Song("txtCIH",
                "Coming In Hot",
                "Andy Mineo",
                "https://firebasestorage.googleapis.com/v0/b/musiccarnival-553f3.appspot.com/o/Lecrae%20%26%20Andy%20Mineo%20-%20Coming%20In%20Hot.mp3?alt=media&token=90e06af7-ecfd-43bf-80a3-8d50da952ed0",
                3.34,
                R.drawable.cominginhot);




        songs[0] = fineLine;
        songs[1] = angelsLikeYou;
        songs[2] = prisoner; //will create 3 instances and put it into the array
        songs[3] = allIKnowSoFarText;
        songs[4] = signOfTheTimes;
        songs[5] = superBass;
        songs[6] = signOfTheTimes;
        songs[7] = walkMeHome;
        songs[8] = mothersDaughter;
        songs[9] = glassOfHeart;
        songs[10] = whoDoYouLove;
        songs[11] = timber;
        songs[12] = weCantStop;
        songs[13] = sorry;
        songs[14] = malibu;
        songs[15] = lightsUp;
        songs[16] = justGiveMeAReason;
        songs[17] = leaveTheDoorOpen;
        songs[18] = shyAway;
        songs[19] = peopleHelpThePeople;
        songs[20] = heartbreakAnniversary;
        songs[21] = magic24k;
        songs[22] = napori;
        songs[23] = toriko;
        songs[24] = standByMeYou;
        songs[25] = dryFlower;
        songs[26] = butter;
        songs[27] = howYouLikeThat;
        songs[28] = loveScenario;
        songs[29] = monster;
        songs[30] = ifTheWorldWasEnding;
        songs[31] = adoreYou;
        songs[32] = youSay;
        songs[33] = sickoMode;
        songs[34] = ourTimeTogether;
        songs[35] = seventhDay;
        songs[36] = comingInHot;
        songs[38] = peaches;
        songs[39] = sunflower;
        songs[40] = seeYouAgain;
        songs[41] = circles;
        songs[42] = oneDance;
        songs[43] = roxanne;
        songs[44] = contempAngelsLikeYou;
        songs[45] = allFallsDown;
        songs[46] = allWeKnow;
        songs[47] = layItAllOnMe;
        songs[48] = oneKiss;
        songs[49] = allForLove;
        songs[50] = allMyLove;
        songs[51] = wastingTime;
        songs[52] = tragic;
        songs[53] = outtaTime;
        songs[54] = notAnotherLoveSong;
        songs[55] = byYourself;
        songs[56] = myAffection;
    }

    public Song getCurrentSong(int currentSongID) {
        return songs[currentSongID];
    }


    //create method
    public int searchSongById(String id) { //String pass into ID.  In MA, getting String.
        for (int i = 0; i < songs.length; i++) { //song.length = 3 items
            Song tempSong = songs[i];
            if (tempSong.getId().equals(id)) { //does comparison if id is the same.
                return i; //return - method will just stop. will return the position
            }
        }
        return -1; // if no known position is found, it will give an unknown number
    }

    public Song searchById(String id){
        Song tempSong = null;
        for (int i = 0; i < songs.length; i++) {
            tempSong = songs[i];
            String tempId = tempSong.getId();
            if (tempId.equals(id)){
                return tempSong;
            }
        }
        return tempSong;
    }


    //WEEK 11: now we will create two more functions

    public int getNextSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex >= songs.length - 1) { //checking song minus one
            return currentSongIndex;
        } else {
            return currentSongIndex + 1; //returning back the number eg. 2. Which is our next song
        }
    }

    public int getPrevSong(int currentSongIndex) { //CSI is our variable. Checking array
        if (currentSongIndex <= 0) { //checking song = 0
            return currentSongIndex;
        } else {
            return currentSongIndex -1; // now 0 is passed into CSI.
        }

    }

}

