package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pan_tool: ImageVector
    get() {
        if (_Pan_tool != null) return _Pan_tool!!
        
        _Pan_tool = ImageVector.Builder(
            name = "pan_tool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(339f, 920f)
                lineTo(48f, 495f)
                lineToRelative(69f, -66f)
                lineToRelative(163f, 114f)
                verticalLineToRelative(-423f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(760f)
                horizontalLineTo(339f)
                close()
            }
        }.build()
        
        return _Pan_tool!!
    }

private var _Pan_tool: ImageVector? = null

