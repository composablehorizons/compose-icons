package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CaretDown: ImageVector
    get() {
        if (_CaretDown != null) return _CaretDown!!
        
        _CaretDown = ImageVector.Builder(
            name = "caret-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(31.3f, 192f)
                horizontalLineToRelative(257.3f)
                curveToRelative(17.8f, 0f, 26.7f, 21.5f, 14.1f, 34.1f)
                lineTo(174.1f, 354.8f)
                curveToRelative(-7.8f, 7.8f, -20.5f, 7.8f, -28.3f, 0f)
                lineTo(17.2f, 226.1f)
                curveTo(4.6f, 213.5f, 13.5f, 192f, 31.3f, 192f)
                close()
            }
        }.build()
        
        return _CaretDown!!
    }

private var _CaretDown: ImageVector? = null

