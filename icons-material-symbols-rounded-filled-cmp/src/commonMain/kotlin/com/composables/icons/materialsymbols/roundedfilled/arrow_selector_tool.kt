package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Arrow_selector_tool: ImageVector
    get() {
        if (_Arrow_selector_tool != null) return _Arrow_selector_tool!!
        
        _Arrow_selector_tool = ImageVector.Builder(
            name = "arrow_selector_tool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(606f, 855f)
                quadToRelative(-23f, 11f, -46f, 2.5f)
                reflectiveQuadTo(526f, 826f)
                lineTo(406f, 568f)
                lineToRelative(-93f, 130f)
                quadToRelative(-17f, 24f, -45f, 15f)
                reflectiveQuadToRelative(-28f, -38f)
                verticalLineToRelative(-513f)
                quadToRelative(0f, -25f, 22.5f, -36f)
                reflectiveQuadToRelative(42.5f, 5f)
                lineToRelative(404f, 318f)
                quadToRelative(23f, 17f, 13.5f, 44f)
                reflectiveQuadTo(684f, 520f)
                horizontalLineTo(516f)
                lineToRelative(119f, 255f)
                quadToRelative(11f, 23f, 2.5f, 46f)
                reflectiveQuadTo(606f, 855f)
                close()
            }
        }.build()
        
        return _Arrow_selector_tool!!
    }

private var _Arrow_selector_tool: ImageVector? = null

