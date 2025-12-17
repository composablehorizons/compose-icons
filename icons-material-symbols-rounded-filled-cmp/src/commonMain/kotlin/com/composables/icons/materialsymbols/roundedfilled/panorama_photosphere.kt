package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Panorama_photosphere: ImageVector
    get() {
        if (_Panorama_photosphere != null) return _Panorama_photosphere!!
        
        _Panorama_photosphere = ImageVector.Builder(
            name = "panorama_photosphere",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-121f, 0f, -216.5f, -63.5f)
                reflectiveQuadTo(120f, 652f)
                quadToRelative(-11f, -5f, -20f, -9f)
                reflectiveQuadToRelative(-18f, -9f)
                quadToRelative(-20f, -11f, -31f, -29f)
                reflectiveQuadToRelative(-11f, -41f)
                verticalLineToRelative(-168f)
                quadToRelative(0f, -23f, 11f, -41f)
                reflectiveQuadToRelative(31f, -29f)
                quadToRelative(9f, -5f, 18f, -9f)
                reflectiveQuadToRelative(20f, -9f)
                quadToRelative(48f, -101f, 143.5f, -164.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(121f, 0f, 216.5f, 63.5f)
                reflectiveQuadTo(840f, 308f)
                quadToRelative(11f, 5f, 20f, 9f)
                reflectiveQuadToRelative(18f, 9f)
                quadToRelative(20f, 11f, 31f, 29.5f)
                reflectiveQuadToRelative(11f, 40.5f)
                verticalLineToRelative(168f)
                quadToRelative(0f, 22f, -11f, 40.5f)
                reflectiveQuadTo(878f, 634f)
                quadToRelative(-9f, 5f, -18f, 9f)
                reflectiveQuadToRelative(-20f, 9f)
                quadToRelative(-48f, 101f, -143.5f, 164.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(69f, 0f, 131f, -28.5f)
                reflectiveQuadTo(718f, 692f)
                quadToRelative(-59f, 14f, -118.5f, 21f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(-60f, 0f, -119.5f, -7f)
                reflectiveQuadTo(242f, 692f)
                quadToRelative(45f, 51f, 107f, 79.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(0f, -640f)
                quadToRelative(-69f, 0f, -131f, 28.5f)
                reflectiveQuadTo(242f, 268f)
                quadToRelative(59f, -14f, 118.5f, -21f)
                reflectiveQuadToRelative(119.5f, -7f)
                quadToRelative(60f, 0f, 119.5f, 7f)
                reflectiveQuadTo(718f, 268f)
                quadToRelative(-45f, -51f, -107f, -79.5f)
                reflectiveQuadTo(480f, 160f)
                close()
            }
        }.build()
        
        return _Panorama_photosphere!!
    }

private var _Panorama_photosphere: ImageVector? = null

