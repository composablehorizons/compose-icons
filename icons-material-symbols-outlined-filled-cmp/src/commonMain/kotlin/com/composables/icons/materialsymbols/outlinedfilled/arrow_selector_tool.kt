package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Arrow_selector_tool: ImageVector
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
                moveTo(551f, 880f)
                lineTo(406f, 568f)
                lineTo(240f, 800f)
                verticalLineToRelative(-720f)
                lineToRelative(560f, 440f)
                horizontalLineTo(516f)
                lineToRelative(144f, 309f)
                lineToRelative(-109f, 51f)
                close()
            }
        }.build()
        
        return _Arrow_selector_tool!!
    }

private var _Arrow_selector_tool: ImageVector? = null

