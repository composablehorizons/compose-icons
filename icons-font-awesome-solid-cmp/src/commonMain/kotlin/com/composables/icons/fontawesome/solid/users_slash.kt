package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UsersSlash: ImageVector
    get() {
        if (_UsersSlash != null) return _UsersSlash!!
        
        _UsersSlash = ImageVector.Builder(
            name = "users-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(132.65f, 212.32f)
                lineTo(36.21f, 137.78f)
                arcTo(63.4f, 63.4f, 0f, false, false, 32f, 160f)
                arcToRelative(63.84f, 63.84f, 0f, false, false, 100.65f, 52.32f)
                close()
                moveToRelative(40.44f, 62.28f)
                arcTo(63.79f, 63.79f, 0f, false, false, 128f, 256f)
                horizontalLineTo(64f)
                arcTo(64.06f, 64.06f, 0f, false, false, 0f, 320f)
                verticalLineToRelative(32f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineTo(97.91f)
                arcTo(146.62f, 146.62f, 0f, false, true, 173.09f, 274.6f)
                close()
                moveTo(544f, 224f)
                arcToRelative(64f, 64f, 0f, true, false, -64f, -64f)
                arcTo(64.06f, 64.06f, 0f, false, false, 544f, 224f)
                close()
                moveTo(500.56f, 355.11f)
                arcToRelative(114.24f, 114.24f, 0f, false, false, -84.47f, -65.28f)
                lineTo(361f, 247.23f)
                curveToRelative(41.46f, -16.3f, 71f, -55.92f, 71f, -103.23f)
                arcTo(111.93f, 111.93f, 0f, false, false, 320f, 32f)
                curveToRelative(-57.14f, 0f, -103.69f, 42.83f, -110.6f, 98.08f)
                lineTo(45.46f, 3.38f)
                arcTo(16f, 16f, 0f, false, false, 23f, 6.19f)
                lineTo(3.37f, 31.46f)
                arcTo(16f, 16f, 0f, false, false, 6.18f, 53.91f)
                lineTo(594.53f, 508.63f)
                arcTo(16f, 16f, 0f, false, false, 617f, 505.82f)
                lineToRelative(19.64f, -25.27f)
                arcToRelative(16f, 16f, 0f, false, false, -2.81f, -22.45f)
                close()
                moveTo(128f, 403.21f)
                verticalLineTo(432f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, 48f)
                horizontalLineTo(464f)
                arcToRelative(47.45f, 47.45f, 0f, false, false, 12.57f, -1.87f)
                lineTo(232f, 289.13f)
                curveTo(173.74f, 294.83f, 128f, 343.42f, 128f, 403.21f)
                close()
                moveTo(576f, 256f)
                horizontalLineTo(512f)
                arcToRelative(63.79f, 63.79f, 0f, false, false, -45.09f, 18.6f)
                arcTo(146.29f, 146.29f, 0f, false, true, 542f, 384f)
                horizontalLineToRelative(66f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(320f)
                arcTo(64.06f, 64.06f, 0f, false, false, 576f, 256f)
                close()
            }
        }.build()
        
        return _UsersSlash!!
    }

private var _UsersSlash: ImageVector? = null

