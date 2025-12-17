package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Savings: ImageVector
    get() {
        if (_Savings != null) return _Savings!!
        
        _Savings = ImageVector.Builder(
            name = "savings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(237f, 840f)
                quadToRelative(-23f, 0f, -44.5f, -16f)
                reflectiveQuadTo(164f, 785f)
                quadToRelative(-25f, -84f, -41f, -145.5f)
                reflectiveQuadToRelative(-25.5f, -108f)
                quadTo(88f, 485f, 84f, 449f)
                reflectiveQuadToRelative(-4f, -69f)
                quadToRelative(0f, -92f, 64f, -156f)
                reflectiveQuadToRelative(156f, -64f)
                horizontalLineToRelative(200f)
                quadToRelative(27f, -36f, 68.5f, -58f)
                reflectiveQuadToRelative(91.5f, -22f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(720f, 140f)
                quadToRelative(0f, 6f, -1.5f, 12f)
                reflectiveQuadToRelative(-3.5f, 11f)
                quadToRelative(-4f, 11f, -7.5f, 22f)
                reflectiveQuadToRelative(-5.5f, 24f)
                lineToRelative(91f, 91f)
                horizontalLineToRelative(47f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 340f)
                verticalLineToRelative(210f)
                quadToRelative(0f, 13f, -7.5f, 23f)
                reflectiveQuadTo(852f, 588f)
                lineToRelative(-85f, 28f)
                lineToRelative(-50f, 167f)
                quadToRelative(-8f, 26f, -29f, 41.5f)
                reflectiveQuadTo(640f, 840f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(480f, 760f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(320f, 840f)
                horizontalLineToRelative(-83f)
                close()
                moveToRelative(3f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                lineToRelative(62f, -206f)
                lineToRelative(98f, -33f)
                verticalLineToRelative(-141f)
                horizontalLineToRelative(-40f)
                lineTo(620f, 240f)
                quadToRelative(0f, -20f, 2.5f, -39f)
                reflectiveQuadToRelative(7.5f, -37f)
                quadToRelative(-29f, 8f, -51f, 27.5f)
                reflectiveQuadTo(547f, 240f)
                horizontalLineTo(300f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 41f, 21f, 140.5f)
                reflectiveQuadTo(240f, 760f)
                close()
                moveToRelative(400f, -320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(640f, 440f)
                close()
                moveToRelative(-160f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 360f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(0f, 102f)
                close()
            }
        }.build()
        
        return _Savings!!
    }

private var _Savings: ImageVector? = null

