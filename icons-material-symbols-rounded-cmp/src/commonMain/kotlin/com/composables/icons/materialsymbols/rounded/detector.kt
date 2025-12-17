package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Detector: ImageVector
    get() {
        if (_Detector != null) return _Detector!!
        
        _Detector = ImageVector.Builder(
            name = "detector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-88f, 0f, -168.5f, -33f)
                reflectiveQuadTo(169f, 711f)
                quadToRelative(-5f, -5f, -8.5f, -13f)
                reflectiveQuadToRelative(-3.5f, -16f)
                quadToRelative(0f, -17f, 12f, -28.5f)
                reflectiveQuadToRelative(29f, -11.5f)
                quadToRelative(8f, 0f, 15.5f, 3f)
                reflectiveQuadToRelative(12.5f, 9f)
                quadToRelative(51f, 51f, 117f, 78.5f)
                reflectiveQuadTo(481f, 760f)
                quadToRelative(72f, 0f, 137.5f, -27f)
                reflectiveQuadTo(735f, 655f)
                quadToRelative(5f, -5f, 12.5f, -8.5f)
                reflectiveQuadTo(763f, 643f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(803f, 683f)
                quadToRelative(0f, 8f, -3.5f, 15.5f)
                reflectiveQuadTo(791f, 711f)
                quadToRelative(-63f, 63f, -143f, 96f)
                reflectiveQuadToRelative(-168f, 33f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-56f, 0f, -107f, -21f)
                reflectiveQuadToRelative(-91f, -61f)
                quadToRelative(-5f, -5f, -8.5f, -12.5f)
                reflectiveQuadTo(270f, 570f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(310f, 530f)
                quadToRelative(8f, 0f, 15.5f, 3.5f)
                reflectiveQuadTo(338f, 542f)
                quadToRelative(29f, 29f, 65.5f, 43.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(40f, 0f, 76.5f, -14.5f)
                reflectiveQuadTo(622f, 542f)
                quadToRelative(5f, -5f, 12.5f, -8.5f)
                reflectiveQuadTo(650f, 530f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(690f, 570f)
                quadToRelative(0f, 8f, -3.5f, 15.5f)
                reflectiveQuadTo(678f, 598f)
                quadToRelative(-40f, 40f, -91f, 61f)
                reflectiveQuadToRelative(-107f, 21f)
                close()
                moveTo(200f, 200f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                close()
                moveToRelative(124f, 120f)
                lineToRelative(12f, 40f)
                horizontalLineToRelative(288f)
                lineToRelative(12f, -40f)
                horizontalLineTo(324f)
                close()
                moveToRelative(12f, 120f)
                quadToRelative(-26f, 0f, -47f, -15.5f)
                reflectiveQuadTo(260f, 384f)
                lineToRelative(-20f, -64f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 240f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 320f)
                horizontalLineToRelative(-40f)
                lineToRelative(-26f, 68f)
                quadToRelative(-9f, 23f, -29f, 37.5f)
                reflectiveQuadTo(620f, 440f)
                horizontalLineTo(336f)
                close()
                moveTo(200f, 200f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Detector!!
    }

private var _Detector: ImageVector? = null

