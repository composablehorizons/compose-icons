package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Build: ImageVector
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
                moveTo(360f, 600f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -20f, 3f, -40f)
                reflectiveQuadToRelative(11f, -38f)
                quadToRelative(5f, -10f, 12.5f, -15f)
                reflectiveQuadToRelative(16.5f, -7f)
                quadToRelative(9f, -2f, 18.5f, 0.5f)
                reflectiveQuadTo(199f, 271f)
                lineToRelative(105f, 105f)
                lineToRelative(72f, -72f)
                lineToRelative(-105f, -105f)
                quadToRelative(-8f, -8f, -10.5f, -17.5f)
                reflectiveQuadTo(260f, 163f)
                quadToRelative(2f, -9f, 7f, -16.5f)
                reflectiveQuadToRelative(15f, -12.5f)
                quadToRelative(18f, -8f, 38f, -11f)
                reflectiveQuadToRelative(40f, -3f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 23f, -4f, 43.5f)
                reflectiveQuadTo(584f, 444f)
                lineToRelative(202f, 200f)
                quadToRelative(29f, 29f, 29f, 71f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(-29f, 29f, -71f, 29f)
                reflectiveQuadToRelative(-71f, -30f)
                lineTo(444f, 584f)
                quadToRelative(-20f, 8f, -40.5f, 12f)
                reflectiveQuadToRelative(-43.5f, 4f)
                close()
            }
        }.build()
        
        return _Build!!
    }

private var _Build: ImageVector? = null

