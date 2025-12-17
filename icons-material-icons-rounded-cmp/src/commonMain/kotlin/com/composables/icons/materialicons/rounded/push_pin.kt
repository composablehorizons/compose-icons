package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Push_pin: ImageVector
    get() {
        if (_Push_pin != null) return _Push_pin!!
        
        _Push_pin = ImageVector.Builder(
            name = "push_pin",
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
                    moveTo(19f, 12.87f)
                    curveToRelative(0f, -0.47f, -0.34f, -0.85f, -0.8f, -0.98f)
                    curveTo(16.93f, 11.54f, 16f, 10.38f, 16f, 9f)
                    verticalLineTo(4f)
                    lineToRelative(1f, 0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(7f)
                    curveTo(6.45f, 2f, 6f, 2.45f, 6f, 3f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    lineToRelative(1f, 0f)
                    verticalLineToRelative(5f)
                    curveToRelative(0f, 1.38f, -0.93f, 2.54f, -2.2f, 2.89f)
                    curveTo(5.34f, 12.02f, 5f, 12.4f, 5f, 12.87f)
                    verticalLineTo(13f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(4.98f)
                    lineTo(11f, 21f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    lineToRelative(-0.02f, -7f)
                    horizontalLineTo(18f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(12.87f)
                    close()
                }
            }
        }.build()
        
        return _Push_pin!!
    }

private var _Push_pin: ImageVector? = null

