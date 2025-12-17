package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Crisis_alert: ImageVector
    get() {
        if (_Crisis_alert != null) return _Crisis_alert!!
        
        _Crisis_alert = ImageVector.Builder(
            name = "crisis_alert",
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
                    moveTo(14.5f, 2.5f)
                    curveToRelative(0f, 1.5f, -1.5f, 6f, -1.5f, 6f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(0f, 0f, -1.5f, -4.5f, -1.5f, -6f)
                    curveTo(9.5f, 1.12f, 10.62f, 0f, 12f, 0f)
                    reflectiveCurveTo(14.5f, 1.12f, 14.5f, 2.5f)
                    close()
                    moveTo(12f, 10f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(13.1f, 10f, 12f, 10f)
                    close()
                    moveTo(16.08f, 5.11f)
                    curveToRelative(0.18f, -0.75f, 0.33f, -1.47f, 0.39f, -2.06f)
                    curveTo(19.75f, 4.69f, 22f, 8.08f, 22f, 12f)
                    curveToRelative(0f, 5.52f, -4.48f, 10f, -10f, 10f)
                    reflectiveCurveTo(2f, 17.52f, 2f, 12f)
                    curveToRelative(0f, -3.92f, 2.25f, -7.31f, 5.53f, -8.95f)
                    curveTo(7.6f, 3.64f, 7.74f, 4.37f, 7.92f, 5.11f)
                    curveTo(5.58f, 6.51f, 4f, 9.07f, 4f, 12f)
                    curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                    reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                    curveTo(20f, 9.07f, 18.42f, 6.51f, 16.08f, 5.11f)
                    close()
                    moveTo(18f, 12f)
                    curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                    reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                    curveToRelative(0f, -2f, 0.98f, -3.77f, 2.48f, -4.86f)
                    curveToRelative(0.23f, 0.81f, 0.65f, 2.07f, 0.65f, 2.07f)
                    curveTo(8.43f, 9.93f, 8f, 10.92f, 8f, 12f)
                    curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                    reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                    curveToRelative(0f, -1.08f, -0.43f, -2.07f, -1.13f, -2.79f)
                    curveToRelative(0f, 0f, 0.41f, -1.22f, 0.65f, -2.07f)
                    curveTo(17.02f, 8.23f, 18f, 10f, 18f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Crisis_alert!!
    }

private var _Crisis_alert: ImageVector? = null

