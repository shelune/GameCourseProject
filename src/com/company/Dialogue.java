package com.company;
import java.util.Random;
public class Dialogue {
    /////////////////////////////////// Option Commands + Location Commands
    private String generalOpts = "Please choose one action from below.\n \t (0). Hints \n \t (1). Move \n \t (2). Explore \n \t (3). Eat food \n \t (4). Study \n \t (5). Check inventory \n \t (6). Rest";
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
    private String instruction = "you emerge as a Student in this game. You have a friend named Rekt.\nYour daily life consists of going to school, walking by and exploring some places, studying and sleeping, just as normal as might be.\nBut now you are having the weirdest dream of your life, and it is going change your life forever.\n\nNow please press Enter to see the general guideline";
    private String inputInstruction = "General Guidelines for Playing: \n\t_ Press ENTER after each line to proceed, until you are given choices to make. \n\t\t.There are some times you have to press ENTER more than once, please be patient.\n\t_ When given choices, you are allowed to input number in brackets (e.g (0) xxx (1) xxx, you input 0 or 1).\n\t_ On the left side, there's a board showing your current status.\n\t\t.CURRENT STAMINA is your health, which depletes for most action you take.\n\t\t.CURRENT PLACE is the place you're in, which leads to exclusive locations.\n\t\t.SCORE is the your score based on your 3 stats, Courage, Understanding and Abnormalilty, which will be affected by your actions.\n\t_ On the right side, there's indication which current day is.\n\t\t.If a specific day passes without solving a specific mystery, it's Game Over.\n\n\t||| The Game Starts Now! |||\n\n\n\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n";
    private String dailyInstruction = "\t_ Everytime you're given 6 actions to perform.\n\t_ [Move] is the most important command, as events and puzzles will happen when you move to some places.\n\t\t.At the beginning of the day (except for day 7 and day 14), you need to [Move] to [Your classroom], after that you're free to do whatever you want.\n\t_ [Explore] is to check the area's items.\n\t\t.Items are needed for specific events and puzzles. Some help you recover STAMINA.\n\t\t.You can take 6 items at max, if you have more than 6, the first item will be discarded.\n\t_ [Eat food] is to recover your STAMINA if your Inventor has food.\n\t_ [Study] is an useful command, as it increases your Understanding by 2 at the cost of half your CURRENT STAMINA.\n\t\t.You should only [Study] when there's no event, as it consumes lots of STAMINA.\n\t_ [Check Inventory] is to see into your Inventory.\n\t\t.Sometimes there's a Key Item which requires solving. Check your Inventory often as it doesn't cost STAMINA.\n\t_ [Rest] is the last command, allows you to teleport to home, restore STAMINA and go to the next day.\n\t\t.When your CURRENT STAMINA is below 25, you automatically [REST].";
    private String endDay = "... You're tired and decide to get a rest.\n\t# Stamina reverted to 100 #\n\tA new day has begun";
    private String stillFull = "You are still full! You shouldn't eat!";
    private String janitorNote = "I enjoyed the XXXXX days when we were worXXg together in that XXX.\nIt was just a magical substance, and XXXX.\nIt tXXd the daily XXX that we cannot live without into XXXhing so XXX.\nXXX promised that XXX the fate of us but the project got XXXXX due to XXX\n\t\t\t\t\t\t\t56.82.13 | Z \n\t\t\t\t\t\t\t165.168.11 | 3";
    /////////////////////////////////// Main Event - First Night
    private String[] firstNight = {
            "*Huff puff*",
            "*Huff puff*",
            "*Huff puff*",
            ".............. It's coming!",
            "The pure color of despair and fear...! That very darkness is crawling and crawling the way onto your body ...!",
            "Is this a dream? If it is... then why are you feeling such cold ...? And pain, in your head..?",
            "VROOM!... A figure suddenly pops up in the midst of the shade, blacker than even the night itself.",
            "\t @ You decide to...? \n\t(0) Go through it \t (1) Stand there and observe \t (2) Run away", //7
    };
    ///////////////// Choice /////////////////
    private String[] firstNightChoice = {
            "... You slam yourself into the figure, but it just disperse ...\n... After a few times, you find it nowhere to be seen ... It's gone! \n... But your Courage is sure to be needed in this journey!", //Choice 0
            "... You take some time standing there and look at the figure ...\n... It jumps and shakes around you, but no real movement at all ... It is actually wandering away...!\n... Your Patience and Understanding of situation may be great in this journey.",//Choice 1
            "... You just run away, avoiding any further advancement of the figure...\n... After all, nothing really happened...", // Choice 2
    };
    /////////////////////////////////// Main Event - First See Numbers p1
    private String[] firstSeeNumChoice_p1 = {
            "... Rekt sees you with very confusing eyes. He thinks you haven't got yourself awake yet.\n... You just prove your awkwardness within 5 seconds. Good fuqing job!",
            "... He laughs it off then proceeds to tell one of his humble dream where he slays Death himself.\n... Seems like your story is not a big deal to your best dude at all, huh?",
    };
    private String[] firstSeeNumbers_p1 = {
            "... You walk outside to see Rekt a.k.a your buddy standing right beside your post.", //0
            "... You are just about to whine to him about your dream last night ... before you see IT!",
            "... There is a NUMBER floating on his head! It is a vague and bad-drawn number that reads '21'.\n... You rub your eyes, and rub them again, but the number still persists.",
            "... Then Rekt slowly turns around and wave you eagerly... Suddenly there is a FLASH...",
            "... To your surprise, the floating number just disappear, into thin air, like nothing ever happened.",
            "... Rekt seems to notice your weird expression. He is asking you what was wrong...",
            "\tYou decide to...? \n \t(0) Ask about the number \t (1) Tell your dream last night", //6 . OPTIONS
    };
    /////////////////////////////////// Main Event - First See Numbers p2
    private String[] firstSeeNumChoice_p2 = {
            "... You take in a big breath and continue walking. But you feel like your weirdness just gets to another level...",
            "... You tell Rekt cautiously : 'It's like I'm still sleepy'. Immediately, he swings his big palm into your face.\n... Swear to God you can even see whirling stars now, but at least you don't get suspected.",
    };
    private String[] firstSeeNumbers_p2 = {
            "... With no further delay, you and Rekt rush to school as it is a bit late already\n... But it is like your nightmare never ends!... There are the numbers '21' floating on EVERYONE on the street!",
            "... WHAT THE HECK IS GOING ON?!!",
            "... You cannot do anything but gasp before this strange scene, but another flash kicks in, and those numbers just vanish again!",
            "... You talk to yourself : 'Maybe I am still not that awake yet...'. So you decide to: \n \t(0) Calm yourself down and keep on \t (1) Ask Rekt to slap you hard in the face\n", //14 . OPTIONS
    };

