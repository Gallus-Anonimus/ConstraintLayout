# Opis atrybutów przycisków

## Przycisk środkowy (`button5`)

- `android:id="@+id/button5"` – nadaje przyciskowi identyfikator `button5`, dzięki któremu można odwołać się do niego w kodzie i w layoucie.
- `android:layout_width="wrap_content"` – ustawia szerokość przycisku tak, aby obejmowała jego zawartość.
- `android:layout_height="wrap_content"` – ustawia wysokość przycisku odpowiednio do jego zawartości.
- `android:text="Button"` – wyświetla na przycisku napis „Button”.
- `app:layout_constraintBottom_toBottomOf="parent"` – wiąże dolną krawędź przycisku z dolną krawędzią całego układu.
- `app:layout_constraintEnd_toEndOf="parent"` – wiąże końcową, czyli w tym przypadku prawą, krawędź przycisku z prawą krawędzią układu.
- `app:layout_constraintHorizontal_bias="0.51"` – przesuwa przycisk minimalnie w prawo względem poziomego środka dostępnej przestrzeni.
- `app:layout_constraintStart_toStartOf="parent"` – wiąże początkową, czyli w tym przypadku lewą, krawędź przycisku z lewą krawędzią układu.
- `app:layout_constraintTop_toTopOf="parent"` – wiąże górną krawędź przycisku z górną krawędzią całego układu.
- `app:layout_constraintVertical_bias="0.45"` – przesuwa przycisk trochę powyżej pionowego środka dostępnej przestrzeni.

## Przycisk z biasem (`button8`)

- `android:id="@+id/button8"` – nadaje przyciskowi identyfikator `button8`, używany do wskazywania go w kodzie lub XML-u.
- `android:layout_width="wrap_content"` – dopasowuje szerokość przycisku do znajdującego się w nim tekstu.
- `android:layout_height="wrap_content"` – dopasowuje wysokość przycisku do jego zawartości.
- `android:text="Button"` – ustawia widoczny na przycisku napis „Button”.
- `app:layout_constraintBottom_toBottomOf="parent"` – łączy dolną krawędź przycisku z dolną krawędzią rodzica.
- `app:layout_constraintEnd_toEndOf="parent"` – łączy prawą krawędź przycisku z prawą krawędzią rodzica.
- `app:layout_constraintStart_toStartOf="parent"` – łączy lewą krawędź przycisku z lewą krawędzią rodzica.
- `app:layout_constraintTop_toTopOf="parent"` – łączy górną krawędź przycisku z górną krawędzią rodzica.
- `app:layout_constraintHorizontal_bias="0.75"` – umieszcza przycisk na 75% poziomej przestrzeni między lewym i prawym ograniczeniem, więc znajduje się bliżej prawej strony.
- `app:layout_constraintVertical_bias="0.25"` – umieszcza przycisk na 25% pionowej przestrzeni między górnym i dolnym ograniczeniem, więc znajduje się bliżej góry.
