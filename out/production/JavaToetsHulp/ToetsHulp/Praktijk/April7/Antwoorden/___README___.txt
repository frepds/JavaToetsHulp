Dit document geeft een toelichting op hoe de becijfering werkt, en hoe je dat terug kunt zien in de nagekeken code.


Er is zoveel mogelijk geprobeerd om automatisch (zinvol) commentaar te plaatsen bij de onderdelen, zodat je van je fouten kunt leren. 
Het plaatsen van de correcte/toelichtend comments is nog een experimentele feature, dus er kun wel eens iets staan dat niet helemaal begrijpelijk is. 
Je kunt in dat geval contact met me opnemen via Microsoft Teams, als je nieuwsgierig bent (of studenten die na jou komen, wilt helpen met betere automatische feedback).
Ik heb dit zo opgezet, omdat het me zinnig lijkt om niet alleen te weten (in het algemeen) dat je iets fout hebt gedaan, maar ook baat hebt bij hints of suggesties zodat je de fout de volgende keer kunt vermijden.


In sommige gevallen staat er geen commentaar, ondanks dat de code wel fout is en er wel punten aftrek zijn gerekend.
Het gaat dan vaak om stukken die handmatig beoordeeld zijn (of: de experimentele feature heeft het af laten weten :-( ...  
Je kunt uiteraard altijd de voorbeeldcode vergelijken met je eigen code om te zien waar het fout is gegaan.



De GUI-onderdelen zijn met de hand nagekeken. Daar zul je geen puntenaantallen in de code vinden. Wel her en der een commentaar om te wijzen op iets wat mis ging,
of iets dat gerepareerd moest worden, voordat de GUI getoond kon worden. In de voorbeelduitwerking van de Dialoog, Frame en tekenpanel vind je de puntenverdeling voor de GUI onderdelen.


Bij het nakijken is alles 'plat geslagen', alle package structuur is weggelaten. Alle java files die je ingeleverd had, zijn verzameld, ook als je ze in meerdere directories had staan.



Als je code had die niet compileerde, is het problematische stuk handmatig uitgecomment of gerepareerd, zodat de rest getest kon worden.
Sterker nog, als je per ongeluk alleen maar *.class files hebt ingeleverd, waren die vaak nog in IntelliJ te decompilen zodat de oorspronkelijke code alsnog bekeken kon worden.
(maar please, volgende keer de juiste bestanden inleveren!)


Op de toets heb je uiteraard vraag 1(a), 1(b), etc... maar "intern" zijn die vragen ook nog opgedeeld in onderdelen. 
De reden hiervoor is dat je op 1 van die onderdelen wellicht zoveel fouten maakt, dat je door alle aftrekpunten niks meer overhoudt, 
terwijl je de rest van de vraag wel goed hebt. Door de indeling in onderwerpen, wordt de schade beperkt. 
(Het alternatief is, om elk klein stukje een nieuwe vraag te laten zijn in de toets, maar dan krijg je vraag 1(a) t/m (z) ofzo)



Een voorbeeldje: Vraag 1(a) over het maken van de Persoon-klasse. Deze is opgedeeld in meerdere onderwerpen:
* 3 punten voor alles wat met het 'abstracte' van de klasse te maken heeft (wordt "@ABSTRACT / ABSTRACT" genoemd in de commentaren)
* 1 punt: het hebben van het juiste attribuut (aanwezig, en private) naam  ("@ABSTRACT / ATTRIBUTEN" in het commentaar)
* 1 punt: het hebben van het juiste attribuut (aanwezig, en private) blij  ("@ABSTRACT / ATTRIBUTEN" in het commentaar)
* 2 punten: de (juiste) constructor, incl. de werking van het opslaan van inputs in attributen ("@ABSTRACT / CONSTRUCTOR" in nakijkcommentaar)
* 2 punten: beide getters ....
* 3 punten: maakBlij  ....
* 3 punten: getKleur ...


stel dat je op onderdeel "getKleur" zoveel fout doet, dat je 20 aftrekpunten hebt, maar je hebt alle andere onderdelen goed.
dan zou je eindscore zijn: 3 + 1 + 1 + 2 + 2 + 3 + 0 = 12 punten, in plaats van 0 punten (15 punten - 20 aftrekpunten), omdat je niet meer dan 3 aftrekpunten van de 3 punten voor getKleur af kunt halen.

In elk onderdeel kun je dus aftrekpunten krijgen voor dingen die verkeerd zijn. 
Het eindresultaat voor een vraag is de optelling van elke categorie (maar elke categorie kan niet lager dan 0 punten gaan).


Je ziet deze punten en aftrekpunten terug in je nagekeken code. In het bovenstaande vb zul je ergens (in de buurt van printLogging, of bovenaan in de klasse) iets tegenkomen zoals:

//mnc07: opgave 1(a)[CONSTRUCTOR: 2 PUNTEN]: Persoon(String,int)

Dit betekent dat het commentaar van mij (of automatisch gegenereerd door mij) is dat over opgave 1(a) gaat (duh) en dat het specifiek gaat over het "CONSTRUCTOR" onderdeel, 
en die categorie was 2 punten waard (en kort de reden waarvoor die punten zijn, in dit geval dus voor de Persoon(String,int) constructor). 
Als zo'n commentaar er niet staat, is dat omdat je die opgave niet gemaakt hebt (of een helemaal lege functie hebt gemaakt). 
Je ktijgt dan uiteraard ook niet de punten van die categorie.

Als je iets fout hebt, dan zie je bv. onderstaand commentaar staan:

//mnc07: opgave 1(a)[CONSTRUCTOR: 1 aftrek]: een of andere reden... heb je aan dit-of-dat gedacht?

Dus: dit hoort bij de categorie "CONSTRUCTOR" van opgave 1(a), en de reden dat het fout is gegaan wordt kort gegeven, samen met hoeveel aftrekpunten dit opleverde.




over de redenen waarom code fout is:
Het is erg lastig om automatisch te bepalen *waarom* iets mis gaat. Dat is zelfs met de hand nog tijdrovend. Vandaar dat het commentaar een educated guess is, 
naar wat waarschijnlijke reden is van de fout. Maar het kan dus zijn dat er een heel andere, zeldzamere, reden was waarom de code niet werkte. 
In dat geval kan het commentaar misleidend zijn.

We bepalen of code goed is of niet, door te kijken wat de code voor outputs geeft op diverse tests die we ook draaien op de goede (voorbeeld) code.
We weten dus wel zeker of code doet wat ie moet doen, of niet, maar niet wat er precies mis is gegaan.

Soms zit er een stukje goede code verborgen in een verkeerde functie: Stel dat je gevraagd wordt om een uitkomst van een berekening te returnen,
en het klassendiagram en/of de tekst van de vraag het heeft over de functie: 

		int doeBerekening() {
			// doe ingewikkeld ...
			return uitkomst_van_ingewikkelde_berekening;
		}
Dan gaan we er vanuit dat die functie (evt met een typo in de naam) aanwezig is, en testen die.
Maar als je de vraag verkeerd begrepen hebt, heb je wellicht:

		void doeBerekening() {
			// doe ingewikkeld ...
			System.out.println( uitkomst_van_ingewikkelde_berekening );
		}		
Het is ontzetten moeilijk om met dit soort situaties rekening te houden (zowel handmatig als automatisch). Het lijkt er in dit geval gewoon op, dat je de functie helemaal niet hebt,
en dus 0 punten verdient op dit onderdeel. Maar... het ging hier natuurlijk om de ingewikkelde berekening, en de vorm van de functie was niet het belangrijkste.
We proberen hier rekening mee te houden, door dit soort situaties te ontdekken en te repareren (de uitkomst returnen, zodat we verder kunnen testen, zodat je het grootste deel van de punten
in ieder geval nog kunt krijgen, namelijk de punten voor de berekening zelf. Je mist dan alleen de punten voor het implementeren van de juiste functie signatuur). 
Maar het kan altijd gebeuren dat zo'n geval over het hoofd gezien wordt, en je alle punten mist. Laat dat in zo'n geval via inzage weten!




Her en der staan ook handmatige commentaren van mij in de code, als ik iets geks tegenkwam en het nader moest onderzoeken. 
Het kan zijn dat je een rare fout had, waardoor de automatisch gegeven "reden" niet helemaal past bij jouw fout. 
De aftrekpunten werden gegeven omdat een onderdeel niet werkte, de reden *waarom* iets niet werkt, is soms alleen maar een vermoeden. 
Je kunt uiteraard in de voorbeelduitwerking kijken hoe het had gekund. 


Als je je afvraagt waarom wat jij gedaan hebt, fout is, zou je contact met me op kunnen nemen via ***Microsoft Teams***.


Wilco Moerman (mnc07)
Java vakverantwoordelijke
cwj.moerman@windesheim.nl