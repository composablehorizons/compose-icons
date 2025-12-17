package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mimo_disconnect: ImageVector
    get() {
        if (_Mimo_disconnect != null) return _Mimo_disconnect!!
        
        _Mimo_disconnect = ImageVector.Builder(
            name = "mimo_disconnect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(127f, 127f)
                verticalLineToRelative(112f)
                lineToRelative(-99f, -99f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                lineToRelative(-212f, -212f)
                horizontalLineToRelative(72f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                lineToRelative(40f, -40f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -37f, 23.5f, -55f)
                lineToRelative(23.5f, -18f)
                close()
                moveToRelative(701f, 587f)
                lineTo(234f, 120f)
                horizontalLineToRelative(566f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 26f, -14.5f, 46f)
                reflectiveQuadTo(828f, 714f)
                close()
            }
        }.build()
        
        return _Mimo_disconnect!!
    }

private var _Mimo_disconnect: ImageVector? = null

