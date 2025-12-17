package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Replay_circle_filled: ImageVector
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
                    moveTo(18f, 12.5f)
                    curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                    reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                    reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                    reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                    verticalLineToRelative(3f)
                    lineToRelative(-4f, -4f)
                    lineToRelative(4f, -4f)
                    verticalLineToRelative(3f)
                    curveTo(15.31f, 6.5f, 18f, 9.19f, 18f, 12.5f)
                    close()
                }
            }
        }.build()
        
        return _Replay_circle_filled!!
    }

private var _Replay_circle_filled: ImageVector? = null

