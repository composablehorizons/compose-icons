package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Interactive_space: ImageVector
    get() {
        if (_Interactive_space != null) return _Interactive_space!!
        
        _Interactive_space = ImageVector.Builder(
            name = "interactive_space",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(266f, 326f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                lineToRelative(52f, -52f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-52f, -52f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-52f, 52f)
                quadToRelative(-6f, 6f, -6f, 14f)
                reflectiveQuadToRelative(6f, 14f)
                lineToRelative(52f, 52f)
                close()
                moveToRelative(394f, -46f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 220f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(660f, 160f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(600f, 220f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(660f, 280f)
                close()
                moveTo(240f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 880f)
                verticalLineToRelative(-44f)
                quadToRelative(0f, -35f, 19.5f, -65f)
                reflectiveQuadToRelative(51.5f, -45f)
                quadToRelative(49f, -23f, 102f, -34.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(54f, 0f, 107f, 11.5f)
                reflectiveQuadTo(689f, 726f)
                quadToRelative(32f, 15f, 51.5f, 45f)
                reflectiveQuadToRelative(19.5f, 65f)
                verticalLineToRelative(44f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 920f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -280f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveTo(80f, 120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 40f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 120f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 560f)
                horizontalLineToRelative(-85f)
                quadToRelative(-17f, 0f, -27.5f, -13f)
                reflectiveQuadToRelative(-8.5f, -30f)
                quadToRelative(1f, -9f, 1f, -18.5f)
                reflectiveQuadToRelative(-1f, -18.5f)
                quadToRelative(-8f, -76f, -64.5f, -128f)
                reflectiveQuadTo(480f, 300f)
                quadToRelative(-78f, 0f, -134.5f, 52f)
                reflectiveQuadTo(281f, 480f)
                quadToRelative(-1f, 9f, -1f, 18.5f)
                reflectiveQuadToRelative(1f, 18.5f)
                quadToRelative(2f, 17f, -8.5f, 30f)
                reflectiveQuadTo(245f, 560f)
                horizontalLineToRelative(-85f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 480f)
                verticalLineToRelative(-360f)
                close()
            }
        }.build()
        
        return _Interactive_space!!
    }

private var _Interactive_space: ImageVector? = null

