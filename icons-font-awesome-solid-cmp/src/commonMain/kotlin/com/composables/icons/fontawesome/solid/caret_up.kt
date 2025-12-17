package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CaretUp: ImageVector
    get() {
        if (_CaretUp != null) return _CaretUp!!
        
        _CaretUp = ImageVector.Builder(
            name = "caret-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288.662f, 352f)
                horizontalLineTo(31.338f)
                curveToRelative(-17.818f, 0f, -26.741f, -21.543f, -14.142f, -34.142f)
                lineToRelative(128.662f, -128.662f)
                curveToRelative(7.81f, -7.81f, 20.474f, -7.81f, 28.284f, 0f)
                lineToRelative(128.662f, 128.662f)
                curveToRelative(12.6f, 12.599f, 3.676f, 34.142f, -14.142f, 34.142f)
                close()
            }
        }.build()
        
        return _CaretUp!!
    }

private var _CaretUp: ImageVector? = null

