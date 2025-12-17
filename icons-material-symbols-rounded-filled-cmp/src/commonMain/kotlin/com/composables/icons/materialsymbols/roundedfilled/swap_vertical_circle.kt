package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Swap_vertical_circle: ImageVector
    get() {
        if (_Swap_vertical_circle != null) return _Swap_vertical_circle!!
        
        _Swap_vertical_circle = ImageVector.Builder(
            name = "swap_vertical_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 354f)
                verticalLineToRelative(126f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 480f)
                verticalLineToRelative(-126f)
                lineToRelative(36f, 35f)
                quadToRelative(11f, 11f, 27.5f, 11f)
                reflectiveQuadToRelative(28.5f, -12f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                lineTo(429f, 229f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(372f, 229f)
                lineTo(268f, 332f)
                quadToRelative(-11f, 11f, -11.5f, 27.5f)
                reflectiveQuadTo(268f, 388f)
                quadToRelative(11f, 11f, 27.5f, 11.5f)
                reflectiveQuadTo(324f, 389f)
                lineToRelative(36f, -35f)
                close()
                moveToRelative(160f, 252f)
                lineToRelative(-36f, -35f)
                quadToRelative(-11f, -11f, -27.5f, -11f)
                reflectiveQuadTo(428f, 572f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                lineToRelative(103f, -104f)
                quadToRelative(11f, -11f, 11.5f, -27.5f)
                reflectiveQuadTo(692f, 572f)
                quadToRelative(-11f, -11f, -27.5f, -11.5f)
                reflectiveQuadTo(636f, 571f)
                lineToRelative(-36f, 35f)
                verticalLineToRelative(-126f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 480f)
                verticalLineToRelative(126f)
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
            }
        }.build()
        
        return _Swap_vertical_circle!!
    }

private var _Swap_vertical_circle: ImageVector? = null

