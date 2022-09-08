1.Identifiera och ge exempel på förekomsten i den egna koden av följande: En klass, en metod, en primitiv datatyp samt ett objekt.

_En klass: En klass i Java är en användardefinierad datatyp, en "blueprint", en klassificering, som beskriver beteendet som objektet av dess typ stödjer.
 exempel ur denna program är InvalidAnswerException.java vilket är en class jag la till. Beeteendet på denna class är att returnera "Enter a number between 1-6".
_en metod: En metod är ett kodblock som bara körs när det anropas.
Man kan skicka data  till en metod. Metoder används för att utföra viss kod, och  kallas även funktioner. Fördelen med Metoder är att kunna lägga sin kod och på ett smidigt sätt kunna använda den igen och inte behöva skriva samma kod flera gånger.
Till exempel har jag Addition(); som en method, vilket mitt programm anropa varje gång någon vill addera med hjälp av kalkulatorn. 
Om jag däremot inte hade gjort det till en method skulle jag behöva skriva samma kod om och om nu behöver jag bara anropa metoden. 
_en primitiv datatyp: Dessa är byte,int,short,long,float,double,bollean och char. Det som utgör de är att alla dessa har ett "defaultvärde" till exempel är boolean false. Double och float har 0.0 som default. Boolean finns i programmet som boolean insuse = false; Jag har även använt float i Division();. 
_ett objekt: Ett objekt är en specifik sak, en klass är en typ av sak. Klassen definierar vilken information det behövs. Objektet är själva "saken".Klassen är en typ av sak. Objektet är en specifik sak.
I detta programm finns det ett objekt scanner som deklarares: private static final Scanner scanner = new Scanner(System.in);





2.Förklara hur du gick tillväga för att identifiera de existerande felen och korrigera dessa. Resonera kring hur man smidigast kan identifiera buggar, och om du ev. hade kunnat göra på något annat vis:
Först gick jag ut ifrån det programmet varnade för vilket va till o börja med invallidanswerexpetion, då denna saknade en class komplierade inte koden. 
Detta löste jag genom att lägga till klassen som saknades. Nästa problem upptäckte jag efter jag hade laggt till metoder för alla räknasätten och körde koden, 
någoting stämmde inte med switch då programmet hoppade till näta och nästa val tills valen tog slut, detta berodde på att det saknades break; efter varje case. 
Jag la till det och då kompliera koden som jag vill att den ska göra. Alla räknasätt utförs på det sättet de ska. Det jag kan tänka mig att man hade kunnat gjort annorlunda här är, 
bara för att throw/throws är nytt för mig, är att man hade kunnat haft en enkel try catch istället. 
En annan sak med detta programm är att det inte fanns någon som helst try catch för all inmatning, allstå om user anger ett ord istället eller nåt som inte är ett heltal så krashar programmet ju och det vill man inte. 
3.Resonera kring hur Unit-tester kan ha vara till nytta, i det aktuella projektet och i allmänhet. Ni behöver inte förstå innebörden med testerna.
_Testerna i denna uppgift hade syfte att kolla om varje räknasätt fungerar. Det postiva med unit tests är att man testar ett stycke kod och inte all sin kod som man gör annars. 
Till exempel om någon inte hade fixat första buggen i programmet men visst hur man lägger till adiitions methoden, så hade den personen skulle kunna testa bara den och vetat om det gick att köra koden. 
Jag kan tänka mig att testerna också är bra om man jobbar med ett team, jag kan testa mitt stycke trots att nän annan har bugg i sin. 