package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Replay_circle_filled: ImageVector
    get() {
        if (_Replay_circle_filled != null) return _Replay_circle_filled!!
        
        _Replay_circle_filled = ImageVector.Builder(
            name = "replay_circle_filled",
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
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                    reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(18f, 12.74f)
                    curveToRelative(-0.12f, 3.09f, -2.67f, 5.64f, -5.76f, 5.76f)
                    curveToRelative(-3.01f, 0.12f, -5.56f, -1.99f, -6.12f, -4.82f)
                    curveTo(5.99f, 13.07f, 6.48f, 12.5f, 7.1f, 12.5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.47f, 0f, 0.88f, 0.33f, 0.98f, 0.8f)
                    curveToRelative(0.42f, 2.07f, 2.44f, 3.57f, 4.72f, 3.12f)
                    curveToRelative(1.56f, -0.3f, 2.82f, -1.56f, 3.12f, -3.12f)
                    curveToRelative(0.5f, -2.56f, -1.45f, -4.8f, -3.92f, -4.8f)
                    verticalLineToRelative(1.79f)
                    curveToRelative(0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f)
                    lineTo(8.35f, 7.85f)
                    curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                    lineToRelative(2.79f, -2.79f)
                    curveTo(11.46f, 4.04f, 12f, 4.26f, 12f, 4.71f)
                    verticalLineTo(6.5f)
                    curveTo(15.39f, 6.5f, 18.13f, 9.32f, 18f, 12.74f)
                    close()
                }
            }
        }.build()
        
        return _Replay_circle_filled!!
    }

private var _Replay_circle_filled: ImageVector? = null