    /////////////////////////////////// Main Event - After Class 1st day
    private String[] afterClass1st = {
            "... It has been such a hard day for you. You are still messed up by the sight in the morning",
            "... What was the number?!",
            "... Is that a freaking days-to-live number as in novels?",
            "... ‘Gosh, I’m so tired. I’m coming home for a rest’, you mumble to yourself.",
            "... 'WAIT DUDE!! You forgot my Finnish homework!'",
            "... 'You promised to do that for me, remember?!', Rekt shouts so loud from behind.",
            "... 'When did I promise that stupid thing?!', you let out a heavy sigh.",
            "... [Finn Homework] Obtained!",
            "... Alright now it's really time to head home!",};

    /////////////////////////////////// Main Event - Get Bullied
    private String[] getBulliedChoice = {
            "... Running to the nearest public place, with 3 other guys tailing right behind! Nooo..!",
            "... You throw out a punch, just to know that you are totally overwhelmed.\nThey kick at your stomach fiercely... At this rate you're gonna be like the hero saving the princess, but without the princess part!",
            "... You try to talk t hings into them... Let's see how things go.",
    };
    private String[] getBullied = {
            "... It is another long day for you. What a relief you don't get to see those numbers again.",
            "... *Thump!* You smash your face into a back. When you get your head up, suddenly all your short-lived relief just vanish...",
            "... It's your 10-year-bully and his pack. 'Not again...', you murmur...\n... But from the way they stretch their necks and cracks their knuckles, you can be sure the next thing coming is not a hug.",
            "... What is your decision before your face may merge with the wall?",
            "\t(0) Run. Run away. It's not that protagonist is immortal.\n\t(1) Fight your ass back. You'll get beaten up anyway, so let your dignity intact!\n\t(2) Let's negotiate. Your words fight better than your flimsy fists\n\t(3) Distract them. Sneak out!",};

    /////////////////////////////////// 2B - First Met Janitor

    private String[] metJanitor = {
            "... 'Hey what are you doing there!?', a craggy, loud voice echoes from afar.",
            "... All of your enemies just back off immediately when they see that person, then runs away quickly.",
            "... *Phew* You blow a breathe of relief. 'Who can that life saver be?', you turn around.",
            "... He is coming towards you, with a bucket and a broomstick on the hands, asking if you was okay.",
            "\t(0) Gosh they were almost murdering me!\n\t(1) Of course not! I was just about to teach them a lesson.\n\t(2) I'm fine but who are you by the way?",};

    private String[] metJanitorChoice = {
            "... 'Glad I came on time, eh?', he smiles kindly and introduces himself to be the school's janitor. He has been working here for several years.",
            "... 'What a bold boy!', he replies with a bit of smirking face. Still, he introduces himself to be the school's janitor. He has been working here for several years.",
            "... He introduces himself to be the school's janitor. Has been working here for several years.",
    };

    /////////////////////////////////// 2C - See Janitor's number
    private String[] seeJanitorNumber = {
            "... ‘Shifffff’, another flash kicks in. You look around. Nothing. Against the expectations, this time, there’s no number. This is a bit weird… ",
            "... Or it’s not. You see the number now, but not on everyone’s heads. ",
            "... There is just that number ‘1’ on top of the person in front of you – the Janitor. ",
            "... ‘What is this?’, you think to yourself, ‘How come that number gets down to 1 after just 1 day?!’. ",
            "You decide to… \n\t(0) Ask the janitor about the number (not again…) \n\t(1) Keep on the conversation. \n\t(2) Say goodbye to the Janitor and come home for a rest now! ",};

    private String[] seeJanitorNumberChoice = {
            "... The janitor smirks ‘Have you got punched so hard that you see numbers instead of stars now?!’… Yeah again… Why even surprised?",
            "... ’Are you hungry now, son?’, the janitor expresses his worry for you.\n... ‘Go home and take a break, I also need to see an old friend now. But before I go, have my cake, don't get yourself hungry eh!'. He even gives you a cake!",
            "... ’Yeah you look pale, son. Have a bite on this cake, will you? I’m coming home to see an old friend now so catch ya later!’.\n... The janitor is so nice.",
    };

