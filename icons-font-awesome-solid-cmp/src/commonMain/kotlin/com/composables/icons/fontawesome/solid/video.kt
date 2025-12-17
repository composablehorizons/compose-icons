package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Video: ImageVector
    get() {
        if (_Video != null) return _Video!!
        
        _Video = ImageVector.Builder(
            name = "video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336.2f, 64f)
                horizontalLineTo(47.8f)
                curveTo(21.4f, 64f, 0f, 85.4f, 0f, 111.8f)
                verticalLineToRelative(288.4f)
                curveTo(0f, 426.6f, 21.4f, 448f, 47.8f, 448f)
                horizontalLineToRelative(288.4f)
                curveToRelative(26.4f, 0f, 47.8f, -21.4f, 47.8f, -47.8f)
                verticalLineTo(111.8f)
                curveToRelative(0f, -26.4f, -21.4f, -47.8f, -47.8f, -47.8f)
                close()
                moveToRelative(189.4f, 37.7f)
                lineTo(416f, 177.3f)
                verticalLineToRelative(157.4f)
                lineToRelative(109.6f, 75.5f)
                curveToRelative(21.2f, 14.6f, 50.4f, -0.3f, 50.4f, -25.8f)
                verticalLineTo(127.5f)
                curveToRelative(0f, -25.4f, -29.1f, -40.4f, -50.4f, -25.8f)
                close()
            }
        }.build()
        
        return _Video!!
    }

private var _Video: ImageVector? = null

