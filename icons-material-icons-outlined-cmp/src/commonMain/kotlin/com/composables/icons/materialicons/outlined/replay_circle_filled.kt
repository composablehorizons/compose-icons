package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Replay_circle_filled: ImageVector
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
                    moveTo(12f, 18.5f)
                    curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                    reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                    curveToRelative(0f, -2.24f, -1.85f, -4.09f, -4.16f, -3.99f)
                    lineToRelative(1.57f, 1.57f)
                    lineTo(12f, 11.5f)
                    lineToRelative(-4f, -4f)
                    lineToRelative(4f, -4f)
                    lineToRelative(1.41f, 1.41f)
                    lineToRelative(-1.6f, 1.6f)
                    curveTo(15.28f, 6.4f, 18f, 9.18f, 18f, 12.5f)
                    curveTo(18f, 15.81f, 15.31f, 18.5f, 12f, 18.5f)
                    close()
                }
            }
        }.build()
        
        return _Replay_circle_filled!!
    }

private var _Replay_circle_filled: ImageVector? = null

