package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandshakeSlash: ImageVector
    get() {
        if (_HandshakeSlash != null) return _HandshakeSlash!!
        
        _HandshakeSlash = ImageVector.Builder(
            name = "handshake-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 128.21f)
                verticalLineTo(384f)
                horizontalLineTo(64f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(184f)
                lineTo(23.83f, 128.21f)
                close()
                moveTo(48f, 320.1f)
                arcToRelative(16f, 16f, 0f, true, true, -16f, 16f)
                arcTo(16f, 16f, 0f, false, true, 48f, 320.1f)
                close()
                moveToRelative(80f, 31.81f)
                horizontalLineToRelative(18.3f)
                lineToRelative(90.5f, 81.89f)
                arcToRelative(64f, 64f, 0f, false, false, 90f, -9.3f)
                lineToRelative(0.2f, -0.2f)
                lineToRelative(17.91f, 15.5f)
                arcToRelative(37.16f, 37.16f, 0f, false, false, 52.29f, -5.39f)
                lineToRelative(8.8f, -10.82f)
                lineTo(128f, 208.72f)
                close()
                moveToRelative(416f, -223.7f)
                verticalLineTo(352.1f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineToRelative(64f)
                verticalLineTo(128.21f)
                close()
                moveTo(592f, 352.1f)
                arcToRelative(16f, 16f, 0f, true, true, 16f, -16f)
                arcTo(16f, 16f, 0f, false, true, 592f, 352.1f)
                close()
                moveTo(303.33f, 202.67f)
                lineToRelative(59.58f, -54.57f)
                arcToRelative(16f, 16f, 0f, false, true, 21.59f, 23.61f)
                lineTo(358.41f, 195.6f)
                lineTo(504f, 313.8f)
                arcToRelative(73.08f, 73.08f, 0f, false, true, 7.91f, 7.7f)
                verticalLineTo(128f)
                lineTo(457.3f, 73.41f)
                arcTo(31.76f, 31.76f, 0f, false, false, 434.7f, 64f)
                horizontalLineTo(348.8f)
                arcToRelative(31.93f, 31.93f, 0f, false, false, -21.6f, 8.41f)
                lineToRelative(-88.07f, 80.64f)
                lineToRelative(-25.64f, -19.81f)
                lineTo(289.09f, 64f)
                horizontalLineTo(205.3f)
                arcToRelative(32f, 32f, 0f, false, false, -22.6f, 9.41f)
                lineTo(162.36f, 93.72f)
                lineTo(45.47f, 3.38f)
                arcTo(16f, 16f, 0f, false, false, 23f, 6.19f)
                lineTo(3.38f, 31.46f)
                arcTo(16f, 16f, 0f, false, false, 6.19f, 53.91f)
                lineTo(594.53f, 508.63f)
                arcTo(16f, 16f, 0f, false, false, 617f, 505.82f)
                lineToRelative(19.65f, -25.27f)
                arcToRelative(16f, 16f, 0f, false, false, -2.82f, -22.45f)
                close()
            }
        }.build()
        
        return _HandshakeSlash!!
    }

private var _HandshakeSlash: ImageVector? = null

