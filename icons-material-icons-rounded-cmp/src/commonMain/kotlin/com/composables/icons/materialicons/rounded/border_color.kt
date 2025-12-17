package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Border_color: ImageVector
    get() {
        if (_Border_color != null) return _Border_color!!
        
        _Border_color = ImageVector.Builder(
            name = "border_color",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 24f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(0f)
                    curveTo(22f, 23.1f, 21.1f, 24f, 20f, 24f)
                    close()
                    moveTo(13.06f, 5.19f)
                    lineToRelative(3.75f, 3.75f)
                    lineToRelative(-8.77f, 8.77f)
                    curveTo(7.86f, 17.9f, 7.6f, 18f, 7.34f, 18f)
                    horizontalLineTo(5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-2.34f)
                    curveToRelative(0f, -0.27f, 0.11f, -0.52f, 0.29f, -0.71f)
                    lineTo(13.06f, 5.19f)
                    close()
                    moveTo(17.88f, 7.87f)
                    lineToRelative(-3.75f, -3.75f)
                    lineToRelative(1.83f, -1.83f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(2.34f, 2.34f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineTo(17.88f, 7.87f)
                    close()
                }
            }
        }.build()
        
        return _Border_color!!
    }

private var _Border_color: ImageVector? = null

