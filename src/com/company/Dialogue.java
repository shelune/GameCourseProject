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
    "Wait what are you gonna distract them with?!\nWith your brilliant mind, you take out your jacket and fling them away, then run. Magnificient!",
    };

    private String[] getBullied = {
        "It is another long day for you. What a relief you don't get to see those numbers again.",
        "*Thump!* You smash your face into a back. When you get your head up, suddenly all your short-lived relief just vanish...",
        "It's your 10-year-bully and his pack. 'Not again...', you murmur...\nBut from the way they stretch their necks and cracks their knuckles, you can be sure the next thing coming is not a hug.",
        "What is your decision before your face may merge with the wall?",
        "\t(0) Run. Run away. It's not that protagonist is immortal.\n\t(1) Fight your ass back. You'll get beaten up anyway, so let your dignity intact!\n\t(2) Let's negotiate. Your words fight better than your flimsy fists\n\t(3) Distract them. Sneak out!",};

    /////////////////////////////////// First Met Janitor
    private String metJanitorChoice0 = "'Glad I came on time, eh?', he smiles kindly and introduces himself to be the school's janitor. He has been working here for several years.";
    private String metJanitorChoice1 = "'What a bold boy!', he replies with a bit of smirking face. Still, he introduces himself to be the school's janitor. He has been working here for several years.";
    private String metJanitorChoice2 = "He introduces himself to be the school's janitor. Has been working here for several years.";

    private String[] metJanitor = {
        "'Hey what are you doing there!?', a craggy, loud voice echoes from afar.",
        "All of your enemies just back off immediately when they see that person, then runs away quickly.",
        "*Phew* You blow a breathe of relief. 'Who can that life saver be?', you turn around.",
        "He is coming towards you, with a bucket and a broomstick on the hands, asking if you was okay.",
        "\t(0) Gosh they were almost murdering me!\n\t(1) Of course not! I was just about to teach them a lesson.\n\t(2) I'm fine but who are you by the way?",};

    /////////////////////////////////// First Death Janitor
    private String firstDeathChoice0 = "...\tRekt smiles eagerly, 'That's my dude! Alright this evening we will pay him a visit! Don't be late!'...\n \t# Courage went up by 2 #\t# Understanding went up by 1 #...\n \t +++ NEW AREA OPENED : JANITOR'S HOUSE +++";
    private String firstDeathChoice1 = "...\tRekt knocks on your shoulder, 'What the hell dude?! He was fighting off the bullies for you, remember?! You're coming with me!'...\n \t# Courage went down by 1 #\t# Understanding went down by 1 #...\n \t +++ NEW AREA OPENED : JANITOR'S HOUSE +++";

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

    /////////////////////////////////// First time Inside Janitor's
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

    /////////////////////////////////// Event 2C: See Janitor's number
    private String seeJanitorNumberChoice0 = "The janitor smirks ‘Have you got punched so hard that you see numbers instead of stars now?!’… Yeah again… Why even surprised?";
    private String seeJanitorNumberChoice1 = "’Are you hungry now, son?’, the janitor expresses his worry for you.\n‘Go home and take a break, I also need to see an old friend now.\nCannot let the joy of the old pass by, but here, have my cake!”. He even gives you a cake!";
    private String seeJanitorNumberChoice2 = "’Yeah you look pale, son. Have  a bite on this cake, will you? I’m coming home to see an old friend now so catch ya later!’.\nThe janitor is so nice.";

    private String[] seeJanitorNumber = {
        "‘Shifffff’, another flash kicks in. You look around. Nothing. Against the expectations, this time, there’s no number. This is a bit weird… ",
        "Or it’s not. You see the number now, but not on everyone’s heads. ",
        "There is just that number ‘1’ on top of the person in front of you – the Janitor. ",
        "‘What is this?’, you think to yourself, ‘How come that number gets down to 1 after just 1 day?!’. ",
        "You decide to… \n\t(0) Ask the janitor about the number (not again…) \n\t(1) Keep on the conversation. \n\t(2) Say goodbye to the Janitor and come home for a rest now! ",};

    /////////////////////////////////// R.event1
    private String rEvent1Choice0 = "You get ultra panic and get everyoneâ€™s attentionsâ€¦ At least you got into her eyes!"; //5
    private String rEvent1Choice1 = "She thinks you are looking at something behind herâ€¦ You barely got away";
    private String rEvent1Choice2 = "She is absolutely baffled by your actions. What are you doing at the middle of the class!";
    private String rEvent1Choice3 = "Wait whatâ€¦ where to run?!?";

    private String[] rEvent1 = {
        "Your class is going on as usual. But not anymore when you notice that...",
        "THAT, I say, is the girl... She's making your world a dream with her straight black hair, beautiful blue eyes, pretty bunny nose and angelic smile.", //0
        "Jenny, student of Faculty of Literature and your 3 years of crush.\nIt is yet another day that you are looking at her and thinking â€œWill I be able to be the one that smile is directed at?â€�. ",
        "Apparently, while you are lost deep in your dream world she has turned towards you and now you are looking right inti those ocean deep eyes.",
        "You're frozen, what to do?\n \t(0) Act as if you havenâ€�t been staring at her last 10 minutes. \n \t(1) Stare at her- Just keep staring... \n \t(2) Wave. \n \t(3) Run for your life. ", //options 4
    };

    /////////////////////////////////// R.event2
    private String rEvent2Choice0 = "She scolds you for your ignorance, but at least she is not coming to grab you.";
    private String rEvent2Choice1 = "Rest for the day as firefighters come (You come home to see a firetruck in front of your doorâ€¦ Oh gosh noooo!)";
    private String rEvent2Choice2 = "Nothing happened, you donâ€™t have sisters (Are you forgetting about your being the only child?!";
    private String rEvent2Choice3 = "Are you freaking texting your mom youâ€™re busy after she calls you 56768 times? I also like to live dangerously.";

    private String[] rEvent2 = {
        "Ring ring! Your mom is calling.",
        "During all the chaos you have forgotten to go through your daily â€œdid you burn the house, yet?â€� check, several times.",
        "She is probably freaking out and ready to call the cops for a missing report. \n \t(0) Answer the call and hope she won't lecture you, too much. \n \t(1) Ignore it and hope she wonâ€�t call the firefighters. \n \t(2) Call your sister to save you from Mom's Fury. \n \t(3) Text your mom â€œI'm busy.â€�. Actually, never mind, don't do that. No, wait. Don't! ", //options 3
    };

    /////////////////////////////////// R.event3
    private String rEvent3Choice0 = "You come for the school quite late and miss the class. \n\t# UND went down by 4 #";
    private String rEvent3Choice1 = "You barely make it to the class and take the quiz.\nAlso you don't really remember whose the bike was... So better just keep it for now eh?\n\t# COU went up by 2 #\n\t# 'Bicycle' Obtained #";
    private String rEvent3Choice2 = "Not a single f*** was given that day, so you enjoy staying home reading some books.\n\t# UND went down by 4 #";

    private String[] rEvent3 = {
        "There goes your bus to school. ",
        "This is your 5th time this month.\nThere should be a quiz in the first lecture today.",
        "You simply don't want to be late, but getting a cab is just too out of your league.",
        "What should you do now?! \n \t(0) What's done is done. Wait for the next bus. \n \t(1) â€œBorrowâ€� one of the bicycles and cycle to school. \n \t(2) Give up, go back home and sleep your frustration off. ",};

    /////////////////////////////////// Constructor
    public Dialogue() {
    	
    }

    /////////////////////////////////// Methods
    public String goSomewhere(int position, ArrayList<String> events) {
        String fromPlace = "Where do you want to head to?\n";
        switch (position) {
            case 0:
                fromPlace += toHome + toClassA;
                if (events.contains("MT")) {
                    fromPlace += toMountain;
                }
                if (events.contains("JN")) {
                    fromPlace += toJanitor;
                }
                if (events.contains("VL")) {
                    fromPlace += toTeacher;
                }
                if (events.contains("TT")) {
                    fromPlace += toTattoo;
                }
                if (events.contains("PL")) {
                    fromPlace += toPolice;
                }
                break;
            case 1:
                fromPlace += toHome + toClassA;
                if (events.contains("CB")) {
                    fromPlace += toClassB;
                }
                break;
            case 2:
                fromPlace += toClassA + toClassB;
                if (events.contains("JN")) {
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

    public String[] getAfterClass1st() {
        return this.afterClass1st;
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

    public String[] getFirstSeeNumbers_p1() {
        return this.firstSeeNumbers_p1;
    }

    public String[] getFirstSeeNumbers_p2() {
        return this.firstSeeNumbers_p2;
    }

    public String[] getEventGetBullied() {
        return this.getBullied;
    }

    public String[] getFirstMetJanitor() {
        return this.metJanitor;
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

    public String getFirstNightChoice(int choice)	{
    	return this.firstNightChoice[choice];
    }
    
    public String getFirstSeeNumChoice_p1(int choice)	{
    	return this.firstSeeNumChoice_p1[choice];
    }
    
    public String getFirstSeeNumChoice_p2(int choice)	{
    	return this.firstSeeNumChoice_p2[choice];
    }
    
    public String getBulliedChoice(int choice)			{
    	return this.getBulliedChoice[choice];
    }
    
}
