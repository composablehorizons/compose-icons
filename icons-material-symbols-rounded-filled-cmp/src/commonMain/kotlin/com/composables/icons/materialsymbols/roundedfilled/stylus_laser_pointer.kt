package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stylus_laser_pointer: ImageVector
    get() {
        if (_Stylus_laser_pointer != null) return _Stylus_laser_pointer!!
        
        _Stylus_laser_pointer = ImageVector.Builder(
            name = "stylus_laser_pointer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(179f, -139f)
                quadToRelative(-6f, -55f, -41f, -97f)
                reflectiveQuadToRelative(-87f, -57f)
                lineToRelative(106f, -107f)
                horizontalLineTo(236f)
                quadToRelative(-32f, 0f, -54f, -22f)
                reflectiveQuadToRelative(-22f, -54f)
                quadToRelative(0f, -20f, 10.5f, -37.5f)
                reflectiveQuadTo(198f, 338f)
                lineToRelative(486f, -291f)
                quadToRelative(18f, -11f, 38f, -5.5f)
                reflectiveQuadToRelative(31f, 23.5f)
                quadToRelative(11f, 18f, 5.5f, 37.5f)
                reflectiveQuadTo(736f, 133f)
                lineTo(360f, 360f)
                horizontalLineToRelative(364f)
                quadToRelative(32f, 0f, 54f, 22f)
                reflectiveQuadToRelative(22f, 54f)
                quadToRelative(0f, 18f, -4.5f, 35.5f)
                reflectiveQuadTo(778f, 502f)
                lineTo(539f, 741f)
                close()
            }
        }.build()
        
        return _Stylus_laser_pointer!!
    }

private var _Stylus_laser_pointer: ImageVector? = null

