package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Light_mode: ImageVector
    get() {
        if (_Light_mode != null) return _Light_mode!!
        
        _Light_mode = ImageVector.Builder(
            name = "light_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveTo(80f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(160f, 520f)
                horizontalLineTo(80f)
                close()
                moveToRelative(720f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 520f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(480f, 200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 160f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 200f)
                close()
                moveToRelative(0f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 880f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 800f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 920f)
                close()
                moveTo(226f, 282f)
                lineToRelative(-43f, -42f)
                quadToRelative(-12f, -11f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -29f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(42f, 43f)
                quadToRelative(11f, 12f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 12f, -27.5f, 11.5f)
                reflectiveQuadTo(226f, 282f)
                close()
                moveToRelative(494f, 495f)
                lineToRelative(-42f, -43f)
                quadToRelative(-11f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(11f, -27.5f)
                quadToRelative(11f, -12f, 27.5f, -11.5f)
                reflectiveQuadTo(734f, 678f)
                lineToRelative(43f, 42f)
                quadToRelative(12f, 11f, 11.5f, 28f)
                reflectiveQuadTo(777f, 777f)
                quadToRelative(-12f, 12f, -29f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveToRelative(-42f, -495f)
                quadToRelative(-12f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(678f, 226f)
                lineToRelative(42f, -43f)
                quadToRelative(11f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(29f, 11.5f)
                quadToRelative(12f, 12f, 12f, 29f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-43f, 42f)
                quadToRelative(-12f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(183f, 777f)
                quadToRelative(-12f, -12f, -12f, -29f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(43f, -42f)
                quadToRelative(12f, -11f, 28.5f, -11f)
                reflectiveQuadToRelative(27.5f, 11f)
                quadToRelative(12f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(282f, 734f)
                lineToRelative(-42f, 43f)
                quadToRelative(-11f, 12f, -28f, 11.5f)
                reflectiveQuadTo(183f, 777f)
                close()
                moveToRelative(297f, -297f)
                close()
            }
        }.build()
        
        return _Light_mode!!
    }

private var _Light_mode: ImageVector? = null

