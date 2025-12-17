package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CaretLeft: ImageVector
    get() {
        if (_CaretLeft != null) return _CaretLeft!!
        
        _CaretLeft = ImageVector.Builder(
            name = "caret-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 192f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 127.338f)
                verticalLineToRelative(257.324f)
                curveToRelative(0f, 17.818f, -21.543f, 26.741f, -34.142f, 14.142f)
                lineTo(29.196f, 270.142f)
                curveToRelative(-7.81f, -7.81f, -7.81f, -20.474f, 0f, -28.284f)
                lineToRelative(128.662f, -128.662f)
                curveToRelative(12.599f, -12.6f, 34.142f, -3.676f, 34.142f, 14.142f)
                close()
            }
        }.build()
        
        return _CaretLeft!!
    }

private var _CaretLeft: ImageVector? = null

