package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Build: ImageVector
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
                moveToRelative(0f, -80f)
                quadToRelative(26f, 0f, 52f, -8f)
                reflectiveQuadToRelative(47f, -25f)
                lineToRelative(243f, 243f)
                quadToRelative(5f, 5f, 13.5f, 4.5f)
                reflectiveQuadTo(729f, 729f)
                quadToRelative(5f, -5f, 5f, -13.5f)
                reflectiveQuadToRelative(-5f, -13.5f)
                lineTo(486f, 460f)
                quadToRelative(18f, -20f, 26f, -46.5f)
                reflectiveQuadToRelative(8f, -53.5f)
                quadToRelative(0f, -60f, -38.5f, -104.5f)
                reflectiveQuadTo(386f, 202f)
                lineToRelative(74f, 74f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(332f, 460f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-74f, -74f)
                quadToRelative(9f, 57f, 53.5f, 95.5f)
                reflectiveQuadTo(360f, 520f)
                close()
                moveToRelative(109f, -51f)
                close()
            }
        }.build()
        
        return _Build!!
    }

private var _Build: ImageVector? = null

