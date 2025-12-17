package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FastForward: ImageVector
    get() {
        if (_FastForward != null) return _FastForward!!
        
        _FastForward = ImageVector.Builder(
            name = "fast-forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.804f, 8f)
                lineTo(1f, 4.633f)
                verticalLineToRelative(6.734f)
                close()
                moveToRelative(0.792f, -0.696f)
                arcToRelative(0.802f, 0.802f, 0f, false, true, 0f, 1.392f)
                lineToRelative(-6.363f, 3.692f)
                curveTo(0.713f, 12.69f, 0f, 12.345f, 0f, 11.692f)
                verticalLineTo(4.308f)
                curveToRelative(0f, -0.653f, 0.713f, -0.998f, 1.233f, -0.696f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.804f, 8f)
                lineTo(9f, 4.633f)
                verticalLineToRelative(6.734f)
                close()
                moveToRelative(0.792f, -0.696f)
                arcToRelative(0.802f, 0.802f, 0f, false, true, 0f, 1.392f)
                lineToRelative(-6.363f, 3.692f)
                curveTo(8.713f, 12.69f, 8f, 12.345f, 8f, 11.692f)
                verticalLineTo(4.308f)
                curveToRelative(0f, -0.653f, 0.713f, -0.998f, 1.233f, -0.696f)
                close()
            }
        }.build()
        
        return _FastForward!!
    }

private var _FastForward: ImageVector? = null

