package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Share_eta: ImageVector
    get() {
        if (_Share_eta != null) return _Share_eta!!
        
        _Share_eta = ImageVector.Builder(
            name = "share_eta",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 720f)
                lineTo(372f, 588f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadToRelative(-3f, -15.5f)
                verticalLineToRelative(-159f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 400f)
                verticalLineToRelative(144f)
                lineToRelative(120f, 120f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(409f, -247f)
                quadToRelative(-17f, 3f, -30f, -7f)
                reflectiveQuadToRelative(-18f, -27f)
                quadToRelative(-30f, -118f, -111.5f, -206.5f)
                reflectiveQuadTo(558f, 105f)
                quadToRelative(-16f, -5f, -24f, -19.5f)
                reflectiveQuadToRelative(-4f, -30.5f)
                quadToRelative(5f, -17f, 21f, -24f)
                reflectiveQuadToRelative(33f, -1f)
                quadToRelative(134f, 46f, 229.5f, 150.5f)
                reflectiveQuadTo(944f, 424f)
                quadToRelative(5f, 17f, -4.5f, 31.5f)
                reflectiveQuadTo(913f, 473f)
                close()
                moveToRelative(-163f, -3f)
                quadToRelative(-16f, 4f, -30.5f, -4f)
                reflectiveQuadTo(699f, 442f)
                quadToRelative(-20f, -52f, -57.5f, -94f)
                reflectiveQuadTo(555f, 279f)
                quadToRelative(-14f, -8f, -20f, -23.5f)
                reflectiveQuadToRelative(0f, -30.5f)
                quadToRelative(6f, -16f, 21.5f, -22f)
                reflectiveQuadToRelative(30.5f, 2f)
                quadToRelative(66f, 35f, 114.5f, 91f)
                reflectiveQuadTo(776f, 422f)
                quadToRelative(6f, 16f, -1.5f, 30f)
                reflectiveQuadTo(750f, 470f)
                close()
                moveTo(401f, 960f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadToRelative(-127.5f, -86f)
                quadTo(63f, 788f, 31.5f, 715f)
                reflectiveQuadTo(0f, 560f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadToRelative(86f, -127.5f)
                quadTo(172f, 222f, 245f, 190.5f)
                reflectiveQuadTo(401f, 159f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(441f, 199f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(401f, 239f)
                quadToRelative(-134f, 0f, -227.5f, 93.5f)
                reflectiveQuadTo(80f, 560f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(401f, 880f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(721f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(761f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(801f, 560f)
                quadToRelative(0f, 82f, -31.5f, 155f)
                reflectiveQuadToRelative(-86f, 127.5f)
                quadToRelative(-54.5f, 54.5f, -127f, 86f)
                reflectiveQuadTo(401f, 960f)
                close()
            }
        }.build()
        
        return _Share_eta!!
    }

private var _Share_eta: ImageVector? = null

