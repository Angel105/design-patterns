package com.example.design_patterns.factory;

import com.example.design_patterns.factory.ingredient.*;

public interface PizzaIngredientFactory { /*Abstract factory*/
    Dough createDough(); /*factory method*/
    Sauce createSauce(); /*factory method*/
    Cheese createCheese(); /*factory method*/
    Veggies[] createVeggies(); /*factory method*/
    Pepperoni createPepperoni(); /*factory method*/
    Clams createClam(); /*factory method*/
}
