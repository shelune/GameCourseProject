package com.company;
import java.util.*;
public class Dialogue {
    /////////////////////////////////// Option Commands + Location Commands
    private String generalOpts = "Please choose one action from below. \n \t (1). Move \n \t (2). Explore \n \t (3). Eat food \n \t (4). Study \n \t (5). Check inventory \n \t (6). Rest";
    private String exploreItems = "[If you want to take items, input a number in the brackets above. If not, just give some letters]\n\t\t\t-----\nWhich one do you want to take?";
    private String checkClue = "Do you want to check this ";
    private String toHome = "\t (0) Home";
    private String toClassA = "\t (1) Your classroom";
    private String toClassB = "\t (2) Your buddy's classroom";
    private String toMountain = "\t (3) Mountain";
    private String toJanitor = "\t (4) Jani the Janitor's";
    private String toTeacher = "\t (5) Your chemisty teacher's";
    private String toTattoo = "\t (6) Tate the Tattooist's";
    private String toPolice = "\t (7) Police station";
    private String toRiver = "\t (8) River";
    /////////////////////////////////// Notices / Warnings / Statements
    private String endDay = "You're tired and decide to get a rest.\n\t# Stamina reverted to 100 #\nA new day has begun";
    private String notAccess = "CANNOT ACCESS THIS AREA!";
    private String stillFull = "You are still full! You shouldn't eat!";
    private String janitorNote = "I enjoyed the XXXXX days when we were worXXg together in that XXX.\nIt was just a magical substance, and XXXX.\nIt tXXd the daily XXX that we cannot live without into XXXhing so XXX.\nXXX promised that XXX the fate of us but the project got XXXXX due to XXX\n\t\t\t\t\t\t\t56.82.13 | Z \n\t\t\t\t\t\t\t165.168.11 | 3";
    /////////////////////////////////// Main Event - First Night
    private String[] firstNight = {
            "...!", //0
            ".........!",
            ".............!",
            ".............. DaRkNeSs!",
            "The pure color of despair and fear...! That very darkness is crawling and crawling the way onto your body ...!",
            "Is this a dream? If it is... then why are you feeling such cold ...? And pain, in your head..?",
            "VROOM!... A figure suddenly pops up in the midst of the shade, blacker than even the night itself.",
            "\t @ You decide to...? \n\t(0) Go through it \t (1) Stand there and observe \t (2) Run away", //7
    };
    ///////////////// Choice /////////////////
    private String[] firstNightChoice = {
            "...\n\tYou slam yourself into the figure, but it just disperse ...\n\tAfter a few times, you find it nowhere to be seen ... It's gone! \n\tBut your Courage is sure to be needed in this journey!\n\t# Courage went up by 2 #", //Choice 0
            "...\n\tYou take some time standing there and look at the figure ...\n\tIt jumps and shakes around you, but no real movement at all ... It is actually wandering away...!\n\tYour Patience and Understanding of situation may be great in this journey\n\t# Understanding went up by 2 #",//Choice 1
            "...\n\tYou just run away, avoiding any further advancement of the figure...\n\tAfter all, nothing really happened...", // Choice 2
    };
    /////////////////////////////////// Main Event - First See Numbers p1
    private String[] firstSeeNumChoice_p1 =	{
            "Rekt sees you with very confusing eyes. He thinks you haven't got yourself awake yet.\nYou just prove your awkwardness within 5 seconds. Good fuqing job!\n\t# Abnormality went up by 2 #",
            "He laughs it off then proceeds to tell one of his humble dream where he slays Death himself.\nSeems like your story is not a big deal to your best dude at all, huh?",
    };
    private String[] firstSeeNumbers_p1 = {
            "You walk outside to see Rekt a.k.a your buddy standing right beside your post.", //0
            "You are just about to whine to him about your dream last night ... before you see IT!",
            "There is a NUMBER floating on his head! It is a vague and bad-drawn number that reads '21'.\nYou rub your eyes, and rub them again, but the number still persists.",
            "Then Rekt slowly turns around and wave you eagerly... Suddenly there is a FLASH...",
            "To your surprise, the floating number just disappear, into thin air, like nothing ever happened.",
            "Rekt seems to notice your weird expression. He is asking you what was wrong...",
            "\tYou decide to...? \n \t(0) Ask about the number \t (1) Tell your dream last night", //6 . OPTIONS
    };
    /////////////////////////////////// Main Event - First See Numbers p2
    private String[] firstSeeNumChoice_p2 = {
            "You take in a big breath and continue walking. But you feel like your weirdness just gets to another level...\n\t# Abnormality went up by 2 #",
            "You tell Rekt cautiously : 'It's like I'm still sleepy'. Immediately, he swings his big palm into your face.\n\tSwear to God you can even see whirling stars now, but at least you don't get suspected.\n\t# Abnormality went down by 1 #\n\t# Stamina went down by A LOT #",
    };
    private String[] firstSeeNumbers_p2 = {
            "With no further delay, you and Rekt rush to school as it is a bit late already\nBut it is like your nightmare never ends!... There are the numbers '21' floating on EVERYONE on the street!",
            "WHAT THE HECK IS GOING ON?!!",
            "You cannot do anything but gasp before this strange scene, but another flash kicks in, and those numbers just vanish again!",
            "You talk to yourself : 'Maybe I am still not that awake yet...'. So you decide to: \n \t(0) Calm yourself down and keep on \t (1) Ask Rekt to slap you hard in the face\n", //14 . OPTIONS
    };
    /////////////////////////////////// Main Event - After Class 1st day
    private String[] afterClass1st = {
            "It has been such a hard day for you. You are still messed up by the sight in the morning",
            "What was the number?!",
            "Is that a freaking days-to-live number as in novels?",
            "‘Gosh, I’m so tired. I’m coming home for a rest’, you mumble to yourself.",
            "'WAIT DUDE!! You forgot my Finnish homework!'",
            "'You promised to do that for me, remember?!', Rekt shouts so loud from behind.",
            "'When did I promise that stupid thing?!', you let out a heavy sigh.",
            "'Homework 1' Obtained!",
            "Alright now it's really time to head home!",};

