Viikko 1:

Aiheen päättäminen / tutkiminen, repon luonti ja vaadittu dokumentointi.

Ohjelman rakenne ei vielä ole täysin selvillä. Annettu regex tulee jakaa tilakoneen tiloihin ja siirtymiin joten yksi tärkeä osa ohjelmaa on luokka, joka analysoi annetun lausekkeen sekä luokka, joka rakentaa tilakoneen. Seuraavaksi ohjelman tilakoneen tulisi joko hyväksyä tai hylätä annettu syöte.

Epäselvää on, mistä kannattaisi lähteä liikkeelle ja mitä rajotteita tulisi asettaa: en ole varma kannataako toteuttaa kaikki tunnetut säännöllisten lausekkeiden ominaisuudet työmäärään nähden. Ohjelma tulisi rakentaa niin, että laajentaminen olisi helppoa.

Seuraavaksi runkoa ohjelman toimintaperiaatteelle:

  Annettu lauseke: 'ab\dc+'

  Jako seuraaviin siirtymiin/tiloihin:

    'a' -> 'b' -> "[0-9]" -> "c ainakin yhden kerran" -> hyväksyvä tila

    Kaikista tiloista on myös siirtymä hylkäävään tilaan mikäli syötteen seuraava merkki ei vastaa mitään siirtymää.

 Laskennan mallien -kurssin tiedoilla tässä on menty tähän asti, joten juurikaan uutta ei ole vielä tullut opittua. Aikaa on kulunut ehkä 3h kokonaisuudessaan.
