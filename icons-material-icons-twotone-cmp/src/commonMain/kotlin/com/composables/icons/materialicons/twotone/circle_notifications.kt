package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Circle_notifications: ImageVector
    get() {
        if (_Circle_notifications != null) return _Circle_notifications!!
        
        _Circle_notifications = ImageVector.Builder(
            name = "circle_notifications",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 4f)
                    curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                    reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                    curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                    reflectiveCurveTo(16.41f, 4f, 12f, 4f)
                    close()
                    moveTo(12f, 18.5f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    horizontalLineToRelative(3f)
                    curveTo(13.5f, 17.83f, 12.83f, 18.5f, 12f, 18.5f)
                    close()
                    moveTo(17f, 16f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-2.61f)
                    curveTo(8f, 9.27f, 9.03f, 7.47f, 11f, 7f)
                    verticalLineTo(6.5f)
                    curveToRelative(0f, -0.57f, 0.43f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.43f, 1f, 1f)
                    verticalLineTo(7f)
                    curveToRelative(1.97f, 0.47f, 3f, 2.28f, 3f, 4.39f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(16f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 18.5f)
                    curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    horizontalLineToRelative(-3f)
                    curveTo(10.5f, 17.83f, 11.17f, 18.5f, 12f, 18.5f)
                    close()
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                    curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                    reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(12f, 20f)
                    curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                    reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                    curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                    reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                    close()
                    moveTo(16f, 11.39f)
                    curveToRelative(0f, -2.11f, -1.03f, -3.92f, -3f, -4.39f)
                    verticalLineTo(6.5f)
                    curveToRelative(0f, -0.57f, -0.43f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.43f, -1f, 1f)
                    verticalLineTo(7f)
                    curveToRelative(-1.97f, 0.47f, -3f, 2.27f, -3f, 4.39f)
                    verticalLineTo(14f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(11.39f)
                    close()
                    moveTo(14f, 14f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Circle_notifications!!
    }

private var _Circle_notifications: ImageVector? = null

