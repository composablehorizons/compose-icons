package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Interactive_space: ImageVector
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
                moveTo(160f, 560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 480f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 40f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 120f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 560f)
                horizontalLineTo(671f)
                quadToRelative(6f, -20f, 8f, -40f)
                reflectiveQuadToRelative(0f, -40f)
                quadToRelative(-8f, -76f, -64.5f, -128f)
                reflectiveQuadTo(480f, 300f)
                quadToRelative(-78f, 0f, -134.5f, 52f)
                reflectiveQuadTo(281f, 480f)
                quadToRelative(-2f, 20f, 0f, 40f)
                reflectiveQuadToRelative(8f, 40f)
                horizontalLineTo(160f)
                close()
                moveToRelative(120f, -220f)
                lineToRelative(80f, -80f)
                lineToRelative(-80f, -80f)
                lineToRelative(-80f, 80f)
                lineToRelative(80f, 80f)
                close()
                moveToRelative(380f, -60f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 220f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(660f, 160f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(600f, 220f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(660f, 280f)
                close()
                moveTo(200f, 920f)
                verticalLineToRelative(-84f)
                quadToRelative(0f, -35f, 19.5f, -65f)
                reflectiveQuadToRelative(51.5f, -45f)
                quadToRelative(49f, -23f, 102f, -34.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(54f, 0f, 107f, 11.5f)
                reflectiveQuadTo(689f, 726f)
                quadToRelative(32f, 15f, 51.5f, 45f)
                reflectiveQuadToRelative(19.5f, 65f)
                verticalLineToRelative(84f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -280f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
            }
        }.build()
        
        return _Interactive_space!!
    }

private var _Interactive_space: ImageVector? = null

