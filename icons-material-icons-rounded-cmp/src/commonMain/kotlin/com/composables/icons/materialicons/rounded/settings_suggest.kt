package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_suggest: ImageVector
    get() {
        if (_Settings_suggest != null) return _Settings_suggest!!
        
        _Settings_suggest = ImageVector.Builder(
            name = "settings_suggest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18.04f, 7.99f)
                    lineToRelative(-0.63f, -1.4f)
                    lineToRelative(-1.4f, -0.63f)
                    curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0f, -0.91f)
                    lineToRelative(1.4f, -0.63f)
                    lineToRelative(0.63f, -1.4f)
                    curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0f)
                    lineToRelative(0.63f, 1.4f)
                    lineToRelative(1.4f, 0.63f)
                    curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0f, 0.91f)
                    lineToRelative(-1.4f, 0.63f)
                    lineToRelative(-0.63f, 1.4f)
                    curveTo(18.78f, 8.38f, 18.22f, 8.38f, 18.04f, 7.99f)
                    close()
                    moveTo(21.28f, 12.72f)
                    lineTo(20.96f, 12f)
                    curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0f)
                    lineToRelative(-0.32f, 0.72f)
                    lineTo(19f, 13.04f)
                    curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0f, 0.91f)
                    lineToRelative(0.72f, 0.32f)
                    lineTo(20.04f, 15f)
                    curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0f)
                    lineToRelative(0.32f, -0.72f)
                    lineTo(22f, 13.96f)
                    curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0f, -0.91f)
                    lineTo(21.28f, 12.72f)
                    close()
                    moveTo(16.24f, 14.37f)
                    lineToRelative(1.23f, 0.93f)
                    curveToRelative(0.4f, 0.3f, 0.51f, 0.86f, 0.26f, 1.3f)
                    lineToRelative(-1.62f, 2.8f)
                    curveToRelative(-0.25f, 0.44f, -0.79f, 0.62f, -1.25f, 0.42f)
                    lineToRelative(-1.43f, -0.6f)
                    curveToRelative(-0.2f, 0.13f, -0.42f, 0.26f, -0.64f, 0.37f)
                    lineToRelative(-0.19f, 1.54f)
                    curveToRelative(-0.06f, 0.5f, -0.49f, 0.88f, -0.99f, 0.88f)
                    horizontalLineTo(8.38f)
                    curveToRelative(-0.5f, 0f, -0.93f, -0.38f, -0.99f, -0.88f)
                    lineTo(7.2f, 19.59f)
                    curveToRelative(-0.22f, -0.11f, -0.43f, -0.23f, -0.64f, -0.37f)
                    lineToRelative(-1.43f, 0.6f)
                    curveToRelative(-0.46f, 0.2f, -1f, 0.02f, -1.25f, -0.42f)
                    lineToRelative(-1.62f, -2.8f)
                    curveToRelative(-0.25f, -0.44f, -0.14f, -0.99f, 0.26f, -1.3f)
                    lineToRelative(1.23f, -0.93f)
                    curveTo(3.75f, 14.25f, 3.75f, 14.12f, 3.75f, 14f)
                    reflectiveCurveToRelative(0f, -0.25f, 0.01f, -0.37f)
                    lineTo(2.53f, 12.7f)
                    curveToRelative(-0.4f, -0.3f, -0.51f, -0.86f, -0.26f, -1.3f)
                    lineToRelative(1.62f, -2.8f)
                    curveToRelative(0.25f, -0.44f, 0.79f, -0.62f, 1.25f, -0.42f)
                    lineToRelative(1.43f, 0.6f)
                    curveToRelative(0.2f, -0.13f, 0.42f, -0.26f, 0.64f, -0.37f)
                    lineToRelative(0.19f, -1.54f)
                    curveTo(7.45f, 6.38f, 7.88f, 6f, 8.38f, 6f)
                    horizontalLineToRelative(3.23f)
                    curveToRelative(0.5f, 0f, 0.93f, 0.38f, 0.99f, 0.88f)
                    lineToRelative(0.19f, 1.54f)
                    curveToRelative(0.22f, 0.11f, 0.43f, 0.23f, 0.64f, 0.37f)
                    lineToRelative(1.43f, -0.6f)
                    curveToRelative(0.46f, -0.2f, 1f, -0.02f, 1.25f, 0.42f)
                    lineToRelative(1.62f, 2.8f)
                    curveToRelative(0.25f, 0.44f, 0.14f, 0.99f, -0.26f, 1.3f)
                    lineToRelative(-1.23f, 0.93f)
                    curveToRelative(0.01f, 0.12f, 0.01f, 0.24f, 0.01f, 0.37f)
                    reflectiveCurveTo(16.25f, 14.25f, 16.24f, 14.37f)
                    close()
                    moveTo(13f, 14f)
                    curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                    reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                    reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                    reflectiveCurveTo(13f, 15.66f, 13f, 14f)
                    close()
                }
            }
        }.build()
        
        return _Settings_suggest!!
    }

private var _Settings_suggest: ImageVector? = null