    /////////////////////////////////// Main Event - Get Bullied
    private String[] getBulliedChoice = {
            "Running to the nearest public place, with 3 other guys tailing right behind! Nooo..!",
            "You throw out a punch, just to know that you are totally overwhelmed.\nThey kick at your stomach fiercely... At this rate you're gonna be like the hero saving the princess, but without the princess part!",
            "You try to talk things into them... Let's see how things go.",
    };
    private String[] getBullied = {
            "It is another long day for you. What a relief you don't get to see those numbers again.",
            "*Thump!* You smash your face into a back. When you get your head up, suddenly all your short-lived relief just vanish...",
            "It's your 10-year-bully and his pack. 'Not again...', you murmur...\nBut from the way they stretch their necks and cracks their knuckles, you can be sure the next thing coming is not a hug.",
            "What is your decision before your face may merge with the wall?",
            "\t(0) Run. Run away. It's not that protagonist is immortal.\n\t(1) Fight your ass back. You'll get beaten up anyway, so let your dignity intact!\n\t(2) Let's negotiate. Your words fight better than your flimsy fists\n\t(3) Distract them. Sneak out!",};

    /////////////////////////////////// 2B - First Met Janitor

    private String[] metJanitor = {
            "'Hey what are you doing there!?', a craggy, loud voice echoes from afar.",
            "All of your enemies just back off immediately when they see that person, then runs away quickly.",
            "*Phew* You blow a breathe of relief. 'Who can that life saver be?', you turn around.",
            "He is coming towards you, with a bucket and a broomstick on the hands, asking if you was okay.",
            "\t(0) Gosh they were almost murdering me!\n\t(1) Of course not! I was just about to teach them a lesson.\n\t(2) I'm fine but who are you by the way?",};

    private String[] metJanitorChoice = {
            "'Glad I came on time, eh?', he smiles kindly and introduces himself to be the school's janitor. He has been working here for several years.",
            "'What a bold boy!', he replies with a bit of smirking face. Still, he introduces himself to be the school's janitor. He has been working here for several years.",
            "He introduces himself to be the school's janitor. Has been working here for several years.",
    };

