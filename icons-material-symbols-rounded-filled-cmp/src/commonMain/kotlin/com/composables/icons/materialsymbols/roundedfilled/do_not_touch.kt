package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Do_not_touch: ImageVector
    get() {
        if (_Do_not_touch != null) return _Do_not_touch!!
        
        _Do_not_touch = ImageVector.Builder(
            name = "do_not_touch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(402f, 920f)
                quadToRelative(-30f, 0f, -56f, -13.5f)
                reflectiveQuadTo(303f, 868f)
                lineTo(67f, 522f)
                quadToRelative(-8f, -12f, -7f, -26f)
                reflectiveQuadToRelative(12f, -24f)
                quadToRelative(19f, -19f, 45f, -22f)
                reflectiveQuadToRelative(47f, 12f)
                lineToRelative(116f, 81f)
                verticalLineToRelative(-150f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                lineToRelative(-16f, -15f)
                quadToRelative(-20f, 15f, -44f, 23.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(402f)
                close()
                moveToRelative(198f, -467f)
                verticalLineToRelative(-333f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(367f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-287f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(429f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(772f, 658f)
                lineTo(623f, 509f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                close()
                moveTo(280f, 170f)
                verticalLineToRelative(-30f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 140f)
                verticalLineToRelative(30f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 210f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 170f)
                close()
                moveToRelative(160f, 150f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(241f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 320f)
                close()
            }
        }.build()
        
        return _Do_not_touch!!
    }

private var _Do_not_touch: ImageVector? = null

