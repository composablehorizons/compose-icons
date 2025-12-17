package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Swap_horizontal_circle: ImageVector
    get() {
        if (_Swap_horizontal_circle != null) return _Swap_horizontal_circle!!
        
        _Swap_horizontal_circle = ImageVector.Builder(
            name = "swap_horizontal_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(354f, 600f)
                horizontalLineToRelative(126f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 560f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 520f)
                horizontalLineTo(354f)
                lineToRelative(35f, -36f)
                quadToRelative(11f, -11f, 11f, -27.5f)
                reflectiveQuadTo(388f, 428f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineTo(228f, 532f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                lineToRelative(104f, 104f)
                quadToRelative(11f, 11f, 27.5f, 11.5f)
                reflectiveQuadTo(388f, 692f)
                quadToRelative(11f, -11f, 11.5f, -27.5f)
                reflectiveQuadTo(389f, 636f)
                lineToRelative(-35f, -36f)
                close()
                moveToRelative(252f, -160f)
                lineToRelative(-35f, 36f)
                quadToRelative(-11f, 11f, -11f, 27.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(104f, -104f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineTo(628f, 268f)
                quadToRelative(-11f, -11f, -27.5f, -11.5f)
                reflectiveQuadTo(572f, 268f)
                quadToRelative(-11f, 11f, -11.5f, 27.5f)
                reflectiveQuadTo(571f, 324f)
                lineToRelative(35f, 36f)
                horizontalLineTo(480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 440f)
                horizontalLineToRelative(126f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Swap_horizontal_circle!!
    }

private var _Swap_horizontal_circle: ImageVector? = null