    /////////////////////////////////// 2C - See Janitor's number
    private String[] seeJanitorNumber = {
            "‘Shifffff’, another flash kicks in. You look around. Nothing. Against the expectations, this time, there’s no number. This is a bit weird… ",
            "Or it’s not. You see the number now, but not on everyone’s heads. ",
            "There is just that number ‘1’ on top of the person in front of you – the Janitor. ",
            "‘What is this?’, you think to yourself, ‘How come that number gets down to 1 after just 1 day?!’. ",
            "You decide to… \n\t(0) Ask the janitor about the number (not again…) \n\t(1) Keep on the conversation. \n\t(2) Say goodbye to the Janitor and come home for a rest now! ",};

    private String[] seeJanitorNumberChoice = {
            "The janitor smirks ‘Have you got punched so hard that you see numbers instead of stars now?!’… Yeah again… Why even surprised?",
            "’Are you hungry now, son?’, the janitor expresses his worry for you.\n‘Go home and take a break, I also need to see an old friend now. But before I go, have my cake, don't get yourself hungry eh!'. He even gives you a cake!",
            "’Yeah you look pale, son. Have a bite on this cake, will you? I’m coming home to see an old friend now so catch ya later!’.\nThe janitor is so nice.",
    };
    
    /////////////////////////////////// 3A - First Death Janitor
    private String[] firstDeath = {
            "\tYou walk into the class, thinking you're late but actually you're not. It seems that people are fussing over something so they ignore you.", // 0
            "...\tThe Chemistry class goes on as usual but the teacher seems a bit troubled. What happened, you wonder...",
            "...\tRekt seems to be quite worried as well. Will you ask him the happening?\n \t(0) Ask him \t (1) Just ignore it", //options . 2
    };
    private String[] firstDeath_p0 = {
            "...\tAs if he were waiting for your question! He gapses it : 'Dude you know what, our only JANITOR is DEAD!'",
            "...\tThey don't even know what the cause was! He was just, like, straight up dead like that! No injury and no blood, so people suspect it was a breakdown",
            "...\t'But the stuff in his room was a bit shuffled up, I heard so. There's no way he died from a breakdown shit, he is the most healthy person I know!', Rekt hisses.",
            "...\t'So, what do you say, are you coming to his house with me? We can, you know, get in to see the scene!",
            "...\tWhat will you do now, going with him?\n \t(0) Nod and agree \t (1) Nope, stay away from the dead", // options . 8
    };
    private String[] firstDeath_p1 = {
            "...\t'Hey dude have you heard it! Our JANITOR is DEAD!' Rekt rushes towards you without you opening your trap.",
            "...\t'So, what do you say, are you coming to his house with me? We can, you know, get in to see the scene!",
            "...\t'But the stuff in his room was a bit shuffled up, I heard so. There's no way he died from a breakdown shit, he is the most healthy person I know!', Rekt hisses.", // 5
            "...\t'So, what do you say, are you coming to his house with me? We can, you know, get in to see the scene!",
            "...\tWhat will you do now, going with him?\n \t(0) Nod and agree \t (1) Nope, stay away from the dead", // options . 8
    };

    private String[] firstDeathChoice = {
            "...\tRekt smiles eagerly, 'That's my dude! Alright this evening we will pay him a visit! Don't be late!'...\n \t# Courage went up by 2 #\t# Understanding went up by 1 #...\n \t +++ NEW AREA OPENED : JANITOR'S HOUSE +++",
            "...\tRekt knocks on your shoulder, 'What the hell dude?! He was fighting off the bullies for you, remember?! You're coming with me!'...\n \t# Courage went down by 1 #\t# Understanding went down by 1 #...\n \t +++ NEW AREA OPENED : JANITOR'S HOUSE +++",
    };

    /////////////////////////////////// 3B - First At Janitor's
    private String[] firstAtJanitors = {
            "After a while, you and Rekt eventually reach the Janitor’s house.",
            "It is situated quite far from the school, backing right at the forest.",
            "'This place is giving chill, dude!', Rekt seems not so welcomed by this place.",
            "It is quite a small house with several small strange-looking statues at front.",
            "Clearly it has been locked away after the owner’s death. You two approach the door, but seemingly there’s no way to get in.",
            "Unless you get the keys… or something else",
            "Let’s go back for now",
    };
    