    /////////////////////////////////// 3A - First Death Janitor
    private String[] firstDeath = {
            "... You walk into the class, thinking you're late but actually you're not. It seems that people are fussing over something so they ignore you.", // 0
            "... The Chemistry class goes on as usual but the teacher seems a bit troubled. 'What has happened?', you wonder...",
            "... Rekt seems to be quite worried as well. Will you ask him the happening?\n \t(0) Ask him \t (1) Just ignore it", //options . 2
    };
    private String[] firstDeath_p0 = {
            "... As if he were waiting for your question! He gapses it : 'Dude you know what, our only JANITOR is DEAD!'",
            "... They don't even know what the cause was! He was just, like, straight up dead like that! No injury and no blood, so people suspect it was a breakdown.",
            "... 'But the stuff in his room was a bit shuffled up, I heard so. There's no way he died from a breakdown shit, he is the most healthy person I know!', Rekt hisses.",
            "... 'So, what do you say, are you coming to his house with me? We can, you know, get in to see the scene!",
            "... What will you do now, going with him?\n \t(0) Nod and agree \t (1) Nope, stay away from the dead.", // options . 8
    };
    private String[] firstDeath_p1 = {
            "... 'Hey dude have you heard it! Our JANITOR is DEAD!' Rekt rushes towards you without you opening your trap.",
            "... 'So, what do you say, are you coming to his house with me? We can, you know, get in to see the scene!",
            "... 'But the stuff in his room was a bit shuffled up, I heard so. There's no way he died from a breakdown shit, he is the most healthy person I know!', Rekt hisses.", // 5
            "... 'So, what do you say, are you coming to his house with me? We can, you know, get in to see the scene!",
            "... What will you do now, going with him?\n \t(0) Nod and agree \t (1) Nope, stay away from the dead.", // options . 8
    };

    private String[] firstDeathChoice = {
            "... Rekt smiles eagerly, 'That's my dude! Alright this evening we will pay him a visit! Don't be late!'...\n \t +++ NEW AREA OPENED : JANITOR'S HOUSE +++",
            "... Rekt knocks on your shoulder, 'What the hell dude?! He was fighting off the bullies for you, remember?! You're coming with me!'...\n \t +++ NEW AREA OPENED : JANITOR'S HOUSE +++",
    };

    /////////////////////////////////// 3B - First At Janitor's
    private String[] firstAtJanitors = {
            "... After a while, you and Rekt eventually reach the Janitor’s house.",
            "... It is situated quite far from the school, backing right at the forest.",
            "... 'This place is giving chill, dude!', Rekt seems not so welcomed by this place.",
            "... It is quite a small house with several small strange-looking statues at front.",
            "... Clearly it has been locked away after the owner’s death. You two approach the door, but seemingly there’s no way to get in.",
            "... Unless you get the keys… or something else.",
            "... Let’s go back for now.",
    };

    /////////////////////////////////// 5A
    private String[] event5A = {
            "... This small statue catches your eyes. It doesn’t have that much dust covering like other statues, if at all.",
            "... Probably that means… \n\t(0) This special statue has a dust-proof layer. It must be expensive!\n\t(1) It can move itself! Let’s look for some secret passage once it’s moved!\n\t(2) It has been touched regularly. Someone probably has been doing something with it.",
    };

    private String[] event5AChoice	= {
            "... ‘Why are you holding such a cheap stuff for so long dude?!’, Rekt doesn’t agree with you on that, then.",
            "... You spend quite a lot of time searching for hidden way into the house, but in vain. So tired already...",
            "... It seems like the statue has been meddled with recently, but for what?",
    };

    /////////////////////////////////// 5B - First time Inside Janitor's
    private String[] firstInJanitor = {
            "... Finally you break into his house. It is much bigger when you look from inside. Still, the creepy feeling somewhere...",
            "... In the middle of the living room is the place they found him dead. The reason is, as mentioned, unknown.",
            "... However, you have something tingling that keeps telling you this is not a suicide or whatnot. Yesterday he didn't show any sign of mental instability.",
            "... It really chills your spine when you think of the number 1 yesterday. Could it be...?",
            "... Right when you are confused, Rekt pats your shoulder to show you a little note.",
            "... 'Hey dude! Look at this! It has been stumbled beneath the table right here! Maybe the police has overlooked it.', seems like Rekt really cares about this person.",
            "... The note itself is old and scratchy... But you can read some most visibile lines on it.",
            "... [Small Note] Obtained!",
            "... You carefully read the note... It is really hard to read those scratched letters, so all you can read is...",};

    /////////////////////////////////// 7A
    private String[] event7A = {
            "... It’s Sunday, but you don’t really feel happy as usual.",
            "... A person was dead a few days ago, and you feel like you somehow were involved in that.",
            "... The numbers, they gotta have something to do with that!...",
            "... ‘Hey dude, are you home? I got this lovely place to go!’, Rekt shouts from below.",
            "... His volume… you can never ignore his loud voice. Where does he want to go to now?",
            "... ‘You know, I have always wanted to have a tattoo! Now for the thrilling events awaiting us, I wanna get it for once. Check this place out!’.",
            "... Oh, so it is for the tattoo. He seems not to have calmed down at all after that night, so you’d better accompany him for some time.",
            "\t \t+++ NEW AREA OPENED : TATTOOIST’s HOUSE +++"
    };

    /////////////////////////////////// 7B
    private String[] event7B = {
            "... After 15 minutes of walking, you two finally reach the destination.",
            "... It is an exotic tattoo shop, at the corner of the street, quite near the janitor’s house actually.",
            "... ‘Mr.Tate’, you can read it from the board in the front, seems to be the owner of this shop.",
            "... You and Rekt step in, the bell rings, but not after a while does Mr.Tate show up and greet. ‘Sorry I was having a guest! You want a tattoo?’.",
            "... While Rekt is busy describing the tattoo, you… \n\t(0) Go further inside and take a look.\n\t(1) ‘Guest? Has he left yet?’\n\t(2) Just wait outside until Rekt is done"
    };

