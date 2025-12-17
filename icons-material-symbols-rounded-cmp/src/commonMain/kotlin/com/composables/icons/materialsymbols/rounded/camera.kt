package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(491f, 360f)
                horizontalLineToRelative(285f)
                quadToRelative(-27f, -69f, -82.5f, -118.5f)
                reflectiveQuadTo(566f, 172f)
                lineToRelative(-92f, 158f)
                quadToRelative(-6f, 10f, 0f, 20f)
                reflectiveQuadToRelative(17f, 10f)
                close()
                moveToRelative(-144f, 50f)
                quadToRelative(6f, 10f, 17f, 10f)
                reflectiveQuadToRelative(17f, -10f)
                lineToRelative(143f, -246f)
                quadToRelative(-11f, -2f, -22f, -3f)
                reflectiveQuadToRelative(-22f, -1f)
                quadToRelative(-66f, 0f, -123f, 25f)
                reflectiveQuadToRelative(-101f, 67f)
                lineToRelative(91f, 158f)
                close()
                moveTo(170f, 560f)
                horizontalLineToRelative(183f)
                quadToRelative(11f, 0f, 17.5f, -10f)
                reflectiveQuadToRelative(0.5f, -20f)
                lineTo(228f, 284f)
                quadToRelative(-32f, 41f, -50f, 90.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 21f, 2.5f, 40.5f)
                reflectiveQuadTo(170f, 560f)
                close()
                moveToRelative(224f, 228f)
                lineToRelative(91f, -158f)
                quadToRelative(6f, -10f, -0.5f, -20f)
                reflectiveQuadTo(467f, 600f)
                horizontalLineTo(184f)
                quadToRelative(27f, 69f, 82.5f, 118.5f)
                reflectiveQuadTo(394f, 788f)
                close()
                moveToRelative(86f, 12f)
                quadToRelative(66f, 0f, 123f, -25f)
                reflectiveQuadToRelative(101f, -67f)
                lineToRelative(-91f, -158f)
                quadToRelative(-6f, -10f, -17f, -10f)
                reflectiveQuadToRelative(-17f, 10f)
                lineTo(436f, 796f)
                quadToRelative(11f, 2f, 21.5f, 3f)
                reflectiveQuadToRelative(22.5f, 1f)
                close()
                moveToRelative(252f, -124f)
                quadToRelative(32f, -41f, 50f, -90.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -21f, -2.5f, -40.5f)
                reflectiveQuadTo(790f, 400f)
                horizontalLineTo(607f)
                quadToRelative(-11f, 0f, -17.5f, 10f)
                reflectiveQuadToRelative(-0.5f, 20f)
                lineToRelative(143f, 246f)
                close()
                moveTo(480f, 480f)
                close()
                moveToRelative(0f, 400f)
                quadToRelative(-82f, 0f, -155f, -31.5f)
                reflectiveQuadToRelative(-127.5f, -86f)
                quadTo(143f, 708f, 111.5f, 635f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -155.5f)
                reflectiveQuadToRelative(86f, -127f)
                quadTo(252f, 143f, 325f, 111.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 155.5f, 31.5f)
                reflectiveQuadToRelative(127f, 86f)
                quadToRelative(54.5f, 54.5f, 86f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 82f, -31.5f, 155f)
                reflectiveQuadToRelative(-86f, 127.5f)
                quadToRelative(-54.5f, 54.5f, -127f, 86f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

