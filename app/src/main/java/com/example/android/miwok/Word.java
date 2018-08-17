package com.example.android.miwok;

/**
 *  Word represents a vocabulary word that the user wants to learn.
 *  It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** Default translation for that word */
    private String mDefaultTranslation;

    /** Miwok translation for that word */
    private  String mMiwokTranslation;

    /** Image Resource ID for that word */
    private int mImageResourceId;

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    // For the phrase activity
    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word
     */

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
