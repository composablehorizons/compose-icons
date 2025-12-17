package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Whatshot: ImageVector
    get() {
        if (_Whatshot != null) return _Whatshot!!
        
        _Whatshot = ImageVector.Builder(
            name = "whatshot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(82f, 440f)
                quadToRelative(15f, -152f, 128f, -256f)
                reflectiveQuadToRelative(270f, -104f)
                quadToRelative(83f, 0f, 155.5f, 31.5f)
                reflectiveQuadToRelative(127f, 86f)
                quadToRelative(54.5f, 54.5f, 86f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 82f, -31.5f, 155f)
                reflectiveQuadToRelative(-86f, 127.5f)
                quadToRelative(-54.5f, 54.5f, -127f, 86f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-53f, 0f, -103f, -13f)
                reflectiveQuadToRelative(-95f, -39f)
                quadToRelative(-18f, -10f, -20f, -29f)
                reflectiveQuadToRelative(14f, -35f)
                quadToRelative(9f, -9f, 23f, -11f)
                reflectiveQuadToRelative(25f, 5f)
                quadToRelative(37f, 20f, 76f, 31f)
                reflectiveQuadToRelative(80f, 11f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-123f, 0f, -213f, 80.5f)
                reflectiveQuadTo(162f, 440f)
                quadToRelative(-2f, 17f, -13.5f, 28.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -12f)
                reflectiveQuadTo(82f, 440f)
                close()
                moveToRelative(398f, 40f)
                close()
                moveToRelative(160f, -24f)
                verticalLineToRelative(64f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 520f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 320f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 400f)
                horizontalLineToRelative(64f)
                lineTo(438f, 546f)
                lineToRelative(-92f, -77f)
                quadToRelative(-12f, -10f, -27.5f, -9f)
                reflectiveQuadTo(292f, 472f)
                lineTo(139f, 625f)
                quadToRelative(-10f, 10f, -11.5f, 23.5f)
                reflectiveQuadTo(133f, 674f)
                quadToRelative(10f, 17f, 29f, 19f)
                reflectiveQuadToRelative(33f, -12f)
                lineToRelative(127f, -127f)
                lineToRelative(92f, 77f)
                quadToRelative(12f, 10f, 27.5f, 9f)
                reflectiveQuadToRelative(26.5f, -12f)
                lineToRelative(172f, -172f)
                close()
            }
        }.build()
        
        return _Whatshot!!
    }

private var _Whatshot: ImageVector? = null

