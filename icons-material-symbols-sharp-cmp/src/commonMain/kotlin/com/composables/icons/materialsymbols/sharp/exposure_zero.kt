package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Exposure_zero: ImageVector
    get() {
        if (_Exposure_zero != null) return _Exposure_zero!!
        
        _Exposure_zero = ImageVector.Builder(
            name = "exposure_zero",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                quadToRelative(-100f, 0f, -160f, -79.5f)
                reflectiveQuadTo(260f, 480f)
                quadToRelative(0f, -121f, 60f, -200.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(100f, 0f, 160f, 79.5f)
                reflectiveQuadTo(700f, 480f)
                quadToRelative(0f, 121f, -60f, 200.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveToRelative(0f, -82f)
                quadToRelative(66f, 0f, 99f, -60f)
                reflectiveQuadToRelative(33f, -138f)
                quadToRelative(0f, -78f, -33f, -138f)
                reflectiveQuadToRelative(-99f, -60f)
                quadToRelative(-66f, 0f, -99f, 60f)
                reflectiveQuadToRelative(-33f, 138f)
                quadToRelative(0f, 78f, 33f, 138f)
                reflectiveQuadToRelative(99f, 60f)
                close()
            }
        }.build()
        
        return _Exposure_zero!!
    }

private var _Exposure_zero: ImageVector? = null

