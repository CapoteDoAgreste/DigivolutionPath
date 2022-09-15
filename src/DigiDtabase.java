//import android.content.res.Resources;
//import android.graphics.drawable.Drawable;


public class DigiDtabase {

    //Resources res = Resources.getSystem();

    //This class will be used like a offline database, adding the data with the same array spot


    //Digimons Name
    String[] Digimons = {
            "Kuramon", "Pabumon", "Punimon", "Botamon", "Poyomon",
            "Arcadiamon In-Tr", "Koromon", "Tanemon", "Tsunomon","Tsumemon","Tokomon", "Nyaromon", "Pagumon", "Yokomon", "Bukamon", "Motimon", "Wanyamon",
            "Agumon", "Agumon BLK", "Arcadiamon Rookie", "Armadillomon", "Impmon", "Elecmon", "Otamamon", "Gaomon", "Gazimon", "Gabumon", "Gabumon BLK",
            "Guilmon", "Kudamon", "Keramon","Gotsumon","Goblimon","Gomamon","Syakomon","Zubamon","Solarmon","Chuumon","Terriermon","Tentomon","ToyAgumon","Dracmon",
            "Dracomon","Dorumon","Hagurumon","Patamon","Hackmon","Palmon","DemiDevimon","Biyomon","Falcomon","FanBeemon","Veemon",
            "Salamon","Betamon","Hawkmon","Mushroomon","Monodramon","Lalamon","Lucemon","Lunamon","Renamon","Lopmon","Wormmon","IceDevimon","Icemon",
            "Aquilamon","Agunimon","Arcadiamon Champion","Ankylomon","Ikkakumon","Wizardmon","Lobomon","Woodmon","Airdramon","ExVeemon","Angemon","Ogremon",
            "Guardromon","Guardromon(Gold)","GaoGamon","Kabuterimon","ShellNumemon","Gargomon","Garurumon","Garurumon BLK", "Kyubimon","Growlmon","Kurisarimon",
            "Greymon","Greymon(Blue)","Clockmon","Kuwagamon","Gekomon","Geremon","Coredramon(Blue)","Coredramon(Green)","GoldNumemon","Golemon","Cyclonemon",
            "Sangloupmon","Sunflowmon","Seadramon","Coelamon","GeoGreymon","Sukamon","Starmon","Stingmon","Strikedramon","Zubaeagermon","Socerimon","Tankmon",
            "MudFrigimon","Tyrannomon","Gatomon","Devimon","Turuiemon","Togemon","Dorugamon","Nanimon","Numemon","Birdramon","BaoHuckmon","Bakemon","Veedramon",
            "Hudiemon","PlatinumSukamon","BlackGatomon","Vegiemon","Peckmon","Meramon","Monochromon","Frigimon","Unimon","Raptordramon","Raremon","Leomon",
            "Lekismon","Reppamon","Waspmon", "MegaKabuterimon","Arcadiamon Ultimate","Antylamon","Andromon","Meteormon","Infermon","Myotismon","Wingdramon",
            "BurningGreymon","AeroVeedramon","Etemon","Angewomon","Okuwamon","Garudamon","KendoGarurumon","Gigadramon","CatchMamemon","CannonBeemon","Groundramon",
            "GrapLeomon","Grademon","Crescemon","Cyberdramon","Shakkoumon","Cherrymon","Silphymon","SuperStarmon","SkullGreymon","SkullSatamon","Zudomon",
            "SaviorHuckmon","Taomon","Dragomon","Chirinmon","Dinobeemon","Digitamamon","SkullMeramon","Duramon","ShogunGekomon","Triceramon","DoruGreymon",
            "Knightmon","Datamon","Paildramon","Panjyamon","Pandamon","Pumpkinmon","Piximon","HippoGryphonmon","Phantomon","BlackKingNumemon","BlueMeramon",
            "Vademon","Whamon","MagnaAngemon","Volcanomon","Matadormon","MachGaogamon","Mamemon","MegaSeadramon","Megadramon","WarGrowlmon","MetalGreymon",
            "MetalGreymon Blue","MetalTyrannomon","MetalMamemon","Monzaemon","Crowmon","RizeGreymon","Lilamon","Rapidmon","Lillymon","Lucemon FM","LadyDevimon",
            "WereGarurumon","WereGarurumon BLK","Wisemon","Arcadiamon Mega","Alphamon","UlforceVeedramon","Ebemon","Imperialdramon DM","Imperialdramon FM","Vikemon",
            "Valkyrimon","Varodurumon","VenomMyotismon","WarGreymon","Ophanimon","Gaiomon","KaiserGreymon","ChaosGallantmon","Chaosdramon","Gankoomon","KingEtemon",
            "Kuzuhamon","GranKuwagamon","GranDracmon","GroundLocomon","Gryphonmon","Craniamon","Kerpymon BLK","Kerpymon Good","Goldramon","SaberLeomon","Sakuyamon",
            "Jesmon","ShineGreymon","ShineGreymon BM","Justimon","Kentaurosmon","Slayerdramon","Seraphimon","MegaGargomon","Darkdramon","TigerVespamon","Titamon",
            "TyrantKabuterimon","Dianamon","Diaboromon","Creepymon","Gallantmon","Dynasmon","Durandamon","Leopardmon","Leopardmon LM","Dorugoramon","Neptunemon","HiAndromon",
            "PileVolcamon","Barbamon","BanchoLeomon","Piedmon","Puppetmon","PlatinumNumemon","BlackWarGreymon","PrinceMamemon","Breakdramon","Plesiomon","HerculesKabuterimon",
            "Beelzemon","Beelzemon BM","Belphemon SM","Hououmon","Magnadramon","Boltmon","MagnaGarurumon","MagnaGarurumon SV","Mastemon","MarineAngemon","Minervamon","MirageGaogamon","MirageGaogamon BM",
            "Machinedramon","Megidramon","MetalEtemon","MetalGarurumon","MetalGarurumon BLK","MetalSeadramon","Merukimon","RustTyranomon","Leviamon","Lilithmon","Ravemon","Ravemon BM",
            "Crusadermon","Rosemon","Rosemon BM","Lotosmon","Armageddemon","Arcadiamon Ultra","Alphamon Ouryuken","Imperialdramon PM","Examon","Omnimon","Omnimon Zwart","Chaosmon",
            "Chaosmon VA","Susanomon","Gallantmon CM","Belphemon RM","Lucemon SM","Flamedramon","Magnamon","Rapidmon Armor","Shoutmon","OmniShoutmon","Ryudamon","Ginryumon","Hisyaryumon",
            "Ouryumon","Apocalymon","Sistermon Blanc","Sistermon B Awake","Sistermon Ciel","Sistermon C Awake","Alphamon NX","Crusadermon NX","Leopardmon NX","Omnimon NX","Gallantmon NX"
    };

    //digimon image
    /*int[] Image = {
            R.drawable.kuramon,R.drawable.pabumon,R.drawable.punimon,R.drawable.botamon,R.drawable.poyomon,R.drawable.arcadiamontr,R.drawable.koromon,R.drawable.tanemon,
            R.drawable.tsunomon,R.drawable.tsumemon,R.drawable.tokomon,R.drawable.nyaromon,R.drawable.pagumon,R.drawable.yokomon,R.drawable.bukamon,R.drawable.motimon,R.drawable.wanyamon,R.drawable.agumon,
            R.drawable.agumonblk,R.drawable.arcadiamonroo,R.drawable.armadillomon,R.drawable.impmon,R.drawable.elecmon,R.drawable.otamamon,R.drawable.gaomon,R.drawable.gazimon,
            R.drawable.gabumon,R.drawable.gabumonblk,R.drawable.guilmon,R.drawable.kudamon,R.drawable.keramon,R.drawable.gotsumon,R.drawable.goblimon,R.drawable.gomamon,R.drawable.syakomon,
            R.drawable.zubamon,R.drawable.solarmon,R.drawable.chuumon,R.drawable.terriermon,R.drawable.tentomon,R.drawable.toyagumon,R.drawable.dracmon,R.drawable.dracomon,R.drawable.dorumon,R.drawable.hagurumon,
            R.drawable.patamon,R.drawable.hackmon,R.drawable.palmon,R.drawable.demidevilmon,R.drawable.biyomon,R.drawable.falcomon,R.drawable.fanbeemon,R.drawable.veemon,R.drawable.salamon,R.drawable.betamon,
            R.drawable.hawkmon,R.drawable.mushroomon,R.drawable.monodramon,R.drawable.lalamon,R.drawable.lucemon,R.drawable.lunamon,R.drawable.renamon,R.drawable.lopmon,R.drawable.wormmon,
            R.drawable.icedevilmon,R.drawable.icemon,R.drawable.aquilamon,R.drawable.agunimon,R.drawable.arcadiamonchampion,R.drawable.ankylomon,R.drawable.ikkakumon,R.drawable.wizadmon,
            R.drawable.lobomon,R.drawable.woodmon,R.drawable.airdramon,R.drawable.exveemon,R.drawable.angemon,R.drawable.ogremon,R.drawable.guardromon,R.drawable.guardromongol,R.drawable.gaogamon,
            R.drawable.kabuterimon,R.drawable.shellnumemon,R.drawable.gargomon,R.drawable.garurumon,R.drawable.garurumonblk,R.drawable.kyubimon,R.drawable.growlmon,R.drawable.kurisarimon,
            R.drawable.greymon,R.drawable.greymonblue,R.drawable.clockmon,R.drawable.kuwagamon,R.drawable.gekomon,R.drawable.geremon,R.drawable.coredramonblue,R.drawable.coredramongreen,
            R.drawable.goldnumemon,R.drawable.golemon,R.drawable.cyclonemon,R.drawable.sangloupmon,R.drawable.sunflowmon,R.drawable.seadramon,R.drawable.coelamon,R.drawable.geogreymon,
            R.drawable.sukamon,R.drawable.starmon,R.drawable.stingmon,R.drawable.strikedramon,R.drawable.zubaeagermon,R.drawable.socerimon,R.drawable.tankmon,R.drawable.mudfrigimon,
            R.drawable.tyrannomon,R.drawable.gatomon,R.drawable.devilmon,R.drawable.turuiemon,R.drawable.togemon,R.drawable.dorugamon,R.drawable.nanimon,R.drawable.numemon,R.drawable.birdramon,
            R.drawable.baohuckmon,R.drawable.bakemon,R.drawable.veedramon,R.drawable.hudiemon,R.drawable.platinumsukamon,R.drawable.blackgatomon,R.drawable.vegiemon,R.drawable.peckmon,
            R.drawable.meramon,R.drawable.monochromon,R.drawable.frigimon,R.drawable.unimon,R.drawable.raptordramon,R.drawable.raremon,R.drawable.leomon,R.drawable.lekismon,R.drawable.reppamon,
            R.drawable.waspmon,R.drawable.megakabuterimon,R.drawable.arcadiamonulti,R.drawable.antylamon,R.drawable.andromon,R.drawable.meteormon,R.drawable.infermon,R.drawable.myotismon,R.drawable.wingdramon,
            R.drawable.burninggreymon,R.drawable.aeroveedramon,R.drawable.etemon,R.drawable.angewomon,R.drawable.okuwamon,R.drawable.garudamon,R.drawable.kendogarurumon,R.drawable.gigadramon,R.drawable.catchmamemon,
            R.drawable.cannonbeemon,R.drawable.groundlocomon,R.drawable.grapleomon,R.drawable.grademon,R.drawable.crescemon,R.drawable.cyberdramon,R.drawable.shakkoumon,R.drawable.cherrymon,R.drawable.silphymon,
            R.drawable.superstarmon,R.drawable.skullgreymon,R.drawable.skullstamon,R.drawable.zudomon,R.drawable.saviorhuckmon,R.drawable.taomon,R.drawable.dragomon,R.drawable.chirinmon,R.drawable.dinobeemon,
            R.drawable.digitamamon,R.drawable.skullmeramon,R.drawable.duramon,R.drawable.shogungekomon,R.drawable.triceramon,R.drawable.dorugreymon,R.drawable.knightmon,R.drawable.datamon,R.drawable.paildramon,
            R.drawable.panjyamon,R.drawable.pandamon,R.drawable.pumpkinmon,R.drawable.piximon,R.drawable.hippogryphonmon,R.drawable.phantomon,R.drawable.blackkingnumemon,R.drawable.bluemeramon,R.drawable.vademon,
            R.drawable.whamon,R.drawable.magnaangemon,R.drawable.volcanomon,R.drawable.matadormon,R.drawable.machgaogamon,R.drawable.mamemon,R.drawable.megaseadramon,R.drawable.megadramon,R.drawable.wargrowlmon,
            R.drawable.metalgreymon,R.drawable.metalgreymonblue,R.drawable.metaltyrannomon,R.drawable.metalmamemon,R.drawable.monzaemon,R.drawable.crowmon,R.drawable.rizegreymon,R.drawable.lilamon,R.drawable.rapidmon,R.drawable.lillymon,
            R.drawable.lucemonfm,R.drawable.ladydevimon,R.drawable.weregarurumon,R.drawable.weregarurumonblk,R.drawable.wisemon,R.drawable.arcadiamonmega,R.drawable.alphamon,R.drawable.ulforceveedramon,R.drawable.ebemon,R.drawable.imperialdramondm,
            R.drawable.imperialdramonfm,R.drawable.vikemon,R.drawable.valkyrimon,R.drawable.varodurumon,R.drawable.venommyotismon,R.drawable.wargreymon,R.drawable.ophanimon,R.drawable.gaiomon,R.drawable.kaisergreymon,R.drawable.chaosgallantmon,
            R.drawable.chaosdramon,R.drawable.gankoomon,R.drawable.kingetemon,R.drawable.kuzuhamon,R.drawable.grankuwagamon,R.drawable.grandracmon,R.drawable.groundlocomon,R.drawable.gryphonmon,R.drawable.craniamon,
            R.drawable.kerpymonblk,R.drawable.kerpymongood,R.drawable.goldramon,R.drawable.saberleomon,R.drawable.sakuyamon,R.drawable.jesmon,R.drawable.shinegreymon,R.drawable.shinegreymonbm,R.drawable.justimon,R.drawable.kentaurosmon,
            R.drawable.slayerdramon,R.drawable.seraphimon,R.drawable.megagargomon,R.drawable.darkdramon,R.drawable.tigervespamon,R.drawable.titamon,R.drawable.tyrantkabuterimon,R.drawable.dianamon,R.drawable.diaboromon,R.drawable.creepymon,
            R.drawable.gallantmon,R.drawable.dynasmon,R.drawable.durandamon,R.drawable.leopardmon,R.drawable.leopardmonlm,R.drawable.dorugoramon,R.drawable.neptunomon,R.drawable.hiandromon,R.drawable.pilevolcano,R.drawable.barbamon,
            R.drawable.bancholeomon,R.drawable.piedmon,R.drawable.puppetmon,R.drawable.platinumnumemon,R.drawable.blackwargreymon,R.drawable.princemamemon,R.drawable.breakdramon,R.drawable.plesiomon,R.drawable.herculeskabuterimon,
            R.drawable.beelzemon,R.drawable.beelzemonbm,R.drawable.belphemonsm,R.drawable.huoumon,R.drawable.magnadramon,R.drawable.boltmon,R.drawable.magnagarurumon,R.drawable.magnagarurumonsv,R.drawable.mastemon,R.drawable.marineangemon,
            R.drawable.minervamon,R.drawable.miragegaogamon,R.drawable.miragegaogamonbm,R.drawable.machinedramon,R.drawable.megidramon,R.drawable.metaletemon,R.drawable.metalgarurumon,R.drawable.metalgarurumonblk,R.drawable.metalseadramon,
            R.drawable.merukimon,R.drawable.rusttyranomon,R.drawable.leviamon,R.drawable.lilithmon,R.drawable.ravemon,R.drawable.ravemonbm,R.drawable.crusadermon,R.drawable.rosemon,R.drawable.rosemonbm,R.drawable.lotosmon,R.drawable.armageddemon,
            R.drawable.arcadiamonultra,R.drawable.alphamonouryuken,R.drawable.imperialdramonpm,R.drawable.examon,R.drawable.omnimon,R.drawable.omnimonzwart,R.drawable.chaosmon,R.drawable.chaosmonva,R.drawable.susanomon,R.drawable.gallantmoncm,
            R.drawable.belphemonrm,R.drawable.lucemonsm,R.drawable.flamedramon,R.drawable.magnamon,R.drawable.rapidmonarmor,R.drawable.shoutmon,R.drawable.omnishoutmon,R.drawable.ryudamon,R.drawable.ginryumon,R.drawable.hisyaryumon,
            R.drawable.ouryumon,R.drawable.apocalymon,R.drawable.sistermonblanc,R.drawable.sistermonbawake,R.drawable.sistermonciel,R.drawable.sistermoncawake,R.drawable.alphanimonnx,R.drawable.crusadermonnx,R.drawable.leopardmonnx,
            R.drawable.omnimonnx,R.drawable.gallantmonnx

    };*/

    String[][][] DigiEvolution = new String[Digimons.length][2][8];
    String[][] Digitypes = new String[Digimons.length][4];

