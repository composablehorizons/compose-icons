package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pan_tool_alt: ImageVector
    get() {
        if (_Pan_tool_alt != null) return _Pan_tool_alt!!
        
        _Pan_tool_alt = ImageVector.Builder(
            name = "pan_tool_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(341f, 840f)
                lineTo(46f, 477f)
                lineToRelative(71f, -68f)
                lineToRelative(163f, 114f)
                verticalLineToRelative(-443f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineTo(341f)
                close()
            }
        }.build()
        
        return _Pan_tool_alt!!
    }

private var _Pan_tool_alt: ImageVector? = null

