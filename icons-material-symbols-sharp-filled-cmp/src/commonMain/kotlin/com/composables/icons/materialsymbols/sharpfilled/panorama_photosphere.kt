package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Panorama_photosphere: ImageVector
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
                lineToRelative(-80f, -38f)
                verticalLineToRelative(-268f)
                lineToRelative(80f, -38f)
                quadToRelative(48f, -101f, 143.5f, -164.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(121f, 0f, 216.5f, 63.5f)
                reflectiveQuadTo(840f, 308f)
                lineToRelative(80f, 38f)
                verticalLineToRelative(268f)
                lineToRelative(-80f, 38f)
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

