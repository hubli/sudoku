package com.example.SudoKu;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-5
 * Time: 下午3:27
 * To change this template use File | Settings | File Templates.
 */
public class Game extends Activity {

    private static final String TAG = "Sudoku";

    public static final String KEY_DIFFICULTY = "difficulty";
    public static final int DIFFICULTY_EASY = 0;
    public static final int DIFFCULTY_MEDIUM = 1;
    public static final int DIFFCULTY_HARD = 2;

    private int puzzle[] = new int[9 * 9];
    private PuzzleView puzzleView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");

        int diff = getIntent().getIntExtra(KEY_DIFFICULTY, DIFFICULTY_EASY);
        //puzzle = getPuzzle(diff);
        //calculateUsedTitles();

        puzzleView = new PuzzleView(this);
        setContentView(puzzleView);
        puzzleView.requestFocus();
    }
}