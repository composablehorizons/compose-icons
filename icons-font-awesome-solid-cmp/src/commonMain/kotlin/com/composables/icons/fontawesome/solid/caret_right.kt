package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CaretRight: ImageVector
    get() {
        if (_CaretRight != null) return _CaretRight!!
        
        _CaretRight = ImageVector.Builder(
            name = "caret-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 192f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 384.662f)
                verticalLineTo(127.338f)
                curveToRelative(0f, -17.818f, 21.543f, -26.741f, 34.142f, -14.142f)
                lineToRelative(128.662f, 128.662f)
                curveToRelative(7.81f, 7.81f, 7.81f, 20.474f, 0f, 28.284f)
                lineTo(34.142f, 398.804f)
                curveTo(21.543f, 411.404f, 0f, 402.48f, 0f, 384.662f)
                close()
            }
        }.build()
        
        return _CaretRight!!
    }

private var _CaretRight: ImageVector? = null

