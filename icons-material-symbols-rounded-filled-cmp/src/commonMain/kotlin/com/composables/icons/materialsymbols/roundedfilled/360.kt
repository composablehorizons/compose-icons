package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.`360`: ImageVector
    get() {
        if (_360 != null) return _360!!
        
        _360 = ImageVector.Builder(
            name = "360",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(374f, 672f)
                quadToRelative(-128f, -17f, -211f, -70f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 115.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(169f, 0f, 284.5f, 58.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 56f, -54.5f, 101.5f)
                reflectiveQuadTo(681f, 653f)
                quadToRelative(-16f, 5f, -28.5f, -4.5f)
                reflectiveQuadTo(640f, 623f)
                quadToRelative(0f, -18f, 10.5f, -32f)
                reflectiveQuadToRelative(27.5f, -20f)
                quadToRelative(60f, -20f, 91f, -45.5f)
                reflectiveQuadToRelative(31f, -45.5f)
                quadToRelative(0f, -32f, -85.5f, -76f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-149f, 0f, -234.5f, 44f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 24f, 51f, 57.5f)
                reflectiveQuadTo(356f, 588f)
                lineToRelative(-24f, -24f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(388f, 772f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(332f, 772f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(331f, 716f)
                lineToRelative(43f, -44f)
                close()
            }
        }.build()
        
        return _360!!
    }

private var _360: ImageVector? = null

