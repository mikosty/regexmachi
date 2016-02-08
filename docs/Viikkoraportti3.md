Ohjelma on edistynyt jonkin verran, hyvin perusregexeillä toimii jo ja myös testimielessä koodattu '\d+' toimii lähes ongelmitta (esim. regex 'abc\d+5g' matchaa stringiin "abc2342342344g" vaikka ennen 'g':tä tulisi olla '5'). Tilojen käsittelylogiikkaa joutuu siis hiomaan.

Testejä en vielä saanut tehtyä kun ohjelman perus luokkarakenne jne. on muovautunut suhteellisen tiheään tahtiin ja tänään huomasin, että olen luonut perus Java -projektin Maven projektin sijaan. Tämä joutuu siis korjata ilmeisesti luomalla uusi Maven -projekti ja kopiomalla sisältö sinne? Ilmeisesti Github repo saattaa mennä tässä uusiksi?

Tällä viikolla aion korjata '+' operaattorin ongelmat tiloissa sekä tuoda uusia regex -ominaisuuksia ohjelmaan.