    /////////////////////////////////// 5A 
    private String[] event5A = {
    		"This small statue catches your eyes. It doesn’t have that much dust covering like other statues, if at all.",
    		"Probably that means… \n\t(0) This special statue has a dust-proof layer. It must be expensive!\n\t(1) It can move itself! Let’s look for some secret passage once it’s moved!\n\t(2) It has been touched regularly. Someone probably has been doing something with it.",
    };
    
    private String[] event5AChoice	= {
    		"‘Why are you holding such a cheap stuff for so long dude?!’, Rekt doesn’t agree with you on that, then.",
    		"You spend quite a lot of time searching for hidden way into the house, but in vain. So tired already…",
    		"It seems like the statue has been meddled with recently, but for what?",
    };

    /////////////////////////////////// 5B - First time Inside Janitor's
    private String[] firstInJanitor = {
            "Finally you break into his house. It is much bigger when you look from inside. Still, the creepy feeling somewhere...",
            "In the middle of the living room is the place they found him dead. The reason is, as mentioned, unknown.",
            "However, you have something tingling that keeps telling you this is not a suicide or whatnot. Yesterday he didn't show any sign of mental instability.",
            "It really chills your spine when you think of the number 1 yesterday. Could it be...?",
            "Right when you are confused, Rekt pats your shoulder to show you a little note.",
            "'Hey dude! Look at this! It has been stumbled beneath the table right here! Maybe the police has overlooked it.', seems like Rekt really cares about this person.",
            "The note itself is old and scratchy... But you can read some most visibile lines on it.",
            "'Janitor's Note' Obtained!",
            "You carefully read the note... It is really hard to read those scratched letters, so all you can read is...",};
    
    /////////////////////////////////// 7A 
    private String[] event7A = {
    	"It’s Sunday, but you don’t really feel happy as usual.",
    	"A person was dead a few days ago, and you feel like you somehow were involved in that.",
    	"The numbers, they gotta have something to do with that!...",
    	"‘Hey dude, are you home? I got this lovely place to go!’, Rekt shouts from below.",
    	"His volume… you can never ignore his loud voice. Where does he want to go to now?",
    	"‘You know, I have always wanted to have a tattoo! Now for the thrilling events awaiting us, I wanna get it for once. Check this place out!’.",
    	"Oh, so it is for the tattoo. He seems not to have calmed down at all after that night, so you’d better accompany him for some time.",
    	"NEW AREA OPENED : TATTOOIST’s PLACE"
    };
    
    /////////////////////////////////// 7B
    private String[] event7B = {
    		"After 15 minutes of walking, you two finally reach the destination.",
    		"It is an exotic tattoo shop, at the corner of the street, quite near the janitor’s house actually.",
    		"‘Mr.Tate’, you can read it from the board in the front, seems to be the owner of this shop.",
    		"You and Rekt step in, the bell rings, but not after a while does Mr.Tate show up and greet. ‘Sorry I was having a guest! You want a tattoo?’.",
    		"While Rekt is busy describing the tattoo, you… \n\t(0) Go further inside and take a look.\n\t(1) ‘Guest? Has he left yet?’\n\t(2) Just wait outside until Rekt is done"
    };
   
    private String[] event7BChoice = {
    		"Before you make a move, Mr.Tate already gets his arm by you and forbid any further movement. ‘Why don’t you take a seat and wait for your friend, lad?’, he seemingly doesn’t want you to enter his shop. ",
    		"‘It should not be of your concern, right? Let’s make this quick and nice’, Mr.Tate doesn’t want to mention his guest.",
    		""
    };
    
    /////////////////////////////////// 7C
    private String[] event7C = {
    	"‘That ringtone is so like the one I heard a while ago. What is its name, Mr.Tate?’, you ask.",
    	"‘Oh, it’s not mine, it’s his phone, and yes, that ringtone is quite unique’.",
    	"So his guest is probably someone you know, but who…",
    	"Before you can even make the wildest guest, Mr.Tate has already finished the tattoo. ",
    	"You don’t even get what it is, but guess what, Rekt likes it!",
    	"‘Thank you so much, Mr.’, Rekt nods and nods.",
    	"Suddenly, the ringtone is on again, but this time you don’t even bother to ask more about it… The flash has kicked in.",
    	"Rekt has nothing. Pedestrians have nothing. But the person standing right in front of you does.",
    	"There’s a vague, wavy number ‘1’ floating right on top of Mr.Tate’s head. And the phone keeps ringing. Ugh, your head hurts so much.",
    	"‘We’re going home now. My friend here seems to have waited for too long’, Rekt leads the way.",
    	"No! ‘I can’t leave now. I need to ask him…’ then everything goes black for you.",
    	"Wake up at home and rest.",
    };
    
