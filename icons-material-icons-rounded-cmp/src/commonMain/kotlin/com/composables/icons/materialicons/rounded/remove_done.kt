package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Remove_done: ImageVector
    get() {
        if (_Remove_done != null) return _Remove_done!!
        
        _Remove_done = ImageVector.Builder(
            name = "remove_done",
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
                    moveTo(4.14f, 2.69f)
                    lineTo(4.14f, 2.69f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(9.67f, 9.67f)
                    lineToRelative(-1.41f, 1.41f)
                    lineToRelative(-3.54f, -3.53f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(4.24f, 4.24f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(2.12f, -2.12f)
                    lineToRelative(5.89f, 5.89f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(5.55f, 2.69f)
                    curveTo(5.16f, 2.3f, 4.53f, 2.3f, 4.14f, 2.69f)
                    close()
                    moveTo(18.05f, 12.36f)
                    lineToRelative(4.24f, -4.24f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.39f, -0.38f, -1.02f, -0.38f, -1.41f, 0.01f)
                    lineToRelative(-4.24f, 4.24f)
                    lineTo(18.05f, 12.36f)
                    close()
                    moveTo(16.64f, 6.7f)
                    lineTo(16.64f, 6.7f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineToRelative(-1.42f, 1.42f)
                    lineToRelative(1.41f, 1.41f)
                    lineToRelative(1.42f, -1.42f)
                    curveTo(17.03f, 7.72f, 17.03f, 7.09f, 16.64f, 6.7f)
                    close()
                    moveTo(1.79f, 13.06f)
                    lineToRelative(4.95f, 4.95f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(3.2f, 11.65f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveTo(1.4f, 12.04f, 1.4f, 12.67f, 1.79f, 13.06f)
                    close()
                }
            }
        }.build()
        
        return _Remove_done!!
    }

private var _Remove_done: ImageVector? = null

