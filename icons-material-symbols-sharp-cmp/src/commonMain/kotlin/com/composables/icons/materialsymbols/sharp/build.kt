package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Build: ImageVector
    get() {
        if (_Build != null) return _Build!!
        
        _Build = ImageVector.Builder(
            name = "build",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(715f, 857f)
                lineTo(444f, 584f)
                quadToRelative(-20f, 8f, -40.5f, 12f)
                reflectiveQuadToRelative(-43.5f, 4f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -36f, 10f, -68.5f)
                reflectiveQuadToRelative(28f, -61.5f)
                lineToRelative(146f, 146f)
                lineToRelative(72f, -72f)
                lineToRelative(-146f, -146f)
                quadToRelative(29f, -18f, 61.5f, -28f)
                reflectiveQuadToRelative(68.5f, -10f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 23f, -4f, 43.5f)
                reflectiveQuadTo(584f, 444f)
                lineToRelative(273f, 271f)
                lineToRelative(-142f, 142f)
                close()
                moveToRelative(0f, -114f)
                lineToRelative(27f, -27f)
                lineToRelative(-256f, -256f)
                quadToRelative(18f, -20f, 26f, -46.5f)
                reflectiveQuadToRelative(8f, -53.5f)
                quadToRelative(0f, -60f, -38.5f, -104.5f)
                reflectiveQuadTo(386f, 202f)
                lineToRelative(102f, 102f)
                lineToRelative(-184f, 184f)
                lineToRelative(-102f, -102f)
                quadToRelative(9f, 57f, 53.5f, 95.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(26f, 0f, 52f, -8f)
                reflectiveQuadToRelative(47f, -25f)
                lineToRelative(256f, 256f)
                close()
                moveTo(472f, 472f)
                close()
            }
        }.build()
        
        return _Build!!
    }

private var _Build: ImageVector? = null