    private String[] event7BChoice = {
            "... Before you make a move, Mr.Tate already gets his arm by you and forbid any further movement. \n... ‘Why don’t you take a seat and wait for your friend, lad?’, he seemingly doesn’t want you to enter his shop. ",
            "... ‘It should not be of your concern, right? Let’s make this quick and nice’, Mr.Tate doesn’t want to mention his guest.",
            ""
    };

    /////////////////////////////////// 7C
    private String[] event7C = {
            "... While you are waiting, a phone rings from inside the store. Its sound… It’s so peculiar, yet a bit similar. You have the feeling that you heard this somewhere…",
            "... ‘That ringtone is so like the one I heard a while ago. What is its name, Mr.Tate?’, you ask.",
            "... ‘Oh, it’s not mine, it’s his phone, and yes, that ringtone is quite unique’.",
            "... So his guest is probably someone you know, but who…",
            "... While you are still bugging your head, Mr.Tate has already finished the tattoo. ",
            "... You don’t even get what it is, but guess what, Rekt likes it!",
            "... ‘Thank you so much, Mr.’, Rekt nods and nods.",
            "... Suddenly, the ringtone is on again, but this time you don’t even bother to ask more about it… The flash has kicked in.",
            "... Rekt has nothing. Pedestrians have nothing. But the person standing right in front of you does.",
            "... There’s a vague, wavy number ‘1’ floating right on top of Mr.Tate’s head. And the phone keeps ringing. Ugh, your head hurts so much.",
            "... ‘We’re going home now. My friend here seems to have waited for too long’, Rekt leads the way.",
            "... No! ‘I can’t leave now. I need to ask him…’ then everything goes black for you.",
    };

    /////////////////////////////////// 8A
    private String[] event8A = {
            "... After all, the class is over. Actually today, it never bothered you.",
            "... What did was the number on the head of that tattooist. Why him? And what does it mean…?",
            "... You really want to come over his place to check out.",
            "... ‘Shall I ask Rekt to come with me, I wonder?’, you think to yourself.\n\t(0) Why not? He has been a great asset.\n\t(1) Nah. This is just your stuff so better go by yourself.",
    };

    /////////////////////////////////// 8B
    private String[] event8B = {
            "... You have the feeling that something bad actually happened… ",
            "... To your fear, a bunch of people are gathering in front of Mr.Tate’s shop.",
            "... They seem pretty unsettled and scared.",
            "... ‘Oh god I can’t believe he just died like that!’",
            "... ‘What was the cause? Did he just go crazy and smash his head onto the shelf?’",
            "... ‘I don’t know, I mean, he was completely normal last evening when I saw him!’",
            "You want to go inside to ask it out.\n\t(0) Ask the crowd, it’s enough for you.\n\t(1) Split the crowd and go straight into the house"
    };

    private String[] event8BChoice = {
            "... The people surrounding are quite clueless as you. You decide to go straight into the house.",
            "... You press your body through the people and just enters the house.",
            "... Rekt proves to be a great asset as always. He actively pushes the crowd to help you enter.",
    };

    /////////////////////////////////// 9A - Infrontof Tattooist's
    private String[] frontOfTattoo = {
            "... Upon entering Mr.Tate’s this time, you are totally taken surprised by a big bad dog standing there.",
            "... Last time it wasn’t even existed! It should just be a cat, cats are much cuter...",
            "... Anyway, it would be impossible to take a look into his house without getting rid of the dog.",
            "... You need to find a way to divert it somehow.",
    };

    /////////////////////////////////// 9B - Infrontof Tattooist's Puzzle
    private String[] frontOfTattooPuzzle = {
            "... The dog is casting its nasty leer onto you.",
            "... If you go in any further, it may probably rush out and bite your head off.",
            "... How could it be distracted now?",
    };

    /////////////////////////////////// 10A - Inside Tattooist's
    private String[] insideTattoo = {
            "... You come into the victim’s room.",
            "... This is where he lied. This is where they found him.",
            "... According to the folks he lost his sanity as they came in.",
            "... You notice his eye-line and his hands were pointing at the shelf far away.",
            "... Did he want to tell something before the death came?",
            "Check the bookshelf?\n \t(0) Yes \t (1) No"
    };

    private String[] insideTattooChoice = {
            "... You come close to the shelf and notice something with strange shape there",
            "... You don't want to touch strange stuff for now... May be dangerous",
    };

    /////////////////////////////////// 10B/C - Tattoo's Puzzle
    private String[] tattooPuzzle = {
            "... There is a little box with a 4-digit passcode and a tiny text carved on top of it, saying 'Look behind you'.",
            "... You turn around and see an exotic calendar hung on the wall",
            "... You wonder what the connection is... ",
            "... Insert password here : XXXX",
    };

    /////////////////////////////////// 12A - First time see the lab
    private String[] frontOfLab = {
            "... Taking the small sideway from the mountain, you manage to reach a strange lab, far away from the city",
            "... But the way into the lab is not easy, as there is a torrenting river stopping you cold",
            "... You need something to repair the bridge, or find something to latch onto the other side...",
    };

    /////////////////////////////////// 14A - Hang out
    private String[] hangOut = {
            "... It’s Sunday again, after a long week you’ve had for yourself.",
            "... Rekt and you are taking a walk into the streets again.",
            "... You don’t know if this is actually good or bad for you, but heck, let’s enjoy your day off.",
    };

