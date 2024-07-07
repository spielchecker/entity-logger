package com.entity_logger;

public enum HighlightMethod {

    NONE ("None", OutlineType.NONE, FillType.EMPTY),
    OUTLINE_EMPTY ("Outline", OutlineType.OUTLINE, FillType.EMPTY),
    HULL_EMPTY ("Hull (empty)", OutlineType.HULL, FillType.EMPTY),
    HULL_TINTED_LIGHT ("Hull (tinted light)", OutlineType.HULL, FillType.TINTED_LIGHT),
    HULL_TINTED_MEDIUM ("Hull (tinted medium)", OutlineType.HULL, FillType.TINTED_MEDIUM),
    HULL_TINTED_HEAVY ("Hull (tinted heavy)", OutlineType.HULL, FillType.TINTED_HEAVY),
    HULL_SOLID ("Hull (solid)", OutlineType.HULL, FillType.SOLID),
    ;

    public final String name;
    public final OutlineType outlineType;
    public final FillType fillType;

    HighlightMethod (String name, OutlineType outlineType, FillType fillType)
    {
        this.name = name;
        this.outlineType = outlineType;
        this.fillType = fillType;
    }

    public enum OutlineType {
        HULL,
        OUTLINE,
        NONE,
        ;
    };

    public enum FillType {
        EMPTY(0),
        TINTED_LIGHT(63),
        TINTED_MEDIUM(127),
        TINTED_HEAVY(191),
        SOLID(255),
        ;
        public final int alpha;
        FillType(int alpha)
        {
            this.alpha = alpha;
        }
    };

}
