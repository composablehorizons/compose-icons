package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Language_pinyin: ImageVector
    get() {
        if (_Language_pinyin != null) return _Language_pinyin!!
        
        _Language_pinyin = ImageVector.Builder(
            name = "language_pinyin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveTo(180f, 800f)
                lineToRelative(-20f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-145f)
                quadToRelative(-17f, 7f, -33f, 13.5f)
                reflectiveQuadTo(176f, 600f)
                lineToRelative(-16f, -78f)
                quadToRelative(19f, -4f, 39.5f, -11f)
                reflectiveQuadToRelative(40.5f, -15f)
                verticalLineToRelative(-136f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(96f)
                quadToRelative(15f, -9f, 29f, -18f)
                reflectiveQuadToRelative(27f, -18f)
                verticalLineToRelative(80f)
                quadToRelative(-12f, 10f, -26f, 19.5f)
                reflectiveQuadTo(320f, 537f)
                verticalLineToRelative(263f)
                horizontalLineTo(180f)
                close()
                moveToRelative(222f, 0f)
                lineToRelative(-44f, -66f)
                quadToRelative(42f, -28f, 72.5f, -75f)
                reflectiveQuadToRelative(42.5f, -99f)
                horizontalLineToRelative(-73f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-86f)
                quadToRelative(-14f, 71f, -54.5f, 136.5f)
                reflectiveQuadTo(402f, 800f)
                close()
                moveToRelative(288f, -490f)
                lineToRelative(-69f, -30f)
                quadToRelative(16f, -27f, 35.5f, -59f)
                reflectiveQuadToRelative(31.5f, -61f)
                lineToRelative(74f, 27f)
                quadToRelative(-15f, 29f, -35f, 62f)
                reflectiveQuadToRelative(-37f, 61f)
                close()
                moveToRelative(-189f, -8f)
                quadToRelative(-17f, -25f, -39f, -55f)
                reflectiveQuadToRelative(-42f, -53f)
                lineToRelative(72f, -34f)
                quadToRelative(18f, 23f, 38.5f, 52f)
                reflectiveQuadToRelative(37.5f, 53f)
                lineToRelative(-67f, 37f)
                close()
            }
        }.build()
        
        return _Language_pinyin!!
    }

private var _Language_pinyin: ImageVector? = null