    /////////////////////////////////// 14B - Hang out
    private String[] seeWomanNumber = {
            "... After a few joyful hours with Rekt, you two slowly walk home.",
            "... As you approach the first victim’s house, you suddenly feel it.",
            "... The flash. It is there again.",
            "... Instinctively, you turn your head around to see if there are any numbers.",
            "... There is no such thing this time… Then you heard something, the ringtone from Mr.Tate’s place.",
            "... The peculiar ringtone reminding you of something so sad, it’s here again.",
            "... Where is it coming from...",
            "... *Shrifff* A woman runs past you, almost knocking you over. That ringtone comes from the phone on her hand, you see it now",
            "... But you see another thing, it is the number 1 floating and drifting right with her head.",
    };

    private String[] seeWomanLowCrg = {
            "... You are a tad scared that the woman may be some kind of killer or something really dangerous.",
            "... You and Rekt slowly go for her trail and finally sees her departing with a strange man.",
            "... It seems that they have traded something.",
    };

    private String[] seeWomanHighCrg = {
            "You decide to...?\n \t(0) Chase after her and ask her for more information \n \t(1) Sit down and rest, the flash after effect is still on\n \t(2) Calmly follow her and not expose yourself",
    };

    private String[] seeWomanChoice = {
            "... The woman is scared of your actions and carefully tread away. You cannot follow her from there on and head home with Rekt afterwards.",
            "... You wait for your head to be normal again, then slowly follow her trail. It appears that you came a bit too late as she is parting with a strange man.",
            "... You tell Rekt to stay back and carefully follow her movements. It appears that she’s meeting someone.",
    };

    /////////////////////////////////// 14C / D - Follow the man
    private String[] followMan = {
            "... As the woman is nowhere to be found, you can only track down the man meeting with her.",
            "... He’s heading towards the mountain, and actually he’s entering the lab.",
            "You decide to...\n \t(0) Go into the lab as well and investigate the man\n \t(1) Wait for him to leave the lab and you enter it",
    };

    private String[] followManChoice = {
            "... You courageously enter the lab and prepare to ask the man for his identity and his involvement with the lab.\nUnfortunately, the man is so brutal and kills you immediately.",
            "... As he leaves the lab, you carefully sneaks in with the Pass Card and gets the newly placed bottle he leaves behind. It can be investigated later.\n[Potion X] Obtained!",
    };

    private String[] followManNext = {
            "... You see the woman is having a conversation with a man in black.",
            "... She looks quite disturbed by the way she is acting now.",
            "... In the end, she gives the man a small bottle and leaves very quickly.",
            "You decide to...?\n \t(0) Follow the woman\n \t(1) Follow the strange man",
    };

    private String[] followWoman = {
            "... The woman walks a bit faster than before. She takes so many right and left turns, but you barely keep up with the pace",
            "... Right when you reach your teacher’s place, she takes a abrupt turn and disappear into the blocks… ",
            "... Where is she now?",
            "\t \t +++ NEW AREA OPENED : TEACHER'S HOUSE +++"
    };

    /////////////////////////////////// 15A
    private String[] event15A = {
            "... You come to class quite early today. ",
            "... To your surprise, your form teacher doesn’t show up. Everyone is confused about this, it seems. ",
            "... The man who takes charge of your class doesn’t come to school late for even once, and now he’s absent.",
            "... There must have been some serious incident.",
            "... You decide to visit his house this afternoon",
            "\t \t+++ NEW AREA OPENED : TEACHER's HOUSE +++",
    };

    /////////////////////////////////// 15B
    private String[] event15B = {
            "... *Ring ding ding*. *Ring ding ding*.",
            "... You have been pressing the door bell for five minutes and no response whatsoever.",
            "... Was your teacher…?",
            "... No, the person yesterday was definitely a woman, not a firm man.",
            "... But what did she have to do at your teacher’s place…?",
            "... Suddenly the door opens, Mr.Cherr, the man of the class, shows up with an extremely desperate face.",
            "You have never seen him like this…\n\t(0) ‘What’s wrong Mr.Cherr? We misseed you at class today…’\n\t(1) ‘Are you being assaulted or threated by someone?’\n\t(2) ‘Yo Mr.Cherr, ya’ know it’s irresponsible of you to leave us like that right?’",
    };

    private String[] event15BChoice = {
            "... Mr.Cherr looks away, with a cannot-be-worse face. He apologizes deeply and asks you to return. He guarantees his return tomorrow.",
            "... The miserable face of Mr.Cherr gets lifted up by a bit.\n... ‘How would you know that?’ He shakes your shoulder a bit hard.\n... ‘My wife just got kidnapped yesterday. I haven’t seen her since the afternoon. Then this morning comes with a note…’.\n... He gives you a note that has ‘Gubbidy Bubbidy To Your Wife, Your Work Has Earned Its Worth’.\n.... He must have been devastated by this…",
            "... Mr.Cherr looks at you with uncannily weird eyes… He may be thinking that you’re crazy.\n... Anyway, you manage to get his attention. Let’s come inside and talk about his situation\n... ‘Are you being assaulted or threated by someone?’\n... The miserable face of Mr.Cherr gets lifted up by a bit.\n... ‘How would you know that?’ He shakes your shoulder a bit hard.\n... ‘My wife just got kidnapped yesterday. I haven’t seen her since the afternoon. Then this morning comes with a note…’.\nHe gives you a note that has ‘Gubbidy Bubbidy To Your Wife, Your Work Has Earned Its Worth’.\n... He must have been devastated by this…",
    };

