package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val teamAscore: TextView =findViewById(R.id.team_a_score)
        val teamBscore: TextView =findViewById(R.id.team_b_score)

        val add3ptsBtnTeamA: Button = findViewById(R.id.team_a_3points)
        val add2ptsBtnTeamA: Button = findViewById(R.id.team_a_2points)
        val fthrowBtnTeamA: Button = findViewById(R.id.team_a_foul_shot)
        val add3ptsBtnTeamB: Button = findViewById(R.id.team_b_3points)
        val add2ptsBtnTeamB: Button = findViewById(R.id.team_b_2points)
        val fthrowBtnTeamB: Button = findViewById(R.id.team_b_foul_shot)
        val resetBtn: Button = findViewById(R.id.reset_btn)

        add3ptsBtnTeamA.setOnClickListener { plusScore(3,teamAscore)}
        add2ptsBtnTeamA.setOnClickListener { plusScore(2,teamAscore) }
        fthrowBtnTeamA.setOnClickListener { plusScore(1,teamAscore) }
        add2ptsBtnTeamB.setOnClickListener { plusScore(2,teamBscore) }
        add3ptsBtnTeamB.setOnClickListener { plusScore(3,teamBscore) }
        fthrowBtnTeamB.setOnClickListener { plusScore(1,teamBscore) }
        resetBtn.setOnClickListener { teamAscore.text="0"
            teamBscore.text="0"}
    }
    private fun plusScore(points:Int,label:TextView){
        val currentScore=label.text.toString().toInt()
        val newScore=currentScore+points
        label.text="$newScore"
    }
}