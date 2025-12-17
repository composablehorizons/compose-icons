package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FastBackward: ImageVector
    get() {
        if (_FastBackward != null) return _FastBackward!!
        
        _FastBackward = ImageVector.Builder(
            name = "fast-backward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 436f)
                verticalLineTo(76f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(151.9f)
                lineTo(235.5f, 71.4f)
                curveTo(256.1f, 54.3f, 288f, 68.6f, 288f, 96f)
                verticalLineToRelative(131.9f)
                lineTo(459.5f, 71.4f)
                curveTo(480.1f, 54.3f, 512f, 68.6f, 512f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 27.4f, -31.9f, 41.7f, -52.5f, 24.6f)
                lineTo(288f, 285.3f)
                verticalLineTo(416f)
                curveToRelative(0f, 27.4f, -31.9f, 41.7f, -52.5f, 24.6f)
                lineTo(64f, 285.3f)
                verticalLineTo(436f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineTo(12f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                close()
            }
        }.build()
        
        return _FastBackward!!
    }

private var _FastBackward: ImageVector? = null

