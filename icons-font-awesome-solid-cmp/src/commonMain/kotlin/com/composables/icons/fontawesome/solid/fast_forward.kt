package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FastForward: ImageVector
    get() {
        if (_FastForward != null) return _FastForward!!
        
        _FastForward = ImageVector.Builder(
            name = "fast-forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(512f, 76f)
                verticalLineToRelative(360f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineTo(284.1f)
                lineTo(276.5f, 440.6f)
                curveToRelative(-20.6f, 17.2f, -52.5f, 2.8f, -52.5f, -24.6f)
                verticalLineTo(284.1f)
                lineTo(52.5f, 440.6f)
                curveTo(31.9f, 457.8f, 0f, 443.4f, 0f, 416f)
                verticalLineTo(96f)
                curveToRelative(0f, -27.4f, 31.9f, -41.7f, 52.5f, -24.6f)
                lineTo(224f, 226.8f)
                verticalLineTo(96f)
                curveToRelative(0f, -27.4f, 31.9f, -41.7f, 52.5f, -24.6f)
                lineTo(448f, 226.8f)
                verticalLineTo(76f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                close()
            }
        }.build()
        
        return _FastForward!!
    }

private var _FastForward: ImageVector? = null

