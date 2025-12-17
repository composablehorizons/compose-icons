package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Panorama_wide_angle: ImageVector
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
                moveToRelative(0f, -320f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(75f, 0f, 149f, -6.5f)
                reflectiveQuadTo(776f, 690f)
                quadToRelative(13f, -52f, 18.5f, -104f)
                reflectiveQuadToRelative(5.5f, -106f)
                quadToRelative(0f, -54f, -5.5f, -106f)
                reflectiveQuadTo(776f, 270f)
                quadToRelative(-65f, -15f, -137.5f, -22.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-85f, 0f, -157.5f, 7.5f)
                reflectiveQuadTo(184f, 270f)
                quadToRelative(-13f, 52f, -18.5f, 104f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 54f, 5.5f, 106f)
                reflectiveQuadTo(184f, 690f)
                quadToRelative(73f, 17f, 147f, 23.5f)
                reflectiveQuadToRelative(149f, 6.5f)
                close()
            }
        }.build()
        
        return _Panorama_wide_angle!!
    }

private var _Panorama_wide_angle: ImageVector? = null