    /////////////////////////////////// 15C
    private String[] event15C = {
            "... You spend a whole afternoon trying to calm your teacher down.",
            "... Now it is clear that the guest at the tattooist’s was Mr.Cherr’s wife.",
            "... What was she doing there? Why both of them had to die?",
            "... ‘Actually the woman is kidnapped, not yet dead so there’s still chance…’, you think to yourself.",
            "... But it is getting late already so you decide to say goodbye to your teacher.",
            "... Before you do so, you notice the strange bottle under the guest table.",
            "... It looks almost exactly the same as the ‘Potion’ you found the other day. \nWhat should you do…?\n\t(0) Sneak the bottle to yourself. It may be the clue.\n\t(1) Just leave it. It’s not your property.",
    };

    private String[] event15CChoice = {
            "... The bottle reads ‘Potion O’. It looks the same as the bottle from yesterday, but from the label, you can see it something completely different.",
            "... Mr.Cherr sees you off his house. Come home and rest.",
    };

    /////////////////////////////////// 15D
    private String[] event15D = {
            "... As Mr.Cherr takes you to the door, you see his face now getting more and more miserable.",
            "... Was the conversation not enough to get his mood up? You have the feeling that he may commit suicide any moment now!",
            "You decide to…\n\t(0) Just say goodbye and leave him to his own appliances.\n\t(1) Stay back and spend dinner with him, it may help him somehow.",
    };

    private String[] event15DChoice = {
            "... Having left the house, your attention now turns to the bottle.\n... Perhaps someone with great knowledge can help you with this.\n... Maybe your own teacher…? Or your friend Rekt..?",
            "... You spent the whole evening at Mr.Cherr’s place as well.\nAfter all he looks quite glad to have you there.\nWhat a long day, and you decide to go home for a rest."
    };

    /////////////////////////////////// 15E - Give Potion to Rekt
    private String[] givePotion = {
            "... What a fortune, Rekt is still in class.",
            "... You ask him about the bottles acquired the other day.",
            "... Rekt’s face gets darkened once you show him the potions.",
            "... ‘This stuff is serious, dude! This smell is so particular, I can’t even forget it. Must be some kind of extreme toxic or whatnot, but what’s the difference between them…’",
            "... For that cause, Rekt drags you to his house and spends the night studying the two bottles.",
            "... You just fall alseep meanwhile, too tired after a whole day.",
    };

    /////////////////////////////////// 16A - Getting Arrested
    private String[] getArrested = {
            "... *Thump* *Thump* *Thump*",
            "... Someone is banging at the door.",
            "... ‘Who can be here this early?!’, Rekt comes to check it out.",
            "... Standing there were 2 officers with a paper having your face on it ‘Where’s is he? We are here for this person",
            "... A person was reported to be missing this morning and he was seen at the victim’s place yesterday’.",
            "... ‘What are you talking about? Who was kidnapped?’, cluelessly you ask.",
            "... One officer flashes off a paper with a very familiar face on it, ‘Mr.Cherr’s is currently nowhere to be found, and some people report that you were visiting him yesterday afternoon.",
            "... 'Please come with us', his face shrinks.",
            "... Now you are at the police station, or in some kind of jail.",
            "... Taken to the interrogation room, you are faced with 2 other officers asking you millions of things.",
            "... ‘Gosh, what have I done?! Shouldn’t have visited him!’.",
            "... 'And why has he disappeared as well?! I didn't see any number on his head!",
    };
    /////////////////////////////////// 17A - Within Jail
    private String[] inJail = {
            "... Now you are at the darkest place ever. You are not allowed to move anywhere...",
            "... This is so terrifying.",
            "... You notice a small craggy brick popping out over your head. This jail has got really old. ",
            "Do you want to poke this oldass brick out…?\n \t(0) Poke it out! Poke it out!\n \t(1) Better leave it there.",
    };

    /////////////////////////////////// 18A
    private String[] event18A = {
            "... It’s kinda late in the afternoon, as you can feel it.",
            "... *Clang* You hear someone is coming.",
            "... The dark figure… You had this dream again, oh no!",
            "... ‘You happy to see me, dude?’. What a familiar voice this time, though.",
            "... Rekt has come to save the day. How did he have the keys?",
            "... ‘Save the questions. We got serious problems here.",
            "... The bottles you gave me days ago, they were probably what caused the death of Mr.Tate and our janitor.",
            "The symptoms and effects all fit in’. Rekt seems a bit scared. What are you doing now…?\n\t(0) Get out of here first. You don’t want to stay in the jail any longer.\n\t(1) Ask Rekt for more information.",
    };

    private String[] event18AChoice = {
            "... You managed to escape the jail, but the next day the police come again and drag you back to the station.\nYou are not allowed to get out of jail and your friend cannot bail you out a second time...",
            "... ‘The bottle is the one responsible for their death, I think. It leaves no trace when diluting in water, while the other neutralizes it’.\n... He further explains his fear, ‘But these things are just samples… Someone must have perfected and mass-produced them, so we must find the place to check this out. By the way, in the process I removed the labels and forgot to put them back…’\n... Before that, however, you need to delete your case file at this station, otherwise the police will still find out about this and capture you again!\n>>>\t [Potion 1] and [Potion 2] Obtained.",
    };

    private String[] deleteCase = {
            "... Spending a good few minutes, you discover the safe containing all the case files.",
            "... You need to find your case in there... What was the number of it again?",
            "... As far as your memory goes, your case number is something answering the question of life, the universe and everything...",
            "... Let's pick the case file : XX",
    };

