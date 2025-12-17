package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Thumbs_up_double: ImageVector
    get() {
        if (_Thumbs_up_double != null) return _Thumbs_up_double!!
        
        _Thumbs_up_double = ImageVector.Builder(
            name = "thumbs_up_double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(774f, 680f)
                quadToRelative(-21f, 0f, -32.5f, -17f)
                reflectiveQuadToRelative(-3.5f, -37f)
                lineToRelative(9f, -19f)
                quadToRelative(19f, -47f, 15.5f, -91f)
                reflectiveQuadTo(739f, 437f)
                quadToRelative(-20f, -35f, -56f, -56f)
                reflectiveQuadToRelative(-83f, -21f)
                horizontalLineToRelative(-67f)
                quadToRelative(5f, -34f, -1.5f, -63.5f)
                reflectiveQuadTo(510f, 243f)
                quadToRelative(-5f, -8f, -5f, -18f)
                reflectiveQuadToRelative(7f, -17f)
                lineToRelative(99f, -99f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(3f, 3f)
                quadToRelative(14f, 14f, 19.5f, 31.5f)
                reflectiveQuadTo(694f, 180f)
                lineToRelative(-14f, 100f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 360f)
                verticalLineToRelative(24f)
                quadToRelative(0f, 8f, -2f, 16f)
                reflectiveQuadToRelative(-5f, 15f)
                lineTo(810f, 657f)
                quadToRelative(-5f, 11f, -14.5f, 17f)
                reflectiveQuadToRelative(-21.5f, 6f)
                close()
                moveTo(240f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-327f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(148f, -148f)
                quadToRelative(12f, -12f, 29.5f, -11f)
                reflectiveQuadToRelative(30.5f, 14f)
                quadToRelative(14f, 14f, 19.5f, 31.5f)
                reflectiveQuadTo(454f, 340f)
                lineToRelative(-14f, 100f)
                horizontalLineToRelative(160f)
                quadToRelative(23f, 0f, 41f, 12f)
                reflectiveQuadToRelative(29f, 32f)
                quadToRelative(11f, 20f, 12f, 44f)
                reflectiveQuadToRelative(-9f, 48f)
                lineToRelative(-93f, 216f)
                quadToRelative(-9f, 22f, -29f, 35f)
                reflectiveQuadToRelative(-44f, 13f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(120f, 480f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(80f, 840f)
                close()
            }
        }.build()
        
        return _Thumbs_up_double!!
    }

private var _Thumbs_up_double: ImageVector? = null

