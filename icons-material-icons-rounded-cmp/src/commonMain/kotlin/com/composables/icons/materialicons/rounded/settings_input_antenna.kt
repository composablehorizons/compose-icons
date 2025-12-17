package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_input_antenna: ImageVector
    get() {
        if (_Settings_input_antenna != null) return _Settings_input_antenna!!
        
        _Settings_input_antenna = ImageVector.Builder(
            name = "settings_input_antenna",
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
                    moveTo(12f, 5f)
                    curveToRelative(-3.48f, 0f, -6.37f, 2.54f, -6.91f, 5.87f)
                    curveToRelative(-0.1f, 0.59f, 0.39f, 1.13f, 1f, 1.13f)
                    curveToRelative(0.49f, 0f, 0.9f, -0.36f, 0.98f, -0.85f)
                    curveTo(7.48f, 8.79f, 9.53f, 7f, 12f, 7f)
                    reflectiveCurveToRelative(4.52f, 1.79f, 4.93f, 4.15f)
                    curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f)
                    curveToRelative(0.61f, 0f, 1.09f, -0.54f, 0.99f, -1.13f)
                    curveTo(18.37f, 7.54f, 15.48f, 5f, 12f, 5f)
                    close()
                    moveTo(13f, 14.29f)
                    curveToRelative(1.07f, -0.48f, 1.76f, -1.66f, 1.41f, -2.99f)
                    curveToRelative(-0.22f, -0.81f, -0.87f, -1.47f, -1.68f, -1.7f)
                    curveTo(11.04f, 9.12f, 9.5f, 10.38f, 9.5f, 12f)
                    curveToRelative(0f, 1.02f, 0.62f, 1.9f, 1.5f, 2.29f)
                    verticalLineToRelative(3.3f)
                    lineToRelative(-2.71f, 2.7f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(2.3f, -2.3f)
                    lineToRelative(2.3f, 2.3f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                    lineTo(13f, 17.59f)
                    verticalLineTo(14.29f)
                    close()
                    moveTo(12f, 1f)
                    curveTo(6.3f, 1f, 1.61f, 5.34f, 1.05f, 10.9f)
                    curveTo(1f, 11.49f, 1.46f, 12f, 2.05f, 12f)
                    curveToRelative(0.51f, 0f, 0.94f, -0.38f, 0.99f, -0.88f)
                    curveTo(3.48f, 6.56f, 7.33f, 3f, 12f, 3f)
                    reflectiveCurveToRelative(8.52f, 3.56f, 8.96f, 8.12f)
                    curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f)
                    curveToRelative(0.59f, 0f, 1.06f, -0.51f, 1f, -1.1f)
                    curveTo(22.39f, 5.34f, 17.7f, 1f, 12f, 1f)
                    close()
                }
            }
        }.build()
        
        return _Settings_input_antenna!!
    }

private var _Settings_input_antenna: ImageVector? = null

