package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Arrow_left_alt: ImageVector
    get() {
        if (_Arrow_left_alt != null) return _Arrow_left_alt!!
        
        _Arrow_left_alt = ImageVector.Builder(
            name = "arrow_left_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(314f, 520f)
                lineToRelative(114f, 114f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(428f, 690f)
                quadToRelative(-12f, 12f, -28.5f, 12.5f)
                reflectiveQuadTo(371f, 691f)
                lineTo(188f, 508f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(183f, -183f)
                quadToRelative(12f, -12f, 28.5f, -11.5f)
                reflectiveQuadTo(428f, 270f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(428f, 326f)
                lineTo(314f, 440f)
                horizontalLineToRelative(446f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 520f)
                horizontalLineTo(314f)
                close()
            }
        }.build()
        
        return _Arrow_left_alt!!
    }

private var _Arrow_left_alt: ImageVector? = null

