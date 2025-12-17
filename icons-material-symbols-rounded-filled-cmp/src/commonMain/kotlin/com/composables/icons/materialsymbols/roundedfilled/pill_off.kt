package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pill_off: ImageVector
    get() {
        if (_Pill_off != null) return _Pill_off!!
        
        _Pill_off = ImageVector.Builder(
            name = "pill_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 345f)
                quadToRelative(0f, 45f, -17f, 86f)
                reflectiveQuadToRelative(-49f, 73f)
                lineToRelative(-52f, 52f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(404f, 294f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(52f, -52f)
                quadToRelative(32f, -32f, 73f, -49f)
                reflectiveQuadToRelative(86f, -17f)
                quadToRelative(94f, 0f, 159.5f, 65.5f)
                reflectiveQuadTo(840f, 345f)
                close()
                moveTo(581f, 697f)
                lineToRelative(-77f, 77f)
                quadToRelative(-32f, 32f, -73f, 49f)
                reflectiveQuadToRelative(-86f, 17f)
                quadToRelative(-94f, 0f, -159.5f, -65.5f)
                reflectiveQuadTo(120f, 615f)
                quadToRelative(0f, -45f, 17f, -86f)
                reflectiveQuadToRelative(49f, -73f)
                lineToRelative(77f, -77f)
                lineTo(84f, 200f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(581f, 697f)
                close()
            }
        }.build()
        
        return _Pill_off!!
    }

private var _Pill_off: ImageVector? = null