    public void DigiEvolutionSet(){
        //setting digivolutions
        //DigiEvolution[DigimonID-1][0 - from|| 1 - for][digimons]

        int i = 0;

        //kuramon
        //for
        DigiEvolution[i][1][0] = "Tsumemon";
        DigiEvolution[i][1][1] = "Pagumon";
        DigiEvolution[i][1][2] = "Arcadiamon In-Tr";
        i+=1;

        //pabumon
        //for
        DigiEvolution[i][1][0] = "Tanemon";
        DigiEvolution[i][1][1] = "Yokomon";
        DigiEvolution[i][1][2] = "Motimon";
        i+=1;

        //punimon
        //for
        DigiEvolution[i][1][0] = "Tsunomon";
        DigiEvolution[i][1][1] = "Nyaromon";
        i+=1;

        //botamon
        //for
        DigiEvolution[i][1][0] = "Koromon";
        DigiEvolution[i][1][1] = "Wanyamon";
        i+=1;

        //poyomon
        //for
        DigiEvolution[i][1][0] = "Tokomon";
        DigiEvolution[i][1][1] = "Bukamon";
        i+=1;

        //arcadiamon In-Tr.
        //from
        DigiEvolution[i][0][0] = "Kuramon";

        //for
        DigiEvolution[i][1][0] = "Arcadiamon Rookie";
        i+=1;

        //koromon
        //from
        DigiEvolution[i][0][0] = "Botamon";

        //for
        DigiEvolution[i][1][0] = "Agumon";
        DigiEvolution[i][1][1] = "Guilmon";
        DigiEvolution[i][1][2] = "ToyAgumon";
        DigiEvolution[i][1][3] = "Hackmon";
        DigiEvolution[i][1][4] = "Dracomon";
        DigiEvolution[i][1][5] = "Shoutmon";
        i+=1;

        //tanemon
        //from
        DigiEvolution[i][0][0] = "Pabumon";

        //for
        DigiEvolution[i][1][0] = "Lalamon";
        DigiEvolution[i][1][1] = "Palmon";
        DigiEvolution[i][1][2] = "Renamon";
        DigiEvolution[i][1][3] = "FanBeemon";
        i+=1;

        //tsunomon
        //from
        DigiEvolution[i][0][0] = "Punimon";

        //for
        DigiEvolution[i][1][0] = "Gabumon";
        DigiEvolution[i][1][1] = "Gabumon BLK";
        DigiEvolution[i][1][2] = "Goblimon";
        DigiEvolution[i][1][3] = "Veemon";
        DigiEvolution[i][1][4] = "Zubamon";
        DigiEvolution[i][1][5] = "Monodramon";
        i+=1;

        //tsumemon
        //from
        DigiEvolution[i][0][0] = "Kuramon";

        //for
        DigiEvolution[i][1][0] = "Agumon BLK";
        DigiEvolution[i][1][1] = "Keramon";
        DigiEvolution[i][1][2] = "DemiDevimon";
        DigiEvolution[i][1][3] = "Dracmon";
        i+=1;

        //tokomon
        //from
        DigiEvolution[i][0][0] = "Poyomon";

        //for
        DigiEvolution[i][1][0] = "Patamon";
        DigiEvolution[i][1][1] = "Falcomon";
        DigiEvolution[i][1][2] = "Hawkmon";
        DigiEvolution[i][1][3] = "Lucemon";
        DigiEvolution[i][1][4] = "Sistermon Blanc";
        i+=1;

        //nyaromon
        //from
        DigiEvolution[i][0][0] = "Punimon";

        //for
        DigiEvolution[i][1][0] = "Armadillomon";
        DigiEvolution[i][1][1] = "Terriermon";
        DigiEvolution[i][1][2] = "Salamon";
        DigiEvolution[i][1][3] = "Lunamon";
        i+=1;

        //Pagumon
        //from
        DigiEvolution[i][0][0] = "Kuramon";

        //for
        DigiEvolution[i][1][0] = "Impmon";
        DigiEvolution[i][1][1] = "Gazimon";
        DigiEvolution[i][1][2] = "Lopmon";
        DigiEvolution[i][1][3] = "Chuumon";
        i+=1;

        //yokomon
        //from
        DigiEvolution[i][0][0] = "Pabumon";

        //for
        DigiEvolution[i][1][0] = "Elecmon";
        DigiEvolution[i][1][1] = "Biyomon";
        DigiEvolution[i][1][2] = "Wormmon";
        DigiEvolution[i][1][3] = "Mushroomon";
        i+=1;

        //bukamon
        //from
        DigiEvolution[i][0][0] = "Poyomon";

        //for
        DigiEvolution[i][1][0] = "Otamamon";
        DigiEvolution[i][1][1] = "Gomamon";
        DigiEvolution[i][1][2] = "Syakomon";
        DigiEvolution[i][1][3] = "Betamon";
        i+=1;

        //motimon
        //from
        DigiEvolution[i][0][0] = "Pabumon";

        //for
        DigiEvolution[i][1][0] = "Gotsumon";
        DigiEvolution[i][1][1] = "Solarmon";
        DigiEvolution[i][1][2] = "Tentomon";
        DigiEvolution[i][1][3] = "Hagurumon";
        i+=1;

        //wanyamon
        //from
        DigiEvolution[i][0][0] = "Pabumon";

        //for
        DigiEvolution[i][1][0] = "Gaomon";
        DigiEvolution[i][1][1] = "Kudamon";
        DigiEvolution[i][1][2] = "Dorumon";
        DigiEvolution[i][1][3] = "Ryudamon";
        i+=1;

        //agumon
        //from
        DigiEvolution[i][0][0] = "Koromon";

        //for
        DigiEvolution[i][1][0] = "Greymon";
        DigiEvolution[i][1][1] = "GeoGreymon";
        DigiEvolution[i][1][2] = "Sukamon";
        DigiEvolution[i][1][3] = "Tyrannomon";
        DigiEvolution[i][1][4] = "Meramon";
        DigiEvolution[i][1][5] = "Agunimon";
        i+=1;

        //agumon blk
        //from
        DigiEvolution[i][0][0] = "Tsumemon";

        //for
        DigiEvolution[i][1][0] = "Growlmon";
        DigiEvolution[i][1][1] = "Greymon(Blue)";
        DigiEvolution[i][1][2] = "Cyclonemon";
        DigiEvolution[i][1][3] = "Tankmon";
        DigiEvolution[i][1][4] = "Tyrannomon";
        DigiEvolution[i][1][5] = "Monochromon";
        i+=1;

        //arcadiamon rookie
        //from
        DigiEvolution[i][0][0] = "Arcadiamon In-Tr";

        //for
        DigiEvolution[i][1][0] = "Arcadiamon Champion";
        DigiEvolution[i][1][1] = "Kurisarimon";
        DigiEvolution[i][1][2] = "Leomon";
        i+=1;

        //armadillomon
        //from
        DigiEvolution[i][0][0] = "Nyaromon";

        //for
        DigiEvolution[i][1][0] = "Ankylomon";
        DigiEvolution[i][1][1] = "Geremon";
        DigiEvolution[i][1][2] = "GoldNumemon";
        DigiEvolution[i][1][3] = "Cyclonemon";
        DigiEvolution[i][1][4] = "Tankmon";
        DigiEvolution[i][1][5] = "Golemon";
        i+=1;

        //impmon
        //from
        DigiEvolution[i][0][0] = "Pagumon";

        //for
        DigiEvolution[i][1][0] = "IceDevimon";
        DigiEvolution[i][1][1] = "Wizardmon";
        DigiEvolution[i][1][2] = "Ogremon";
        DigiEvolution[i][1][3] = "Socerimon";
        DigiEvolution[i][1][4] = "Bakemon";
        DigiEvolution[i][1][5] = "BlackGatomon";
        i+=1;

        //Elecmon
        //from
        DigiEvolution[i][0][0] = "Yokomon";

        //for
        DigiEvolution[i][1][0] = "Garurumon";
        DigiEvolution[i][1][1] = "Garurumon BLK";
        DigiEvolution[i][1][2] = "Geremon";
        DigiEvolution[i][1][3] = "Sukamon";
        DigiEvolution[i][1][4] = "Nanimon";
        DigiEvolution[i][1][5] = "Leomon";
        i+=1;

        //Otamamon
        //from
        DigiEvolution[i][0][0] = "Bukamon";

        //for
        DigiEvolution[i][1][0] = "ShellNumemon";
        DigiEvolution[i][1][1] = "Gekomon";
        DigiEvolution[i][1][2] = "Seadramon";
        DigiEvolution[i][1][3] = "Numemon";
        DigiEvolution[i][1][4] = "Coelamon";
        DigiEvolution[i][1][5] = "Raremon";
        i+=1;

        //Gaomon
        //from
        DigiEvolution[i][0][0] = "Wanyamon";

        //for
        DigiEvolution[i][1][0] = "Ogremon";
        DigiEvolution[i][1][1] = "GaoGamon";
        DigiEvolution[i][1][2] = "Gargomon";
        DigiEvolution[i][1][3] = "Togemon";
        DigiEvolution[i][1][4] = "Leomon";
        DigiEvolution[i][1][5] = "Sangloupmon";
        i+=1;

        //Gazimon
        //from
        DigiEvolution[i][0][0] = "Pagumon";

        //for
        DigiEvolution[i][1][0] = "GaoGamon";
        DigiEvolution[i][1][1] = "Garurumon BLK";
        DigiEvolution[i][1][2] = "Kurisarimon";
        DigiEvolution[i][1][3] = "Dorugamon";
        DigiEvolution[i][1][4] = "Nanimon";
        DigiEvolution[i][1][5] = "Leomon";
        i+=1;

        //Gabumon
        //from
        DigiEvolution[i][0][0] = "Tsunomon";

        //for
        DigiEvolution[i][1][0] = "Garurumon";
        DigiEvolution[i][1][1] = "Dorugamon";
        DigiEvolution[i][1][2] = "Numemon";
        DigiEvolution[i][1][3] = "Veedramon";
        DigiEvolution[i][1][4] = "Frigimon";
        DigiEvolution[i][1][5] = "Lobomon";
        i+=1;

        //Gabumon BLK
        //from
        DigiEvolution[i][0][0] = "Tsunomon";

        //for
        DigiEvolution[i][1][0] = "Garurumon BLK";
        DigiEvolution[i][1][1] = "Vegiemon";
        DigiEvolution[i][1][2] = "Frigimon";
        DigiEvolution[i][1][3] = "Reppamon";
        DigiEvolution[i][1][4] = "Raremon";
        i+=1;

        //Guilmon
        //from
        DigiEvolution[i][0][0] = "Koromon";

        //for
        DigiEvolution[i][1][0] = "GeoGreymon";
        DigiEvolution[i][1][1] = "Growlmon";
        DigiEvolution[i][1][2] = "Greymon(Blue)";
        DigiEvolution[i][1][3] = "Tyrannomon";
        DigiEvolution[i][1][4] = "Meramon";
        DigiEvolution[i][1][5] = "Agunimon";
        i+=1;

        //Kudamon
        //from
        DigiEvolution[i][0][0] = "Wanyamon";

        //for
        DigiEvolution[i][1][0] = "Angemon";
        DigiEvolution[i][1][1] = "GoldNumemon";
        DigiEvolution[i][1][2] = "Peckmon";
        DigiEvolution[i][1][3] = "Reppamon";
        DigiEvolution[i][1][4] = "Lobomon";
        i+=1;

        //Keramon
        //from
        DigiEvolution[i][0][0] = "Tsumemon";

        //for
        DigiEvolution[i][1][0] = "Wizardmon";
        DigiEvolution[i][1][1] = "Kurisarimon";
        DigiEvolution[i][1][2] = "Bakemon";
        DigiEvolution[i][1][3] = "PlatinumSukamon";
        DigiEvolution[i][1][4] = "Arcadiamon Champion";
        i+=1;

        //Gotsumon
        //from
        DigiEvolution[i][0][0] = "Motimon";

        //for
        DigiEvolution[i][1][0] = "Ankylomon";
        DigiEvolution[i][1][1] = "Clockmon";
        DigiEvolution[i][1][2] = "Starmon";
        DigiEvolution[i][1][3] = "Tankmon";
        DigiEvolution[i][1][4] = "Icemon";
        DigiEvolution[i][1][5] = "Golemon";
        i+=1;

        //Goblimon
        //from
        DigiEvolution[i][0][0] = "Tsunomon";

        //for
        DigiEvolution[i][1][0] = "GaoGamon";
        DigiEvolution[i][1][1] = "Growlmon";
        DigiEvolution[i][1][2] = "Greymon(Blue)";
        DigiEvolution[i][1][3] = "Nanimon";
        DigiEvolution[i][1][4] = "Coredramon(Green)";
        i+=1;

        //Gomamon
        //from
        DigiEvolution[i][0][0] = "Bukamon";

        //for
        DigiEvolution[i][1][0] = "Ankylomon";
        DigiEvolution[i][1][1] = "Ikkakumon";
        DigiEvolution[i][1][2] = "Socerimon";
        DigiEvolution[i][1][3] = "Frigimon";
        DigiEvolution[i][1][4] = "Icemon";
        i+=1;

        //Syakomon
        //from
        DigiEvolution[i][0][0] = "Bukamon";

        //for
        DigiEvolution[i][1][0] = "Ikkakumon";
        DigiEvolution[i][1][1] = "ShellNumemon";
        DigiEvolution[i][1][2] = "Gekomon";
        DigiEvolution[i][1][3] = "Seadramon";
        DigiEvolution[i][1][4] = "Coelamon";
        i+=1;

        //Zubamon
        //from
        DigiEvolution[i][0][0] = "Tsunomon";

        //for
        DigiEvolution[i][1][0] = "Zubaeagermon";
        DigiEvolution[i][1][1] = "BaoHuckmon";
        DigiEvolution[i][1][2] = "GoldNumemon";
        DigiEvolution[i][1][3] = "Ginryumon";
        i+=1;

        //Solarmon
        //from
        DigiEvolution[i][0][0] = "Motimon";

        //for
        DigiEvolution[i][1][0] = "Clockmon";
        DigiEvolution[i][1][1] = "Starmon";
        DigiEvolution[i][1][2] = "Meramon";
        DigiEvolution[i][1][3] = "Guardromon(Gold)";
        DigiEvolution[i][1][4] = "Golemon";
        i+=1;

        //Chuumon
        //from
        DigiEvolution[i][0][0] = "Pagumon";

        //for
        DigiEvolution[i][1][0] = "Raremon";
        DigiEvolution[i][1][1] = "Sukamon";
        DigiEvolution[i][1][2] = "BlackGatomon";
        DigiEvolution[i][1][3] = "Nanimon";
        i+=1;

        //Terriermon
        //from
        DigiEvolution[i][0][0] = "Nyaromon";

        //for
        DigiEvolution[i][1][0] = "Gargomon";
        DigiEvolution[i][1][1] = "Ikkakumon";
        DigiEvolution[i][1][2] = "Gatomon";
        DigiEvolution[i][1][3] = "Rapidmon Armor";
        DigiEvolution[i][1][4] = "Unimon";
        i+=1;

        //Tentomon
        //from
        DigiEvolution[i][0][0] = "Motimon";

        //for
        DigiEvolution[i][1][0] = "Kabuterimon";
        DigiEvolution[i][1][1] = "Kuwagamon";
        DigiEvolution[i][1][2] = "Sunflowmon";
        DigiEvolution[i][1][3] = "Stingmon";
        DigiEvolution[i][1][4] = "Waspmon";
        i+=1;

        //ToyAgumon
        //from
        DigiEvolution[i][0][0] = "Koromon";

        //for
        DigiEvolution[i][1][0] = "Clockmon";
        DigiEvolution[i][1][1] = "Guardromon";
        DigiEvolution[i][1][2] = "Greymon";
        DigiEvolution[i][1][3] = "Sukamon";
        DigiEvolution[i][1][4] = "Starmon";
        DigiEvolution[i][1][5] = "Guardromon(Gold)";
        i+=1;

        //Dracmon
        //from
        DigiEvolution[i][0][0] = "Tsumemon";

        //for
        DigiEvolution[i][1][0] = "Arcadiamon Champion";
        DigiEvolution[i][1][1] = "Sangloupmon";
        DigiEvolution[i][1][2] = "Raremon";
        DigiEvolution[i][1][3] = "Sistermon Ciel";
        DigiEvolution[i][1][4] = "Devimon";
        i+=1;

        //Dracomon
        //from
        DigiEvolution[i][0][0] = "Koromon";

        //for
        DigiEvolution[i][1][0] = "Coredramon(Blue)";
        DigiEvolution[i][1][1] = "Coredramon(Green)";
        DigiEvolution[i][1][2] = "Veedramon";
        DigiEvolution[i][1][3] = "Ginryumon";
        i+=1;

        //Dorumon
        //from
        DigiEvolution[i][0][0] = "Wanyamon";

        //for
        DigiEvolution[i][1][0] = "Guardromon";
        DigiEvolution[i][1][1] = "Cyclonemon";
        DigiEvolution[i][1][2] = "Dorugamon";
        DigiEvolution[i][1][3] = "Waspmon";
        DigiEvolution[i][1][4] = "Raptordramon";
        i+=1;

        //Hagurumon
        //from
        DigiEvolution[i][0][0] = "Motimon";

        //for
        DigiEvolution[i][1][0] = "Guardromon";
        DigiEvolution[i][1][1] = "Clockmon";
        DigiEvolution[i][1][2] = "GoldNumemon";
        DigiEvolution[i][1][3] = "Starmon";
        DigiEvolution[i][1][4] = "PlatinumSukamon";
        i+=1;

        //Patamon
        //from
        DigiEvolution[i][0][0] = "Tokomon";

        //for
        DigiEvolution[i][1][0] = "ExVeemon";
        DigiEvolution[i][1][1] = "Angemon";
        DigiEvolution[i][1][2] = "Gatomon";
        DigiEvolution[i][1][3] = "Birdramon";
        DigiEvolution[i][1][4] = "Reppamon";
        DigiEvolution[i][1][5] = "Unimon";
        i+=1;

        //Hackmon
        //from
        DigiEvolution[i][0][0] = "Koromon";

        //for
        DigiEvolution[i][1][0] = "Greymon";
        DigiEvolution[i][1][1] = "GeoGreymon";
        DigiEvolution[i][1][2] = "PlatinumSukamon";
        DigiEvolution[i][1][3] = "Zubaeagermon";
        DigiEvolution[i][1][4] = "BaoHuckmon";
        DigiEvolution[i][1][5] = "Monochromon";
        i+=1;

        //Palmon
        //from
        DigiEvolution[i][0][0] = "Tanemon";

        //for
        DigiEvolution[i][1][0] = "Woodmon";
        DigiEvolution[i][1][1] = "Kuwagamon";
        DigiEvolution[i][1][2] = "Sunflowmon";
        DigiEvolution[i][1][3] = "Togemon";
        DigiEvolution[i][1][4] = "Vegiemon";
        DigiEvolution[i][1][5] = "MudFrigimon";
        i+=1;

        //DemiDevimon
        //from
        DigiEvolution[i][0][0] = "Tsumemon";

        //for
        DigiEvolution[i][1][0] = "IceDevimon";
        DigiEvolution[i][1][1] = "Kyubimon";
        DigiEvolution[i][1][2] = "Kurisarimon";
        DigiEvolution[i][1][3] = "Devimon";
        DigiEvolution[i][1][4] = "Bakemon";
        i+=1;

        //Biyomon
        //from
        DigiEvolution[i][0][0] = "Aquilamon";

        //for
        DigiEvolution[i][1][0] = "Kabuterimon";
        DigiEvolution[i][1][1] = "Kyubimon";
        DigiEvolution[i][1][2] = "Birdramon";
        DigiEvolution[i][1][3] = "Airdramon";
        i+=1;

        //Falcomon
        //from
        DigiEvolution[i][0][0] = "Tokomon";

        //for
        DigiEvolution[i][1][0] = "Aquilamon";
        DigiEvolution[i][1][1] = "ExVeemon";
        DigiEvolution[i][1][2] = "Stingmon";
        DigiEvolution[i][1][3] = "Peckmon";
        i+=1;

        //FanBeemon
        //from
        DigiEvolution[i][0][0] = "Tanemon";

        //for
        DigiEvolution[i][1][0] = "Guardromon(Gold)";
        DigiEvolution[i][1][1] = "Raptordramon";
        DigiEvolution[i][1][2] = "Stingmon";
        DigiEvolution[i][1][3] = "Waspmon";
        DigiEvolution[i][1][4] = "Togemon";
        i+=1;

        //Veemon
        //from
        DigiEvolution[i][0][0] = "Tsunomon";

        //for
        DigiEvolution[i][1][0] = "ExVeemon";
        DigiEvolution[i][1][1] = "Veedramon";
        DigiEvolution[i][1][2] = "Flamedramon";
        DigiEvolution[i][1][3] = "Magnamon";
        DigiEvolution[i][1][4] = "Lobomon";
        DigiEvolution[i][1][5] = "Strikedramon";
        i+=1;

        //Salamon
        //from
        DigiEvolution[i][0][0] = "Nyaromon";

        //for
        DigiEvolution[i][1][0] = "Socerimon";
        DigiEvolution[i][1][1] = "Gatomon";
        DigiEvolution[i][1][2] = "Veedramon";
        DigiEvolution[i][1][3] = "Frigimon";
        DigiEvolution[i][1][4] = "Reppamon";
        DigiEvolution[i][1][5] = "BaoHuckmon";
        i+=1;

        //Betamon
        //from
        DigiEvolution[i][0][0] = "Bukamon";

        //for
        DigiEvolution[i][1][0] = "ShellNumemon";
        DigiEvolution[i][1][1] = "Gekomon";
        DigiEvolution[i][1][2] = "Seadramon";
        DigiEvolution[i][1][3] = "Numemon";
        DigiEvolution[i][1][4] = "Vegiemon";
        DigiEvolution[i][1][5] = "Airdramon";
        i+=1;

        //Hawkmon
        //from
        DigiEvolution[i][0][0] = "Tokomon";

        //for
        DigiEvolution[i][1][0] = "Aquilamon";
        DigiEvolution[i][1][1] = "Birdramon";
        DigiEvolution[i][1][2] = "Peckmon";
        DigiEvolution[i][1][3] = "Meramon";
        DigiEvolution[i][1][4] = "Airdramon";
        i+=1;

        //Mushroomon
        //from
        DigiEvolution[i][0][0] = "Yokomon";

        //for
        DigiEvolution[i][1][0] = "MudFrigimon";
        DigiEvolution[i][1][1] = "Woodmon";
        DigiEvolution[i][1][2] = "Sunflowmon";
        DigiEvolution[i][1][3] = "Vegiemon";
        i+=1;

        //Monodramon
        //from
        DigiEvolution[i][0][0] = "Tsunomon";

        //for
        DigiEvolution[i][1][0] = "Coredramon(Blue)";
        DigiEvolution[i][1][1] = "Strikedramon";
        DigiEvolution[i][1][2] = "Raptordramon";
        DigiEvolution[i][1][3] = "Kurisarimon";
        DigiEvolution[i][1][4] = "Dorugamon";
        i+=1;

        //Lalamon
        //from
        DigiEvolution[i][0][0] = "Tanemon";

        //for
        DigiEvolution[i][1][0] = "Woodmon";
        DigiEvolution[i][1][1] = "Sunflowmon";
        DigiEvolution[i][1][2] = "Togemon";
        DigiEvolution[i][1][3] = "Vegiemon";
        i+=1;

        //Lucemon
        //from
        DigiEvolution[i][0][0] = "Tokomon";

        //for
        DigiEvolution[i][1][0] = "Angemon";
        DigiEvolution[i][1][1] = "Devimon";
        DigiEvolution[i][1][2] = "Lucemon FM";
        i+=1;

        //Lunamon
        //from
        DigiEvolution[i][0][0] = "Nyaromon";

        //for
        DigiEvolution[i][1][0] = "Sangloupmon";
        DigiEvolution[i][1][1] = "Lekismon";
        DigiEvolution[i][1][2] = "Sistermon Ciel";
        DigiEvolution[i][1][3] = "Gatomon";
        i+=1;

        //Renamon
        //from
        DigiEvolution[i][0][0] = "Tanemon";

        //for
        DigiEvolution[i][1][0] = "Woodmon";
        DigiEvolution[i][1][1] = "Garurumon";
        DigiEvolution[i][1][2] = "Kyubimon";
        DigiEvolution[i][1][3] = "BlackGatomon";
        DigiEvolution[i][1][4] = "Turuiemon";
        DigiEvolution[i][1][5] = "Lekismon";
        i+=1;

        //Lopmon
        //from
        DigiEvolution[i][0][0] = "Pagumon";

        //for
        DigiEvolution[i][1][0] = "Wizardmon";
        DigiEvolution[i][1][1] = "Gargomon";
        DigiEvolution[i][1][2] = "Devimon";
        DigiEvolution[i][1][3] = "BlackGatomon";
        DigiEvolution[i][1][4] = "MudFrigimon";
        DigiEvolution[i][1][5] = "Turuiemon";
        i+=1;

        //Wormmon
        //from
        DigiEvolution[i][0][0] = "Yokomon";

        //for
        DigiEvolution[i][1][0] = "IceDevimon";
        DigiEvolution[i][1][1] = "Kabuterimon";
        DigiEvolution[i][1][2] = "Kuwagamon";
        DigiEvolution[i][1][3] = "Stingmon";
        DigiEvolution[i][1][4] = "Waspmon";
        DigiEvolution[i][1][5] = "Hudiemon";
        i+=1;

        //IceDevimon
        //from
        DigiEvolution[i][0][0] = "Impmon";
        DigiEvolution[i][0][1] = "DemiDevimon";
        DigiEvolution[i][0][2] = "Wormmon";

        //for
        DigiEvolution[i][1][0] = "Myotismon";
        DigiEvolution[i][1][1] = "Cherrymon";
        DigiEvolution[i][1][2] = "LadyDevimon";
        DigiEvolution[i][1][3] = "Arcadiamon Ultimate";
        DigiEvolution[i][1][4] = "Dragomon";
        i+=1;

        //Icemon
        //from
        DigiEvolution[i][0][0] = "Gotsumon";
        DigiEvolution[i][0][1] = "Gomamon";

        //for
        DigiEvolution[i][1][0] = "Meteormon";
        DigiEvolution[i][1][1] = "Panjyamon";
        DigiEvolution[i][1][2] = "Zudomon";
        i+=1;

        //Aquilamon
        //from
        DigiEvolution[i][0][0] = "Biyomon";
        DigiEvolution[i][0][1] = "Falcomon";
        DigiEvolution[i][0][2] = "Hawkmon";

        //for
        DigiEvolution[i][1][0] = "AeroVeedramon";
        DigiEvolution[i][1][1] = "Garudamon";
        DigiEvolution[i][1][2] = "Silphymon";
        DigiEvolution[i][1][3] = "Crowmon";
        DigiEvolution[i][1][4] = "HippoGryphonmon";
        i+=1;

        //Agunimon
        //from
        DigiEvolution[i][0][0] = "Agumon";
        DigiEvolution[i][0][1] = "Guilmon";

        //for
        DigiEvolution[i][1][0] = "BurningGreymon";
        DigiEvolution[i][1][1] = "Matadormon";
        DigiEvolution[i][1][2] = "SkullMeramon";
        DigiEvolution[i][1][3] = "RizeGreymon";
        i+=1;

        //Arcadiamon Champion
        //from
        DigiEvolution[i][0][0] = "Arcadiamon Rookie";
        DigiEvolution[i][0][1] = "Keramon";
        DigiEvolution[i][0][2] = "Dracmon";

        //for
        DigiEvolution[i][1][0] = "Arcadiamon Ultimate";
        DigiEvolution[i][1][1] = "SkullSatamon";
        DigiEvolution[i][1][2] = "Infermon";
        i+=1;

        //Ankylomon
        //from
        DigiEvolution[i][0][0] = "Armadillomon";
        DigiEvolution[i][0][1] = "Gotsumon";
        DigiEvolution[i][0][2] = "Gomamon";

        //for
        DigiEvolution[i][1][0] = "Meteormon";
        DigiEvolution[i][1][1] = "Shakkoumon";
        DigiEvolution[i][1][2] = "SkullGreymon";
        DigiEvolution[i][1][3] = "MagnaAngemon";
        DigiEvolution[i][1][4] = "Groundramon";
        i+=1;

        //Ikkakumon
        //from
        DigiEvolution[i][0][0] = "Gomamon";
        DigiEvolution[i][0][1] = "Syakomon";
        DigiEvolution[i][0][2] = "Terriermon";

        //for
        DigiEvolution[i][1][0] = "Zudomon";
        DigiEvolution[i][1][1] = "Whamon";
        DigiEvolution[i][1][2] = "MachGaogamon";
        DigiEvolution[i][1][3] = "Triceramon";
        i+=1;

        //Wizardmon
        //from
        DigiEvolution[i][0][0] = "Impmon";
        DigiEvolution[i][0][1] = "Keramon";
        DigiEvolution[i][0][2] = "Lopmon";

        //for
        DigiEvolution[i][1][0] = "Myotismon";
        DigiEvolution[i][1][1] = "SkullMeramon";
        DigiEvolution[i][1][2] = "Wisemon";
        DigiEvolution[i][1][3] = "Phantomon";
        i+=1;

        //Lobomon
        //from
        DigiEvolution[i][0][0] = "Gabumon";
        DigiEvolution[i][0][1] = "Kudamon";
        DigiEvolution[i][0][2] = "Veemon";

        //for
        DigiEvolution[i][1][0] = "KendoGarurumon";
        DigiEvolution[i][1][1] = "Knightmon";
        i+=1;

        //Woodmon
        //from
        DigiEvolution[i][0][0] = "Palmon";
        DigiEvolution[i][0][1] = "Lalamon";
        DigiEvolution[i][0][2] = "Renamon";
        DigiEvolution[i][0][3] = "Mushroomon";

        //for
        DigiEvolution[i][1][0] = "Cherrymon";
        DigiEvolution[i][1][1] = "Taomon";
        DigiEvolution[i][1][2] = "Pumpkinmon";
        i+=1;

        //Airdramon
        //from
        DigiEvolution[i][0][0] = "Biyomon";
        DigiEvolution[i][0][1] = "Hawkmon";
        DigiEvolution[i][0][2] = "Betamon";

        //for
        DigiEvolution[i][1][0] = "Wingdramon";
        DigiEvolution[i][1][1] = "MegaSeadramon";
        DigiEvolution[i][1][2] = "Megadramon";
        DigiEvolution[i][1][3] = "MetalGreymon";
        i+=1;

        //ExVeemon
        //from
        DigiEvolution[i][0][0] = "Patamon";
        DigiEvolution[i][0][1] = "Falcomon";
        DigiEvolution[i][0][2] = "Veemon";

        //for
        DigiEvolution[i][1][0] = "Paildramon";
        DigiEvolution[i][1][1] = "MagnaAngemon";
        DigiEvolution[i][1][2] = "RizeGreymon";
        DigiEvolution[i][1][3] = "Wingdramon";
        DigiEvolution[i][1][4] = "Dinobeemon";
        i+=1;

        //Angemon
        //from
        DigiEvolution[i][0][0] = "Kudamon";
        DigiEvolution[i][0][1] = "Patamon";
        DigiEvolution[i][0][2] = "Lucemon";

        //for
        DigiEvolution[i][1][0] = "Garudamon";
        DigiEvolution[i][1][1] = "Shakkoumon";
        DigiEvolution[i][1][2] = "MagnaAngemon";
        DigiEvolution[i][1][3] = "SaviorHuckmon";
        DigiEvolution[i][1][4] = "HippoGryphonmon";
        i+=1;

        //Ogremon
        //from
        DigiEvolution[i][0][0] = "Impmon";
        DigiEvolution[i][0][1] = "Gaomon";
        DigiEvolution[i][0][2] = "Goblimon";

        //for
        DigiEvolution[i][1][0] = "Digitamamon";
        DigiEvolution[i][1][1] = "SkullMeramon";
        DigiEvolution[i][1][2] = "WereGarurumon";
        DigiEvolution[i][1][3] = "SkullSatamon";
        i+=1;

        //Guardromon
        //from
        DigiEvolution[i][0][0] = "ToyAgumon";
        DigiEvolution[i][0][1] = "Dorumon";
        DigiEvolution[i][0][2] = "Hagurumon";

        //for
        DigiEvolution[i][1][0] = "Andromon";
        DigiEvolution[i][1][1] = "GrapLeomon";
        DigiEvolution[i][1][2] = "Datamon";
        DigiEvolution[i][1][3] = "MetalMamemon";
        DigiEvolution[i][1][4] = "CatchMamemon";
        i+=1;

        //Guardromon Gold
        //from
        DigiEvolution[i][0][0] = "ToyAgumon";
        DigiEvolution[i][0][1] = "Solarmon";
        DigiEvolution[i][0][2] = "FanBeemon";

        //for
        DigiEvolution[i][1][0] = "Grademon";
        DigiEvolution[i][1][1] = "Duramon";
        DigiEvolution[i][1][2] = "Andromon";
        DigiEvolution[i][1][3] = "Rapidmon Armor";
        DigiEvolution[i][1][4] = "Magnamon";
        i+=1;

        //GaoGamon
        //from
        DigiEvolution[i][0][0] = "Gaomon";
        DigiEvolution[i][0][1] = "Gazimon";
        DigiEvolution[i][0][2] = "Goblimon";

        //for
        DigiEvolution[i][1][0] = "GrapLeomon";
        DigiEvolution[i][1][1] = "MachGaogamon";
        DigiEvolution[i][1][2] = "WereGarurumon";
        i+=1;

        //Kabuterimon
        //from
        DigiEvolution[i][0][0] = "Tentomon";
        DigiEvolution[i][0][1] = "Biyomon";
        DigiEvolution[i][0][2] = "Wormmon";

        //for
        DigiEvolution[i][1][0] = "MegaKabuterimon";
        DigiEvolution[i][1][1] = "Cherrymon";
        DigiEvolution[i][1][2] = "Lilamon";
        i+=1;

        //ShellNumemon
        //from
        DigiEvolution[i][0][0] = "Otamamon";
        DigiEvolution[i][0][1] = "Syakomon";
        DigiEvolution[i][0][2] = "Betamon";

        //for
        DigiEvolution[i][1][0] = "ShogunGekomon";
        DigiEvolution[i][1][1] = "BlackKingNumemon";
        DigiEvolution[i][1][2] = "MegaSeadramon";
        i+=1;

        //Gargomon
        //from
        DigiEvolution[i][0][0] = "Gaomon";
        DigiEvolution[i][0][1] = "Terriermon";
        DigiEvolution[i][0][2] = "Lopmon";
        DigiEvolution[i][0][3] = "Sistermon Blanc";

        //for
        DigiEvolution[i][1][0] = "Antylamon";
        DigiEvolution[i][1][1] = "WarGrowlmon";
        DigiEvolution[i][1][2] = "Rapidmon";
        i+=1;

        //Garurumon
        //from
        DigiEvolution[i][0][0] = "Elecmon";
        DigiEvolution[i][0][1] = "Gabumon";
        DigiEvolution[i][0][2] = "Renamon";

        //for
        DigiEvolution[i][1][0] = "Zudomon";
        DigiEvolution[i][1][1] = "DoruGreymon";
        DigiEvolution[i][1][2] = "Panjyamon";
        DigiEvolution[i][1][3] = "WereGarurumon";
        i+=1;

        //Garurumon Black
        //from
        DigiEvolution[i][0][0] = "Elecmon";
        DigiEvolution[i][0][1] = "Gazimon";
        DigiEvolution[i][0][2] = "Gabumon BLK";

        //for
        DigiEvolution[i][1][0] = "BlueMeramon";
        DigiEvolution[i][1][1] = "MachGaogamon";
        DigiEvolution[i][1][2] = "WereGarurumon BLK";
        DigiEvolution[i][1][3] = "Pandamon";
        i+=1;

        //Kyubimon
        //from
        DigiEvolution[i][0][0] = "DemiDevimon";
        DigiEvolution[i][0][1] = "Biyomon";
        DigiEvolution[i][0][2] = "Renamon";

        //for
        DigiEvolution[i][1][0] = "Taomon";
        DigiEvolution[i][1][1] = "Monzaemon";
        DigiEvolution[i][1][2] = "LadyDevimon";
        i+=1;

        //Growlmon
        //from
        DigiEvolution[i][0][0] = "Agumon BLK";
        DigiEvolution[i][0][1] = "Guilmon";
        DigiEvolution[i][0][2] = "Goblimon";

        //for
        DigiEvolution[i][1][0] = "Gigadramon";
        DigiEvolution[i][1][1] = "WarGrowlmon";
        DigiEvolution[i][1][2] = "MetalGreymon";
        DigiEvolution[i][1][3] = "MetalTyrannomon";
        DigiEvolution[i][1][4] = "BurningGreymon";
        i+=1;

        //Kurisarimon
        //from
        DigiEvolution[i][0][0] = "Gazimon";
        DigiEvolution[i][0][1] = "Keramon";
        DigiEvolution[i][0][2] = "DemiDevimon";
        DigiEvolution[i][0][3] = "Arcadiamon Rookie";
        DigiEvolution[i][0][4] = "Monodramon";

        //for
        DigiEvolution[i][1][0] = "Infermon";
        DigiEvolution[i][1][1] = "Cyberdramon";
        DigiEvolution[i][1][2] = "Taomon";
        DigiEvolution[i][1][3] = "Arcadiamon Ultimate";
        i+=1;

        //Greymon
        //from
        DigiEvolution[i][0][0] = "Agumon";
        DigiEvolution[i][0][1] = "ToyAgumon";
        DigiEvolution[i][0][2] = "Hackmon";

        //for
        DigiEvolution[i][1][0] = "SkullGreymon";
        DigiEvolution[i][1][1] = "Megadramon";
        DigiEvolution[i][1][2] = "MetalGreymon";
        DigiEvolution[i][1][3] = "MetalGreymon Blue";
        i+=1;

        //Greymon Blue
        //from
        DigiEvolution[i][0][0] = "Agumon BLK";
        DigiEvolution[i][0][1] = "Guilmon";
        DigiEvolution[i][0][2] = "Goblimon";

        //for
        DigiEvolution[i][1][0] = "DoruGreymon";
        DigiEvolution[i][1][1] = "Knightmon";
        DigiEvolution[i][1][2] = "MetalGreymon Blue";
        DigiEvolution[i][1][3] = "Triceramon";
        i+=1;

        //Clockmon
        //from
        DigiEvolution[i][0][0] = "Gotsumon";
        DigiEvolution[i][0][1] = "Solarmon";
        DigiEvolution[i][0][2] = "ToyAgumon";
        DigiEvolution[i][0][3] = "Hagurumon";

        //for
        DigiEvolution[i][1][0] = "Andromon";
        DigiEvolution[i][1][1] = "Knightmon";
        DigiEvolution[i][1][2] = "Datamon";
        DigiEvolution[i][1][3] = "Wisemon";
        i+=1;

        //Kuwagamon
        //from
        DigiEvolution[i][0][0] = "Tentomon";
        DigiEvolution[i][0][1] = "Palmon";
        DigiEvolution[i][0][2] = "Wormmon";

        //for
        DigiEvolution[i][1][0] = "Okuwamon";
        DigiEvolution[i][1][1] = "CannonBeemon";
        DigiEvolution[i][1][2] = "Cherrymon";
        i+=1;

        //Gekomon
        //from
        DigiEvolution[i][0][0] = "Otamamon";
        DigiEvolution[i][0][1] = "Syakomon";
        DigiEvolution[i][0][2] = "Betamon";

        //for
        DigiEvolution[i][1][0] = "ShogunGekomon";
        DigiEvolution[i][1][1] = "Whamon";
        DigiEvolution[i][1][2] = "MegaSeadramon";
        i+=1;

        //Geremon
        //from
        DigiEvolution[i][0][0] = "Armadillomon";
        DigiEvolution[i][0][1] = "Elecmon";
        DigiEvolution[i][0][2] = "Solarmon";

        //for
        DigiEvolution[i][1][0] = "Etemon";
        DigiEvolution[i][1][1] = "SuperStarmon";
        DigiEvolution[i][1][2] = "MetalMamemon";
        i+=1;

        //Coredramon Blue
        //from
        DigiEvolution[i][0][0] = "Dracomon";
        DigiEvolution[i][0][1] = "Monodramon";

        //for
        DigiEvolution[i][1][0] = "Wingdramon";
        DigiEvolution[i][1][1] = "AeroVeedramon";
        DigiEvolution[i][1][2] = "BlueMeramon";
        i+=1;

        //Coredramon Green
        //from
        DigiEvolution[i][0][0] = "Goblimon";
        DigiEvolution[i][0][1] = "Dracomon";

        //for
        DigiEvolution[i][1][0] = "Groundramon";
        DigiEvolution[i][1][1] = "Triceramon";
        DigiEvolution[i][1][2] = "WarGrowlmon";
        i+=1;

        //GoldNumemon
        //from
        DigiEvolution[i][0][0] = "Armadillomon";
        DigiEvolution[i][0][1] = "Kudamon";
        DigiEvolution[i][0][2] = "Hagurumon";
        DigiEvolution[i][0][3] = "Zubamon";

        //for
        DigiEvolution[i][1][0] = "BlackKingNumemon";
        DigiEvolution[i][1][1] = "Vademon";
        DigiEvolution[i][1][2] = "PlatinumNumemon";
        i+=1;

        //Golemon
        //from
        DigiEvolution[i][0][0] = "Armadillomon";
        DigiEvolution[i][0][1] = "Gotsumon";
        DigiEvolution[i][0][2] = "Solarmon";

        //for
        DigiEvolution[i][1][0] = "Volcanomon";
        DigiEvolution[i][1][1] = "Meteormon";
        DigiEvolution[i][1][2] = "Pumpkinmon";
        i+=1;

        //Cyclonemon
        //from
        DigiEvolution[i][0][0] = "Agumon BLK";
        DigiEvolution[i][0][1] = "Armadillomon";
        DigiEvolution[i][0][2] = "Dorumon";

        //for
        DigiEvolution[i][1][0] = "DoruGreymon";
        DigiEvolution[i][1][1] = "Datamon";
        DigiEvolution[i][1][2] = "Megadramon";
        i+=1;

        //Sangloupmon
        //from
        DigiEvolution[i][0][0] = "Gaomon";
        DigiEvolution[i][0][1] = "Dracmon";
        DigiEvolution[i][0][2] = "Lunamon";

        //for
        DigiEvolution[i][1][0] = "KendoGarurumon";
        DigiEvolution[i][1][1] = "Matadormon";
        DigiEvolution[i][1][2] = "Myotismon";
        DigiEvolution[i][1][3] = "WereGarurumon BLK";
        i+=1;

        //Sunflowmon
        //from
        DigiEvolution[i][0][0] = "Tentomon";
        DigiEvolution[i][0][1] = "Palmon";
        DigiEvolution[i][0][2] = "Lalamon";
        DigiEvolution[i][0][3] = "Mushroomon";

        //for
        DigiEvolution[i][1][0] = "Angemon";
        DigiEvolution[i][1][1] = "Lilamon";
        DigiEvolution[i][1][2] = "Lillymon";
        i+=1;

        //Seadramon
        //from
        DigiEvolution[i][0][0] = "Otamamon";
        DigiEvolution[i][0][1] = "Syakomon";
        DigiEvolution[i][0][2] = "Betamon";

        //for
        DigiEvolution[i][1][0] = "ShogunGekomon";
        DigiEvolution[i][1][1] = "Whamon";
        DigiEvolution[i][1][2] = "MegaSeadramon";
        DigiEvolution[i][1][3] = "Hisyaryumon";
        i+=1;

        //Coelamon
        //from
        DigiEvolution[i][0][0] = "Otamamon";
        DigiEvolution[i][0][1] = "Syakomon";

        //for
        DigiEvolution[i][1][0] = "Dragomon";
        DigiEvolution[i][1][1] = "Andromon";
        DigiEvolution[i][1][2] = "MegaSeadramon";
        DigiEvolution[i][1][3] = "Hisyaryumon";
        i+=1;

        //GeoGreymon
        //from
        DigiEvolution[i][0][0] = "Agumon";
        DigiEvolution[i][0][1] = "Guilmon";
        DigiEvolution[i][0][2] = "Hackmon";

        //for
        DigiEvolution[i][1][0] = "Gigadramon";
        DigiEvolution[i][1][1] = "SkullGreymon";
        DigiEvolution[i][1][2] = "RizeGreymon";
        DigiEvolution[i][1][3] = "Groundramon";
        i+=1;

        //Sukamon
        //from
        DigiEvolution[i][0][0] = "Agumon";
        DigiEvolution[i][0][1] = "Elecmon";
        DigiEvolution[i][0][2] = "ToyAgumon";
        DigiEvolution[i][0][3] = "Chuumon";

        //for
        DigiEvolution[i][1][0] = "Etemon";
        DigiEvolution[i][1][1] = "SuperStarmon";
        DigiEvolution[i][1][2] = "Vademon";
        i+=1;

        //Starmon
        //from
        DigiEvolution[i][0][0] = "Gotsumon";
        DigiEvolution[i][0][1] = "Solarmon";
        DigiEvolution[i][0][2] = "ToyAgumon";
        DigiEvolution[i][0][3] = "Hagurumon";

        //for
        DigiEvolution[i][1][0] = "SuperStarmon";
        DigiEvolution[i][1][1] = "Mamemon";
        DigiEvolution[i][1][2] = "MetalMamemon";
        DigiEvolution[i][1][3] = "CatchMamemon";
        DigiEvolution[i][1][4] = "Crescemon";
        i+=1;

        //Stingmon
        //from
        DigiEvolution[i][0][0] = "Tentomon";
        DigiEvolution[i][0][1] = "Falcomon";
        DigiEvolution[i][0][2] = "Wormmon";
        DigiEvolution[i][0][3] = "FanBeemon";

        //for
        DigiEvolution[i][1][0] = "Infermon";
        DigiEvolution[i][1][1] = "Okuwamon";
        DigiEvolution[i][1][2] = "Paildramon";
        DigiEvolution[i][1][3] = "Dinobeemon";
        i+=1;

        //Strikedramon
        //from
        DigiEvolution[i][0][0] = "Gomamon";
        DigiEvolution[i][0][1] = "Veemon";
        DigiEvolution[i][0][2] = "Monodramon";

        //for
        DigiEvolution[i][1][0] = "SaviorHuckmon";
        DigiEvolution[i][1][1] = "Cyberdramon";
        DigiEvolution[i][1][2] = "WereGarurumon";
        i+=1;

        //Zubaeagermon
        //from
        DigiEvolution[i][0][0] = "Hackmon";
        DigiEvolution[i][0][1] = "Zubamon";

        //for
        DigiEvolution[i][1][0] = "KendoGarurumon";
        DigiEvolution[i][1][1] = "Duramon";
        DigiEvolution[i][1][2] = "Phantomon";
        i+=1;

        //Socerimon
        //from
        DigiEvolution[i][0][0] = "Impmon";
        DigiEvolution[i][0][1] = "Gomamon";
        DigiEvolution[i][0][2] = "Salamon";

        //for
        DigiEvolution[i][1][0] = "Antylamon";
        DigiEvolution[i][1][1] = "Piximon";
        DigiEvolution[i][1][2] = "Wisemon";
        i+=1;

        //Tankmon
        //from
        DigiEvolution[i][0][0] = "Agumon BLK";
        DigiEvolution[i][0][1] = "Armadillomon";
        DigiEvolution[i][0][2] = "Gotsumon";

        //for
        DigiEvolution[i][1][0] = "Andromon";
        DigiEvolution[i][1][1] = "Gigadramon";
        DigiEvolution[i][1][2] = "CannonBeemon";
        DigiEvolution[i][1][3] = "Knightmon";
        DigiEvolution[i][1][4] = "Volcanomon";
        i+=1;

        //MudFrigimon
        //from
        DigiEvolution[i][0][0] = "Palmon";
        DigiEvolution[i][0][1] = "Mushroomon";
        DigiEvolution[i][0][2] = "Lopmon";

        //for
        DigiEvolution[i][1][0] = "Pandamon";
        DigiEvolution[i][1][1] = "Meteormon";
        DigiEvolution[i][1][2] = "Pumpkinmon";
        i+=1;

        //Tyrannomon
        //from
        DigiEvolution[i][0][0] = "Agumon";
        DigiEvolution[i][0][1] = "Agumon BLK";
        DigiEvolution[i][0][2] = "Guilmon";

        //for
        DigiEvolution[i][1][0] = "Mamemon";
        DigiEvolution[i][1][1] = "Megadramon";
        DigiEvolution[i][1][2] = "MetalGreymon Blue";
        DigiEvolution[i][1][3] = "MetalTyrannomon";
        i+=1;

        //Gatomon
        //from
        DigiEvolution[i][0][0] = "Terriermon";
        DigiEvolution[i][0][1] = "Patamon";
        DigiEvolution[i][0][2] = "Salamon";
        DigiEvolution[i][0][3] = "Lunamon";

        //for
        DigiEvolution[i][1][0] = "Angewomon";
        DigiEvolution[i][1][1] = "Silphymon";
        DigiEvolution[i][1][2] = "Lillymon";
        DigiEvolution[i][1][3] = "Pandamon";
        i+=1;

        //Devimon
        //from
        DigiEvolution[i][0][0] = "DemiDevimon";
        DigiEvolution[i][0][1] = "Lucemon";
        DigiEvolution[i][0][2] = "Lopmon";
        DigiEvolution[i][0][3] = "Dracmon";

        //for
        DigiEvolution[i][1][0] = "Infermon";
        DigiEvolution[i][1][1] = "Myotismon";
        DigiEvolution[i][1][2] = "Meramon";
        DigiEvolution[i][1][3] = "MetalGreymon Blue";
        DigiEvolution[i][1][4] = "SkullSatamon";
        i+=1;

        //Turuiemon
        //from
        DigiEvolution[i][0][0] = "Renamon";
        DigiEvolution[i][0][1] = "Lopmon";

        //for
        DigiEvolution[i][1][0] = "Antylamon";
        DigiEvolution[i][1][1] = "Cyberdramon";
        DigiEvolution[i][1][2] = "Monzaemon";
        i+=1;

        //Togemon
        //from
        DigiEvolution[i][0][0] = "Gaomon";
        DigiEvolution[i][0][1] = "Palmon";
        DigiEvolution[i][0][2] = "Lalamon";
        DigiEvolution[i][0][3] = "FanBeemon";

        //for
        DigiEvolution[i][1][0] = "Pumpkinmon";
        DigiEvolution[i][1][1] = "MachGaogamon";
        DigiEvolution[i][1][2] = "Lillymon";
        i+=1;

        //Dorugamon
        //from
        DigiEvolution[i][0][0] = "Gazimon";
        DigiEvolution[i][0][1] = "Gabumon";
        DigiEvolution[i][0][2] = "Dorumon";
        DigiEvolution[i][0][3] = "Monodramon";

        //for
        DigiEvolution[i][1][0] = "Chirinmon";
        DigiEvolution[i][1][1] = "DoruGreymon";
        DigiEvolution[i][1][2] = "RizeGreymon";
        DigiEvolution[i][1][3] = "Grademon";
        i+=1;

        //Nanimon
        //from
        DigiEvolution[i][0][0] = "Elecmon";
        DigiEvolution[i][0][1] = "Gazimon";
        DigiEvolution[i][0][2] = "Goblimon";
        DigiEvolution[i][0][3] = "Chuumon";

        //for
        DigiEvolution[i][1][0] = "Meteormon";
        DigiEvolution[i][1][1] = "SuperStarmon";
        DigiEvolution[i][1][2] = "Digitamamon";
        i+=1;

        //Numemon
        //from
        DigiEvolution[i][0][0] = "Otamamon";
        DigiEvolution[i][0][1] = "Gabumon";
        DigiEvolution[i][0][2] = "Betamon";

        //for
        DigiEvolution[i][1][0] = "Etemon";
        DigiEvolution[i][1][1] = "BlackKingNumemon";
        DigiEvolution[i][1][2] = "Monzaemon";
        i+=1;

        //Birdramon
        //from
        DigiEvolution[i][0][0] = "Patamon";
        DigiEvolution[i][0][1] = "Biyomon";
        DigiEvolution[i][0][2] = "Hawkmon";

        //for
        DigiEvolution[i][1][0] = "AeroVeedramon";
        DigiEvolution[i][1][1] = "Garudamon";
        DigiEvolution[i][1][2] = "Chirinmon";
        DigiEvolution[i][1][3] = "Crowmon";
        DigiEvolution[i][1][4] = "BurningGreymon";
        DigiEvolution[i][1][5] = "HippoGryphonmon";
        i+=1;

        //BaoHuckmon
        //from
        DigiEvolution[i][0][0] = "Hackmon";
        DigiEvolution[i][0][1] = "Zubamon";
        DigiEvolution[i][0][2] = "Salamon";

        //for
        DigiEvolution[i][1][0] = "KendoGarurumon";
        DigiEvolution[i][1][1] = "SaviorHuckmon";
        DigiEvolution[i][1][2] = "RizeGreymon";
        i+=1;

        //Bakemon
        //from
        DigiEvolution[i][0][0] = "Impmon";
        DigiEvolution[i][0][1] = "Keramon";
        DigiEvolution[i][0][2] = "DemiDevimon";

        //for
        DigiEvolution[i][1][0] = "Myotismon";
        DigiEvolution[i][1][1] = "Pumpkinmon";
        DigiEvolution[i][1][2] = "BlueMeramon";
        DigiEvolution[i][1][3] = "LadyDevimon";
        DigiEvolution[i][1][4] = "Phantomon";
        DigiEvolution[i][1][5] = "Matadormon";
        i+=1;

        //Veedramon
        //from
        DigiEvolution[i][0][0] = "Gabumon";
        DigiEvolution[i][0][1] = "Veemon";
        DigiEvolution[i][0][2] = "Salamon";
        DigiEvolution[i][0][3] = "Dracomon";

        //for
        DigiEvolution[i][1][0] = "AeroVeedramon";
        DigiEvolution[i][1][1] = "Cyberdramon";
        DigiEvolution[i][1][2] = "WarGrowlmon";
        DigiEvolution[i][1][3] = "MetalTyrannomon";
        i+=1;

        //Hudiemon
        //from
        DigiEvolution[i][0][0] = "Wormmon";

        //for
        DigiEvolution[i][1][0] = "Lillymon";
        DigiEvolution[i][1][1] = "CannonBeemon";
        DigiEvolution[i][1][2] = "Lilamon";
        i+=1;

        //PlatinumSukamon
        //from
        DigiEvolution[i][0][0] = "Keramon";
        DigiEvolution[i][0][1] = "Hagurumon";
        DigiEvolution[i][0][2] = "Hackmon";

        //for
        DigiEvolution[i][1][0] = "Etemon";
        DigiEvolution[i][1][1] = "Vademon";
        DigiEvolution[i][1][2] = "MetalMamemon";
        DigiEvolution[i][1][3] = "CatchMamemon";
        i+=1;

        //BlackGatomon
        //from
        DigiEvolution[i][0][0] = "Impmon";
        DigiEvolution[i][0][1] = "Renamon";
        DigiEvolution[i][0][2] = "Lopmon";
        DigiEvolution[i][0][3] = "Chuumon";

        //for
        DigiEvolution[i][1][0] = "Cyberdramon";
        DigiEvolution[i][1][1] = "Knightmon";
        DigiEvolution[i][1][2] = "LadyDevimon";
        DigiEvolution[i][1][3] = "WereGarurumon";
        i+=1;

        //Vegiemon
        //from
        DigiEvolution[i][0][0] = "Gabumon BLK";
        DigiEvolution[i][0][1] = "Palmon";
        DigiEvolution[i][0][2] = "Betamon";
        DigiEvolution[i][0][3] = "Lalamon";
        DigiEvolution[i][0][4] = "Mushroomon";

        //for
        DigiEvolution[i][1][0] = "MegaKabuterimon";
        DigiEvolution[i][1][1] = "Digitamamon";
        DigiEvolution[i][1][2] = "Lilamon";
        i+=1;

        //Peckmon
        //from
        DigiEvolution[i][0][0] = "Kudamon";
        DigiEvolution[i][0][1] = "Falcomon";
        DigiEvolution[i][0][2] = "Hawkmon";

        //for
        DigiEvolution[i][1][0] = "Antylamon";
        DigiEvolution[i][1][1] = "Piximon";
        DigiEvolution[i][1][2] = "Crowmon";
        i+=1;

        //Meramon
        //from
        DigiEvolution[i][0][0] = "Agumon";
        DigiEvolution[i][0][1] = "Guilmon";
        DigiEvolution[i][0][2] = "Solarmon";
        DigiEvolution[i][0][3] = "Hawkmon";

        //for
        DigiEvolution[i][1][0] = "SkullMeramon";
        DigiEvolution[i][1][1] = "Panjyamon";
        DigiEvolution[i][1][2] = "BlueMeramon";
        DigiEvolution[i][1][3] = "Mamemon";
        DigiEvolution[i][1][4] = "BurningGreymon";
        DigiEvolution[i][1][5] = "Volcanomon";
        i+=1;

        //Monochromon
        //from
        DigiEvolution[i][0][0] = "Agumon BLK";
        DigiEvolution[i][0][1] = "Hackmon";

        //for
        DigiEvolution[i][1][0] = "Triceramon";
        DigiEvolution[i][1][1] = "SkullGreymon";
        DigiEvolution[i][1][2] = "MetalTyrannomon";
        i+=1;

        //Frigimon
        //from
        DigiEvolution[i][0][0] = "Gabumon";
        DigiEvolution[i][0][1] = "Gabumon BLK";
        DigiEvolution[i][0][2] = "Gomamon";
        DigiEvolution[i][0][3] = "Salamon";

        //for
        DigiEvolution[i][1][0] = "Angewomon";
        DigiEvolution[i][1][1] = "Zudomon";
        DigiEvolution[i][1][2] = "Monzaemon";
        DigiEvolution[i][1][3] = "Crescemon";
        i+=1;

        //Unimon
        //from
        DigiEvolution[i][0][0] = "Terriermon";
        DigiEvolution[i][0][1] = "Patamon";

        //for
        DigiEvolution[i][1][0] = "HippoGryphonmon";
        DigiEvolution[i][1][1] = "Piximon";
        DigiEvolution[i][1][2] = "MagnaAngemon";
        i+=1;

        //Raptordramon
        //from
        DigiEvolution[i][0][0] = "Dorumon";
        DigiEvolution[i][0][1] = "FanBeemon";
        DigiEvolution[i][0][2] = "Monodramon";
        DigiEvolution[i][0][3] = "Ryudamon";

        //for
        DigiEvolution[i][1][0] = "Grademon";
        DigiEvolution[i][1][1] = "Duramon";
        DigiEvolution[i][1][2] = "Gigadramon";
        DigiEvolution[i][1][3] = "DoruGreymon";
        i+=1;

        //Raremon
        //from
        DigiEvolution[i][0][0] = "Otamamon";
        DigiEvolution[i][0][1] = "Gabumon BLK";
        DigiEvolution[i][0][2] = "Chuumon";
        DigiEvolution[i][0][3] = "Dracmon";

        //for
        DigiEvolution[i][1][0] = "SkullSatamon";
        DigiEvolution[i][1][1] = "Dragomon";
        DigiEvolution[i][1][2] = "Phantomon";
        DigiEvolution[i][1][3] = "BlackKingNumemon";
        DigiEvolution[i][1][4] = "MetalGreymon Blue";
        i+=1;

        //Leomon
        //from
        DigiEvolution[i][0][0] = "Elecmon";
        DigiEvolution[i][0][1] = "Gaomon";
        DigiEvolution[i][0][2] = "Gazimon";
        DigiEvolution[i][0][3] = "Arcadiamon Rookie";

        //for
        DigiEvolution[i][1][0] = "Meteormon";
        DigiEvolution[i][1][1] = "GrapLeomon";
        DigiEvolution[i][1][2] = "Panjyamon";
        DigiEvolution[i][1][3] = "MetalGreymon";
        DigiEvolution[i][1][4] = "Grademon";
        i+=1;

        //Lekismon
        //from
        DigiEvolution[i][0][0] = "Renamon";
        DigiEvolution[i][0][1] = "Lunamon";
        DigiEvolution[i][0][2] = "Sistermon Blanc";

        //for
        DigiEvolution[i][1][0] = "Crescemon";
        DigiEvolution[i][1][1] = "Antylamon";
        DigiEvolution[i][1][2] = "MachGaogamon";
        i+=1;

        //Reppamon
        //from
        DigiEvolution[i][0][0] = "Gabumon BLK";
        DigiEvolution[i][0][1] = "Kudamon";
        DigiEvolution[i][0][2] = "Patamon";
        DigiEvolution[i][0][3] = "Salamon";
        DigiEvolution[i][0][4] = "Ryudamon";

        //for
        DigiEvolution[i][1][0] = "Chirinmon";
        DigiEvolution[i][1][1] = "Piximon";
        DigiEvolution[i][1][2] = "Rapidmon";
        i+=1;

        //Waspmon
        //from
        DigiEvolution[i][0][0] = "Tentomon";
        DigiEvolution[i][0][1] = "Dorumon";
        DigiEvolution[i][0][2] = "Wormmon";
        DigiEvolution[i][0][3] = "FanBeemon";

        //for
        DigiEvolution[i][1][0] = "MegaKabuterimon";
        DigiEvolution[i][1][1] = "Okuwamon";
        DigiEvolution[i][1][2] = "CannonBeemon";
        DigiEvolution[i][1][3] = "Rapidmon";
        i+=1;

        //MegaKabuterimon
        //from
        DigiEvolution[i][0][0] = "Kabuterimon";
        DigiEvolution[i][0][1] = "Vegiemon";
        DigiEvolution[i][0][2] = "Waspmon";

        //for
        DigiEvolution[i][1][0] = "GranKuwagamon";
        DigiEvolution[i][1][1] = "HerculesKabuterimon";
        DigiEvolution[i][1][2] = "Magnadramon";
        i+=1;

        //Arcadiamon Ultimate
        //from
        DigiEvolution[i][0][0] = "IceDevimon";
        DigiEvolution[i][0][1] = "Arcadiamon Champion";
        DigiEvolution[i][0][2] = "Kurisarimon";

        //for
        DigiEvolution[i][1][0] = "Arcadiamon Mega";
        DigiEvolution[i][1][1] = "Diaboromon";
        DigiEvolution[i][1][2] = "Creepymon";
        i+=1;

        //Antylamon
        //from
        DigiEvolution[i][0][0] = "Gargomon";
        DigiEvolution[i][0][1] = "Socerimon";
        DigiEvolution[i][0][2] = "Peckmon";
        DigiEvolution[i][0][3] = "Turuiemon";
        DigiEvolution[i][0][4] = "Lekismon";

        //for
        DigiEvolution[i][1][0] = "Kerpymon Good";
        DigiEvolution[i][1][1] = "Dianamon";
        DigiEvolution[i][1][2] = "Diaboromon";
        DigiEvolution[i][1][3] = "Kerpymon BLK";
        i+=1;

        //Andromon
        //from
        DigiEvolution[i][0][0] = "Guardromon";
        DigiEvolution[i][0][1] = "Clockmon";
        DigiEvolution[i][0][2] = "Tankmon";
        DigiEvolution[i][0][3] = "Guardromon(Gold)";
        DigiEvolution[i][0][4] = "Coelamon";

        //for
        DigiEvolution[i][1][0] = "Craniamon";
        DigiEvolution[i][1][1] = "TigerVespamon";
        DigiEvolution[i][1][2] = "HiAndromon";
        i+=1;

        //Meteormon
        //from
        DigiEvolution[i][0][0] = "Ankylomon";
        DigiEvolution[i][0][1] = "Nanimon";
        DigiEvolution[i][0][2] = "Leomon";
        DigiEvolution[i][0][3] = "Icemon";
        DigiEvolution[i][0][4] = "Golemon";
        DigiEvolution[i][0][5] = "MudFrigimon";

        //for
        DigiEvolution[i][1][0] = "Ebemon";
        DigiEvolution[i][1][1] = "Dianamon";
        DigiEvolution[i][1][2] = "MetalEtemon";
        i+=1;

        //Infermon
        //from
        DigiEvolution[i][0][0] = "Kurisarimon";
        DigiEvolution[i][0][1] = "Stingmon";
        DigiEvolution[i][0][2] = "Devimon";
        DigiEvolution[i][0][3] = "Arcadiamon Champion";

        //for
        DigiEvolution[i][1][0] = "VenomMyotismon";
        DigiEvolution[i][1][1] = "Diaboromon";
        DigiEvolution[i][1][2] = "Beelzemon";
        DigiEvolution[i][1][3] = "Arcadiamon Mega";
        i+=1;

        //Myotismon
        //from
        DigiEvolution[i][0][0] = "IceDevimon";
        DigiEvolution[i][0][1] = "Wizardmon";
        DigiEvolution[i][0][2] = "Devimon";
        DigiEvolution[i][0][3] = "Bakemon";
        DigiEvolution[i][0][4] = "Sangloupmon";

        //for
        DigiEvolution[i][1][0] = "VenomMyotismon";
        DigiEvolution[i][1][1] = "Barbamon";
        DigiEvolution[i][1][2] = "Piedmon";
        DigiEvolution[i][1][3] = "Arcadiamon Mega";
        DigiEvolution[i][1][4] = "GranDracmon";
        i+=1;

        //Wingdramon
        //from
        DigiEvolution[i][0][0] = "Airdramon";
        DigiEvolution[i][0][1] = "ExVeemon";
        DigiEvolution[i][0][2] = "Coredramon(Blue)";

        //for
        DigiEvolution[i][1][0] = "Slayerdramon";
        DigiEvolution[i][1][1] = "UlforceVeedramon";
        DigiEvolution[i][1][2] = "Dynasmon";
        i+=1;

        //BurningGreymon
        //from
        DigiEvolution[i][0][0] = "Agunimon";
        DigiEvolution[i][0][1] = "Growlmon";
        DigiEvolution[i][0][2] = "Birdramon";
        DigiEvolution[i][0][3] = "Meramon";

        //for
        DigiEvolution[i][1][0] = "KaiserGreymon";
        i+=1;

        //AeroVeedramon
        //from
        DigiEvolution[i][0][0] = "Aquilamon";
        DigiEvolution[i][0][1] = "Birdramon";
        DigiEvolution[i][0][2] = "Veedramon";
        DigiEvolution[i][0][3] = "Coredramon(Blue)";

        //for
        DigiEvolution[i][1][0] = "UlforceVeedramon";
        DigiEvolution[i][1][1] = "Dynasmon";
        DigiEvolution[i][1][2] = "Ravemon";
        DigiEvolution[i][1][3] = "Goldramon";
        i+=1;

        //Etemon
        //from
        DigiEvolution[i][0][0] = "Geremon";
        DigiEvolution[i][0][1] = "Sukamon";
        DigiEvolution[i][0][2] = "Numemon";
        DigiEvolution[i][0][3] = "PlatinumSukamon";

        //for
        DigiEvolution[i][1][0] = "Piedmon";
        DigiEvolution[i][1][1] = "PlatinumNumemon";
        i+=1;

        //Angewomon
        //from
        DigiEvolution[i][0][0] = "Sunflowmon";
        DigiEvolution[i][0][1] = "Gatomon";
        DigiEvolution[i][0][2] = "Frigimon";

        //for
        DigiEvolution[i][1][0] = "Ophanimon";
        DigiEvolution[i][1][1] = "Magnadramon";
        DigiEvolution[i][1][2] = "Mastemon";
        DigiEvolution[i][1][3] = "Valkyrimon";
        i+=1;

        //Okuwamon
        //from
        DigiEvolution[i][0][0] = "Kuwagamon";
        DigiEvolution[i][0][1] = "Stingmon";
        DigiEvolution[i][0][2] = "Waspmon";

        //for
        DigiEvolution[i][1][0] = "GranKuwagamon";
        DigiEvolution[i][1][1] = "Diaboromon";
        DigiEvolution[i][1][2] = "HerculesKabuterimon";
        i+=1;

        //Garudamon
        //from
        DigiEvolution[i][0][0] = "Aquilamon";
        DigiEvolution[i][0][1] = "Angemon";
        DigiEvolution[i][0][2] = "Birdramon";

        //for
        DigiEvolution[i][1][0] = "Justimon";
        DigiEvolution[i][1][1] = "Hououmon";
        DigiEvolution[i][1][2] = "Ravemon";
        DigiEvolution[i][1][3] = "Varodurumon";
        DigiEvolution[i][1][4] = "Gryphonmon";
        i+=1;

        //KendoGarurumon
        //from
        DigiEvolution[i][0][0] = "Lobomon";
        DigiEvolution[i][0][1] = "Sangloupmon";
        DigiEvolution[i][0][2] = "Zubaeagermon";
        DigiEvolution[i][0][3] = "BaoHuckmon";

        //for
        DigiEvolution[i][1][0] = "MagnaGarurumon";
        i+=1;

        //Gigadramon
        //from
        DigiEvolution[i][0][0] = "Growlmon";
        DigiEvolution[i][0][1] = "GeoGreymon";
        DigiEvolution[i][0][2] = "Tankmon";
        DigiEvolution[i][0][3] = "Raptordramon";

        //for
        DigiEvolution[i][1][0] = "GroundLocomon";
        DigiEvolution[i][1][1] = "Machinedramon";
        DigiEvolution[i][1][2] = "MetalSeadramon";
        DigiEvolution[i][1][3] = "Darkdramon";
        DigiEvolution[i][1][4] = "Dorugoramon";
        DigiEvolution[i][1][5] = "Megidramon";
        i+=1;

        //CatchMamemon
        //from
        DigiEvolution[i][0][0] = "Guardromon";
        DigiEvolution[i][0][1] = "Starmon";
        DigiEvolution[i][0][2] = "PlatinumSukamon";

        //for
        DigiEvolution[i][1][0] = "Justimon";
        DigiEvolution[i][1][1] = "Puppetmon";
        DigiEvolution[i][1][2] = "PrinceMamemon";
        i+=1;

        //CannonBeemon
        //from
        DigiEvolution[i][0][0] = "Kuwagamon";
        DigiEvolution[i][0][1] = "Tankmon";
        DigiEvolution[i][0][2] = "Waspmon";
        DigiEvolution[i][0][3] = "Ginryumon";
        DigiEvolution[i][0][4] = "Hudiemon";

        //for
        DigiEvolution[i][1][0] = "GroundLocomon";
        DigiEvolution[i][1][1] = "MegaGargomon";
        DigiEvolution[i][1][2] = "TigerVespamon";
        i+=1;

        //Groundramon
        //from
        DigiEvolution[i][0][0] = "Ankylomon";
        DigiEvolution[i][0][1] = "Coredramon(Green)";
        DigiEvolution[i][0][2] = "GeoGreymon";

        //for
        DigiEvolution[i][1][0] = "Breakdramon";
        DigiEvolution[i][1][1] = "Megidramon";
        DigiEvolution[i][1][2] = "Vikemon";
        i+=1;

        //GrapLeomon
        //from
        DigiEvolution[i][0][0] = "Guardromon";
        DigiEvolution[i][0][1] = "GaoGamon";
        DigiEvolution[i][0][2] = "Leomon";

        //for
        DigiEvolution[i][1][0] = "SaberLeomon";
        DigiEvolution[i][1][1] = "Leopardmon";
        DigiEvolution[i][1][2] = "BanchoLeomon";
        DigiEvolution[i][1][3] = "PileVolcamon";
        i+=1;

        //Grademon
        //from
        DigiEvolution[i][0][0] = "Guardromon(Gold)";
        DigiEvolution[i][0][1] = "Dorugamon";
        DigiEvolution[i][0][2] = "Raptordramon";
        DigiEvolution[i][0][3] = "Leomon";

        //for
        DigiEvolution[i][1][0] = "Durandamon";
        DigiEvolution[i][1][1] = "Dorugoramon";
        DigiEvolution[i][1][2] = "Alphamon";
        DigiEvolution[i][1][3] = "TigerVespamon";
        DigiEvolution[i][1][4] = "Ouryumon";
        i+=1;

        //Crescemon
        //from
        DigiEvolution[i][0][0] = "Starmon";
        DigiEvolution[i][0][1] = "Frigimon";
        DigiEvolution[i][0][2] = "Lekismon";

        //for
        DigiEvolution[i][1][0] = "Kerpymon Good";
        DigiEvolution[i][1][1] = "Kentaurosmon";
        DigiEvolution[i][1][2] = "Dianamon";
        i+=1;

        //Cyberdramon
        //from
        DigiEvolution[i][0][0] = "Kurisarimon";
        DigiEvolution[i][0][1] = "Veedramon";
        DigiEvolution[i][0][2] = "BlackGatomon";
        DigiEvolution[i][0][3] = "Strikedramon";
        DigiEvolution[i][0][4] = "Turuiemon";

        //for
        DigiEvolution[i][1][0] = "Alphamon";
        DigiEvolution[i][1][1] = "Justimon";
        DigiEvolution[i][1][2] = "Titamon";
        i+=1;

        //Shakkoumon
        //from
        DigiEvolution[i][0][0] = "Ankylomon";
        DigiEvolution[i][0][1] = "Angemon";

        //for
        DigiEvolution[i][1][0] = "Vikemon";
        DigiEvolution[i][1][1] = "ChaosGallantmon";
        DigiEvolution[i][1][2] = "Kerpymon Good";
        i+=1;

        //Cherrymon
        //from
        DigiEvolution[i][0][0] = "IceDevimon";
        DigiEvolution[i][0][1] = "Woodmon";
        DigiEvolution[i][0][2] = "Kabuterimon";
        DigiEvolution[i][0][3] = "Kuwagamon";

        //for
        DigiEvolution[i][1][0] = "Kuzuhamon";
        DigiEvolution[i][1][1] = "GranKuwagamon";
        DigiEvolution[i][1][2] = "Puppetmon";
        i+=1;

        //Silphymon
        //from
        DigiEvolution[i][0][0] = "Aquilamon";
        DigiEvolution[i][0][1] = "Gatomon";

        //for
        DigiEvolution[i][1][0] = "Sakuyamon";
        DigiEvolution[i][1][1] = "Dynasmon";
        DigiEvolution[i][1][2] = "Hououmon";
        DigiEvolution[i][1][3] = "Valkyrimon";
        DigiEvolution[i][1][4] = "Gryphonmon";
        i+=1;

        //SuperStarmon
        //from
        DigiEvolution[i][0][0] = "Geremon";
        DigiEvolution[i][0][1] = "Sukamon";
        DigiEvolution[i][0][2] = "Starmon";
        DigiEvolution[i][0][3] = "Nanimon";

        //for
        DigiEvolution[i][1][0] = "Gankoomon";
        DigiEvolution[i][1][1] = "Justimon";
        DigiEvolution[i][1][2] = "PlatinumNumemon";
        i+=1;

        //SkullGreymon
        //from
        DigiEvolution[i][0][0] = "Ankylomon";
        DigiEvolution[i][0][1] = "Greymon";
        DigiEvolution[i][0][2] = "GeoGreymon";
        DigiEvolution[i][0][3] = "Monochromon";

        //for
        DigiEvolution[i][1][0] = "ShineGreymon";
        DigiEvolution[i][1][1] = "Titamon";
        DigiEvolution[i][1][2] = "Creepymon";
        i+=1;

        //SkullSatamon
        //from
        DigiEvolution[i][0][0] = "Arcadiamon Champion";
        DigiEvolution[i][0][1] = "Ogremon";
        DigiEvolution[i][0][2] = "Devimon";
        DigiEvolution[i][0][3] = "Raremon";

        //for
        DigiEvolution[i][1][0] = "GranDracmon";
        DigiEvolution[i][1][1] = "Diaboromon";
        DigiEvolution[i][1][2] = "Creepymon";
        i+=1;

        //Zudomon
        //from
        DigiEvolution[i][0][0] = "Ikkakumon";
        DigiEvolution[i][0][1] = "Garurumon";
        DigiEvolution[i][0][2] = "Frigimon";
        DigiEvolution[i][0][3] = "Icemon";

        //for
        DigiEvolution[i][1][0] = "Vikemon";
        DigiEvolution[i][1][1] = "MarineAngemon";
        DigiEvolution[i][1][2] = "MetalGarurumon";
        DigiEvolution[i][1][3] = "Plesiomon";
        i+=1;

        //SaviorHuckmon
        //from
        DigiEvolution[i][0][0] = "Angemon";
        DigiEvolution[i][0][1] = "Strikedramon";
        DigiEvolution[i][0][2] = "BaoHuckmon";

        //for
        DigiEvolution[i][1][0] = "Slayerdramon";
        DigiEvolution[i][1][1] = "Valkyrimon";
        DigiEvolution[i][1][2] = "Jesmon";
        i+=1;

        //Taomon
        //from
        DigiEvolution[i][0][0] = "Woodmon";
        DigiEvolution[i][0][1] = "Kyubimon";
        DigiEvolution[i][0][2] = "Kurisarimon";

        //for
        DigiEvolution[i][1][0] = "Kuzuhamon";
        DigiEvolution[i][1][1] = "Sakuyamon";
        DigiEvolution[i][1][2] = "Dianamon";
        i+=1;

        //Dragomon
        //from
        DigiEvolution[i][0][0] = "IceDevimon";
        DigiEvolution[i][0][1] = "Coelamon";
        DigiEvolution[i][0][2] = "Raremon";

        //for
        DigiEvolution[i][1][0] = "Neptunemon";
        DigiEvolution[i][1][1] = "Ebemon";
        DigiEvolution[i][1][2] = "Leviamon";
        i+=1;

        //Chirinmon
        //from
        DigiEvolution[i][0][0] = "Dorugamon";
        DigiEvolution[i][0][1] = "Birdramon";
        DigiEvolution[i][0][2] = "Reppamon";

        //for
        DigiEvolution[i][1][0] = "Kentaurosmon";
        DigiEvolution[i][1][1] = "Seraphimon";
        DigiEvolution[i][1][2] = "MetalGarurumon";
        i+=1;

        //DinoBeemon
        //from
        DigiEvolution[i][0][0] = "ExVeemon";
        DigiEvolution[i][0][1] = "Stingmon";

        //for
        DigiEvolution[i][1][0] = "Imperialdramon DM";
        DigiEvolution[i][1][1] = "GranKuwagamon";
        i+=1;

        //Digitamamon
        //from
        DigiEvolution[i][0][0] = "Ogremon";
        DigiEvolution[i][0][1] = "Nanimon";
        DigiEvolution[i][0][2] = "Vegiemon";

        //for
        DigiEvolution[i][1][0] = "Titamon";
        DigiEvolution[i][1][1] = "Belphemon SM";
        DigiEvolution[i][1][2] = "Minervamon";
        i+=1;

        //SkullMeramon
        //from
        DigiEvolution[i][0][0] = "Wizardmon";
        DigiEvolution[i][0][1] = "Ogremon";
        DigiEvolution[i][0][2] = "Meramon";
        DigiEvolution[i][0][3] = "Agunimon";

        //for
        DigiEvolution[i][1][0] = "Gankoomon";
        DigiEvolution[i][1][1] = "Beelzemon";
        DigiEvolution[i][1][2] = "Boltmon";
        i+=1;

        //Duramon
        //from
        DigiEvolution[i][0][0] = "Guardromon(Gold)";
        DigiEvolution[i][0][1] = "Zubaeagermon";
        DigiEvolution[i][0][2] = "Raptordramon";
        //for
        DigiEvolution[i][1][0] = "Durandamon";
        DigiEvolution[i][1][1] = "TigerVespamon";
        DigiEvolution[i][1][2] = "Jesmon";
        i+=1;

        //ShogunGekomon
        //from
        DigiEvolution[i][0][0] = "ShellNumemon";
        DigiEvolution[i][0][1] = "Gekomon";
        DigiEvolution[i][0][2] = "Seadramon";

        //for
        DigiEvolution[i][1][0] = "Vikemon";
        DigiEvolution[i][1][1] = "Plesiomon";
        DigiEvolution[i][1][2] = "Leviamon";
        DigiEvolution[i][1][3] = "KingEtemon";
        i+=1;

        //Triceramon
        //from
        DigiEvolution[i][0][0] = "Ikkakumon";
        DigiEvolution[i][0][1] = "Greymon(Blue)";
        DigiEvolution[i][0][2] = "Coredramon(Green)";
        DigiEvolution[i][0][3] = "Monochromon";

        //for
        DigiEvolution[i][1][0] = "Breakdramon";
        DigiEvolution[i][1][1] = "GranKuwagamon";
        DigiEvolution[i][1][2] = "SaberLeomon";
        i+=1;

        //DoruGreymon
        //from
        DigiEvolution[i][0][0] = "Garurumon";
        DigiEvolution[i][0][1] = "Greymon(Blue)";
        DigiEvolution[i][0][2] = "Cyclonemon";
        DigiEvolution[i][0][3] = "Dorugamon";
        DigiEvolution[i][0][4] = "Raptordramon";

        //for
        DigiEvolution[i][1][0] = "Alphamon";
        DigiEvolution[i][1][1] = "Kentaurosmon";
        DigiEvolution[i][1][2] = "Dorugoramon";
        i+=1;

        //Knightmon
        //from
        DigiEvolution[i][0][0] = "Greymon(Blue)";
        DigiEvolution[i][0][1] = "Clockmon";
        DigiEvolution[i][0][2] = "Tankmon";
        DigiEvolution[i][0][3] = "BlackGatomon";
        DigiEvolution[i][0][4] = "Lobomon";

        //for
        DigiEvolution[i][1][0] = "Craniamon";
        DigiEvolution[i][1][1] = "Leopardmon";
        DigiEvolution[i][1][2] = "Crusadermon";
        DigiEvolution[i][1][3] = "Durandamon";
        i+=1;

        //Datamon
        //from
        DigiEvolution[i][0][0] = "Guardromon";
        DigiEvolution[i][0][1] = "Clockmon";
        DigiEvolution[i][0][2] = "Cyclonemon";

        //for
        DigiEvolution[i][1][0] = "GroundLocomon";
        DigiEvolution[i][1][1] = "Machinedramon";
        DigiEvolution[i][1][2] = "MetalGarurumon BLK";
        i+=1;

        //Paildramon
        //from
        DigiEvolution[i][0][0] = "ExVeemon";
        DigiEvolution[i][0][1] = "Stingmon";

        //for
        DigiEvolution[i][1][0] = "Imperialdramon DM";
        i+=1;

        //Panjyamon
        //from
        DigiEvolution[i][0][0] = "Garurumon";
        DigiEvolution[i][0][1] = "Meramon";
        DigiEvolution[i][0][2] = "Leomon";
        DigiEvolution[i][0][3] = "Icemon";

        //for
        DigiEvolution[i][1][0] = "SaberLeomon";
        DigiEvolution[i][1][1] = "BanchoLeomon";
        DigiEvolution[i][1][2] = "MirageGaogamon";
        i+=1;

        //Pandamon
        //from
        DigiEvolution[i][0][0] = "Garurumon BLK";
        DigiEvolution[i][0][1] = "MudFrigimon";
        DigiEvolution[i][0][2] = "Gatomon";
        DigiEvolution[i][0][3] = "Sistermon Ciel";

        //for
        DigiEvolution[i][1][0] = "KingEtemon";
        DigiEvolution[i][1][1] = "Justimon";
        DigiEvolution[i][1][2] = "BanchoLeomon";
        i+=1;

        //Pumpkinmon
        //from
        DigiEvolution[i][0][0] = "Woodmon";
        DigiEvolution[i][0][1] = "Togemon";
        DigiEvolution[i][0][2] = "Bakemon";
        DigiEvolution[i][0][3] = "Golemon";
        DigiEvolution[i][0][4] = "MudFrigimon";

        //for
        DigiEvolution[i][1][0] = "Puppetmon";
        DigiEvolution[i][1][1] = "Boltmon";
        DigiEvolution[i][1][2] = "Rosemon";
        i+=1;

        //Piximon
        //from
        DigiEvolution[i][0][0] = "Socerimon";
        DigiEvolution[i][0][1] = "Peckmon";
        DigiEvolution[i][0][2] = "Reppamon";
        DigiEvolution[i][0][3] = "Unimon";

        //for
        DigiEvolution[i][1][0] = "Ophanimon";
        DigiEvolution[i][1][1] = "Hououmon";
        DigiEvolution[i][1][2] = "MarineAngemon";
        i+=1;

        //HippoGryphonmon
        //from
        DigiEvolution[i][0][0] = "Aquilamon";
        DigiEvolution[i][0][1] = "Angemon";
        DigiEvolution[i][0][2] = "Birdramon";
        DigiEvolution[i][0][3] = "Unimon";

        //for
        DigiEvolution[i][1][0] = "Varodurumon";
        DigiEvolution[i][1][1] = "Gryphonmon";
        DigiEvolution[i][1][2] = "Seraphimon";
        i+=1;

        //Phantomon
        //from
        DigiEvolution[i][0][0] = "Wizardmon";
        DigiEvolution[i][0][1] = "Zubaeagermon";
        DigiEvolution[i][0][2] = "Bakemon";
        DigiEvolution[i][0][3] = "Raremon";

        //for
        DigiEvolution[i][1][0] = "VenomMyotismon";
        DigiEvolution[i][1][1] = "Titamon";
        DigiEvolution[i][1][2] = "Barbamon";
        i+=1;

        //BlackKingNumemon
        //from
        DigiEvolution[i][0][0] = "ShellNumemon";
        DigiEvolution[i][0][1] = "GoldNumemon";
        DigiEvolution[i][0][2] = "Numemon";
        DigiEvolution[i][0][3] = "Raremon";

        //for
        DigiEvolution[i][1][0] = "PlatinumNumemon";
        DigiEvolution[i][1][1] = "PrinceMamemon";
        DigiEvolution[i][1][2] = "MetalEtemon";
        i+=1;

        //BlueMeramon
        //from
        DigiEvolution[i][0][0] = "Garurumon BLK";
        DigiEvolution[i][0][1] = "Devimon";
        DigiEvolution[i][0][2] = "Bakemon";
        DigiEvolution[i][0][3] = "Meramon";
        DigiEvolution[i][0][4] = "Coredramon(Blue)";

        //for
        DigiEvolution[i][1][0] = "Creepymon";
        DigiEvolution[i][1][1] = "Barbamon";
        DigiEvolution[i][1][2] = "Boltmon";
        DigiEvolution[i][1][3] = "Darkdramon";
        i+=1;

        //Vademon
        //from
        DigiEvolution[i][0][0] = "GoldNumemon";
        DigiEvolution[i][0][1] = "Sukamon";
        DigiEvolution[i][0][2] = "PlatinumSukamon";

        //for
        DigiEvolution[i][1][0] = "Ebemon";
        DigiEvolution[i][1][1] = "HiAndromon";
        DigiEvolution[i][1][2] = "HerculesKabuterimon";
        i+=1;

        //Whamon
        //from
        DigiEvolution[i][0][0] = "Ikkakumon";
        DigiEvolution[i][0][1] = "Gekomon";
        DigiEvolution[i][0][2] = "Seadramon";

        //for
        DigiEvolution[i][1][0] = "Plesiomon";
        DigiEvolution[i][1][1] = "MarineAngemon";
        DigiEvolution[i][1][2] = "MetalSeadramon";
        DigiEvolution[i][1][3] = "Neptunemon";
        i+=1;

        //MagnaAngemon
        //from
        DigiEvolution[i][0][0] = "Ankylomon";
        DigiEvolution[i][0][1] = "ExVeemon";
        DigiEvolution[i][0][2] = "Angemon";
        DigiEvolution[i][0][3] = "Unimon";
        //for
        DigiEvolution[i][1][0] = "ShineGreymon";
        DigiEvolution[i][1][1] = "Seraphimon";
        DigiEvolution[i][1][2] = "Crusadermon";
        DigiEvolution[i][1][3] = "Valkyrimon";
        DigiEvolution[i][1][4] = "Goldramon";
        i+=1;

        //Volcanomon
        //from
        DigiEvolution[i][0][0] = "Golemon";
        DigiEvolution[i][0][1] = "Tankmon";
        DigiEvolution[i][0][2] = "Meramon";

        //for
        DigiEvolution[i][1][0] = "PileVolcamon";
        DigiEvolution[i][1][1] = "Gankoomon";
        DigiEvolution[i][1][2] = "MetalEtemon";
        i+=1;

        //Matadormon
        //from
        DigiEvolution[i][0][0] = "Sangloupmon";
        DigiEvolution[i][0][1] = "Bakemon";
        DigiEvolution[i][0][2] = "Agunimon";

        //for
        DigiEvolution[i][1][0] = "GranDracmon";
        DigiEvolution[i][1][1] = "VenomMyotismon";
        DigiEvolution[i][1][2] = "Piedmon";
        i+=1;

        //MachGaogamon
        //from
        DigiEvolution[i][0][0] = "Ikkakumon";
        DigiEvolution[i][0][1] = "GaoGamon";
        DigiEvolution[i][0][2] = "Garurumon BLK";
        DigiEvolution[i][0][3] = "Togemon";
        DigiEvolution[i][0][4] = "Lekismon";

        //for
        DigiEvolution[i][1][0] = "MegaGargomon";
        DigiEvolution[i][1][1] = "BanchoLeomon";
        DigiEvolution[i][1][2] = "MirageGaogamon";
        DigiEvolution[i][1][3] = "Merukimon";
        i+=1;

        //Mamemon
        //from
        DigiEvolution[i][0][0] = "Starmon";
        DigiEvolution[i][0][1] = "Tyrannomon";
        DigiEvolution[i][0][2] = "Meramon";

        //for
        DigiEvolution[i][1][0] = "WarGreymon";
        DigiEvolution[i][1][1] = "Puppetmon";
        DigiEvolution[i][1][2] = "PrinceMamemon";
        i+=1;

        //MegaSeadramon
        //from
        DigiEvolution[i][0][0] = "ShellNumemon";
        DigiEvolution[i][0][1] = "Gekomon";
        DigiEvolution[i][0][2] = "Seadramon";
        DigiEvolution[i][0][3] = "Airdramon";
        DigiEvolution[i][0][4] = "Coelamon";
        DigiEvolution[i][0][5] = "Ginryumon";

        //for
        DigiEvolution[i][1][0] = "Plesiomon";
        DigiEvolution[i][1][1] = "MetalSeadramon";
        DigiEvolution[i][1][2] = "Leviamon";
        DigiEvolution[i][1][3] = "Neptunemon";
        i+=1;

        //Megadramon
        //from
        DigiEvolution[i][0][0] = "Greymon";
        DigiEvolution[i][0][1] = "Cyclonemon";
        DigiEvolution[i][0][2] = "Tyrannomon";
        DigiEvolution[i][0][3] = "Airdramon";

        //for
        DigiEvolution[i][1][0] = "UlforceVeedramon";
        DigiEvolution[i][1][1] = "BlackWarGreymon";
        DigiEvolution[i][1][2] = "Machinedramon";
        DigiEvolution[i][1][3] = "Goldramon";
        DigiEvolution[i][1][4] = "Megidramon";
        i+=1;

        //WarGrowlmon
        //from
        DigiEvolution[i][0][0] = "Gargomon";
        DigiEvolution[i][0][1] = "Growlmon";
        DigiEvolution[i][0][2] = "Veedramon";
        DigiEvolution[i][0][3] = "Coredramon(Green)";

        //for
        DigiEvolution[i][1][0] = "ChaosGallantmon";
        DigiEvolution[i][1][1] = "Gallantmon";
        DigiEvolution[i][1][2] = "RustTyranomon";
        DigiEvolution[i][1][3] = "Darkdramon";
        DigiEvolution[i][1][4] = "Megidramon";
        i+=1;

        //Metal Greymon
        //from
        DigiEvolution[i][0][0] = "Growlmon";
        DigiEvolution[i][0][1] = "Greymon";
        DigiEvolution[i][0][2] = "Leomon";
        DigiEvolution[i][0][3] = "Airdramon";

        //for
        DigiEvolution[i][1][0] = "WarGreymon";
        DigiEvolution[i][1][1] = "Gaiomon";
        DigiEvolution[i][1][2] = "RustTyranomon";
        i+=1;

        //MetalGreymon Blue
        //from
        DigiEvolution[i][0][0] = "Greymon";
        DigiEvolution[i][0][1] = "Greymon(Blue)";
        DigiEvolution[i][0][2] = "Tyrannomon";
        DigiEvolution[i][0][3] = "Devimon";
        DigiEvolution[i][0][4] = "Raremon";

        //for
        DigiEvolution[i][1][0] = "WarGreymon";
        DigiEvolution[i][1][1] = "Gaiomon";
        DigiEvolution[i][1][2] = "BlackWarGreymon";
        DigiEvolution[i][1][3] = "Kerpymon BLK";
        i+=1;

        //MetalTyrannomon
        //from
        DigiEvolution[i][0][0] = "Growlmon";
        DigiEvolution[i][0][1] = "Tyrannomon";
        DigiEvolution[i][0][2] = "Veedramon";
        DigiEvolution[i][0][3] = "Monochromon";

        //for
        DigiEvolution[i][1][0] = "BlackWarGreymon";
        DigiEvolution[i][1][1] = "Gallantmon";
        DigiEvolution[i][1][2] = "RustTyranomon";
        DigiEvolution[i][1][3] = "Breakdramon";
        i+=1;

        //MetalMamemon
        //from
        DigiEvolution[i][0][0] = "Guardromon";
        DigiEvolution[i][0][1] = "Geremon";
        DigiEvolution[i][0][2] = "Starmon";
        DigiEvolution[i][0][3] = "PlatinumSukamon";

        //for
        DigiEvolution[i][1][0] = "Ebemon";
        DigiEvolution[i][1][1] = "HiAndromon";
        DigiEvolution[i][1][2] = "PrinceMamemon";
        i+=1;

        //Monzaemon
        //from
        DigiEvolution[i][0][0] = "Kyubimon";
        DigiEvolution[i][0][1] = "Numemon";
        DigiEvolution[i][0][2] = "Frigimon";
        DigiEvolution[i][0][3] = "Turuiemon";

        //for
        DigiEvolution[i][1][0] = "SaberLeomon";
        DigiEvolution[i][1][1] = "Sakuyamon";
        DigiEvolution[i][1][2] = "Minervamon";
        i+=1;

        //Crowmon
        //from
        DigiEvolution[i][0][0] = "Aquilamon";
        DigiEvolution[i][0][1] = "Birdramon";
        DigiEvolution[i][0][2] = "Peckmon";

        //for
        DigiEvolution[i][1][0] = "Kuzuhamon";
        DigiEvolution[i][1][1] = "Minervamon";
        DigiEvolution[i][1][2] = "Ravemon";
        DigiEvolution[i][1][3] = "Varodurumon";
        DigiEvolution[i][1][4] = "Ouryumon";
        i+=1;

        //RizeGreymon
        //from
        DigiEvolution[i][0][0] = "ExVeemon";
        DigiEvolution[i][0][1] = "GeoGreymon";
        DigiEvolution[i][0][2] = "Dorugamon";
        DigiEvolution[i][0][3] = "Agunimon";
        DigiEvolution[i][0][4] = "BaoHuckmon";

        //for
        DigiEvolution[i][1][0] = "Gaiomon";
        DigiEvolution[i][1][1] = "ShineGreymon";
        DigiEvolution[i][1][2] = "Slayerdramon";
        i+=1;

        //Lilamon
        //from
        DigiEvolution[i][0][0] = "Kabuterimon";
        DigiEvolution[i][0][1] = "Sunflowmon";
        DigiEvolution[i][0][2] = "Vegiemon";
        DigiEvolution[i][0][3] = "Hudiemon";

        //for
        DigiEvolution[i][1][0] = "Lilithmon";
        DigiEvolution[i][1][1] = "Rosemon";
        DigiEvolution[i][1][2] = "Lotosmon";
        i+=1;

        //Rapidmon
        //from
        DigiEvolution[i][0][0] = "Gargomon";
        DigiEvolution[i][0][1] = "Reppamon";
        DigiEvolution[i][0][2] = "Waspmon";

        //for
        DigiEvolution[i][1][0] = "MegaGargomon";
        DigiEvolution[i][1][1] = "TigerVespamon";
        DigiEvolution[i][1][2] = "MetalGarurumon BLK";
        i+=1;

        //Lillymon
        //from
        DigiEvolution[i][0][0] = "Sunflowmon";
        DigiEvolution[i][0][1] = "Gatomon";
        DigiEvolution[i][0][2] = "Togemon";
        DigiEvolution[i][0][3] = "Hudiemon";

        //for
        DigiEvolution[i][1][0] = "Magnadramon";
        DigiEvolution[i][1][1] = "Rosemon";
        DigiEvolution[i][1][2] = "Lotosmon";
        i+=1;

        //Lucemon FM
        //from
        DigiEvolution[i][0][0] = "Lucemon";

        //for
        DigiEvolution[i][1][0] = "Lucemon SM";
        i+=1;

        //LadyDevimon
        //from
        DigiEvolution[i][0][0] = "Icemon";
        DigiEvolution[i][0][1] = "Kyubimon";
        DigiEvolution[i][0][2] = "Bakemon";
        DigiEvolution[i][0][3] = "BlackGatomon";
        DigiEvolution[i][0][4] = "Sistermon Ciel";

        //for
        DigiEvolution[i][1][0] = "Mastemon";
        DigiEvolution[i][1][1] = "Lilithmon";
        DigiEvolution[i][1][2] = "Lotosmon";
        i+=1;

        //WereGarurumon
        //from
        DigiEvolution[i][0][0] = "Ogremon";
        DigiEvolution[i][0][1] = "GaoGamon";
        DigiEvolution[i][0][2] = "Garurumon";
        DigiEvolution[i][0][3] = "Lobomon";
        DigiEvolution[i][0][4] = "Strikedramon";

        //for
        DigiEvolution[i][1][0] = "MirageGaogamon";
        DigiEvolution[i][1][1] = "MetalGarurumon";
        DigiEvolution[i][1][2] = "MetalGarurumon BLK";
        i+=1;

        //WereGarurumon BLK
        //from
        DigiEvolution[i][0][0] = "Garurumon BLK";
        DigiEvolution[i][0][1] = "BlackGatomon";
        DigiEvolution[i][0][2] = "Sangloupmon";

        //for
        DigiEvolution[i][1][0] = "BanchoLeomon";
        DigiEvolution[i][1][1] = "Minervamon";
        DigiEvolution[i][1][2] = "MetalGarurumon BLK";
        DigiEvolution[i][1][3] = "Merukimon";
        i+=1;

        //Wisemon
        //from
        DigiEvolution[i][0][0] = "Wizardmon";
        DigiEvolution[i][0][1] = "Clockmon";
        DigiEvolution[i][0][2] = "Socerimon";

        //for
        DigiEvolution[i][1][0] = "VenomMyotismon";
        DigiEvolution[i][1][1] = "Piedmon";
        DigiEvolution[i][1][2] = "Belphemon SM";
        i+=1;

        //Arcadiamon Mega
        //from
        DigiEvolution[i][0][0] = "Arcadiamon Ultimate";
        DigiEvolution[i][0][1] = "Infermon";
        DigiEvolution[i][0][2] = "Myotismon";

        //for
        DigiEvolution[i][1][0] = "Arcadiamon Ultra";
        i+=1;

        //Alphamon
        //from
        DigiEvolution[i][0][0] = "Cyberdramon";
        DigiEvolution[i][0][1] = "DoruGreymon";
        DigiEvolution[i][0][2] = "Grademon";

        //for
        DigiEvolution[i][1][0] = "Alphamon Ouryuken";
        i+=1;

        //UlforceVeedramon
        //from
        DigiEvolution[i][0][0] = "AeroVeedramon";
        DigiEvolution[i][0][1] = "Megadramon";
        DigiEvolution[i][0][2] = "Wingdramon";
        i+=1;

        //Ebemon
        //from
        DigiEvolution[i][0][0] = "Meteormon";
        DigiEvolution[i][0][1] = "Vademon";
        DigiEvolution[i][0][2] = "MetalMamemon";
        DigiEvolution[i][0][3] = "Dragomon";
        i+=1;

        //Imperialdramon DM
        //from
        DigiEvolution[i][0][0] = "Paildramon";
        DigiEvolution[i][0][1] = "Imperialdramon FM";
        DigiEvolution[i][0][2] = "Dinobeemon";

        //for
        DigiEvolution[i][1][0] = "Imperialdramon PM";
        DigiEvolution[i][1][1] = "Imperialdramon FM";
        i+=1;

        //Imperialdramon FM
        //from
        DigiEvolution[i][0][0] = "Imperialdramon DM";

        //for
        DigiEvolution[i][1][0] = "Imperialdramon DM";
        i+=1;

        //Vikemon
        //from
        DigiEvolution[i][0][0] = "Shakkoumon";
        DigiEvolution[i][0][1] = "Zudomon";
        DigiEvolution[i][0][2] = "ShogunGekomon";
        DigiEvolution[i][0][3] = "Groundramon";
        i+=1;

        //Valkyrimon
        //from
        DigiEvolution[i][0][0] = "Angewomon";
        DigiEvolution[i][0][1] = "Silphymon";
        DigiEvolution[i][0][2] = "MagnaAngemon";
        DigiEvolution[i][0][3] = "SaviorHuckmon";
        i+=1;

        //Varodurumon
        //from
        DigiEvolution[i][0][0] = "Garudamon";
        DigiEvolution[i][0][1] = "HippoGryphonmon";
        DigiEvolution[i][0][2] = "Crowmon";

        //for
        DigiEvolution[i][1][0] = "Chaosmon VA";
        i+=1;

        //VenomMyotismon
        //from
        DigiEvolution[i][0][0] = "Infermon";
        DigiEvolution[i][0][1] = "Myotismon";
        DigiEvolution[i][0][2] = "Wisemon";
        DigiEvolution[i][0][3] = "Phantomon";
        DigiEvolution[i][0][4] = "Matadormon";
        i+=1;

        //WarGreymon
        //from
        DigiEvolution[i][0][0] = "Mamemon";
        DigiEvolution[i][0][1] = "MetalGreymon";
        DigiEvolution[i][0][2] = "MetalGreymon Blue";

        //for
        DigiEvolution[i][1][0] = "Omnimon";
        i+=1;

        //Ophanimon
        //from
        DigiEvolution[i][0][0] = "Angewomon";
        DigiEvolution[i][0][1] = "Piximon";
        i+=1;

        //Gaiomon
        //from
        DigiEvolution[i][0][0] = "MetalGreymon";
        DigiEvolution[i][0][1] = "MetalGreymon Blue";
        DigiEvolution[i][0][2] = "RizeGreymon";
        DigiEvolution[i][0][3] = "Hisyaryumon";
        i+=1;

        //KaiserGreymon
        //from
        DigiEvolution[i][0][0] = "BurningGreymon";

        //for
        DigiEvolution[i][1][0] = "Susanomon";
        i+=1;

        //ChaosGallantmon
        //from
        DigiEvolution[i][0][0] = "Shakkoumon";
        DigiEvolution[i][0][1] = "WarGrowlmon";
        i+=1;

        //Chaosdramon
        //from
        DigiEvolution[i][0][0] = "Machinedramon";
        i+=1;

        //Gankoomon
        //from
        DigiEvolution[i][0][0] = "SuperStarmon";
        DigiEvolution[i][0][1] = "SkullMeramon";
        DigiEvolution[i][0][2] = "Volcanomon";
        i+=1;

        //KingEtemon
        //from
        DigiEvolution[i][0][0] = "Etemon";
        DigiEvolution[i][0][1] = "ShogunGekomon";
        DigiEvolution[i][0][2] = "Pandamon";
        i+=1;

        //Kuzuhamon
        //from
        DigiEvolution[i][0][0] = "Cherrymon";
        DigiEvolution[i][0][1] = "Taomon";
        DigiEvolution[i][0][2] = "Crowmon";
        i+=1;

        //GranKuwagamon
        //from
        DigiEvolution[i][0][0] = "MegaKabuterimon";
        DigiEvolution[i][0][1] = "Okuwamon";
        DigiEvolution[i][0][2] = "Cherrymon";
        DigiEvolution[i][0][3] = "Dinobeemon";
        DigiEvolution[i][0][4] = "Triceramon";
        i+=1;

        //GranDracmon
        //from
        DigiEvolution[i][0][0] = "Myotismon";
        DigiEvolution[i][0][1] = "SkullSatamon";
        DigiEvolution[i][0][2] = "Matadormon";
        i+=1;

        //GroundLocomon
        //from
        DigiEvolution[i][0][0] = "Gigadramon";
        DigiEvolution[i][0][1] = "CannonBeemon";
        DigiEvolution[i][0][2] = "Datamon";
        i+=1;

        //Gryphonmon
        //from
        DigiEvolution[i][0][0] = "Garudamon";
        DigiEvolution[i][0][1] = "Silphymon";
        DigiEvolution[i][0][2] = "HippoGryphonmon";
        i+=1;

        //Craniamon
        //from
        DigiEvolution[i][0][0] = "Andromon";
        DigiEvolution[i][0][1] = "Knightmon";
        i+=1;

        //Kerpymon BLK
        //from
        DigiEvolution[i][0][0] = "Antylamon";
        DigiEvolution[i][0][1] = "MetalGreymon Blue";
        i+=1;

        //kerpymon GOod
        //from
        DigiEvolution[i][0][0] = "Antylamon";
        DigiEvolution[i][0][1] = "Shakkoumon";
        DigiEvolution[i][0][2] = "Crescemon";
        i+=1;

        //Goldramon
        //from
        DigiEvolution[i][0][0] = "AeroVeedramon";
        DigiEvolution[i][0][1] = "MagnaAngemon";
        DigiEvolution[i][0][2] = "Megadramon";
        DigiEvolution[i][0][3] = "Hisyaryumon";
        i+=1;

        //SaberLeomon
        //from
        DigiEvolution[i][0][0] = "GrapLeomon";
        DigiEvolution[i][0][1] = "Panjyamon";
        DigiEvolution[i][0][2] = "Monzaemon";
        DigiEvolution[i][0][3] = "Triceramon";
        i+=1;

        //Sakuyamon
        //from
        DigiEvolution[i][0][0] = "Silphymon";
        DigiEvolution[i][0][1] = "Taomon";
        DigiEvolution[i][0][2] = "Monzaemon";
        i+=1;

        //Jesmon
        //from
        DigiEvolution[i][0][0] = "SaviorHuckmon";
        DigiEvolution[i][0][1] = "Duramon";
        i+=1;

        //ShineGreymon
        //from
        DigiEvolution[i][0][0] = "SkullGreymon";
        DigiEvolution[i][0][1] = "MagnaAngemon";
        DigiEvolution[i][0][2] = "RizeGreymon";

        //for
        DigiEvolution[i][1][0] = "ShineGreymon BM";
        i+=1;

        //ShineGreymon BM
        //from
        DigiEvolution[i][0][0] = "ShineGreymon";
        i+=1;

        //Justimon
        //from
        DigiEvolution[i][0][0] = "Garudamon";
        DigiEvolution[i][0][1] = "Cyberdramon";
        DigiEvolution[i][0][2] = "SuperStarmon";
        DigiEvolution[i][0][3] = "CatchMamemon";
        DigiEvolution[i][0][4] = "Pandamon";
        i+=1;

        //Kentaurosmon
        //from
        DigiEvolution[i][0][0] = "Kentaurosmon";
        DigiEvolution[i][0][1] = "Chirinmon";
        DigiEvolution[i][0][2] = "DoruGreymon";
        DigiEvolution[i][0][3] = "Crescemon";
        i+=1;

        //Slayerdramon
        //from
        DigiEvolution[i][0][0] = "Wingdramon";
        DigiEvolution[i][0][1] = "SaviorHuckmon";
        DigiEvolution[i][0][2] = "RizeGreymon";

        //for
        DigiEvolution[i][1][0] = "Examon";
        i+=1;

        //Seraphimon
        //from
        DigiEvolution[i][0][0] = "Chirinmon";
        DigiEvolution[i][0][1] = "MagnaAngemon";
        DigiEvolution[i][0][2] = "HippoGryphonmon";
        i+=1;

        //MegaGargomon
        //from
        DigiEvolution[i][0][0] = "CannonBeemon";
        DigiEvolution[i][0][1] = "MachGaogamon";
        DigiEvolution[i][0][2] = "Rapidmon";
        i+=1;

        //Darkdramon
        //from
        DigiEvolution[i][0][0] = "Gigadramon";
        DigiEvolution[i][0][1] = "BlueMeramon";
        DigiEvolution[i][0][2] = "WarGrowlmon";

        //for
        DigiEvolution[i][1][0] = "Chaosmon";
        i+=1;

        //TigesVespamon
        //from
        DigiEvolution[i][0][0] = "Andromon";
        DigiEvolution[i][0][1] = "CannonBeemon";
        DigiEvolution[i][0][2] = "Rapidmon";
        DigiEvolution[i][0][3] = "Grademon";
        DigiEvolution[i][0][4] = "Duramon";
        i+=1;

        //Titamon
        //from
        DigiEvolution[i][0][0] = "Cyberdramon";
        DigiEvolution[i][0][1] = "SkullGreymon";
        DigiEvolution[i][0][2] = "Digitamamon";
        DigiEvolution[i][0][3] = "Phantomon";
        i+=1;

        //TyrantKabuterimon
        //from
        DigiEvolution[i][0][0] = "HerculesKabuterimon";
        i+=1;

        //Dianamon
        //from
        DigiEvolution[i][0][0] = "Antylamon";
        DigiEvolution[i][0][1] = "Meteormon";
        DigiEvolution[i][0][2] = "Taomon";
        DigiEvolution[i][0][3] = "Crescemon";
        i+=1;

        //Diaboromon
        //from
        DigiEvolution[i][0][0] = "Antylamon";
        DigiEvolution[i][0][1] = "Infermon";
        DigiEvolution[i][0][2] = "Okuwamon";
        DigiEvolution[i][0][3] = "Arcadiamon Ultimate";
        DigiEvolution[i][0][4] = "SkullSatamon";

        //for
        DigiEvolution[i][1][0] = "Armageddemon";
        i+=1;

        //Creepymon
        //from
        DigiEvolution[i][0][0] = "SkullGreymon";
        DigiEvolution[i][0][1] = "BlueMeramon";
        DigiEvolution[i][0][2] = "Arcadiamon Ultimate";
        DigiEvolution[i][0][3] = "SkullSatamon";
        i+=1;

        //Gallantmon
        //from
        DigiEvolution[i][0][0] = "WarGrowlmon";
        DigiEvolution[i][0][1] = "MetalTyrannomon";

        //for
        DigiEvolution[i][1][0] = "Gallantmon CM";
        i+=1;

        //Dynasmon
        //from
        DigiEvolution[i][0][0] = "AeroVeedramon";
        DigiEvolution[i][0][1] = "Silphymon";
        DigiEvolution[i][0][2] = "Wingdramon";
        i+=1;

        //Durandamon
        //from
        DigiEvolution[i][0][0] = "Grademon";
        DigiEvolution[i][0][1] = "Duramon";
        DigiEvolution[i][0][2] = "Knightmon";
        i+=1;

        //Leopardmon
        //from
        DigiEvolution[i][0][0] = "GrapLeomon";
        DigiEvolution[i][0][1] = "Knightmon";
        DigiEvolution[i][0][2] = "Leopardmon LM";

        //for
        DigiEvolution[i][1][0] = "Leopardmon LM";
        i+=1;

        //Leopardmon LM
        //from
        DigiEvolution[i][0][0] = "Leopardmon";

        //for
        DigiEvolution[i][1][0] = "Leopardmon";
        i+=1;

        //Dorugoramon
        //from
        DigiEvolution[i][0][0] = "Gigadramon";
        DigiEvolution[i][0][1] = "Grademon";
        DigiEvolution[i][0][2] = "DoruGreymon";
        i+=1;

        //Neptunemon
        //from
        DigiEvolution[i][0][0] = "Dragomon";
        DigiEvolution[i][0][1] = "Whamon";
        DigiEvolution[i][0][2] = "MegaSeadramon";
        i+=1;

        //HiAndromon
        //from
        DigiEvolution[i][0][0] = "Andromon";
        DigiEvolution[i][0][1] = "Vademon";
        DigiEvolution[i][0][2] = "MetalMamemon";
        i+=1;

        //PileVolcamon
        //from
        DigiEvolution[i][0][0] = "Etemon";
        DigiEvolution[i][0][1] = "GrapLeomon";
        DigiEvolution[i][0][2] = "Volcanomon";
        i+=1;

        //Barbamon
        //from
        DigiEvolution[i][0][0] = "Myotismon";
        DigiEvolution[i][0][1] = "BlueMeramon";
        DigiEvolution[i][0][2] = "Phantomon";
        i+=1;

        //BanchoLeomon
        //from
        DigiEvolution[i][0][0] = "GrapLeomon";
        DigiEvolution[i][0][1] = "Panjyamon";
        DigiEvolution[i][0][2] = "MachGaogamon";
        DigiEvolution[i][0][3] = "WereGarurumon BLK";
        DigiEvolution[i][0][4] = "Pandamon";

        //for
        DigiEvolution[i][1][0] = "Chaosmon";
        DigiEvolution[i][1][0] = "Chaosmon VA";
        i+=1;

        //Piedmon
        //from
        DigiEvolution[i][0][0] = "Myotismon";
        DigiEvolution[i][0][1] = "Etemon";
        DigiEvolution[i][0][2] = "Wisemon";
        DigiEvolution[i][0][3] = "Matadormon";

        //for
        DigiEvolution[i][1][0] = "Apocalymon";
        i+=1;

        //Puppetmon
        //from
        DigiEvolution[i][0][0] = "Cherrymon";
        DigiEvolution[i][0][1] = "Pumpkinmon";
        DigiEvolution[i][0][2] = "Mamemon";
        DigiEvolution[i][0][3] = "CatchMamemon";

        //for
        DigiEvolution[i][1][0] = "Apocalymon";
        i+=1;

        //PlatinumNumemon
        //from
        DigiEvolution[i][0][0] = "GoldNumemon";
        DigiEvolution[i][0][1] = "Etemon";
        DigiEvolution[i][0][2] = "SuperStarmon";
        DigiEvolution[i][0][3] = "BlackKingNumemon";
        i+=1;

        //BlackWarGreymon
        //from
        DigiEvolution[i][0][0] = "Megadramon";
        DigiEvolution[i][0][1] = "MetalGreymon Blue";
        DigiEvolution[i][0][2] = "MetalTyrannomon";

        //for
        DigiEvolution[i][1][0] = "Omnimon Zwart";
        i+=1;

        //PrinceMamemon
        //from
        DigiEvolution[i][0][0] = "BlackKingNumemon";
        DigiEvolution[i][0][1] = "Mamemon";
        DigiEvolution[i][0][2] = "MetalMamemon";
        i+=1;

        //Breakdramon
        //from
        DigiEvolution[i][0][0] = "Groundramon";
        DigiEvolution[i][0][1] = "Triceramon";
        DigiEvolution[i][0][2] = "MetalTyrannomon";

        //for
        DigiEvolution[i][1][0] = "Examon";
        i+=1;

        //Plesiomon
        //from
        DigiEvolution[i][0][0] = "ShogunGekomon";
        DigiEvolution[i][0][1] = "Whamon";
        DigiEvolution[i][0][2] = "MegaSeadramon";
        DigiEvolution[i][0][3] = "Zudomon";
        i+=1;

        //Herculeskabuterimon
        //from
        DigiEvolution[i][0][0] = "MegaKabuterimon";
        DigiEvolution[i][0][1] = "Okuwamon";
        DigiEvolution[i][0][2] = "Vademon";

        //for
        DigiEvolution[i][1][0] = "TyrantKabuterimon";
        i+=1;

        //Beelzemon
        //from
        DigiEvolution[i][0][0] = "Infermon";
        DigiEvolution[i][0][1] = "SkullMeramon";

        //for
        DigiEvolution[i][1][0] = "Beelzemon BM";
        i+=1;

        //Beelzemon BM
        //from
        DigiEvolution[i][0][0] = "Beelzemon";
        i+=1;

        //Belphemon SM
        //from
        DigiEvolution[i][0][0] = "Digitamamon";
        DigiEvolution[i][0][1] = "Wisemon";
        DigiEvolution[i][0][2] = "Belphemon RM";

        //for
        DigiEvolution[i][1][0] = "Belphemon RM";
        i+=1;

        //Hououmon
        //from
        DigiEvolution[i][0][0] = "Garudamon";
        DigiEvolution[i][0][1] = "Silphymon";
        DigiEvolution[i][0][2] = "Piximon";
        i+=1;

        //Magnadramon
        //from
        DigiEvolution[i][0][0] = "MegaKabuterimon";
        DigiEvolution[i][0][1] = "Angemon";
        DigiEvolution[i][0][2] = "Lillymon";
        i+=1;

        //Boltmon
        //from
        DigiEvolution[i][0][0] = "SkullMeramon";
        DigiEvolution[i][0][1] = "Pumpkinmon";
        DigiEvolution[i][0][2] = "BlueMeramon";
        i+=1;

        //MagnaGarurumon
        //from
        DigiEvolution[i][0][0] = "KendoGarurumon";
        DigiEvolution[i][0][1] = "MagnaGarurumon SV";

        //for
        DigiEvolution[i][1][0] = "MagnaGarurumon SV";
        DigiEvolution[i][1][1] = "Susanomon";
        i+=1;

        //MagnaGarurumon SV
        //from
        DigiEvolution[i][0][0] = "MagnaGarurumon";

        //for
        DigiEvolution[i][1][0] = "MagnaGarurumon";
        i+=1;

        //Mastemon
        //from
        DigiEvolution[i][0][0] = "Angewomon";
        DigiEvolution[i][0][1] = "LadyDevimon";
        i+=1;

        //MarineAngemon
        //from
        DigiEvolution[i][0][0] = "Zudomon";
        DigiEvolution[i][0][1] = "Piximon";
        DigiEvolution[i][0][2] = "Whamon";
        i+=1;

        //Minervamon
        //from
        DigiEvolution[i][0][0] = "Digitamamon";
        DigiEvolution[i][0][1] = "Monzaemon";
        DigiEvolution[i][0][2] = "Crowmon";
        DigiEvolution[i][0][3] = "WereGarurumon BLK";
        DigiEvolution[i][0][4] = "Hisyaryumon";
        i+=1;

        //MirageGaogamon
        //from
        DigiEvolution[i][0][0] = "Panjyamon";
        DigiEvolution[i][0][1] = "MachGaogamon";
        DigiEvolution[i][0][2] = "WereGarurumon";

        //for
        DigiEvolution[i][1][0] = "MirageGaogamon BM";
        i+=1;

        //MirageGaogamon BM
        //from
        DigiEvolution[i][0][0] = "MirageGaogamon";
        i+=1;

        //Machinedramon
        //from
        DigiEvolution[i][0][0] = "Gigadramon";
        DigiEvolution[i][0][1] = "Datamon";
        DigiEvolution[i][0][2] = "Megadramon";

        //for
        DigiEvolution[i][1][0] = "Chaosdramon";
        DigiEvolution[i][1][1] = "Apocalymon";
        i+=1;

        //Megidramon
        //from
        DigiEvolution[i][0][0] = "GroundLocomon";
        DigiEvolution[i][0][1] = "Megadramon";
        DigiEvolution[i][0][2] = "WarGrowlmon";
        DigiEvolution[i][0][3] = "Gigadramon";
        i+=1;

        //MetalEtemon
        //from
        DigiEvolution[i][0][0] = "Meteormon";
        DigiEvolution[i][0][1] = "Etemon";
        DigiEvolution[i][0][2] = "BlackKingNumemon";
        DigiEvolution[i][0][3] = "Volcanomon";
        i+=1;

        //MetalGarurumon
        //from
        DigiEvolution[i][0][0] = "Zudomon";
        DigiEvolution[i][0][1] = "Chirinmon";
        DigiEvolution[i][0][2] = "WereGarurumon";

        //for
        DigiEvolution[i][1][0] = "Omnimon";
        i+=1;

        //MetalGarurumon BLK
        //from
        DigiEvolution[i][0][0] = "Datamon";
        DigiEvolution[i][0][1] = "Rapidmon";
        DigiEvolution[i][0][2] = "WereGarurumon";
        DigiEvolution[i][0][3] = "WereGarurumon BLK";

        //for
        DigiEvolution[i][1][0] = "Omnimon Zwart";
        i+=1;

        //MetalSeadramon
        //from
        DigiEvolution[i][0][0] = "Gigadramon";
        DigiEvolution[i][0][1] = "Whamon";
        DigiEvolution[i][0][2] = "MegaSeadramon";

        //for
        DigiEvolution[i][1][0] = "Apocalymon";
        i+=1;

        //Merukimon
        //from
        DigiEvolution[i][0][0] = "MachGaogamon";
        DigiEvolution[i][0][1] = "WereGarurumon BLK";
        i+=1;

        //RustTyranomon
        //from
        DigiEvolution[i][0][0] = "WarGrowlmon";
        DigiEvolution[i][0][1] = "MetalGreymon";
        DigiEvolution[i][0][2] = "MetalTyrannomon";
        i+=1;

        //Leviamon
        //from
        DigiEvolution[i][0][0] = "ShogunGekomon";
        DigiEvolution[i][0][1] = "MegaSeadramon";
        DigiEvolution[i][0][2] = "Dragomon";
        i+=1;

        //Lilithmon
        //from
        DigiEvolution[i][0][0] = "Lilamon";
        DigiEvolution[i][0][1] = "LadyDevimon";
        i+=1;

        //Ravemon
        //from
        DigiEvolution[i][0][0] = "AeroVeedramon";
        DigiEvolution[i][0][1] = "Garudamon";
        DigiEvolution[i][0][2] = "Crowmon";

        //for
        DigiEvolution[i][1][0] = "Ravemon BM";
        i+=1;

        //Ravemon BM
        //from
        DigiEvolution[i][0][0] = "Ravemon";
        i+=1;

        //Crusadermon
        //from
        DigiEvolution[i][0][0] = "Knightmon";
        DigiEvolution[i][0][1] = "MagnaAngemon";
        i+=1;

        //Rosemon
        //from
        DigiEvolution[i][0][0] = "Pumpkinmon";
        DigiEvolution[i][0][1] = "Lilamon";
        DigiEvolution[i][0][2] = "Lillymon";

        //for
        DigiEvolution[i][1][0] = "Rosemon BM";
        i+=1;

        //Rosemon BM
        //from
        DigiEvolution[i][0][0] = "Rosemon";
        i+=1;

        //Lotosmon
        //from
        DigiEvolution[i][0][0] = "Lilamon";
        DigiEvolution[i][0][1] = "Lillymon";
        DigiEvolution[i][0][2] = "LadyDevimon";
        i+=1;

        //Armageddemon
        //from
        DigiEvolution[i][0][0] = "Diaboromon";
        i+=1;

        //Arcadiamon Ultra
        //from
        DigiEvolution[i][0][0] = "Arcadiamon Mega";
        i+=1;

        //Alphamon Ouryuken
        //from
        DigiEvolution[i][0][0] = "Alphamon";
        DigiEvolution[i][0][1] = "Ouryumon";
        i+=1;

        //Imperialdramon PM
        //from
        DigiEvolution[i][0][0] = "Imperialdramon DM";
        i+=1;

        //Examon
        //from
        DigiEvolution[i][0][0] = "Slayerdramon";
        DigiEvolution[i][0][1] = "Breakdramon";
        i+=1;

        //Omnimon
        //from
        DigiEvolution[i][0][0] = "WarGreymon";
        DigiEvolution[i][0][1] = "MetalGarurumon";
        i+=1;

        //Omnimon Zwart
        //from
        DigiEvolution[i][0][0] = "BlackWarGreymon";
        DigiEvolution[i][0][1] = "MetalGarurumon BLK";
        i+=1;

        //Chaosmon
        //from
        DigiEvolution[i][0][0] = "BanchoLeomon";
        DigiEvolution[i][0][1] = "Darkdramon";
        i+=1;

        //Chaosmon VA
        //from
        DigiEvolution[i][0][0] = "Varodurumon";
        DigiEvolution[i][0][1] = "BanchoLeomon";
        i+=1;

        //Susanomon
        //from
        DigiEvolution[i][0][0] = "KaiserGreymon";
        DigiEvolution[i][0][1] = "MagnaGarurumon";
        i+=1;

        //Gallantmon CM
        //from
        DigiEvolution[i][0][0] = "Gallantmon";
        i+=1;

        //Belphemon RM
        //from
        DigiEvolution[i][0][0] = "Belphemon SM";

        //for
        DigiEvolution[i][1][0] = "Belphemon SM";
        i+=1;

        //Lucemon SM
        //from
        DigiEvolution[i][0][0] = "Lucemon FM";
        i+=1;

        //Flamedramon
        //from
        DigiEvolution[i][0][0] = "Veemon";
        i+=1;

        //Magnamon
        //from
        DigiEvolution[i][0][0] = "Veemon";
        DigiEvolution[i][0][1] = "Guardromon(Gold)";
        i+=1;

        //Rapidmon(Armor)
        //from
        DigiEvolution[i][0][0] = "Terriermon";
        DigiEvolution[i][0][1] = "Guardromon(Gold)";
        i+=1;

        //Shoutmon
        //from
        DigiEvolution[i][0][0] = "Koromon";

        //for
        DigiEvolution[i][1][0] = "OmniShoutmon";
        i+=1;

        //OmniShoutmon
        //from
        DigiEvolution[i][0][0] = "Shoutmon";
        i+=1;

        //Ryudamon
        //from
        DigiEvolution[i][0][0] = "Wanyamon";

        //for
        DigiEvolution[i][1][0] = "Ginryumon";
        DigiEvolution[i][1][1] = "Raptordramon";
        DigiEvolution[i][1][2] = "Reppamon";
        i+=1;

        //Ginryudamon
        //from
        DigiEvolution[i][0][0] = "Ryudamon";
        DigiEvolution[i][0][1] = "Zubamon";
        DigiEvolution[i][0][2] = "Dracomon";

        //for
        DigiEvolution[i][1][0] = "Hisyaryumon";
        DigiEvolution[i][1][1] = "CannonBeemon";
        DigiEvolution[i][1][2] = "MegaSeadramon";
        i+=1;

        //Hisyaryumon
        //from
        DigiEvolution[i][0][0] = "Ginryumon";
        DigiEvolution[i][0][1] = "Seadramon";
        DigiEvolution[i][0][2] = "Coelamon";

        //for
        DigiEvolution[i][1][0] = "Ouryumon";
        DigiEvolution[i][1][1] = "Gaiomon";
        DigiEvolution[i][1][2] = "Goldramon";
        DigiEvolution[i][1][3] = "Minervamon";
        i+=1;

        //Ouryumon
        //from
        DigiEvolution[i][0][0] = "Hisyaryumon";
        DigiEvolution[i][0][1] = "Grademon";
        DigiEvolution[i][0][2] = "Crowmon";

        //for
        DigiEvolution[i][1][0] = "Alphamon Ouryuken";
        i+=1;

        //Apocalymon
        //from
        DigiEvolution[i][0][0] = "MetalSeadramon";
        DigiEvolution[i][0][1] = "Puppetmon";
        DigiEvolution[i][0][2] = "Machinedramon";
        DigiEvolution[i][0][3] = "Piedmon";
        i+=1;

        //Sistermon Blanc
        //from
        DigiEvolution[i][0][0] = "Tokomon";

        //for
        DigiEvolution[i][1][0] = "Sistermon B Awake";
        DigiEvolution[i][1][1] = "Sistermon Ciel";
        DigiEvolution[i][1][2] = "Gargomon";
        DigiEvolution[i][1][3] = "Lekismon";
        i+=1;

        //Sistermon B Awake
        //from
        DigiEvolution[i][0][0] = "Sistermon Blanc";
        i+=1;

        //Sistermon Ciel
        //from
        DigiEvolution[i][0][0] = "Sistermon Blanc";
        DigiEvolution[i][0][1] = "Dracmon";
        DigiEvolution[i][0][2] = "Lunamon";

        //for
        DigiEvolution[i][1][0] = "Sistermon C Awake";
        DigiEvolution[i][1][1] = "Pandamon";
        DigiEvolution[i][1][2] = "LadyDevimon";
        i+=1;

        //Sistermon C Awake
        //from
        DigiEvolution[i][0][0] = "Sistermon Ciel";
        i+=1;

        /*
        //
        //from
        DigiEvolution[i][0][0] = "";
        DigiEvolution[i][0][1] = "";
        DigiEvolution[i][0][2] = "";
        DigiEvolution[i][0][3] = "";
        DigiEvolution[i][0][4] = "";

        //for
        DigiEvolution[i][1][0] = "";
        i+=1;

         */

        /*
        //Digimon Name
        //from
        DigiEvolution[i][0][0] = "Previous01";
        DigiEvolution[i][0][1] = "Previous02";
        DigiEvolution[i][0][2] = "Previous03";

        //for
        DigiEvolution[i][1][0] = "Next01";
        DigiEvolution[i][1][1] = "Next02";
        DigiEvolution[i][1][2] = "Next03";
        DigiEvolution[i][1][3] = "Next04";
        DigiEvolution[i][1][4] = "Next05";
        i+=1;

         */
    }

