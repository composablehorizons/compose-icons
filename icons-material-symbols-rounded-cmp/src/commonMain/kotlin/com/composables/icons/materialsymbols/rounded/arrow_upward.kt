package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Arrow_upward: ImageVector
    get() {
        if (_Arrow_upward != null) return _Arrow_upward!!
        
        _Arrow_upward = ImageVector.Builder(
            name = "arrow_upward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 313f)
                lineTo(244f, 509f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(188f, 508f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(264f, -264f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(264f, 264f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(772f, 508f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(715f, 508f)
                lineTo(520f, 313f)
                verticalLineToRelative(447f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 760f)
                verticalLineToRelative(-447f)
                close()
            }
        }.build()
        
        return _Arrow_upward!!
    }

private var _Arrow_upward: ImageVector? = null

