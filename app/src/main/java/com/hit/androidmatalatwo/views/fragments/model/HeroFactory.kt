package com.hit.androidmatalatwo.views.fragments.model

import com.hit.androidmatalatwo.R

class HeroFactory {

    companion object {
        fun createHeroList(): List<Hero> {
            return listOf(
                Hero(
                    "Bloom",
                    "is the Fairy of the Dragon Flame, which is the most powerful power in the universe originating from the Great Dragon, a primeval deity that created the Magic Dimension. " +
                            "She is the most powerful fairy and the leader of the Winx Club. " +
                            "Before discovering her magical powers, she lived on Earth as an ordinary human, unaware of her birth on the planet Domino. " +
                            "Throughout the first three seasons, Bloom uncovers the mystery behind her home planet's destruction at the hands of the Ancestral Witches, culminating in a battle against them. " +
                            "Bloom dates Sky throughout the series and accepts his marriage proposal in Winx Club 3D: Magical Adventure.",
                    R.drawable.bloom
                ),
                Hero(
                    "Stella",
                    "is the outgoing and spontaneous Fairy of the Shining Sun. She is from Solaria. " +
                            "She has long, blonde hair, and her powers involve manipulating light and using energy from the sun and moon. " +
                            "She is a skilled artist and keeps a sketchbook of fashion drawings. Throughout the series, Stella creates her own outfits for the group to follow her dreams of becoming a fashion designer. " +
                            "Stella is Bloom's best friend and she enjoys being the center of attention. " +
                            "She is the oldest of the Winx, as she was held back at Alfea for a year. " +
                            "She is engaged to Sky's bodyguard, Brandon, whom she tends to obsess over.",
                    R.drawable.stella
                ),
                Hero(
                    "Flora",
                    "is the sensitive and shy Fairy of Nature from the planet Lynphea. " +
                            "She has long, brown hair with blonde bangs and tan skin. " +
                            "Flora draws her strength from plants and her room at Alfea resembles a greenhouse. " +
                            "She is the Winx Club's peacemaker, believing in protecting others and the environment. " +
                            "Flora is the group's potions expert who brews herbal remedies. Flora begins dating Helia in the second season.",
                    R.drawable.flora
                ),
                Hero(
                    "Musa",
                    "is the Fairy of Music from the planet Melody. " +
                            "She has blue-black hair that is worn in short pigtails in the first two seasons and in a longer hairstyle thereafter. " +
                            "Her powers involve manipulating sound waves and music. She loves music and dance, and can be pessimistic at times. " +
                            "She is the most outspoken and sensible of the group. " +
                            "Musa goes through multiple breakups with her boyfriend Riven, including one in season six that carries over through the seventh season, before the two got back together in the eighth season.",
                    R.drawable.musa
                ),
                Hero(
                    "Tecna",
                    "is the Fairy of Technology. " +
                            "She has light skin, short magenta hair (usually worn in a pixie cut), and blue-green eyes. " +
                            "She is from the planet Zenith and draws her magical abilities from machinery and energy. " +
                            "Tecna has a photographic memory and a knowledge of science, helping her invent devices to help herself and her friends. " +
                            "Tecna enjoys experimenting with computer programs and playing video games. " +
                            "She is orderly and rational, using logic to solve problems. Tecna dates Timmy throughout the series.",
                    R.drawable.tecna
                ),
                Hero(
                    "Aisha",
                    "is the Fairy of Waves and a Crown Princess of Andros, introduced in the second season. " +
                            "Aisha joins the Winx after the other fairies rescue her from Lord Darkar. She is from the planet Andros, a realm of oceans." +
                            "She has dark skin, curly dark-brown hair, and blue eyes. Aisha is able to control and manipulate a pink fluid called Morphix." +
                            "She is rebellious and athletic, with a passion for sports and dance. In the sixth and seventh seasons, Aisha enters a romantic relationship with Nex following the death of her fiancé Nabu in the fourth season.",
                    R.drawable.aisha
                ),
                Hero(
                    "Roxy",
                    "is the strong-willed Fairy of Animals, introduced in the fourth season. " +
                            "She occasionally joins the Winx and is named as the Winx Club's seventh member by the show's three production companies. " +
                            "She is the youngest and weakest of the seven fairies.",
                    R.drawable.roxy
                )
            )
        }
    }
}