package co.edu.unipiloto.BeerAdviser;

import android.content.Context;

public class BeerExpert {
    public String[] beers;

    public BeerExpert(Context context){
        this.beers = context.getResources().getStringArray(R.array.beers);

    }

    public String getProducts(String transportType){
        switch (transportType) {
            case "Mercancías Sólidas":
                return this.beers[0];
            case "Productos Agrícolas":
                return this.beers[1];
            case "Líquidos":
                return this.beers[2];
        }
        return "No se reconoce";
    }
}