    /////////////////////////////////// 8A
    private String[] event8A = {
    	"Afterall, the class is over. Actually today, it never bothered you.",
    	"What did was the number on the head of that tattooist. Why him? And what does it mean…?",
    	"You really want to come over his place to check out.",
    	"‘Shall I ask Rekt to come with me, I wonder?’, you think to yourself.\n\t(0) Why not? He has been a great asset.\n\t(1) Nah. This is just your stuff so better go by yourself.",
    };
    
    /////////////////////////////////// 8B
    private String[] event8B = {
    		"You have the feeling that something bad actually happened… ",
    		"To your fear, a bunch of people are gathering in front of Mr.Tate’s shop.",
    		"They seem pretty unsettled and scared.",
    		"‘Oh god I can’t believe he just died like that!’",
    		"‘What was the cause? Did he just go crazy and smash his head onto the shelf?’",
    		"‘I don’t know, I mean, he was completely normal last evening when I saw him!’",
    		"You want to go inside to ask it out.\n\t(0) Ask the crowd, it’s enough for you.\n\t(1) Split the crowd and go straight into the house"
    };
    
    /////////////////////////////////// 15A
    private String[] event15A = {
    	"You come to class quite early today. ",
    	"To your surprise, your form teacher doesn’t show up. Everyone is confused about this, it seems. ",
    	"The man who takes charge of your class doesn’t come to school late for even once, and now he’s absent.",
    	"There must have been some serious incident.",
    	"You decide to visit his house this afternoon",
    };
    
    /////////////////////////////////// 15B
    private String[] event15B = {
    		"*Ring ding ding*. *Ring ding ding*.",
    		"You have been pressing the door bell for five minutes and no response whatsoever.",
    		"Was your teacher…?",
    		"No, the person yesterday was definitely a woman, not a firm man.",
    		"But what did she have to do at your teacher’s place…?",
    		"Suddenly the door opens, Mr.Cherr, the man of the class, shows up with an extremely desperate face.",
    		"You have never seen him like this…\n\t(0) ‘What’s wrong Mr.Cherr? We misseed you at class today…’\n\t(1) ‘Are you being assaulted or threated by someone?’\n\t(2) ‘Yo Mr.Cherr, ya’ know it’s irresponsible of you to leave us like that right?’",
    };
    
    private String[] event15BChoice = {
    		"Mr.Cherr looks away, with a cannot-be-worse face. He apologizes deeply and asks you to return. He guarantees his return tomorrow.",
    		"The miserable face of Mr.Cherr gets lifted up by a bit.\n‘How would you know that?’ He shakes your shoulder a bit hard.\n‘My wife just got kidnapped yesterday. I haven’t seen her since the afternoon. Then this morning comes with a note…’.\nHe gives you a note that has ‘Gubbidy Bubbidy To Your Wife, Your Work Has Earned Its Worth’.\nHe must have been devastated by this…",
    		"Mr.Cherr looks at you with uncannily weird eyes… He may be thinking that you’re crazy.\nAnyway, you manage to get his attention. Let’s come inside and talk about his situation\n‘Are you being assaulted or threated by someone?’\nThe miserable face of Mr.Cherr gets lifted up by a bit.\n‘How would you know that?’ He shakes your shoulder a bit hard.\n‘My wife just got kidnapped yesterday. I haven’t seen her since the afternoon. Then this morning comes with a note…’.\nHe gives you a note that has ‘Gubbidy Bubbidy To Your Wife, Your Work Has Earned Its Worth’.\nHe must have been devastated by this…",
    };
    
