package com.example.googleplay_thiagoaguiar10.model

enum class GameType (val label: String) {

    /*
     <!--
   ▬▬▬ DOCUMENTAÇÃO = Aula 03 = 001:
   ▬ Navegação entre Activitys:
   • Activity Anterior: XXXXX;
   • Activity Atual: GameType;
   • Activity Próxima: fragment_game.xml;
   ▬ Descrição:
   • O GameType Foi recortado de MainFragment;
   -->
     */

    FOR_YOU("For you"),
    TOP_CHARTS("Top charts"),
    PREMIUM("Premium"),
    CATEGORIES("Categories"),
    FAMILY("Family"),
    EDITORS_CHOICE("Editors choice");
}