    public void DigiTypeSet(){
        int i = 0;

        //adding the type, atribute, phase and memory cost


        //baby

        //kuramon
        Digitypes[i][0] = "Baby";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "2";
        i+=1;

        //Pabumon
        Digitypes[i][0] = "Baby";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "2";
        i+=1;

        //Punimon
        Digitypes[i][0] = "Baby";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "2";
        i+=1;

        //Botamon
        Digitypes[i][0] = "Baby";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "2";
        i+=1;

        //Poyomon
        Digitypes[i][0] = "Baby";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "2";
        i+=1;

        //Arcadiamon In-Tr
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;


        //In-training

        //Koromon
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;

        //Tanemon
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;

        //Tsnumon
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;

        //Tsumemon
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;

        //Tokomon
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;

        //Nyaromon
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;

        //Pagumon
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;

        //Yokomon
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;

        //Bukamon
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;

        //Motimon
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;

        //Wanyamon
        Digitypes[i][0] = "In-Training";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "3";
        i+=1;


        //Rookie

        //Agumon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "5";
        i+=1;

        //Agumon BLK
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "5";
        i+=1;

        //Arcadiamon Rookie
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "5";
        i+=1;

        //Armadillomon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "4";
        i+=1;

        //Impmon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "5";
        i+=1;

        //Elecmon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "4";
        i+=1;

        //Otamamon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "4";
        i+=1;

        //Gaomon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "5";
        i+=1;

        //Gazimon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "4";
        i+=1;

        //Gabumon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "5";
        i+=1;

        //Gabumon BLK
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "5";
        i+=1;

        //Guilmon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "5";
        i+=1;

        //Kudamon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "5";
        i+=1;

        //Keramon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "5";
        i+=1;

        //Gotsumon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "5";
        i+=1;

        //Goblimon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "4";
        i+=1;

        //Gomamon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "5";
        i+=1;

        //Syakomon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "4";
        i+=1;

        //Zubamon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "5";
        i+=1;

        //Solarmon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "4";
        i+=1;

        //Chuumon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "4";
        i+=1;

        //Terriermon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "4";
        i+=1;

        //Tentomon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "4";
        i+=1;

        //ToyAgumon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "4";
        i+=1;

        //Dracmon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "5";
        i+=1;

        //Dracomon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "5";
        i+=1;

        //Dorumon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "5";
        i+=1;

        //Hagurumon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "4";
        i+=1;

        //Patamon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "4";
        i+=1;

        //Hackmon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "5";
        i+=1;

        //Palmon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "5";
        i+=1;

        //DemiDevimon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "4";
        i+=1;

        //Biyomon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "4";
        i+=1;

        //Falcomon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "5";
        i+=1;

        //FanBeemon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "4";
        i+=1;

        //Veemon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Free";
        Digitypes[i][2] = "Neutral";
        Digitypes[i][3] = "5";
        i+=1;

        //Salamon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "4";
        i+=1;

        //Betamon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "4";
        i+=1;

        //Hawkmon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "5";
        i+=1;

        //Mushroomon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "4";
        i+=1;

        //Monodramon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "4";
        i+=1;

        //Lalamon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "4";
        i+=1;

        //Lucemon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "14";
        i+=1;

        //Lunamon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "5";
        i+=1;

        //Renamon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "5";
        i+=1;

        //Lopmon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "4";
        i+=1;

        //Wormmon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "4";
        i+=1;

        //IceDevimon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "8";
        i+=1;

        //Icemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Aquilamon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "8";
        i+=1;

        //Agunimon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "8";
        i+=1;

        //Arcadiamon Champion
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "8";
        i+=1;

        //Ankylamon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "6";
        i+=1;

        //Ikkakumon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Wizzardmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "8";
        i+=1;

        //Lobomon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "8";
        i+=1;

        //Woodmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Airdramon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "6";
        i+=1;

        //Exveemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "8";
        i+=1;

        //Angemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Ogremon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "8";
        i+=1;

        //Guardromon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "8";
        i+=1;

        //Guardromon gold
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "6";
        i+=1;

        //Gaogamon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "8";
        i+=1;

        //Kabuterimon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "6";
        i+=1;

        //ShellNumemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Gargomon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "6";
        i+=1;

        //Garurumon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Garururmon Black
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "8";
        i+=1;

        //kyubimon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "8";
        i+=1;

        //Growlmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "8";
        i+=1;

        //Kurisarimon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Fire";
        Digitypes[i][3] = "8";
        i+=1;

        //Greymon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Greymon blue
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "8";
        i+=1;

        //Clockmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Kuwagamon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Gekomon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Geremon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Coredramon Blue
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Coredramon Green
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "8";
        i+=1;

        //Gold numemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "light";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Golemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Cyclonemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Sangloupmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //sunglowmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Seadramon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Coelamon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Geogreymon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Sukamon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Starmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Stingmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "8";
        i+=1;

        //Strikedramon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "6";
        i+=1;

        //Zubaeagermon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Socerimon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Tankmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //MudFrigimon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Tyrannomon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Gatomon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Devimon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "8";
        i+=1;

        //Turuiemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Togemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "8";
        i+=1;

        //Dorugamon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "8";
        i+=1;

        //Nanimon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Numemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Birdramon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //BaoHuckmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "8";
        i+=1;

        //Bakemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Veedramon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Hudiemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "8";
        i+=1;

        //Platinum Sukamon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //BlackGatomon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "8";
        i+=1;

        //Vegiemon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "¨6";
        i+=1;

        //Peckmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Meramon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Monochromon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Frigimon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "6";
        i+=1;

        //Unimon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "6";
        i+=1;

        //Raptordramon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "6";
        i+=1;

        //Raremon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Leomon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Lekismon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Reppamon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Waspmon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;


        //Ultimate

        //MegaKabuterimon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //Arcadiamon Ultimate
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "14";
        i+=1;

        //Antylamon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Andromon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //Meteormon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Infermon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "14";
        i+=1;

        //Myotismon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "14";
        i+=1;

        //Wingdramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "14";
        i+=1;

        //BurningGreymon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "14";
        i+=1;

        //AeroVeedramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "14";
        i+=1;

        //Etemon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //Angewomon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "14";
        i+=1;

        //Okuwamon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //Garudamon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //KendoGarurumon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "14";
        i+=1;

        //Gigaramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //CatchMamemon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "10";
        i+=1;

        //CannonBeemon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //Groundramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "14";
        i+=1;

        //GrapLeomon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //Grademon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //Crescemon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Cyberdramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "14";
        i+=1;

        //Shakkoumon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "14";
        i+=1;

        //Cherrymon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //Silphymon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "14";
        i+=1;

        //SuperStarmon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //SkullGreymon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "14";
        i+=1;

        //SkullSatamon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //Zudomon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //SaviorHuckmon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "14";
        i+=1;

        //Taomon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Dragomon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //Chirinmon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "14";
        i+=1;

        //Dinobeemon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "14";
        i+=1;

        //Chirinmon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //SkullMeramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Duramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "14";
        i+=1;

        //ShogunGekomon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //Triceramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //DoruGreymon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "14";
        i+=1;

        //Knightmon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Datamon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //Paildramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "14";
        i+=1;

        //Panjyamon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //Pandamon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Pumpkinmon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "10";
        i+=1;

        //Piximon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //HippoGryphonmon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Phantomon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //BlackKingNumemon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "10";
        i+=1;

        //BlueMeramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //Vademon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "10";
        i+=1;

        //Whamon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //MagnaAngemon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "14";
        i+=1;

        //Volcanomon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Matadormon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //MachGaogamon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Mamemon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "10";
        i+=1;

        //MegaSeadramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Megadramon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //WarGrowlmon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "14";
        i+=1;

        //MetalGreymon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "14";
        i+=1;

        //MetalGreymon Blue
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "14";
        i+=1;

        //MetalTyrannomon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //MetalMamemon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "10";
        i+=1;

        //Monzaemon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //Crowmon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //RizeGreymon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "14";
        i+=1;

        //Lilamon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Rapidmon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //Lillymon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "12";
        i+=1;

        //Lucemon FM
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "22";
        i+=1;

        //LadyDevimon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "14";
        i+=1;

        //WereGarurumon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "12";
        i+=1;

        //WereGarurumon BLK
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;

        //Wisemon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "12";
        i+=1;


        //Mega

        //Arcadiamon Mega
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //Alphamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "22";
        i+=1;

        //UlforceVeedramon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "22";
        i+=1;

        //Ebemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "16";
        i+=1;

        //Imperialdramon DM
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "20";
        i+=1;

        //Imperialdramon FM
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "20";
        i+=1;

        //Vikemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "18";
        i+=1;

        //Valkyrimon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "18";
        i+=1;

        //Varodurumon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //VenomMyotismon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //WarGreymon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //Ophanimon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //Gaiomon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //KaiserGreymon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "20";
        i+=1;

        //ChaosGallantmon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "22";
        i+=1;

        //Chaosdramon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //Gankoomon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "22";
        i+=1;

        //KingEtemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //Kuzuhamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //GranKuwagamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //GranKuwagamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //GroundLocomon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //Gryphonmon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //Craniamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "22";
        i+=1;

        //Kerpymon BLK
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //Kerpymon GOOD
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //Goldramon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //SaberLeomon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //Sakuyamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //Jesmon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "22";
        i+=1;

        //ShineGreymon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //ShingeGreymon BM
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "22";
        i+=1;

        //Justimon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //Kentaurosmon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "22";
        i+=1;

        //Slayerdramon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //Seraphimon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //MegaGargomon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "18";
        i+=1;

        //Darkdramon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //TigerVespamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //Titamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //TyrantKabuterimon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //Dianamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "20";
        i+=1;

        //Diaboromon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "20";
        i+=1;

        //Creepymon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "22";
        i+=1;

        //Gallantmon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "22";
        i+=1;

        //Dynasmon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "22";
        i+=1;

        //Durandamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //Leopardmon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "22";
        i+=1;

        //Leopardmon LM
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "25";
        i+=1;

        //Dorugoramon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //Neptunemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //HiAndromon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "18";
        i+=1;

        //PileAndromon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //Barbamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "22";
        i+=1;

        //BanchoLeomon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "18";
        i+=1;

        //Piedmon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //Puppetmon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //PlatinumNumemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "16";
        i+=1;

        //BlackWarGreymon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //PrinceMamemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "16";
        i+=1;

        //Breakdramon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //Plesiomon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //HerculesKabuterimon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "18";
        i+=1;

        //Beelzemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "22";
        i+=1;

        //Beelzemon GM
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "25";
        i+=1;

        //Belphemon SM
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "22";
        i+=1;

        //Houomon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "18";
        i+=1;

        //Magnadramon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //Boltmon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //MagnaGarurumon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "18";
        i+=1;

        //MagnaGarurumon SV
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "18";
        i+=1;

        //Mastemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "22";
        i+=1;

        //MarineAngemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "18";
        i+=1;

        //Minervamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //MirageGaogamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //MirageGaogamon BM
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "20";
        i+=1;

        //Machinedramon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //Megidramon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //MetalEtemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //MetalGarurumon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //MetalGarurumon BLK
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //MetalSeadramon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //Merukimon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //RustTyranomon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Electric";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //Leviamon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Water";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //Lilith
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "22";
        i+=1;

        //Ravemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "18";
        i+=1;

        //Ravemon BM
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //Crusadermon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "20";
        i+=1;

        //Rosemon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;

        //Rosemon BM
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "20";
        i+=1;

        //Lotosmon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Plant";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "18";
        i+=1;


        //Ultra,rookie,armor,champion and ultimate, but here exist more Ultra Forms.

        //Armageddemon
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "25";
        i+=1;

        //Arcadiamon Ultra
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "25";
        i+=1;

        //Alphamon Ouryuken
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "25";
        i+=1;

        //Imperialdramon PM
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "25";
        i+=1;

        //Examon
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Wind";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "25";
        i+=1;

        //Omnimon
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "25";
        i+=1;

        //Alphamon Zwart
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "25";
        i+=1;

        //Chaosmon
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "25";
        i+=1;

        //Chaosmon VA
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "25";
        i+=1;

        //Susanomon
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "25";
        i+=1;

        //Gallantmon CM
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "25";
        i+=1;

        //Belphemon RM
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "25";
        i+=1;

        //Lucemon SM
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "25";
        i+=1;

        //Flamedramon
        Digitypes[i][0] = "Armor";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "8";
        i+=1;

        //Magnamon
        Digitypes[i][0] = "Armor";
        Digitypes[i][1] = "Earth";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "22";
        i+=1;

        //Rapidmon Armor
        Digitypes[i][0] = "Armor";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "25";
        i+=1;

        //Shoutmon
        Digitypes[i][0] = "None";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "5";
        i+=1;

        //OmniShoutmon
        Digitypes[i][0] = "None";
        Digitypes[i][1] = "Fire";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "20";
        i+=1;

        //Ryudamon
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "5";
        i+=1;

        //Ginryumon
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "8";
        i+=1;

        //Hisyaryumon
        Digitypes[i][0] = "Ultimate";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "14";
        i+=1;

        //Ouryumon
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "20";
        i+=1;

        //Apocalymon
        Digitypes[i][0] = "Ultra";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Free";
        Digitypes[i][3] = "25";
        i+=1;

        //Sistermon Blanc
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "4";
        i+=1;

        //Sistermon Ciel Awake
        Digitypes[i][0] = "Rookie";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "18";
        i+=1;

        //Sistermon Ciel
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Sistermon Ciel Awake
        Digitypes[i][0] = "Champion";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "18";
        i+=1;

        //Alphamon NX
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Neutral";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "6";
        i+=1;

        //Crusadermon NX
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Dark";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;

        //Leopardmon NX
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Data";
        Digitypes[i][3] = "6";
        i+=1;

        //Omnimon NX
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Vaccine";
        Digitypes[i][3] = "6";
        i+=1;

        //Gallantmon NX
        Digitypes[i][0] = "Mega";
        Digitypes[i][1] = "Light";
        Digitypes[i][2] = "Virus";
        Digitypes[i][3] = "6";
        i+=1;
    }



}

