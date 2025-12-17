package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Webhook: ImageVector
    get() {
        if (_Webhook != null) return _Webhook!!
        
        _Webhook = ImageVector.Builder(
            name = "webhook",
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
                    moveTo(10f, 15f)
                    lineToRelative(5.88f, 0f)
                    curveToRelative(0.27f, -0.31f, 0.67f, -0.5f, 1.12f, -0.5f)
                    curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                    curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                    curveToRelative(-0.44f, 0f, -0.84f, -0.19f, -1.12f, -0.5f)
                    lineToRelative(-3.98f, 0f)
                    curveToRelative(-0.46f, 2.28f, -2.48f, 4f, -4.9f, 4f)
                    curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                    curveToRelative(0f, -2.42f, 1.72f, -4.44f, 4f, -4.9f)
                    lineToRelative(0f, 2.07f)
                    curveTo(4.84f, 13.58f, 4f, 14.7f, 4f, 16f)
                    curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                    reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                    verticalLineTo(15f)
                    close()
                    moveTo(12.5f, 4f)
                    curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                    curveToRelative(0f, 1.43f, 0.6f, 2.71f, 1.55f, 3.62f)
                    lineToRelative(-2.35f, 3.9f)
                    curveTo(6.02f, 14.66f, 5.5f, 15.27f, 5.5f, 16f)
                    curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                    reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                    curveToRelative(0f, -0.16f, -0.02f, -0.31f, -0.07f, -0.45f)
                    lineToRelative(3.38f, -5.63f)
                    curveTo(10.49f, 9.61f, 9.5f, 8.42f, 9.5f, 7f)
                    curveTo(9.5f, 5.35f, 10.85f, 4f, 12.5f, 4f)
                    close()
                    moveTo(17f, 13f)
                    curveToRelative(-0.64f, 0f, -1.23f, 0.2f, -1.72f, 0.54f)
                    lineToRelative(-3.05f, -5.07f)
                    curveTo(11.53f, 8.35f, 11f, 7.74f, 11f, 7f)
                    curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveTo(14f, 6.17f, 14f, 7f)
                    curveToRelative(0f, 0.15f, -0.02f, 0.29f, -0.06f, 0.43f)
                    lineToRelative(2.19f, 3.65f)
                    curveTo(16.41f, 11.03f, 16.7f, 11f, 17f, 11f)
                    lineToRelative(0f, 0f)
                    curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                    curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                    curveToRelative(-1.85f, 0f, -3.47f, -1.01f, -4.33f, -2.5f)
                    lineToRelative(2.67f, 0f)
                    curveTo(15.82f, 18.82f, 16.39f, 19f, 17f, 19f)
                    curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                    reflectiveCurveTo(18.65f, 13f, 17f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Webhook!!
    }

private var _Webhook: ImageVector? = null

