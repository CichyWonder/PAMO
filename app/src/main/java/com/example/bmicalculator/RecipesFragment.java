package com.example.bmicalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class RecipesFragment extends Fragment {

    public RecipesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recipes, container, false);
        TextView recipeText = view.findViewById(R.id.textViewRecipe);
        recipeText.setText("Krok 1\n" +
                "W szerokim rondlu podsmaż posiekaną cebulę. Po chwili dodaj ryż. Całość smaż, aż wszystko się lekko zeszkli. \nKrok 2\n" +
                "Wlej tyle wody, aby zakryła ryż. Dodaj kostkę Knorr i gotuj, mieszając od czasu do czasu, aż ryż wchłonie płyn. Ewentualnie ponownie wlej odrobinę wody. Całość gotuj około 18 minut.\nKrok 3\n" +
                "W tym czasie brokuł podziel na mniejsze różyczki, a szparagi pokrój w plastry." +
                "\nKrok 4\n" +
                "Pod koniec gotowania wlej śmietankę, dodaj wszystkie warzywa i żurawinę. Gotuj jeszcze około 3 minut. Podawaj od razu po przygotowaniu.");
        return view;
    }
}