    /////////////////////////////////// R1 - R.event1
    private String[] rEvent1 = {
            "Your class is going on as usual. But not anymore when you notice that...",
            "THAT, I say, is the girl... She's making your world a dream with her straight black hair, beautiful blue eyes, pretty bunny nose and angelic smile.", //0
            "Jenny, student of Faculty of Literature and your 3 years of crush.\nIt is yet another day that you are looking at her and thinking 'Will I be able to be the one that smile is directed at?'",
            "Apparently, while you are lost deep in your dream world she has turned towards you and now you are looking right inti those ocean deep eyes.",
            "You're frozen, what to do?\n \t(0) Act as if you haven't been staring at her last 10 minutes. \n \t(1) Stare at her- Just keep staring... \n \t(2) Wave. \n \t(3) Run for your life. ", //options 4
    };

    private String[] rEvent1Choice = {
            "You get ultra panic and get everyone's attentions... At least you got into her eyes!",
            "She thinks you are looking at something behind her... You barely got away",
            "She is absolutely baffled by your actions. What are you doing at the middle of the class!",
            "Wait what!? where to run?!?",
    };

    /////////////////////////////////// R2 - R.event2
    private String[] rEvent2 = {
            "Ring ring! Your mom is calling.",
            "During all the chaos you have forgotten to go through your daily 'did you burn the house, yet?' check, several times.",
            "She is probably freaking out and ready to call the cops for a missing report. \n \t(0) Answer the call and hope she won't lecture you, too much. \n \t(1) Ignore it and hope she won't call the firefighters. \n \t(2) Call your sister to save you from Mom's Fury. \n \t(3) Text your mom 'I'm busy.'. Actually, never mind, don't do that. No, wait. Don't! ", //options 3
    };

    private String[] rEvent2Choice = {
        "She scolds you for your ignorance, but at least she is not coming to grab you up.",
        "Rest for the day as firefighters come (You come home to see a firetruck in front of your door... Oh gosh noooo!)",
        "Nothing happened, you don't have sisters...",
        "Are you freaking texting your mom that you're busy after she calls you 56768 times? I also like to live dangerously.",
    };

    /////////////////////////////////// R3 - R.event3
    private String[] rEvent3 = {
            "There goes your bus to school. ",
            "This is your 5th time this month.\nThere should be a quiz in the first lecture today.",
            "You simply don't want to be late, but getting a cab is just too out of your league.",
            "What should you do now?! \n \t(0) What's done is done. Wait for the next bus. \n \t(1) â€œBorrowâ€� one of the bicycles and cycle to school. \n \t(2) Give up, go back home and sleep your frustration off. ",};

    private String[] rEvent3Choice = {
            "You come for the school quite late and miss the class. \n\t# UND went down by 2 #",
            "You barely make it to the class and take the quiz.\nAlso you don't really remember whose the bike was... So better just keep it for now eh?\n\t# COU went up by 2 #\n\t# 'Bicycle' Obtained #",
            "Not a single f*** was given that day, so you enjoy staying home reading some books.\n\t# UND went down by 4 #",
    };

    /////////////////////////////////// Constructor
    public Dialogue() {
    }

    /////////////////////////////////// Methods
    public String goSomewhere(int position, Events events) {
        String fromPlace = "Where do you want to head to?\n";
        switch (position) {
            case 0:
                fromPlace += toHome + toClassA;
                if (events.isTriggered("MT")) {
                    fromPlace += toMountain;
                }
                if (events.isTriggered("JN")) {
                    fromPlace += toJanitor;
                }
                if (events.isTriggered("VL")) {
                    fromPlace += toTeacher;
                }
                if (events.isTriggered("TT")) {
                    fromPlace += toTattoo;
                }
                if (events.isTriggered("PL")) {
                    fromPlace += toPolice;
                }
                break;
            case 1:
                fromPlace += toHome + toClassA;
                if (events.isTriggered("CB")) {
                    fromPlace += toClassB;
                }
                break;
            case 2:
                fromPlace += toClassA + toClassB;
                if (events.isTriggered("JN")) {
                    fromPlace += toJanitor;
                }
                break;
            case 3:
                fromPlace += toHome + toMountain;
                break;
            case 4:
                fromPlace += toHome + toJanitor;
                break;
        }
        return fromPlace;
    }
    public String getGeneralOpts() {
        return this.generalOpts;
    }
    public String getExploreItems() {
        return this.exploreItems;
    }
    public String getCheckClue() {
        return this.checkClue;
    }
    public String getAtSchool() {
        String result = "";
        Random rand = new Random();
        int subject = rand.nextInt(3);
        switch (subject) {
            case 0:
                result = "Today you have Maths. Gosh this stuff blows your brain.\n\t# Understanding went up by 2 #";
                break;
            case 1:
                result = "Today you have Finnish. What the heck do they think when putting Finnish in your schedule?!\n\t# Understanding went up by 2 #";
                break;
            case 2:
                result = "Today you have Biology. So hard, but at least you are familiar with it from before.\n\t# Understanding went up by 2 #";
                break;
            case 3:
                result = "Today is for History! Gosh, they always say that you should let it past right?! Right?!\n\t# Understanding went up by 2 #";
        }
        return result;
    }
    public String getEndDay() {
        return this.endDay;
    }
    public String getStillFull() {
        return this.stillFull;
    }
    public String[] getFirstNight() {
        return this.firstNight;
    }

