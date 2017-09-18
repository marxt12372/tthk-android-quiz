package eu.marxt12372.quiz;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper
{
    public DBHandler(Context context)
    {
        super(context, "max_score", null, 2);
    }

    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE score (id INTEGER PRIMARY KEY AUTOINCREMENT, score INTEGER);");
        db.execSQL("INSERT INTO score (id, score) VALUES ('1', '0')");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS score");
        onCreate(db);
    }

    public int getMaxScore()
    {
        int maxScore = 0;
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM score WHERE id = 1;", null);
        c.moveToFirst();
        maxScore = c.getInt(c.getColumnIndex("score"));
        db.close();
        return maxScore;
    }

    public void setMaxScore(int newMaxScore)
    {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("UPDATE score SET score = " + newMaxScore + " WHERE id = 1;");
        db.close();
    }
}
