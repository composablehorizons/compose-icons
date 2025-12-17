package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandshakeAltSlash: ImageVector
    get() {
        if (_HandshakeAltSlash != null) return _HandshakeAltSlash!!
        
        _HandshakeAltSlash = ImageVector.Builder(
            name = "handshake-alt-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(358.59f, 195.6f)
                lineTo(504.2f, 313.8f)
                arcToRelative(63.4f, 63.4f, 0f, false, true, 22.21f, 37.91f)
                horizontalLineTo(624f)
                arcToRelative(16.05f, 16.05f, 0f, false, false, 16f, -16f)
                verticalLineTo(143.91f)
                arcTo(16f, 16f, 0f, false, false, 624f, 128f)
                horizontalLineTo(512f)
                lineTo(457.41f, 73.41f)
                arcTo(32f, 32f, 0f, false, false, 434.8f, 64f)
                horizontalLineTo(348.91f)
                arcToRelative(32f, 32f, 0f, false, false, -21.61f, 8.41f)
                lineToRelative(-88.12f, 80.68f)
                lineToRelative(-25.69f, -19.85f)
                lineTo(289.09f, 64f)
                horizontalLineTo(205.3f)
                arcToRelative(32f, 32f, 0f, false, false, -22.6f, 9.41f)
                lineToRelative(-20.34f, 20.3f)
                lineTo(45.47f, 3.38f)
                arcTo(16f, 16f, 0f, false, false, 23f, 6.19f)
                lineTo(3.38f, 31.46f)
                arcTo(16f, 16f, 0f, false, false, 6.19f, 53.91f)
                lineTo(594.54f, 508.63f)
                arcTo(16f, 16f, 0f, false, false, 617f, 505.82f)
                lineToRelative(19.64f, -25.27f)
                arcToRelative(16f, 16f, 0f, false, false, -2.81f, -22.45f)
                lineTo(303.4f, 202.72f)
                lineToRelative(32.69f, -29.92f)
                lineToRelative(27f, -24.7f)
                arcToRelative(16f, 16f, 0f, false, true, 21.61f, 23.61f)
                close()
                moveTo(16f, 128f)
                arcTo(16.05f, 16.05f, 0f, false, false, 0f, 144f)
                verticalLineTo(335.91f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineTo(146.3f)
                lineToRelative(90.5f, 81.89f)
                arcToRelative(64f, 64f, 0f, false, false, 90f, -9.3f)
                lineToRelative(0.2f, -0.2f)
                lineToRelative(17.91f, 15.5f)
                arcToRelative(37.16f, 37.16f, 0f, false, false, 52.29f, -5.39f)
                lineToRelative(8.8f, -10.82f)
                lineTo(23.56f, 128f)
                close()
            }
        }.build()
        
        return _HandshakeAltSlash!!
    }

private var _HandshakeAltSlash: ImageVector? = null

