package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Handshake: ImageVector
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
                    moveTo(16.48f, 10.41f)
                    curveToRelative(-0.39f, 0.39f, -1.04f, 0.39f, -1.43f, 0f)
                    lineToRelative(-4.47f, -4.46f)
                    lineToRelative(-7.05f, 7.04f)
                    lineToRelative(-0.66f, -0.63f)
                    curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0f, -4.24f)
                    lineToRelative(4.24f, -4.24f)
                    curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0f)
                    lineTo(16.48f, 9f)
                    curveTo(16.87f, 9.39f, 16.87f, 10.02f, 16.48f, 10.41f)
                    close()
                    moveTo(17.18f, 8.29f)
                    curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                    curveToRelative(-1.27f, 1.27f, -2.61f, 0.22f, -2.83f, 0f)
                    lineToRelative(-3.76f, -3.76f)
                    lineToRelative(-5.57f, 5.57f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0f)
                    lineToRelative(4.62f, -4.62f)
                    lineToRelative(0.71f, 0.71f)
                    lineToRelative(-4.62f, 4.62f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0f)
                    lineToRelative(4.62f, -4.62f)
                    lineToRelative(0.71f, 0.71f)
                    lineToRelative(-4.62f, 4.62f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(4.62f, -4.62f)
                    lineToRelative(0.71f, 0.71f)
                    lineToRelative(-4.62f, 4.62f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(8.32f, -8.34f)
                    curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                    lineToRelative(-4.24f, -4.24f)
                    curveToRelative(-1.15f, -1.15f, -3.01f, -1.17f, -4.18f, -0.06f)
                    lineTo(17.18f, 8.29f)
                    close()
                }
            }
        }.build()
        
        return _Handshake!!
    }

private var _Handshake: ImageVector? = null

