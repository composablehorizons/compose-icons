package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Smart_button: ImageVector
    get() {
        if (_Smart_button != null) return _Smart_button!!
        
        _Smart_button = ImageVector.Builder(
            name = "smart_button",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 9f)
                    verticalLineToRelative(6f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineToRelative(-1f)
                    lineToRelative(0f, -2f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(9f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(16f)
                    curveTo(21.1f, 7f, 22f, 7.9f, 22f, 9f)
                    close()
                    moveTo(14.04f, 17.99f)
                    curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0f)
                    lineToRelative(0.63f, -1.4f)
                    lineToRelative(1.4f, -0.63f)
                    curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0f, -0.91f)
                    lineToRelative(-1.4f, -0.63f)
                    lineToRelative(-0.63f, -1.4f)
                    curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0f)
                    lineToRelative(-0.63f, 1.4f)
                    lineToRelative(-1.4f, 0.63f)
                    curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                    lineToRelative(1.4f, 0.63f)
                    lineTo(14.04f, 17.99f)
                    close()
                    moveTo(16.74f, 13.43f)
                    curveToRelative(0.1f, 0.22f, 0.42f, 0.22f, 0.52f, 0f)
                    lineToRelative(0.36f, -0.8f)
                    lineToRelative(0.8f, -0.36f)
                    curveToRelative(0.22f, -0.1f, 0.22f, -0.42f, 0f, -0.52f)
                    lineToRelative(-0.8f, -0.36f)
                    lineToRelative(-0.36f, -0.8f)
                    curveToRelative(-0.1f, -0.22f, -0.42f, -0.22f, -0.52f, 0f)
                    lineToRelative(-0.36f, 0.8f)
                    lineToRelative(-0.8f, 0.36f)
                    curveToRelative(-0.22f, 0.1f, -0.22f, 0.42f, 0f, 0.52f)
                    lineToRelative(0.8f, 0.36f)
                    lineTo(16.74f, 13.43f)
                    close()
                }
            }
        }.build()
        
        return _Smart_button!!
    }

private var _Smart_button: ImageVector? = null

