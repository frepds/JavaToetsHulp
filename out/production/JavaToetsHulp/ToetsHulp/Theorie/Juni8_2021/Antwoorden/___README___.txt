Dit document geeft een toelichting op hoe de becijfering achter de schermen in z'n werk gaat, en hoe je dat terug kunt zien in de nagekeken code.
Wat voor punten/puntenaftrek er was, staat in de toets pdf.

Er is zoveel mogelijk geprobeerd om automatisch (zinvol) commentaar te plaatsen bij de onderdelen, zodat je van je fouten kunt leren. 
Het plaatsen van de correcte/toelichtend comments is nog een experimentele feature, dus er kun wel eens iets staan dat niet helemaal begrijpelijk is. 
Neem in dat geval contact met me op via Microsoft Teams. In sommige gevallen staat er geen commentaar, ondanks dat de code wel fout is en er wel punten aftrek zijn gerekend.
Het gaat dan vaak om stukken die handmatig beoordeeld zijn maar waar automatisch verkeerd commentaar bij gezet wordt.
Je kunt uiteraard altijd de voorbeeldcode vergelijken met je eigen code om te zien waar het fout is gegaan.


Bij het nakijken is alles 'plat geslagen', alle package structuur is weggelaten. Alle java files die je ingeleverd had, zijn verzameld, ook als je ze in meerdere directories had staan.

Als je code had die niet compileerde, is het problematische stuk met de hand uitgecomment, zodat de rest getest kon worden.

================== puntentelling ========================
Op de toets heb je uiteraard vraag 1(a), 1(b), etc... maar "intern" zijn die vragen ook nog opgedeeld in onderdelen. 
De reden hiervoor is dat je op 1 van die onderdelen wellicht zoveel fouten maakt, dat je door alle aftrekpunten niks meer overhoudt, 
terwijl je de rest van de vraag wel goed hebt. Door de indeling in onderwerpen, wordt de schade beperkt. 
(Het alternatief is, om elk klein stukje een nieuwe vraag te laten zijn in de toets, maar dan krijg je vraag 1(a) t/m (z) ofzo)

Een voorbeeldje [uit de toets van p3]: Vraag 1(c) over het loggen van de legale/illegale waardes bij van ToetsHulp.Theorie.April9_2021.Antwoorden.Opgave1.ToetsHulp.Theorie.April9_2021.StartSituatie.Opgave1.ToetsHulp.NieuwePoging.April9.Opgave1.Beschermd. Deze is opgedeeld in 3 delen.
3 punten voor het hebben van de statische printLogging functie, ook al print ie onzin (dat onderdeel heet dan "PRINT")
4 punten voor het hebben van 1 of meer statische attributen ("TELLER") omdat dat de basis is die je sowieso nodig hebt, als je wilt gaan tellen.
8 punten voor de correcte werking ("WERKING")


stel dat je op onderdeel "WERKING" zoveel fout doet, dat je 20 aftrekpunten hebt, maar je hebt wel een statische methode printLogging hebt, die iets doet (ook al is het fout) en statische attributen, 
dan zou je eindscore zijn: 3 + 4 + 0 = 7 punten, in plaats van 0 punten (15 punten - 20 aftrekpunten). 

In elk onderdeel kun je dus aftrekpunten krijgen voor dingen die verkeerd zijn. 
Het eindresultaat voor een vraag is de optelling van elke categorie (maar elke categorie kan niet lager dan 0 punten gaan).


Je ziet deze punten en aftrekpunten terug in je nagekeken code. In het bovenstaande vb zul je ergens of bovenaan de klasse iets tegenkomen zoals:

//mnc07: opgave 1(c)[PRINT: puntenverdeling: 3 PUNTEN]: Statische functie printLogging() aanwezig ---> ....

Dit betekent dat het commentaar van mij (of automatisch gegenereerd door mij) is dat over opgave 1(c) gaat (duh) en dat het specifiek gaat over de "PRINT" categorie, 
en die categorie was 3 punten waard (en kort de reden waarvoor die punten zijn). Erachter staat hoeveel je op dit onderdeel gescoord hebt.
Als zo'n commentaar er niet staat, is dat omdat je die opgave niet gemaakt hebt (of een helemaal lege functie hebt gemaakt). 
Je ktijgt dan uiteraard ook niet de punten van die categorie.

Als je iets fout hebt, dan zie je bv. onderstaand commentaar staan:

//mnc07: opgave 1(c)[PRINT: 1 aftrek]: een of andere reden... heb je aan dit-of-dat gedacht?

Dus: dit hoort bij de categorie "PRINT" van opgave 1(c), en de reden dat het fout is gegaan wordt kort gegeven, samen met hoeveel aftrekpunten dit opleverde.


=========== overig commentaar, handmatig =--=========
Her en der staan ook handmatige commentaren van mij in de code, als ik iets geks tegenkwam en het nader moest onderzoeken. 
Het kan zijn dat je een rare fout had, waardoor de automatisch gegeven "reden" niet helemaal past bij jouw fout. 

De aftrekpunten werden gegeven omdat een onderdeel simplelweg niet werkte (ongeacht hoe de code eruit ziet, wat voor manier van oplossen gekozen is, etc). Maar de reden *waarom* iets niet werkt, is soms alleen maar een vermoeden. Je kunt uiteraard in de voorbeelduitwerking kijken hoe het had gemoeten. 

Als je je afvraagt waarom wat jij gedaan hebt, fout is, zou je contact met me op kunnen nemen via ***Microsoft Teams***.


Wilco Moerman (mnc07)
Java vakverantwoordelijke
cwj.moerman@windesheim.nl