    /////////////////////////////////// 19A - Final Lab Visit & River Discovered
    private String[] finalLab = {
            "... You arrive at the Lab.",
            "... It seems a bit ‘used’ today, so someone must have entered it quite frequently for the past few days.",
            "... That proves to be true as at the end of the lab corridor, you see now the door used to be wide opened is locked hard now.",
            "You decide to…?\n \t (0) Try to open it. Worth a try? \n \t (1) Bypass it. You need to check the lab now.",
    };

    private String[] finalLabChoice = {
            "... You hear the sound of a person inside that... That’s a woman!\n However, you need to find a way to break into that, otherwise no way you can hear what she is saying",
            "... You decide not to touch the scary locked-door and proceed forward. Who knows what monster is hiding behind the door?!",
    };

    private String[] finalLabRescued = {
            "... There is a woman crumbling in the corner of the room.",
            "... However, she just jumps out of the window and runs, as if she were haunted by something.",
            "... Unable to track down the woman, you leave the room and resume to check the lab's surrounding.",
    };

    private String[] riverDiscovered = {
            "... After a while you find out a small passage at the corner of the lab leading directly to the river.",
            "... However, it’s getting dark again so you’d better head home for now.",
            "... A number ‘2’ vaguely floats in front of your eyes….",
            "\t \t+++ NEW AREA OPENED : RIVER +++",
    };

    /////////////////////////////////// 20A - Final Morning
    private String[] finalMorning = {
            "... You wake up in the morning with a unbearable headache.",
            "... There’s no flash here though, so this may be a normal one.",
            "You decide to...?\n \t (0) Forget about it and go to school anyway \n \t (1) Take some aspirin first",
    };

    private String[] finalMorningChoice = {
            "... You just keep yourself up and ignore the pain. It's just so painful...",
            "... You take in some aspirin, but the headache doesn’t wane. You go to school anyway.",
    };

    /////////////////////////////////// 20B - Final To School
    private String[] finalToSchool = {
            "... Opening the door, you have another flash.",
            "... ‘What’s with this morning?!’, you mutter.",
            "... The headache was just the tip of the iceberg.",
            "... You see the number 1. You see it.",
            "... Everywhere.",
            "... You forget how to blink. This scene is just too terrifying.",
            "... Something is happening the next day and that is definitely gonna kill everyone here.",
            "What to do now, you even have an exam today. Shall you skip it...?\n \t (0) Yeah! Skip it! Everyone is dying here, duh?! \n \t (1) It’s just 1 morning and you have the whole day to yourself anyway",
    };

    private String[] finalToSchoolChoice = {
            "... You decide to leave the exam aside and focus on saving everyone!",
            "... Education is more important. You can solve the problem later on with your superb mind.",
    };

    /////////////////////////////////// 20C - Final Clues
    private String[] finalClues = {
            "... Note the clues you have until now.",
            "\t - The note you get from the janitor.",
            "\t - The disappearing of Mr.Cherr and his wife.",
            "\t - The peculiar ringtone you heard some days ago.",
            "\t - The substances you have in your pocket.",
            "What place do you want to investigate now...?\n \t (0) Mr.Tate's \n \t (1) Mountain \n \t (2) Lab \n \t (3) Mr.Cherr's \n \t (4) Class B",
    };

    private String[] finalCluesChoice = {
            "... You come to check the intended place, but nothing was found. You come back to the starting point.",
            "... It should be this place. You have the feeling that Mr.Cherr's house is holding something.",
    };

    /////////////////////////////////// 20D - Final At Cherr's place
    private String[] finalAtCherr = {
            "... You come into the house, a bit surprised to find out that the house was never locked.",
            "... What surprised you even more is the dead body of a woman, laid in the middle of the dining room.",
            "... This woman looks like the one you saw on the other day, and if so, is Mr.Cherr’s wife.",
            "... You knee down on her and see a paper crumbled into her hand...",
            "... ‘RIVER’. It reads so. With a lot of blood splattered around it.",
    };

    private String[] finalAtCherrRescued = {
            "... You come into the house, a bit surprised to find out that the house was never locked.",
            "... What surprised you even more is a woman shivering at the corner of the room, with a terrified expression and messed-up hair.",
            "... She looks so empty. Do you...\n \t (0) Come to talk to her \n \t (1) Approach her carefully",
    };

    private String[] talkWoman = {
            "... ‘My husband is totally insane…’, she still shivers",
            "... You calm her down with your charisma.",
            "... ‘He’s going to kill everyone…’.",
            "... You think she’s still nervous.",
            "... ‘You have to listen to me! If you don’t come to the river now and stop him, everyone is going to die tomorrow’.",
            "... That's when you stop doubting her mentality... So it’s true that the number is telling you something, for real. ",
            "... You don’t know if this woman is speaking the truth, but you need to come to the RIVER, as soon as possible.",
            "... Also, you get the [Potion Note] from her. Maybe this can help you soon.",
            "[Potion Note] Obtained.",
    };

    private String[] approachWoman = {
            "... The woman dare not speak a word and keep trembling like crazy.",
            "... You notice a crumbled piece of paper inside her palm.",
            "... Carefully, you take it out. The paper reads ‘RIVER’.",
    };

    /////////////////////////////////// 20E - Final Showdown
    private String[] finalShowdown = {
            "... Now you see the very figure of the man standing near the source of the river flowing directly to your place.",
            "... It’s no one but your very own chemistry teacher, Mr.Cherr.",
            "... So it’s him who killed the Janitor and Mr.Tate",
            "... And it’s him as well planning to annihilate the whole town. ",
            "... You’ve got to stop this.",
    };

