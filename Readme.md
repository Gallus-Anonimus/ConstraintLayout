# Zadanie 5 - ekran logowania

Utworzono kompletny ekran logowania przy użyciu `ConstraintLayout`.

Ekran zawiera:
- kwadratowe logo `ImageView`,
- pole e-mail,
- pole hasła,
- checkbox „Zapamiętaj mnie",
- przycisk „Zaloguj",
- przycisk tekstowy „Nie pamiętam hasła".

Wszystkie teksty zostały umieszczone w pliku `strings.xml`.

## Logo

Logo wykorzystuje `ImageView`. Jego kształt kwadratowy został
uzyskany za pomocą:

`app:layout_constraintDimensionRatio="1:1"`

## Orientacja pionowa

W orientacji pionowej elementy są ułożone jeden pod drugim
i ekran wygląda poprawnie.

## Orientacja pozioma

Po obróceniu urządzenia ekran nie jest dostosowany specjalnie
do orientacji poziomej. Układ pozostaje pionowy, przez co:

- pozostaje dużo niewykorzystanego miejsca po bokach,
- elementy są skupione w jednym pionowym układzie,
- przy mniejszej wysokości ekranu może zabraknąć miejsca
  na wszystkie elementy.

Nie zastosowano osobnego layoutu dla orientacji poziomej,
