package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Build: ImageVector
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
            }
        }.build()
        
        return _Build!!
    }

private var _Build: ImageVector? = null

