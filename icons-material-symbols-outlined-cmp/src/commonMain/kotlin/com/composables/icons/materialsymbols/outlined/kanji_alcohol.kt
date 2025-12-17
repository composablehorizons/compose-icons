package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Kanji_alcohol: ImageVector
    get() {
        if (_Kanji_alcohol != null) return _Kanji_alcohol!!
        
        _Kanji_alcohol = ImageVector.Builder(
            name = "kanji_alcohol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, -120f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-60f)
                horizontalLineTo(400f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, -140f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-40f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                quadToRelative(0f, 26f, -7f, 51f)
                reflectiveQuadToRelative(-21f, 48f)
                lineToRelative(-38f, 62f)
                lineToRelative(-68f, -41f)
                lineToRelative(37f, -62f)
                quadToRelative(8f, -13f, 12f, -27.5f)
                reflectiveQuadToRelative(5f, -30.5f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(400f, 400f)
                verticalLineToRelative(180f)
                close()
                moveToRelative(160f, -300f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 360f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 440f)
                close()
                moveTo(176f, 776f)
                lineToRelative(-72f, -33f)
                lineToRelative(100f, -220f)
                lineToRelative(72f, 33f)
                lineToRelative(-100f, 220f)
                close()
                moveToRelative(19f, -345f)
                lineTo(95f, 351f)
                lineToRelative(50f, -62f)
                lineToRelative(100f, 80f)
                lineToRelative(-50f, 62f)
                close()
                moveToRelative(30f, -150f)
                lineToRelative(-100f, -80f)
                lineToRelative(50f, -62f)
                lineToRelative(100f, 80f)
                lineToRelative(-50f, 62f)
                close()
            }
        }.build()
        
        return _Kanji_alcohol!!
    }

private var _Kanji_alcohol: ImageVector? = null

