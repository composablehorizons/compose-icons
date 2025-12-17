package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Handshake: ImageVector
    get() {
        if (_Handshake != null) return _Handshake!!
        
        _Handshake = ImageVector.Builder(
            name = "handshake",
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
                    moveTo(12.22f, 19.85f)
                    curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0f)
                    curveToRelative(-0.18f, -0.18f, -0.21f, -0.5f, 0f, -0.71f)
                    lineToRelative(3.39f, -3.39f)
                    lineToRelative(-1.41f, -1.41f)
                    lineToRelative(-3.39f, 3.39f)
                    curveToRelative(-0.19f, 0.2f, -0.51f, 0.19f, -0.71f, 0f)
                    curveToRelative(-0.21f, -0.21f, -0.18f, -0.53f, 0f, -0.71f)
                    lineToRelative(3.39f, -3.39f)
                    lineToRelative(-1.41f, -1.41f)
                    lineToRelative(-3.39f, 3.39f)
                    curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0f)
                    curveToRelative(-0.19f, -0.19f, -0.19f, -0.51f, 0f, -0.71f)
                    lineToRelative(3.39f, -3.39f)
                    lineTo(9.24f, 10.1f)
                    lineToRelative(-3.39f, 3.39f)
                    curveToRelative(-0.18f, 0.18f, -0.5f, 0.21f, -0.71f, 0f)
                    curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0f, -0.71f)
                    lineTo(9.52f, 8.4f)
                    lineToRelative(1.87f, 1.86f)
                    curveToRelative(0.95f, 0.95f, 2.59f, 0.94f, 3.54f, 0f)
                    curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0f, -3.54f)
                    lineToRelative(-1.86f, -1.86f)
                    lineToRelative(0.28f, -0.28f)
                    curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                    lineToRelative(4.24f, 4.24f)
                    curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                    lineTo(12.22f, 19.85f)
                    close()
                    moveTo(21.83f, 13.07f)
                    curveToRelative(1.56f, -1.56f, 1.56f, -4.09f, 0f, -5.66f)
                    lineToRelative(-4.24f, -4.24f)
                    curveToRelative(-1.56f, -1.56f, -4.09f, -1.56f, -5.66f, 0f)
                    lineToRelative(-0.28f, 0.28f)
                    lineToRelative(-0.28f, -0.28f)
                    curveToRelative(-1.56f, -1.56f, -4.09f, -1.56f, -5.66f, 0f)
                    lineTo(2.17f, 6.71f)
                    curveToRelative(-1.42f, 1.42f, -1.55f, 3.63f, -0.4f, 5.19f)
                    lineToRelative(1.45f, -1.45f)
                    curveTo(2.83f, 9.7f, 2.96f, 8.75f, 3.59f, 8.12f)
                    lineToRelative(3.54f, -3.54f)
                    curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                    lineToRelative(3.56f, 3.56f)
                    curveToRelative(0.18f, 0.18f, 0.21f, 0.5f, 0f, 0.71f)
                    curveToRelative(-0.21f, 0.21f, -0.53f, 0.18f, -0.71f, 0f)
                    lineTo(9.52f, 5.57f)
                    lineToRelative(-5.8f, 5.79f)
                    curveToRelative(-0.98f, 0.97f, -0.98f, 2.56f, 0f, 3.54f)
                    curveToRelative(0.39f, 0.39f, 0.89f, 0.63f, 1.42f, 0.7f)
                    curveToRelative(0.07f, 0.52f, 0.3f, 1.02f, 0.7f, 1.42f)
                    curveToRelative(0.4f, 0.4f, 0.9f, 0.63f, 1.42f, 0.7f)
                    curveToRelative(0.07f, 0.52f, 0.3f, 1.02f, 0.7f, 1.42f)
                    curveToRelative(0.4f, 0.4f, 0.9f, 0.63f, 1.42f, 0.7f)
                    curveToRelative(0.07f, 0.54f, 0.31f, 1.03f, 0.7f, 1.42f)
                    curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                    curveToRelative(0.67f, 0f, 1.3f, -0.26f, 1.77f, -0.73f)
                    lineTo(21.83f, 13.07f)
                    close()
                }
            }
        }.build()
        
        return _Handshake!!
    }

private var _Handshake: ImageVector? = null

