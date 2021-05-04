package com.example.midterm

import com.example.midterm.model.Music

class MusicDataSet {
    companion object {
        val dataSet = listOf(
            Music(
                1,
                "Seven nation army",
                "Blackroots",
                R.raw.blackroots_seven_nation_army,
                R.raw.seven_nation_army_lyrics
            ),
            Music(
                2,
                "Ghost town",
                "Adam Lambert",
                R.raw.ghost_town,
                R.raw.ghost_town_lyrics
            ),
            Music(
                3,
                "Razor sharp",
                "Pegboard Nerds & Tristam",
                R.raw.pegboard_nerds_tristam_razor_sharp,
                R.raw.razor_sharp_lyrics
            ),
            Music(
                4,
                "Live My Life",
                "Far East Movement",
                R.raw.live_my_life,
                R.raw.live_my_life_lyrics
            ),
            Music(
                5,
                "That Power",
                "will.i.am",
                R.raw.that_power,
                R.raw.that_power_lyrics
            ),
            Music(
                6,
                "Freaks",
                "Timmy Trumpet",
                R.raw.freaks,
                R.raw.freaks_lyrics
            )
        )
    }
}