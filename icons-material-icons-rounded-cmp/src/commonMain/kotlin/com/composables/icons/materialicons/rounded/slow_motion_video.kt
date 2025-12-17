package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Slow_motion_video: ImageVector
    get() {
        if (_Slow_motion_video != null) return _Slow_motion_video!!
        
        _Slow_motion_video = ImageVector.Builder(
            name = "slow_motion_video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 8.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.41f, 0.47f, 0.65f, 0.8f, 0.4f)
                lineToRelative(4.67f, -3.5f)
                curveToRelative(0.27f, -0.2f, 0.27f, -0.6f, 0f, -0.8f)
                lineTo(10.8f, 8.1f)
                curveToRelative(-0.33f, -0.25f, -0.8f, -0.01f, -0.8f, 0.4f)
                close()
                moveToRelative(1f, -5.27f)
                curveToRelative(0f, -0.64f, -0.59f, -1.13f, -1.21f, -0.99f)
                curveToRelative(-1.12f, 0.26f, -2.18f, 0.7f, -3.12f, 1.3f)
                curveToRelative(-0.53f, 0.34f, -0.61f, 1.1f, -0.16f, 1.55f)
                curveToRelative(0.32f, 0.32f, 0.83f, 0.4f, 1.21f, 0.16f)
                curveToRelative(0.77f, -0.49f, 1.62f, -0.85f, 2.54f, -1.05f)
                curveToRelative(0.44f, -0.1f, 0.74f, -0.51f, 0.74f, -0.97f)
                close()
                moveTo(5.1f, 6.51f)
                curveToRelative(-0.46f, -0.45f, -1.21f, -0.38f, -1.55f, 0.16f)
                curveToRelative(-0.6f, 0.94f, -1.04f, 2f, -1.3f, 3.12f)
                curveToRelative(-0.14f, 0.62f, 0.34f, 1.21f, 0.98f, 1.21f)
                curveToRelative(0.45f, 0f, 0.87f, -0.3f, 0.96f, -0.74f)
                curveToRelative(0.2f, -0.91f, 0.57f, -1.77f, 1.05f, -2.53f)
                curveToRelative(0.26f, -0.39f, 0.18f, -0.9f, -0.14f, -1.22f)
                close()
                moveTo(3.23f, 13f)
                curveToRelative(-0.64f, 0f, -1.13f, 0.59f, -0.99f, 1.21f)
                curveToRelative(0.26f, 1.12f, 0.7f, 2.17f, 1.3f, 3.12f)
                curveToRelative(0.34f, 0.54f, 1.1f, 0.61f, 1.55f, 0.16f)
                curveToRelative(0.32f, -0.32f, 0.4f, -0.83f, 0.15f, -1.21f)
                curveToRelative(-0.49f, -0.76f, -0.85f, -1.61f, -1.05f, -2.53f)
                curveToRelative(-0.09f, -0.45f, -0.5f, -0.75f, -0.96f, -0.75f)
                close()
                moveToRelative(3.44f, 7.45f)
                curveToRelative(0.95f, 0.6f, 2f, 1.04f, 3.12f, 1.3f)
                curveToRelative(0.62f, 0.14f, 1.21f, -0.35f, 1.21f, -0.98f)
                curveToRelative(0f, -0.45f, -0.3f, -0.87f, -0.74f, -0.96f)
                curveToRelative(-0.91f, -0.2f, -1.77f, -0.57f, -2.53f, -1.05f)
                curveToRelative(-0.39f, -0.24f, -0.89f, -0.17f, -1.21f, 0.16f)
                curveToRelative(-0.46f, 0.44f, -0.39f, 1.19f, 0.15f, 1.53f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 4.73f, -3.3f, 8.71f, -7.73f, 9.74f)
                curveToRelative(-0.62f, 0.15f, -1.22f, -0.34f, -1.22f, -0.98f)
                curveToRelative(0f, -0.46f, 0.31f, -0.86f, 0.75f, -0.97f)
                curveToRelative(3.55f, -0.82f, 6.2f, -4f, 6.2f, -7.79f)
                reflectiveCurveToRelative(-2.65f, -6.97f, -6.2f, -7.79f)
                curveToRelative(-0.44f, -0.1f, -0.75f, -0.51f, -0.75f, -0.97f)
                curveToRelative(0f, -0.64f, 0.6f, -1.13f, 1.22f, -0.98f)
                curveTo(18.7f, 3.29f, 22f, 7.27f, 22f, 12f)
                close()
            }
        }.build()
        
        return _Slow_motion_video!!
    }

private var _Slow_motion_video: ImageVector? = null

