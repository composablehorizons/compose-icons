package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Close_small: ImageVector
    get() {
        if (_Close_small != null) return _Close_small!!
        
        _Close_small = ImageVector.Builder(
            name = "close_small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 536f)
                lineTo(363.33f, 653f)
                quadToRelative(-11.07f, 11f, -28.17f, 11f)
                reflectiveQuadTo(307f, 653f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(117f, -117f)
                lineToRelative(-117f, -115.67f)
                quadToRelative(-11f, -11.07f, -11f, -28.17f)
                reflectiveQuadTo(307f, 308f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(117f, 117f)
                lineToRelative(115.67f, -117f)
                quadToRelative(11.07f, -11f, 28.17f, -11f)
                reflectiveQuadTo(652f, 308f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(652f, 364f)
                lineTo(535f, 480f)
                lineToRelative(117f, 116.67f)
                quadToRelative(11f, 11.07f, 11f, 28.17f)
                reflectiveQuadTo(652f, 653f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(596f, 653f)
                lineTo(480f, 536f)
                close()
            }
        }.build()
        
        return _Close_small!!
    }

private var _Close_small: ImageVector? = null

