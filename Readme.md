# Zadanie 4 - Łańcuch i style

W zadaniu utworzono trzy przyciski umieszczone w jednym poziomym
łańcuchu (`horizontal chain`) na dole ekranu.

## Style łańcucha

### 1. Spread

Styl `spread` rozkłada elementy łańcucha na całej dostępnej
szerokości. Wolna przestrzeń jest rozdzielana pomiędzy przyciski.

![Spread](docs/chain-spread.png)

### 2. Spread inside

Styl `spread_inside` powoduje, że pierwszy przycisk znajduje się
przy lewej krawędzi, a ostatni przy prawej krawędzi. Wolna przestrzeń
jest rozdzielana pomiędzy elementami znajdującymi się wewnątrz
łańcucha.

![Spread inside](docs/chain-spread-inside.png)

### 3. Packed

Styl `packed` grupuje wszystkie przyciski razem. Przyciski znajdują
się obok siebie, a wolna przestrzeń pozostaje po bokach całej grupy.

![Packed](docs/chain-packed.png)

## Różnice

- `spread` - elementy są rozłożone w całej dostępnej przestrzeni.
- `spread_inside` - pierwszy i ostatni element są przy krawędziach,
  a wolna przestrzeń znajduje się pomiędzy elementami.
- `packed` - wszystkie elementy są skupione obok siebie.

## Wersja końcowa

Na końcu pozostawiono styl `spread` z wagami `1 : 2 : 1`.

Oznacza to, że pierwszy i trzeci przycisk mają taką samą szerokość,
natomiast drugi przycisk otrzymuje dwa razy większą szerokość.

```text
Przycisk 1 : Przycisk 2 : Przycisk 3
       1   :       2     :       1
```