    private String[] finalShowdownChoice = {
            "... With all your courage, you walk up to Mr.Cherr and knock him down with ease.",
            "... With all your brilliance, you walk up to Mr.Cherr and simply talk him out of poisoning the whole town.",
            "... With all your SWAG, you walk up to Mr.Cherr and give him such a weird dance that he is completely confused and forgets what to do.",
    };

    /////////////////////////////////// 21A - Final Event
    private String[] finalEvent = {
            "... But the poison has already been poured down into the river.",
            "... Now all you’re facing is the choice between being a hero and a zero.",
            "... You have to choose between the 2 potions, one being the lifesaver, the other worsening the effect.",
            "... You decide to choose…?\n \t(0) Potion 1 \n \t(1) Potion 2",
    };

    private String[] finalEventAlter = {
            "... Now all you’re facing is the choice between being a hero and a zero.",
            "... You have to choose between the 2 potions, one being the lifesaver, the other worsening the effect.",
            "... However, with the tip from Mr.Cherr's wife, you manage to choose the right bottle and pour it into the river!",
            "... You pour the supposedly antidote into the water. Now all you do is drink the water itself to check the result.",
            "...",
            "... And you didn’t die! You just saved the whole town! Good job!\n",
    };

    private String[] finalEventChoiceCorrect = {
            "... You pour the supposedly antidote into the water. Now all you do is drink the water itself to check the result.",
            "...",
            "... And you didn’t die! You just saved the whole town! Good job!\n",
    };

    private String[] finalEventChoiceWrong = {
            "... You pour the supposedly antidote into the water. Now all you do is drink the water itself to check the result.",
            "...",
            "... You feel the burn deep down from the belly.",
            "... You feel your sanity losing itself. You just die...",
    };

    /////////////////////////////////// R1 - R.event1
    private String[] rEvent1 = {
            "... Your class is going on as usual. But not anymore when you notice that...",
            "... THAT, I say, is the girl... She's making your world a dream with her straight black hair, beautiful blue eyes, pretty bunny nose and angelic smile.", //0
            "... Jenny, student of Faculty of Literature and your 3 years of crush.\nIt is yet another day that you are looking at her and thinking 'Will I be able to be the one that smile is directed at?'",
            "... Apparently, while you are lost deep in your dream world she has turned towards you and now you are looking right inti those ocean deep eyes.",
            "... You're frozen, what to do?\n \t(0) Act as if you haven't been staring at her last 10 minutes. \n \t(1) Stare at her- Just keep staring... \n \t(2) Wave. \n \t(3) Run for your life. ", //options 4
    };

    private String[] rEvent1Choice = {
            "... You get ultra panic and get everyone's attentions... At least you got into her eyes!",
            "... She thinks you are looking at something behind her... You barely got away",
            "... She is absolutely baffled by your actions. What are you doing at the middle of the class!",
            "... Wait what!? where to run?!?",
    };

    /////////////////////////////////// R2 - R.event2
    private String[] rEvent2 = {
            "... Ring ring! Your mom is calling.",
            "... During all the chaos you have forgotten to go through your daily 'did you burn the house, yet?' check, several times.",
            "... She is probably freaking out and ready to call the cops for a missing report. \n \t(0) Answer the call and hope she won't lecture you, too much. \n \t(1) Ignore it and hope she won't call the firefighters. \n \t(2) Call your sister to save you from Mom's Fury. \n \t(3) Text your mom 'I'm busy.'. Actually, never mind, don't do that. No, wait. Don't! ", //options 3
    };

    private String[] rEvent2Choice = {
            "... She scolds you for your ignorance, but at least she is not coming to grab you up.",
            "... Rest for the day as firefighters come (You come home to see a firetruck in front of your door... Oh gosh noooo!)",
            "... Nothing happened, you don't have sisters...",
            "... Are you freaking texting your mom that you're busy after she calls you 56768 times? I also like to live dangerously.",
    };

    /////////////////////////////////// R3 - R.event3
    private String[] rEvent3 = {
            "... There goes your bus to school. ",
            "... This is your 5th time this month.\nThere should be a quiz in the first lecture today.",
            "... You simply don't want to be late, but getting a cab is just too out of your league.",
            "... What should you do now?! \n \t(0) What's done is done. Wait for the next bus. \n \t(1) â€œBorrowâ€� one of the bicycles and cycle to school. \n \t(2) Give up, go back home and sleep your frustration off. ",};

    private String[] rEvent3Choice = {
            "... You come for the school quite late and miss the class.",
            "... You barely make it to the class and take the quiz.\nAlso you don't really remember whose the bike was... So better just keep it for now eh?\n\t# 'Bicycle' Obtained #",
            "... Not a single f*** was given that day, so you enjoy staying home reading some books.",
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
                if (events.isTriggered("TT")) {
                    fromPlace += toTattoo;
                }
                if (events.isTriggered("VL")) {
                    fromPlace += toTeacher;
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
                result = "\tToday you have Maths. Gosh this stuff blows your brain.";
                break;
            case 1:
                result = "\tToday you have Finnish. What the heck do they think when putting Finnish in your schedule?!";
                break;
            case 2:
                result = "\tToday you have Biology. So hard, but at least you are familiar with it from before.";
                break;
            case 3:
                result = "\tToday is for History! Gosh, they always say that you should let it past right?! Right?!";
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

    public String getInstruction(Player player) {
        return player.getPlayerName() + ", " + instruction;
    }

    public String getInputInstruction() {
        return inputInstruction;
    }

    public String getDailyInstruction() {
        return dailyInstruction;
    }
}