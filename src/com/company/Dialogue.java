package com.company;
import java.util.Random;
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
    private String toTattoo = "\t (5) Tate the Tattooist's";
    private String toLab = "\t (6) Lab";
    private String toTeacher = "\t (7) Your chemisty teacher's";
    private String toPolice = "\t (8) Police station";
    private String toRiver = "\t (9) River";
    /////////////////////////////////// Notices / Warnings / Statements
    private String endDay = "You're tired and decide to get a rest.\n\t# Stamina reverted to 100 #\nA new day has begun";
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

    /////////////////////////////////// 9A - Infrontof Tattooist's
    private String[] frontOfTattoo = {
            "Upon arriving at Mr.Tate’s house, you are totally taken surprised by a big bad dog standing there.",
            "Last time it wasn’t even existed!",
            "Anyway, it would be impossible to take a look into his house without getting rid of the dog.",
            "You need to find a way to divert it somehow.",
    };

    /////////////////////////////////// 9B - Infrontof Tattooist's Puzzle
    private String[] frontOfTattooPuzzle = {
            "The dog is casting its nasty leer onto you.",
            "If you go in any further, it may probably rush out and bite your head off.",
            "How could it be distracted now?",
    };

    /////////////////////////////////// 10A - Inside Tattooist's
    private String[] insideTattoo = {
            "You come into the victim’s room.",
            "This is where he lied. This is where they found him.",
            "According to the folks he lost his sanity as they came in.",
            "You notice his eye-line and his hands were pointing at the shelf far away.",
            "Did he want to tell something before the death came?",
            "Check the bookshelf?\n \t(0) Yes \t (1) No"
    };

    private String[] insideTattooChoice = {
            "You come close to the shelf and notice something with strange shape there",
            "You don't want to touch strange stuff for now... May be dangerous",
    };

    /////////////////////////////////// 10B/C - Tattoo's Puzzle
    private String[] tattooPuzzle = {
            "There is a little box with a 4-digit passcode and a tiny text carved on top of it, saying 'Look behind you'.",
            "You turn around and see an exotic calendar hung on the wall",
            "You wonder what the connection is... ",
            "Insert password here : XXXX",
    };

    /////////////////////////////////// 12A - First time see the lab
    private String[] frontOfLab = {
            "Taking the small sideway from the mountain, you manage to reach a strange lab, far away from the city",
            "But the way into the lab is not easy, as there is a torrenting river stopping you cold",
            "You need something to repair the bridge, or find something to latch onto the other side...",
    };

    /////////////////////////////////// 14A - Hang out
    private String[] hangOut = {
            "It’s Sunday again, after a long week you’ve had for yourself.",
            "Rekt and you are taking a walk into the streets again.",
            "You don’t know if this is actually good or bad for you, but heck, let’s enjoy your day off.",
    };

    /////////////////////////////////// 14B - Hang out
    private String[] seeWomanNumber = {
            "After a few joyful hours with Rekt, you two slowly walk home.",
            "As you approach the first victim’s house, you suddenly feel it.",
            "The flash. It is there again.",
            "Instinctively, you turn your head around to see if there are any numbers.",
            "There is no such thing this time… Then you heard something, the ringtone from Mr.Tate’s place.",
            "The peculiar ringtone reminding you of something so sad, it’s here again.",
            "Where is it coming from...",
            "*Shrifff* A woman runs past you, almost knocking you over. That ringtone comes from the phone on her hand, you see it now",
            "But you see another thing, it is the number 1 floating and drifting right with her head.",
    };

    private String[] seeWomanLowCrg = {
            "You are a tad scared that the woman may be some kind of killer or something really dangerous.",
            "You and Rekt slowly go for her trail and finally sees her departing with a strange man.",
            "It seems that they have traded something.",
    };

    private String[] seeWomanHighCrg = {
            "You decide to...?\n \t(0) Chase after her and ask her for more information \n \t(1) Sit down and rest, the flash after effect is still on\n \t(2) Calmly follow her and not expose yourself",
    };

    private String[] seeWomanChoice = {
            "The woman is scared of your actions and carefully tread away. You cannot follow her from there on and head home with Rekt afterwards.",
            "You wait for your head to be normal again, then slowly follow her trail. It appears that you came a bit too late as she is parting with a strange man.",
            "You tell Rekt to stay back and carefully follow her movements. It appears that she’s meeting someone.",
    };

    /////////////////////////////////// 14C / D - Follow the man
    private String[] followMan = {
            "As the woman is nowhere to be found, you can only track down the man meeting with her.",
            "He’s heading towards the mountain, and actually he’s entering the lab.",
            "You decide to...\n \t(0) Go into the lab as well and investigate the man\n \t(1) Wait for him to leave the lab and you enter it",
    };

    private String[] followManChoice = {
            "You courageously enter the lab and prepare to ask the man for his identity and his involvement with the lab.\nUnfortunately, the man is so brutal and kills you immediately.",
            "As he leaves the lab, you carefully sneaks in with the Pass Card and gets the newly placed bottle he leaves behind. It can be investigated later.\n[Potion X] Obtained!",
    };

    private String[] followManNext = {
            "You see the woman is having a conversation with a man in black.",
            "She looks quite disturbed by the way she is acting now.",
            "In the end, she gives the man a small bottle and leaves very quickly.",
            "You decide to...?\n \t(0) Follow the woman\n \t(1) Follow the strange man",
    };

    private String[] followWoman = {
            "The woman walks a bit faster than before. She takes so many right and left turns, but you barely keep up with the pace",
            "Right when you reach your teacher’s place, she takes a abrupt turn and disappear into the blocks… ",
            "Where is she now?",
            "\t \t +++ NEW AREA OPENED : TEACHER'S HOUSE +++"
    };

    /////////////////////////////////// 21A - Final Event
    private String[] finalEvent = {
            "Now all you’re facing is the choice between being a hero and a zero.",
            "You have to choose between the 2 potions, one being the lifesaver, the other worsening the effect.",
            "You decide to choose…?\n \t(0) Potion 1 \n \t (1) Potion 2",
    };

    private String[] finalEventAlter = {
            "Now all you’re facing is the choice between being a hero and a zero.",
            "You have to choose between the 2 potions, one being the lifesaver, the other worsening the effect.",
            "However, with the tip from Mr.Cherr's wife, you manage to choose the right bottle and pour it into the river!",
            "You pour the supposedly antidote into the water. Now all you do is drink the water itself to check the result.",
            "...",
            "And you didn’t die! You just saved the whole town! Good job!\n",
    };

    private String[] finalEventChoiceCorrect = {
            "You pour the supposedly antidote into the water. Now all you do is drink the water itself to check the result.",
            "...",
            "And you didn’t die! You just saved the whole town! Good job!\n",
    };

    private String[] finalEventChoiceWrong = {
            "You pour the supposedly antidote into the water. Now all you do is drink the water itself to check the result.",
            "...",
            "You feel the burn deep down from the belly.",
            "You feel your sanity losing itself. You just die...",
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
                if (events.isTriggered("LB")) {
                    fromPlace += toLab;
                }
                if (events.isTriggered("RV")) {
                    fromPlace += toRiver;
                }
                break;
            case 4:
                fromPlace += toHome + toJanitor;
                break;
            case 5:
                fromPlace += toHome + toTattoo;
                break;
            case 6:
                fromPlace += toMountain + toLab;
                break;
            case 7:
                fromPlace += toHome + toTeacher;
                break;
            case 8:
                fromPlace += toHome + toPolice;
                break;
            case 9:
                fromPlace += toMountain + toRiver;
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

    public String[] getInsideTattoo() {
        return this.insideTattoo;
    }

    public String[] getTattooPuzzle() {
        return this.tattooPuzzle;
    }

    public String[] getFrontOfTattoo() {
        return this.frontOfTattoo;
    }

    public String[] getFrontOfTattooPuzzle() {
        return this.frontOfTattooPuzzle;
    }

    public String[] getFrontOfLab() {
        return this.frontOfLab;
    }

    public String[] getHangOut() {
        return this.hangOut;
    }

    public String[] getSeeWomanNumber() {
        return this.seeWomanNumber;
    }

    public String[] getSeeWomanNumberLowCrg() {
        return this.seeWomanLowCrg;
    }

    public String[] getSeeWomanNumberHiCrg() {
        return this.seeWomanHighCrg;
    }

    public String[] getFollowMan() {
        return this.followMan;
    }

    public String[] getFollowManNext() {
        return this.followManNext;
    }

    public String[] getFollowWoman() {
        return this.followWoman;
    }

    public String[] getFinalEvent() {
        return this.finalEvent;
    }

    public String[] getFinalEventAlter() {
        return this.finalEventAlter;
    }

    public String[] getFinalEventChoiceCorrect() {
        return this.finalEventChoiceCorrect;
    }

    public String[] getFinalEventChoiceWrong() {
        return this.finalEventChoiceWrong;
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

    public String getInsideTattooChoice(int choice) {
        return this.insideTattooChoice[choice];
    }

    public String getFollowManChoice(int choice) {
        return this.followManChoice[choice];
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