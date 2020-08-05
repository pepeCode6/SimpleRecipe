package com.pepecode.simplerecipe

class RecipesFactory {

    var recipes: ArrayList<Recipe> = ArrayList()

    init {

        recipes.add( Recipe("Hamburgesa", R.drawable.hamburger,
            arrayListOf("partir los panes", "tostar los panes", "cocinar la carne"),
            30, "Una deliciosa hamburgesa, hecha para los paladares mas exigentes" ))

        recipes.add( Recipe("Banderilla", R.drawable.banderilla,
            arrayListOf("partir las salchichas al tamaño que quieramos", "hacer la harina de las banderillas",
                "llenar la salchica con la harina", "freir la banderilla"),
            10, "Degusta de una banderilla crugiente, caliente y deliciosa." ))

        recipes.add( Recipe("Papas fritas", R.drawable.chips,
            arrayListOf("lavar las papas", "pelar las papas", "rayar las papas", "ehcar las papas en aceite", "quitar el exceso de aceite", "agregar sal y servir"),
            15, "Prueba las mejores papas fritas hechas al momento y en casa." ))

        recipes.add( Recipe("Enchiladas", R.drawable.enchiladas,
            arrayListOf("hacer la salsa", "dorar las tortillas", "mojar las tortillas en la salsa", "servir las tortillas dobladas", "agregar queso, crema y pollo"),
            30, "Las mejores enchiladas del mundo mundial, solo para ti." ))

        recipes.add( Recipe("Pizza", R.drawable.pizza,
            arrayListOf("hacer la masa", "hacer la salsa base", "picar los ingredientes", "hornear por 40 min", "partir la pizza"),
            60, "La pizza con mejor sabor, la mas crujiente y con mucho queso." ))

        recipes.add( Recipe("Ensalada", R.drawable.salad,
            arrayListOf("lavar los ingredientes", "picar los ingredientes", "mezclar todo muy bien"),
            10, "Para esos dias de ponerte en forma que mejor que una comida ligera." ))

        recipes.add( Recipe("Salmon", R.drawable.salmon,
            arrayListOf("limpiar el salmon", "sacar rebanas del tamaño deseado", "picar cebolla, cilantro y epazote", "freir el salmon a uego lento" ),
            30, "Cuando te estas cuidando, nada mejor que la proteina del mar para ayudarte a lograr tus objetivos." ))

        recipes.add( Recipe("Sandwitch", R.drawable.sandwich,
            arrayListOf("dorar los panes", "agregar mayonesa a los panes", "poner jamon, queso, jitomate y lechuga entre los panes"),
            5, "Algo simple pero delicioso, saludable pero barato." ))

        recipes.add( Recipe("Sopa", R.drawable.soup,
            arrayListOf("Picar los ingredientes", "hervir agua", "agregar los ingredientes", "dejar sasonar por 10 minutos"),
            30, "Porque nunca debe faltar en una comida completa, acompaña cualquier platillo con sopa." ))

    }


}