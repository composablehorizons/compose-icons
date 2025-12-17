package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Panorama_wide_angle: ImageVector
    get() {
        if (_Panorama_wide_angle != null) return _Panorama_wide_angle!!
        
        _Panorama_wide_angle = ImageVector.Builder(
            name = "panorama_wide_angle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(-91f, 0f, -181.5f, -8.5f)
                reflectiveQuadTo(120f, 760f)
                quadToRelative(-21f, -69f, -30.5f, -138.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -72f, 9.5f, -141.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(79f, -20f, 168f, -30f)
                reflectiveQuadToRelative(192f, -10f)
                quadToRelative(103f, 0f, 192f, 10f)
                reflectiveQuadToRelative(168f, 30f)
                quadToRelative(21f, 69f, 30.5f, 138.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 72f, -10f, 141.5f)
                reflectiveQuadTo(840f, 760f)
                quadToRelative(-88f, 23f, -178.5f, 31.5f)
                reflectiveQuadTo(480f, 800f)
                close()
            }
        }.build()
        
        return _Panorama_wide_angle!!
    }

private var _Panorama_wide_angle: ImageVector? = null