    public String[] getFirstSeeNumbers_p1() {
        return this.firstSeeNumbers_p1;
    }

    public String[] getFirstSeeNumbers_p2() {
        return this.firstSeeNumbers_p2;
    }
    public String[] getAfterClass1st() {
        return this.afterClass1st;
    }

    public String[] getEventGetBullied() {
        return this.getBullied;
    }
    public String[] getFirstMetJanitor() {
        return this.metJanitor;
    }

    public String[] getFirstDeath() {
        return this.firstDeath;
    }
    public String[] getFirstDeath_p0() {
        return this.firstDeath_p0;
    }
    public String[] getFirstDeath_p1() {
        return this.firstDeath_p1;
    }

    public String[] getFirstAtJanitors() {
        return this.firstAtJanitors;
    }

    public String[] getFirstInJanitor() {
        return this.firstInJanitor;
    }
    public String[] getSeeJanitorNumber() {
        return this.seeJanitorNumber;
    }
    public String[] getREvent1() {
        return this.rEvent1;
    }
    public String[] getREvent2() {
        return this.rEvent2;
    }
    public String[] getREvent3() {
        return this.rEvent3;
    }
    public String getJanitorNote() {
        return janitorNote;
    }
    
    public String[] getEvent5A()	{
    	return event5A;
    }
    
    public String[] getEvent7A()	{
    	return event7A;
    }
    
    public String[] getEvent7B()	{
    	return event7B;
    }
    
    public String[] getEvent7C()	{
    	return event7C;
    }
    
    public String[] getEvent8A()	{
    	return event8A;
    }
 
    public String[] getEvent8B()	{
    	return event8B;
    }
    
    public String[] getEvent15A()	{
    	return event15A;
    }
    
    public String[] getEvent15B()	{
    	return event15B;
    }
    
    public String getFirstNightChoice(int choice) {
        return this.firstNightChoice[choice];
    }
    public String getFirstSeeNumChoice_p1(int choice) {
        return this.firstSeeNumChoice_p1[choice];
    }
    public String getFirstSeeNumChoice_p2(int choice) {
        return this.firstSeeNumChoice_p2[choice];
    }
    public String getBulliedChoice(int choice) {
        if (choice < 3) {
            return this.getBulliedChoice[choice];
        } else {
            return "";
        }
    }

    public String getMetJanitorChoice(int choice) {
        return metJanitorChoice[choice];
    }

    public String getSeeJanitorNumChoice(int choice) {
        return seeJanitorNumberChoice[choice];
    }

    public String getFirstDeathChoice(int choice) {
        return this.firstDeathChoice[choice];
    }

    public String getEvent5AChoice(int choice)	{
    	return this.event5AChoice[choice];
    }

    public String getEvent7BChoice(int choice)	{
    	return this.event7BChoice[choice];
    }

    public String getEvent15BChoice(int choice)	{
    	return this.event15BChoice[choice];
    }
    
    public String getREvent1Choice(int choice) {
        return rEvent1Choice[choice];
    }

    public String getREvent2Choice(int choice) {
        return rEvent2Choice[choice];
    }

    public String getREvent3Choice(int choice) {
        return rEvent3Choice[choice];
    }
}
