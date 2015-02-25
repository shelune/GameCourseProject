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
    private String instruction = "You emerge as a Student in this game. You have a friend named Rekt.\nYour daily life consists of going to school, walking ";
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
            "...\n\tRekt sees you with very confusing eyes. He thinks you haven't got yourself awake yet.\n\tYou just prove your awkwardness within 5 seconds. Good fuqing job!\n\t# Abnormality went up by 2 #",
            "...\n\tHe laughs it off then proceeds to tell one of his humble dream where he slays Death himself.\nSeems like your story is not a big deal to your best dude at all, huh?",
    };
    private String[] firstSeeNumbers_p1 = {
            "...\tYou walk outside to see Rekt a.k.a your buddy standing right beside your post.", //0
            "...\tYou are just about to whine to him about your dream last night ... before you see IT!",
            "...\tThere is a NUMBER floating on his head! It is a vague and bad-drawn number that reads '21'.\n\tYou rub your eyes, and rub them again, but the number still persists.",
            "...\tThen Rekt slowly turns around and wave you eagerly... Suddenly there is a FLASH...",
            "...\tTo your surprise, the floating number just disappear, into thin air, like nothing ever happened.",
            "...\tRekt seems to notice your weird expression. He is asking you what was wrong...",
            "\tYou decide to...? \n \t(0) Ask about the number \t (1) Tell your dream last night", //6 . OPTIONS
    };
    /////////////////////////////////// Main Event - First See Numbers p2
    private String[] firstSeeNumChoice_p2 = {
            "...\tYou take in a big breath and continue walking. But you feel like your weirdness just gets to another level...\n\t# Abnormality went up by 2 #",
            "...\tYou tell Rekt cautiously : 'It's like I'm still sleepy'. Immediately, he swings his big palm into your face.\n\tSwear to God you can even see whirling stars now, but at least you don't get suspected.\n\t# Abnormality went down by 1 #\n\t# Stamina went down by A LOT #",
    };
    private String[] firstSeeNumbers_p2 = {
            "...\tWith no further delay, you and Rekt rush to school as it is a bit late already\n\tBut it is like your nightmare never ends!... There are the numbers '21' floating on EVERYONE on the street!",
            "...\tWHAT THE HECK IS GOING ON?!!",
            "...\tYou cannot do anything but gasp before this strange scene, but another flash kicks in, and those numbers just vanish again!",
            "...\tYou talk to yourself : 'Maybe I am still not that awake yet...'. So you decide to: \n \t(0) Calm yourself down and keep on \t (1) Ask Rekt to slap you hard in the face\n", //14 . OPTIONS
    };

    /////////////////////////////////// Main Event - After Class 1st day
    private String[] afterClass1st = {
            "...\tIt has been such a hard day for you. You are still messed up by the sight in the morning",
            "...\tWhat was the number?!",
            "...\tIs that a freaking days-to-live number as in novels?",
            "...\t‘Gosh, I’m so tired. I’m coming home for a rest’, you mumble to yourself.",
            "...\t'WAIT DUDE!! You forgot my Finnish homework!'",
            "...\t'You promised to do that for me, remember?!', Rekt shouts so loud from behind.",
            "...\t'When did I promise that stupid thing?!', you let out a heavy sigh.",
            "...\t[Finn Homework] Obtained!",
            "...\tAlright now it's really time to head home!",};

    /////////////////////////////////// Main Event - Get Bullied
    private String[] getBulliedChoice = {
            "...\tRunning to the nearest public place, with 3 other guys tailing right behind! Nooo..!",
            "...\tYou throw out a punch, just to know that you are totally overwhelmed.\nThey kick at your stomach fiercely... At this rate you're gonna be like the hero saving the princess, but without the princess part!",
            "...\tYou try to talk t hings into them... Let's see how things go.",
    };
    private String[] getBullied = {
            "...\tIt is another long day for you. What a relief you don't get to see those numbers again.",
            "...\t*Thump!* You smash your face into a back. When you get your head up, suddenly all your short-lived relief just vanish...",
            "...\tIt's your 10-year-bully and his pack. 'Not again...', you murmur...\nBut from the way they stretch their necks and cracks their knuckles, you can be sure the next thing coming is not a hug.",
            "...\tWhat is your decision before your face may merge with the wall?",
            "\t(0) Run. Run away. It's not that protagonist is immortal.\n\t(1) Fight your ass back. You'll get beaten up anyway, so let your dignity intact!\n\t(2) Let's negotiate. Your words fight better than your flimsy fists\n\t(3) Distract them. Sneak out!",};

    /////////////////////////////////// 2B - First Met Janitor

    private String[] metJanitor = {
            "...\t'Hey what are you doing there!?', a craggy, loud voice echoes from afar.",
            "...\tAll of your enemies just back off immediately when they see that person, then runs away quickly.",
            "...\t*Phew* You blow a breathe of relief. 'Who can that life saver be?', you turn around.",
            "...\tHe is coming towards you, with a bucket and a broomstick on the hands, asking if you was okay.",
            "\t(0) Gosh they were almost murdering me!\n\t(1) Of course not! I was just about to teach them a lesson.\n\t(2) I'm fine but who are you by the way?",};

    private String[] metJanitorChoice = {
            "...\t'Glad I came on time, eh?', he smiles kindly and introduces himself to be the school's janitor. He has been working here for several years.",
            "...\t'What a bold boy!', he replies with a bit of smirking face. Still, he introduces himself to be the school's janitor. He has been working here for several years.",
            "...\tHe introduces himself to be the school's janitor. Has been working here for several years.",
    };

    /////////////////////////////////// 2C - See Janitor's number
    private String[] seeJanitorNumber = {
            "...\t‘Shifffff’, another flash kicks in. You look around. Nothing. Against the expectations, this time, there’s no number. This is a bit weird… ",
            "...\tOr it’s not. You see the number now, but not on everyone’s heads. ",
            "...\tThere is just that number ‘1’ on top of the person in front of you – the Janitor. ",
            "...\t‘What is this?’, you think to yourself, ‘How come that number gets down to 1 after just 1 day?!’. ",
            "You decide to… \n\t(0) Ask the janitor about the number (not again…) \n\t(1) Keep on the conversation. \n\t(2) Say goodbye to the Janitor and come home for a rest now! ",};

    private String[] seeJanitorNumberChoice = {
            "...\tThe janitor smirks ‘Have you got punched so hard that you see numbers instead of stars now?!’… Yeah again… Why even surprised?",
            "...\t’Are you hungry now, son?’, the janitor expresses his worry for you.\n‘Go home and take a break, I also need to see an old friend now. But before I go, have my cake, don't get yourself hungry eh!'. He even gives you a cake!",
            "...\t’Yeah you look pale, son. Have a bite on this cake, will you? I’m coming home to see an old friend now so catch ya later!’.\nThe janitor is so nice.",
    };

    /////////////////////////////////// 3A - First Death Janitor
    private String[] firstDeath = {
            "\tYou walk into the class, thinking you're late but actually you're not. It seems that people are fussing over something so they ignore you.", // 0
            "...\tThe Chemistry class goes on as usual but the teacher seems a bit troubled. 'What has happened?', you wonder...",
            "...\tRekt seems to be quite worried as well. Will you ask him the happening?\n \t(0) Ask him \t (1) Just ignore it", //options . 2
    };
    private String[] firstDeath_p0 = {
            "...\tAs if he were waiting for your question! He gapses it : 'Dude you know what, our only JANITOR is DEAD!'",
            "...\tThey don't even know what the cause was! He was just, like, straight up dead like that! No injury and no blood, so people suspect it was a breakdown.",
            "...\t'But the stuff in his room was a bit shuffled up, I heard so. There's no way he died from a breakdown shit, he is the most healthy person I know!', Rekt hisses.",
            "...\t'So, what do you say, are you coming to his house with me? We can, you know, get in to see the scene!",
            "...\tWhat will you do now, going with him?\n \t(0) Nod and agree \t (1) Nope, stay away from the dead.", // options . 8
    };
    private String[] firstDeath_p1 = {
            "...\t'Hey dude have you heard it! Our JANITOR is DEAD!' Rekt rushes towards you without you opening your trap.",
            "...\t'So, what do you say, are you coming to his house with me? We can, you know, get in to see the scene!",
            "...\t'But the stuff in his room was a bit shuffled up, I heard so. There's no way he died from a breakdown shit, he is the most healthy person I know!', Rekt hisses.", // 5
            "...\t'So, what do you say, are you coming to his house with me? We can, you know, get in to see the scene!",
            "What will you do now, going with him?\n \t(0) Nod and agree \t (1) Nope, stay away from the dead.", // options . 8
    };

    private String[] firstDeathChoice = {
            "...\tRekt smiles eagerly, 'That's my dude! Alright this evening we will pay him a visit! Don't be late!'...\n \t# Courage went up by 2 #\t# Understanding went up by 1 #...\n \t +++ NEW AREA OPENED : JANITOR'S HOUSE +++",
            "...\tRekt knocks on your shoulder, 'What the hell dude?! He was fighting off the bullies for you, remember?! You're coming with me!'...\n \t# Courage went down by 1 #\t# Understanding went down by 1 #...\n \t +++ NEW AREA OPENED : JANITOR'S HOUSE +++",
    };

    /////////////////////////////////// 3B - First At Janitor's
    private String[] firstAtJanitors = {
            "...\tAfter a while, you and Rekt eventually reach the Janitor’s house.",
            "...\tIt is situated quite far from the school, backing right at the forest.",
            "...\t'This place is giving chill, dude!', Rekt seems not so welcomed by this place.",
            "...\tIt is quite a small house with several small strange-looking statues at front.",
            "...\tClearly it has been locked away after the owner’s death. You two approach the door, but seemingly there’s no way to get in.",
            "...\tUnless you get the keys… or something else.",
            "...\tLet’s go back for now.",
    };

    /////////////////////////////////// 5A
    private String[] event5A = {
            "...\tThis small statue catches your eyes. It doesn’t have that much dust covering like other statues, if at all.",
            "...\tProbably that means… \n\t(0) This special statue has a dust-proof layer. It must be expensive!\n\t(1) It can move itself! Let’s look for some secret passage once it’s moved!\n\t(2) It has been touched regularly. Someone probably has been doing something with it.",
    };

    private String[] event5AChoice	= {
            "...\t‘Why are you holding such a cheap stuff for so long dude?!’, Rekt doesn’t agree with you on that, then.",
            "...\tYou spend quite a lot of time searching for hidden way into the house, but in vain. So tired already...",
            "...\tIt seems like the statue has been meddled with recently, but for what?",
    };

    /////////////////////////////////// 5B - First time Inside Janitor's
    private String[] firstInJanitor = {
            "...\tFinally you break into his house. It is much bigger when you look from inside. Still, the creepy feeling somewhere...",
            "...\tIn the middle of the living room is the place they found him dead. The reason is, as mentioned, unknown.",
            "...\tHowever, you have something tingling that keeps telling you this is not a suicide or whatnot. Yesterday he didn't show any sign of mental instability.",
            "...\tIt really chills your spine when you think of the number 1 yesterday. Could it be...?",
            "...\tRight when you are confused, Rekt pats your shoulder to show you a little note.",
            "...\t'Hey dude! Look at this! It has been stumbled beneath the table right here! Maybe the police has overlooked it.', seems like Rekt really cares about this person.",
            "...\tThe note itself is old and scratchy... But you can read some most visibile lines on it.",
            "...\t'Janitor's Note' Obtained!",
            "...\tYou carefully read the note... It is really hard to read those scratched letters, so all you can read is...",};

    /////////////////////////////////// 7A
    private String[] event7A = {
            "...\tIt’s Sunday, but you don’t really feel happy as usual.",
            "...\tA person was dead a few days ago, and you feel like you somehow were involved in that.",
            "...\tThe numbers, they gotta have something to do with that!...",
            "...\t‘Hey dude, are you home? I got this lovely place to go!’, Rekt shouts from below.",
            "...\tHis volume… you can never ignore his loud voice. Where does he want to go to now?",
            "...\t‘You know, I have always wanted to have a tattoo! Now for the thrilling events awaiting us, I wanna get it for once. Check this place out!’.",
            "...\tOh, so it is for the tattoo. He seems not to have calmed down at all after that night, so you’d better accompany him for some time.",
            "\t \t+++ NEW AREA OPENED : TATTOOIST’s HOUSE +++"
    };

    /////////////////////////////////// 7B
    private String[] event7B = {
            "...\tAfter 15 minutes of walking, you two finally reach the destination.",
            "...\tIt is an exotic tattoo shop, at the corner of the street, quite near the janitor’s house actually.",
            "...\t‘Mr.Tate’, you can read it from the board in the front, seems to be the owner of this shop.",
            "...\tYou and Rekt step in, the bell rings, but not after a while does Mr.Tate show up and greet. ‘Sorry I was having a guest! You want a tattoo?’.",
            "...\tWhile Rekt is busy describing the tattoo, you… \n\t(0) Go further inside and take a look.\n\t(1) ‘Guest? Has he left yet?’\n\t(2) Just wait outside until Rekt is done"
    };

    private String[] event7BChoice = {
            "...\tBefore you make a move, Mr.Tate already gets his arm by you and forbid any further movement. \n‘Why don’t you take a seat and wait for your friend, lad?’, he seemingly doesn’t want you to enter his shop. ",
            "...\t‘It should not be of your concern, right? Let’s make this quick and nice’, Mr.Tate doesn’t want to mention his guest.",
            ""
    };

    /////////////////////////////////// 7C
    private String[] event7C = {
            "...\t‘That ringtone is so like the one I heard a while ago. What is its name, Mr.Tate?’, you ask.",
            "...\t‘Oh, it’s not mine, it’s his phone, and yes, that ringtone is quite unique’.",
            "...\tSo his guest is probably someone you know, but who…",
            "...\tWhile you are still bugging your head, Mr.Tate has already finished the tattoo. ",
            "...\tYou don’t even get what it is, but guess what, Rekt likes it!",
            "...\t‘Thank you so much, Mr.’, Rekt nods and nods.",
            "...\tSuddenly, the ringtone is on again, but this time you don’t even bother to ask more about it… The flash has kicked in.",
            "...\tRekt has nothing. Pedestrians have nothing. But the person standing right in front of you does.",
            "...\tThere’s a vague, wavy number ‘1’ floating right on top of Mr.Tate’s head. And the phone keeps ringing. Ugh, your head hurts so much.",
            "...\t‘We’re going home now. My friend here seems to have waited for too long’, Rekt leads the way.",
            "...\tNo! ‘I can’t leave now. I need to ask him…’ then everything goes black for you.",
    };

    /////////////////////////////////// 8A
    private String[] event8A = {
            "...\tAfter all, the class is over. Actually today, it never bothered you.",
            "...\tWhat did was the number on the head of that tattooist. Why him? And what does it mean…?",
            "...\tYou really want to come over his place to check out.",
            "...\t‘Shall I ask Rekt to come with me, I wonder?’, you think to yourself.\n\t(0) Why not? He has been a great asset.\n\t(1) Nah. This is just your stuff so better go by yourself.",
    };

    /////////////////////////////////// 8B
    private String[] event8B = {
            "...\tYou have the feeling that something bad actually happened… ",
            "...\tTo your fear, a bunch of people are gathering in front of Mr.Tate’s shop.",
            "...\tThey seem pretty unsettled and scared.",
            "...\t‘Oh god I can’t believe he just died like that!’",
            "...\t‘What was the cause? Did he just go crazy and smash his head onto the shelf?’",
            "...\t‘I don’t know, I mean, he was completely normal last evening when I saw him!’",
            "You want to go inside to ask it out.\n\t(0) Ask the crowd, it’s enough for you.\n\t(1) Split the crowd and go straight into the house"
    };

    private String[] event8BChoice = {
            "...\tThe people surrounding are quite clueless as you. You decide to go straight into the house.",
            "...\tYou press your body through the people and just enters the house.",
            "...\tRekt proves to be a great asset as always. He actively pushes the crowd to help you enter.",
    };

    /////////////////////////////////// 9A - Infrontof Tattooist's
    private String[] frontOfTattoo = {
            "...\tUpon entering Mr.Tate’s this time, you are totally taken surprised by a big bad dog standing there.",
            "...\tLast time it wasn’t even existed! It should just be a cat, cats are much cuter...",
            "...\tAnyway, it would be impossible to take a look into his house without getting rid of the dog.",
            "...\tYou need to find a way to divert it somehow.",
    };

    /////////////////////////////////// 9B - Infrontof Tattooist's Puzzle
    private String[] frontOfTattooPuzzle = {
            "...\tThe dog is casting its nasty leer onto you.",
            "...\tIf you go in any further, it may probably rush out and bite your head off.",
            "...\tHow could it be distracted now?",
    };

    /////////////////////////////////// 10A - Inside Tattooist's
    private String[] insideTattoo = {
            "...\tYou come into the victim’s room.",
            "...\tThis is where he lied. This is where they found him.",
            "...\tAccording to the folks he lost his sanity as they came in.",
            "...\tYou notice his eye-line and his hands were pointing at the shelf far away.",
            "...\tDid he want to tell something before the death came?",
            "Check the bookshelf?\n \t(0) Yes \t (1) No"
    };

    private String[] insideTattooChoice = {
            "...\tYou come close to the shelf and notice something with strange shape there",
            "...\tYou don't want to touch strange stuff for now... May be dangerous",
    };

    /////////////////////////////////// 10B/C - Tattoo's Puzzle
    private String[] tattooPuzzle = {
            "...\tThere is a little box with a 4-digit passcode and a tiny text carved on top of it, saying 'Look behind you'.",
            "...\tYou turn around and see an exotic calendar hung on the wall",
            "...\tYou wonder what the connection is... ",
            "...\tInsert password here : XXXX",
    };

    /////////////////////////////////// 12A - First time see the lab
    private String[] frontOfLab = {
            "...\tTaking the small sideway from the mountain, you manage to reach a strange lab, far away from the city",
            "...\tBut the way into the lab is not easy, as there is a torrenting river stopping you cold",
            "...\tYou need something to repair the bridge, or find something to latch onto the other side...",
    };

    /////////////////////////////////// 14A - Hang out
    private String[] hangOut = {
            "...\tIt’s Sunday again, after a long week you’ve had for yourself.",
            "...\tRekt and you are taking a walk into the streets again.",
            "...\tYou don’t know if this is actually good or bad for you, but heck, let’s enjoy your day off.",
    };

    /////////////////////////////////// 14B - Hang out
    private String[] seeWomanNumber = {
            "...\tAfter a few joyful hours with Rekt, you two slowly walk home.",
            "...\tAs you approach the first victim’s house, you suddenly feel it.",
            "...\tThe flash. It is there again.",
            "...\tInstinctively, you turn your head around to see if there are any numbers.",
            "...\tThere is no such thing this time… Then you heard something, the ringtone from Mr.Tate’s place.",
            "...\tThe peculiar ringtone reminding you of something so sad, it’s here again.",
            "...\tWhere is it coming from...",
            "...\t*Shrifff* A woman runs past you, almost knocking you over. That ringtone comes from the phone on her hand, you see it now",
            "...\tBut you see another thing, it is the number 1 floating and drifting right with her head.",
    };

    private String[] seeWomanLowCrg = {
            "...\tYou are a tad scared that the woman may be some kind of killer or something really dangerous.",
            "...\tYou and Rekt slowly go for her trail and finally sees her departing with a strange man.",
            "...\tIt seems that they have traded something.",
    };

    private String[] seeWomanHighCrg = {
            "You decide to...?\n \t(0) Chase after her and ask her for more information \n \t(1) Sit down and rest, the flash after effect is still on\n \t(2) Calmly follow her and not expose yourself",
    };

    private String[] seeWomanChoice = {
            "...\tThe woman is scared of your actions and carefully tread away. You cannot follow her from there on and head home with Rekt afterwards.",
            "...\tYou wait for your head to be normal again, then slowly follow her trail. It appears that you came a bit too late as she is parting with a strange man.",
            "...\tYou tell Rekt to stay back and carefully follow her movements. It appears that she’s meeting someone.",
    };

    /////////////////////////////////// 14C / D - Follow the man
    private String[] followMan = {
            "...\tAs the woman is nowhere to be found, you can only track down the man meeting with her.",
            "...\tHe’s heading towards the mountain, and actually he’s entering the lab.",
            "You decide to...\n \t(0) Go into the lab as well and investigate the man\n \t(1) Wait for him to leave the lab and you enter it",
    };

    private String[] followManChoice = {
            "...\tYou courageously enter the lab and prepare to ask the man for his identity and his involvement with the lab.\nUnfortunately, the man is so brutal and kills you immediately.",
            "...\tAs he leaves the lab, you carefully sneaks in with the Pass Card and gets the newly placed bottle he leaves behind. It can be investigated later.\n[Potion X] Obtained!",
    };

    private String[] followManNext = {
            "...\tYou see the woman is having a conversation with a man in black.",
            "...\tShe looks quite disturbed by the way she is acting now.",
            "...\tIn the end, she gives the man a small bottle and leaves very quickly.",
            "You decide to...?\n \t(0) Follow the woman\n \t(1) Follow the strange man",
    };

    private String[] followWoman = {
            "...\tThe woman walks a bit faster than before. She takes so many right and left turns, but you barely keep up with the pace",
            "...\tRight when you reach your teacher’s place, she takes a abrupt turn and disappear into the blocks… ",
            "...\tWhere is she now?",
            "\t \t +++ NEW AREA OPENED : TEACHER'S HOUSE +++"
    };

    /////////////////////////////////// 15A
    private String[] event15A = {
            "...\tYou come to class quite early today. ",
            "...\tTo your surprise, your form teacher doesn’t show up. Everyone is confused about this, it seems. ",
            "...\tThe man who takes charge of your class doesn’t come to school late for even once, and now he’s absent.",
            "...\tThere must have been some serious incident.",
            "...\tYou decide to visit his house this afternoon",
            "\t \t+++ NEW AREA OPENED : TEACHER's HOUSE +++",
    };

    /////////////////////////////////// 15B
    private String[] event15B = {
            "...\t*Ring ding ding*. *Ring ding ding*.",
            "...\tYou have been pressing the door bell for five minutes and no response whatsoever.",
            "...\tWas your teacher…?",
            "...\tNo, the person yesterday was definitely a woman, not a firm man.",
            "...\tBut what did she have to do at your teacher’s place…?",
            "...\tSuddenly the door opens, Mr.Cherr, the man of the class, shows up with an extremely desperate face.",
            "You have never seen him like this…\n\t(0) ‘What’s wrong Mr.Cherr? We misseed you at class today…’\n\t(1) ‘Are you being assaulted or threated by someone?’\n\t(2) ‘Yo Mr.Cherr, ya’ know it’s irresponsible of you to leave us like that right?’",
    };

    private String[] event15BChoice = {
            "...\tMr.Cherr looks away, with a cannot-be-worse face. He apologizes deeply and asks you to return. He guarantees his return tomorrow.",
            "...\tThe miserable face of Mr.Cherr gets lifted up by a bit.\n‘How would you know that?’ He shakes your shoulder a bit hard.\n‘My wife just got kidnapped yesterday. I haven’t seen her since the afternoon. Then this morning comes with a note…’.\nHe gives you a note that has ‘Gubbidy Bubbidy To Your Wife, Your Work Has Earned Its Worth’.\nHe must have been devastated by this…",
            "...\tMr.Cherr looks at you with uncannily weird eyes… He may be thinking that you’re crazy.\nAnyway, you manage to get his attention. Let’s come inside and talk about his situation\n‘Are you being assaulted or threated by someone?’\nThe miserable face of Mr.Cherr gets lifted up by a bit.\n‘How would you know that?’ He shakes your shoulder a bit hard.\n‘My wife just got kidnapped yesterday. I haven’t seen her since the afternoon. Then this morning comes with a note…’.\nHe gives you a note that has ‘Gubbidy Bubbidy To Your Wife, Your Work Has Earned Its Worth’.\nHe must have been devastated by this…",
    };

    /////////////////////////////////// 15C
    private String[] event15C = {
            "...\tYou spend a whole afternoon trying to calm your teacher down.",
            "...\tNow it is clear that the guest at the tattooist’s was Mr.Cherr’s wife.",
            "...\tWhat was she doing there? Why both of them had to die?",
            "...\t‘Actually the woman is kidnapped, not yet dead so there’s still chance…’, you think to yourself.",
            "...\tBut it is getting late already so you decide to say goodbye to your teacher.",
            "...\tBefore you do so, you notice the strange bottle under the guest table.",
            "...\tIt looks almost exactly the same as the ‘Potion’ you found the other day. \nWhat should you do…?\n\t(0) Sneak the bottle to yourself. It may be the clue.\n\t(1) Just leave it. It’s not your property.",
    };

    private String[] event15CChoice = {
            "...\tThe bottle reads ‘Potion O’. It looks the same as the bottle from yesterday, but from the label, you can see it something completely different.",
            "...\tMr.Cherr sees you off his house. Come home and rest.",
    };

    /////////////////////////////////// 15D
    private String[] event15D = {
            "...\tAs Mr.Cherr takes you to the door, you see his face now getting more and more miserable.",
            "...\tWas the conversation not enough to get his mood up? You have the feeling that he may commit suicide any moment now!",
            "You decide to…\n\t(0) Just say goodbye and leave him to his own appliances.\n\t(1) Stay back and spend dinner with him, it may help him somehow.",
    };

    private String[] event15DChoice = {
            "...\tHaving left the house, your attention now turns to the bottle.\nPerhaps someone with great knowledge can help you with this.\nMaybe your own teacher…? Or your friend Rekt..?",
            "...\tYou spent the whole evening at Mr.Cherr’s place as well.\nAfter all he looks quite glad to have you there.\nWhat a long day, and you decide to go home for a rest."
    };

    /////////////////////////////////// 15E - Give Potion to Rekt
    private String[] givePotion = {
            "...\tWhat a fortune, Rekt is still in class.",
            "...\tYou ask him about the bottles acquired the other day.",
            "...\tRekt’s face gets darkened once you show him the potions.",
            "...\t‘This stuff is serious, dude! This smell is so particular, I can’t even forget it. Must be some kind of extreme toxic or whatnot, but what’s the difference between them…’",
            "...\tFor that cause, Rekt drags you to his house and spends the night studying the two bottles.",
            "...\tYou just fall alseep meanwhile, too tired after a whole day.",
    };

    /////////////////////////////////// 16A - Getting Arrested
    private String[] getArrested = {
            "...\t*Thump* *Thump* *Thump*",
            "...\tSomeone is banging at the door.",
            "...\t‘Who can be here this early?!’, Rekt comes to check it out.",
            "...\tStanding there were 2 officers with a paper having your face on it ‘Where’s is he? We are here for this person",
            "...\tA person was reported to be missing this morning and he was seen at the victim’s place yesterday’.",
            "...\t‘What are you talking about? Who was kidnapped?’, cluelessly you ask.",
            "...\tOne officer flashes off a paper with a very familiar face on it, ‘Mr.Cherr’s is currently nowhere to be found, and some people report that you were visiting him yesterday afternoon.",
            "...\t'Please come with us', his face shrinks.",
            "...\tNow you are at the police station, or in some kind of jail.",
            "...\tTaken to the interrogation room, you are faced with 2 other officers asking you millions of things.",
            "...\t‘Gosh, what have I done?! Shouldn’t have visited him!’.",
            "...\t'And why has he disappeared as well?! I didn't see any number on his head!",
    };
    /////////////////////////////////// 17A - Within Jail
    private String[] inJail = {
            "...\tNow you are at the darkest place ever. You are not allowed to move anywhere...",
            "...\tThis is so terrifying.",
            "...\tYou notice a small craggy brick popping out over your head. This jail has got really old. ",
            "Do you want to poke this oldass brick out…?\n \t(0) Poke it out! Poke it out!\n \t (1) Better leave it there.",
    };

    /////////////////////////////////// 18A
    private String[] event18A = {
            "...\tIt’s kinda late in the afternoon, as you can feel it.",
            "...\t*Clang* You hear someone is coming.",
            "...\tThe dark figure… You had this dream again, oh no!",
            "...\t‘You happy to see me, dude?’. What a familiar voice this time, though.",
            "...\tRekt has come to save the day. How did he have the keys?",
            "...\t‘Save the questions. We got serious problems here.",
            "...\tThe bottles you gave me days ago, they were probably what caused the death of Mr.Tate and our janitor.",
            "The symptoms and effects all fit in’. Rekt seems a bit scared. What are you doing now…?\n\t(0) Get out of here first. You don’t want to stay in the jail any longer.\n\t(1) Ask Rekt for more information.",
    };

    private String[] event18AChoice = {
            "...\tYou managed to escape the jail, but the next day the police come again and drag you back to the station.\nYou are not allowed to get out of jail and your friend cannot bail you out a second time...",
            "...\t‘The bottle is the one responsible for their death, I think. It leaves no trace when diluting in water, while the other neutralizes it’.\nHe further explains his fear, ‘But these things are just samples… Someone must have perfected and mass-produced them, so we must find the place to check this out. By the way, in the process I removed the labels and forgot to put them back…’\nBefore that, however, you need to delete your case file at this station, otherwise the police will still find out about this and capture you again!\n>>> Obtained ‘Potion 1’ and ‘Potion 2’.",
    };

    private String[] deleteCase = {
            "...\tSpending a good few minutes, you discover the safe containing all the case files.",
            "...\tYou need to find your case in there... What was the number of it again?",
            "...\tAs far as your memory goes, your case number is something answering the question of life, the universe and everything...",
            "...\tLet's pick the case file : XX",
    };

    /////////////////////////////////// 19A - Final Lab Visit & River Discovered
    private String[] finalLab = {
            "...\tYou arrive at the Lab.",
            "...\tIt seems a bit ‘used’ today, so someone must have entered it quite frequently for the past few days.",
            "...\tThat proves to be true as at the end of the lab corridor, you see now the door used to be wide opened is locked hard now.",
            "You decide to…?\n \t (0) Try to open it. Worth a try? \n \t (1) Bypass it. You need to check the lab now.",
    };

    private String[] finalLabChoice = {
            "...\tYou hear the sound of a person inside that... That’s a woman!\n However, you need to find a way to break into that, otherwise no way you can hear what she is saying",
            "...\tYou decide not to touch the scary locked-door and proceed forward. Who knows what monster is hiding behind the door?!",
    };

    private String[] finalLabRescued = {
            "...\tThere is a woman crumbling in the corner of the room.",
            "...\tHowever, she just jumps out of the window and runs, as if she were haunted by something.",
            "...\tUnable to track down the woman, you leave the room and resume to check the lab's surrounding.",
    };

    private String[] riverDiscovered = {
            "...\tAfter a while you find out a small passage at the corner of the lab leading directly to the river.",
            "...\tHowever, it’s getting dark again so you’d better head home for now.",
            "...\tA number ‘2’ vaguely floats in front of your eyes….",
            "\t \t+++ NEW AREA OPENED : RIVER +++",
    };

    /////////////////////////////////// 20A - Final Morning
    private String[] finalMorning = {
            "...\tYou wake up in the morning with a unbearable headache.",
            "...\tThere’s no flash here though, so this may be a normal one.",
            "You decide to...?\n \t (0) Forget about it and go to school anyway \n \t (1) Take some aspirin first",
    };

    private String[] finalMorningChoice = {
            "...\tYou just keep yourself up and ignore the pain. It's just so painful...",
            "...\tYou take in some aspirin, but the headache doesn’t wane. You go to school anyway.",
    };

    /////////////////////////////////// 20B - Final To School
    private String[] finalToSchool = {
            "...\tOpening the door, you have another flash.",
            "...\t‘What’s with this morning?!’, you mutter.",
            "...\tThe headache was just the tip of the iceberg.",
            "...\tYou see the number 1. You see it.",
            "...\tEverywhere.",
            "...\tYou forget how to blink. This scene is just too terrifying.",
            "...\tSomething is happening the next day and that is definitely gonna kill everyone here.",
            "What to do now, you even have an exam today. Shall you skip it...?\n \t (0) Yeah! Skip it! Everyone is dying here, duh?! \n \t (1) It’s just 1 morning and you have the whole day to yourself anyway",
    };

    private String[] finalToSchoolChoice = {
            "...\tYou decide to leave the exam aside and focus on saving everyone!",
            "...\tEducation is more important. You can solve the problem later on with your superb mind.",
    };

    /////////////////////////////////// 20C - Final Clues
    private String[] finalClues = {
            "...\tNote the clues you have until now.",
            "\t - The note you get from the janitor.",
            "\t - The disappearing of Mr.Cherr and his wife.",
            "\t - The peculiar ringtone you heard some days ago.",
            "\t - The substances you have in your pocket.",
            "What place do you want to investigate now...?\n \t (0) Mr.Tate's \n \t (1) Mountain \n \t (2) Lab \n \t (3) Mr.Cherr's \n \t (4) Class B",
    };

    private String[] finalCluesChoice = {
            "...\tYou come to check the intended place, but nothing was found. You come back to the starting point.",
            "...\tIt should be this place. You have the feeling that Mr.Cherr's house is holding something.",
    };

    /////////////////////////////////// 20D - Final At Cherr's place
    private String[] finalAtCherr = {
            "...\tYou come into the house, a bit surprised to find out that the house was never locked.",
            "...\tWhat surprised you even more is the dead body of a woman, laid in the middle of the dining room.",
            "...\tThis woman looks like the one you saw on the other day, and if so, is Mr.Cherr’s wife.",
            "...\tYou knee down on her and see a paper crumbled into her hand...",
            "...\t‘RIVER’. It reads so. With a lot of blood splattered around it.",
    };

    private String[] finalAtCherrRescued = {
            "...\tYou come into the house, a bit surprised to find out that the house was never locked.",
            "...\tWhat surprised you even more is a woman shivering at the corner of the room, with a terrified expression and messed-up hair.",
            "...\tShe looks so empty. Do you...\n \t (0) Come to talk to her \n \t (1) Approach her carefully",
    };

    private String[] talkWoman = {
            "...\t‘My husband is totally insane…’, she still shivers",
            "...\tYou calm her down with your charisma.",
            "...\t‘He’s going to kill everyone…’.",
            "...\tYou think she’s still nervous.",
            "...\t‘You have to listen to me! If you don’t come to the river now and stop him, everyone is going to die tomorrow’.",
            "...\tThat's when you stop doubting her mentality... So it’s true that the number is telling you something, for real. ",
            "...\tYou don’t know if this woman is speaking the truth, but you need to come to the RIVER, as soon as possible.",
            "...\tAlso, you get the [Potion Note] from her. Maybe this can help you soon.",
            "[Potion Note] Obtained.",
    };

    private String[] approachWoman = {
            "...\tThe woman dare not speak a word and keep trembling like crazy.",
            "...\tYou notice a crumbled piece of paper inside her palm.",
            "...\tCarefully, you take it out. The paper reads ‘RIVER’.",
    };

    /////////////////////////////////// 20E - Final Showdown
    private String[] finalShowdown = {
            "...\tNow you see the very figure of the man standing near the source of the river flowing directly to your place.",
            "...\tIt’s no one but your very own chemistry teacher, Mr.Cherr.",
            "...\tSo it’s him who killed the Janitor and Mr.Tate",
            "...\tAnd it’s him as well planning to annihilate the whole town. ",
            "...\tYou’ve got to stop this.",
    };

    private String[] finalShowdownChoice = {
            "...\tWith all your courage, you walk up to Mr.Cherr and knock him down with ease.",
            "...\tWith all your brilliance, you walk up to Mr.Cherr and simply talk him out of poisoning the whole town.",
            "...\tWith all your SWAG, you walk up to Mr.Cherr and give him such a weird dance that he is completely confused and forgets what to do.",
    };

    /////////////////////////////////// 21A - Final Event
    private String[] finalEvent = {
            "...\tBut the poison has already been poured down into the river.",
            "...\tNow all you’re facing is the choice between being a hero and a zero.",
            "...\tYou have to choose between the 2 potions, one being the lifesaver, the other worsening the effect.",
            "...\tYou decide to choose…?\n \t(0) Potion 1 \n \t (1) Potion 2",
    };

    private String[] finalEventAlter = {
            "...\tNow all you’re facing is the choice between being a hero and a zero.",
            "...\tYou have to choose between the 2 potions, one being the lifesaver, the other worsening the effect.",
            "...\tHowever, with the tip from Mr.Cherr's wife, you manage to choose the right bottle and pour it into the river!",
            "...\tYou pour the supposedly antidote into the water. Now all you do is drink the water itself to check the result.",
            "...",
            "...\tAnd you didn’t die! You just saved the whole town! Good job!\n",
    };

    private String[] finalEventChoiceCorrect = {
            "...\tYou pour the supposedly antidote into the water. Now all you do is drink the water itself to check the result.",
            "...",
            "...\tAnd you didn’t die! You just saved the whole town! Good job!\n",
    };

    private String[] finalEventChoiceWrong = {
            "...\tYou pour the supposedly antidote into the water. Now all you do is drink the water itself to check the result.",
            "...",
            "...\tYou feel the burn deep down from the belly.",
            "...\tYou feel your sanity losing itself. You just die...",
    };

    /////////////////////////////////// R1 - R.event1
    private String[] rEvent1 = {
            "...\tYour class is going on as usual. But not anymore when you notice that...",
            "...\tTHAT, I say, is the girl... She's making your world a dream with her straight black hair, beautiful blue eyes, pretty bunny nose and angelic smile.", //0
            "...\tJenny, student of Faculty of Literature and your 3 years of crush.\nIt is yet another day that you are looking at her and thinking 'Will I be able to be the one that smile is directed at?'",
            "...\tApparently, while you are lost deep in your dream world she has turned towards you and now you are looking right inti those ocean deep eyes.",
            "...\tYou're frozen, what to do?\n \t(0) Act as if you haven't been staring at her last 10 minutes. \n \t(1) Stare at her- Just keep staring... \n \t(2) Wave. \n \t(3) Run for your life. ", //options 4
    };

    private String[] rEvent1Choice = {
            "...\tYou get ultra panic and get everyone's attentions... At least you got into her eyes!",
            "...\tShe thinks you are looking at something behind her... You barely got away",
            "...\tShe is absolutely baffled by your actions. What are you doing at the middle of the class!",
            "...\tWait what!? where to run?!?",
    };

    /////////////////////////////////// R2 - R.event2
    private String[] rEvent2 = {
            "...\tRing ring! Your mom is calling.",
            "...\tDuring all the chaos you have forgotten to go through your daily 'did you burn the house, yet?' check, several times.",
            "...\tShe is probably freaking out and ready to call the cops for a missing report. \n \t(0) Answer the call and hope she won't lecture you, too much. \n \t(1) Ignore it and hope she won't call the firefighters. \n \t(2) Call your sister to save you from Mom's Fury. \n \t(3) Text your mom 'I'm busy.'. Actually, never mind, don't do that. No, wait. Don't! ", //options 3
    };

    private String[] rEvent2Choice = {
            "...\tShe scolds you for your ignorance, but at least she is not coming to grab you up.",
            "...\tRest for the day as firefighters come (You come home to see a firetruck in front of your door... Oh gosh noooo!)",
            "...\tNothing happened, you don't have sisters...",
            "...\tAre you freaking texting your mom that you're busy after she calls you 56768 times? I also like to live dangerously.",
    };

    /////////////////////////////////// R3 - R.event3
    private String[] rEvent3 = {
            "...\tThere goes your bus to school. ",
            "...\tThis is your 5th time this month.\nThere should be a quiz in the first lecture today.",
            "...\tYou simply don't want to be late, but getting a cab is just too out of your league.",
            "...\tWhat should you do now?! \n \t(0) What's done is done. Wait for the next bus. \n \t(1) â€œBorrowâ€� one of the bicycles and cycle to school. \n \t(2) Give up, go back home and sleep your frustration off. ",};

    private String[] rEvent3Choice = {
            "...\tYou come for the school quite late and miss the class. \n\t# UND went down by 2 #",
            "...\tYou barely make it to the class and take the quiz.\nAlso you don't really remember whose the bike was... So better just keep it for now eh?\n\t# COU went up by 2 #\n\t# 'Bicycle' Obtained #",
            "...\tNot a single f*** was given that day, so you enjoy staying home reading some books.\n\t# UND went down by 4 #",
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

    public String[] getEvent15C()	{
    	return event15C;
    }

    public String[] getEvent15D()	{
    	return event15D;
    }

    public String[] getEvent18A()	{
    	return event18A;
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

    public String[] getGivePotion() {
        return this.givePotion;
    }

    public String[] getGetArrested() {
        return this.getArrested;
    }

    public String[] getInJail() {
        return this.inJail;
    }

    public String[] getFinalLab() {
        return this.finalLab;
    }

    public String[] getFinalLabRescued() {
        return this.finalLabRescued;
    }

    public String[] getRiverDiscovered() {
        return this.riverDiscovered;
    }

    public String[] getFinalMorning() {
        return this.finalMorning;
    }

    public String[] getFinalToSchool() {
        return this.finalToSchool;
    }

    public String[] getFinalClues() {
        return this.finalClues;
    }

    public String[] getFinalAtCherr() {
        return this.finalAtCherr;
    }

    public String[] getFinalAtCherrRescued() {
        return this.finalAtCherrRescued;
    }

    public String[] getTalkWoman() {
        return this.talkWoman;
    }

    public String[] getApproachWoman() {
        return this.approachWoman;
    }

    public String[] getDeleteCase() {
        return this.deleteCase;
    }

    public String[] getFinalShowdown() {
        return this.finalShowdown;
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

    public String getEvent5AChoice(int choice)	{
        return this.event5AChoice[choice];
    }

    public String getEvent7BChoice(int choice)	{
        return this.event7BChoice[choice];
    }

    public String getEvent8BChoice(int choice) {
        return this.event8BChoice[choice];
    }

    public String getEvent15BChoice(int choice)	{
        return this.event15BChoice[choice];
    }

    public String getEvent15CChoice(int choice)	{
        return this.event15CChoice[choice];
    }

    public String getEvent15DChoice(int choice)	{
        return this.event15DChoice[choice];
    }

    public String getEvent18AChoice(int choice)	{
        return this.event18AChoice[choice];
    }

    public String getInsideTattooChoice(int choice) {
        return this.insideTattooChoice[choice];
    }

    public String getFollowManChoice(int choice) {
        return this.followManChoice[choice];
    }

    public String getFinalLabChoice(int choice) {
        return this.finalLabChoice[choice];
    }

    public String getFinalMorningChoice(int choice) {
        return this.finalMorningChoice[choice];
    }

    public String getFinalToSchoolChoice(int choice) {
        return this.finalToSchoolChoice[choice];
    }

    public String getFinalCluesChoice(int choice) {
        return this.finalCluesChoice[choice];
    }

    public String getFinalShowdownChoice(int choice) {
        return this.finalShowdownChoice[choice];
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