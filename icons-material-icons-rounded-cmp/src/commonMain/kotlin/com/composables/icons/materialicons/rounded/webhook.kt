package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Webhook: ImageVector
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
                    moveTo(2f, 16f)
                    curveToRelative(0f, -1.84f, 1f, -3.45f, 2.48f, -4.32f)
                    curveTo(5.15f, 11.29f, 6f, 11.76f, 6f, 12.54f)
                    curveToRelative(0f, 0.36f, -0.19f, 0.68f, -0.5f, 0.86f)
                    curveTo(4.6f, 13.92f, 4f, 14.89f, 4f, 16f)
                    curveToRelative(0f, 1.85f, 1.68f, 3.31f, 3.6f, 2.94f)
                    curveToRelative(1.42f, -0.28f, 2.4f, -1.61f, 2.4f, -3.06f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.49f, 0.39f, -0.88f, 0.88f, -0.88f)
                    lineToRelative(5f, 0f)
                    curveToRelative(0.27f, -0.31f, 0.67f, -0.5f, 1.12f, -0.5f)
                    curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                    curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                    curveToRelative(-0.44f, 0f, -0.84f, -0.19f, -1.12f, -0.5f)
                    lineToRelative(-3.98f, 0f)
                    curveToRelative(-0.46f, 2.28f, -2.48f, 4f, -4.9f, 4f)
                    curveTo(4.24f, 21f, 2f, 18.76f, 2f, 16f)
                    close()
                    moveTo(16.37f, 7f)
                    curveToRelative(0.65f, 0f, 1.14f, -0.62f, 0.97f, -1.25f)
                    curveTo(16.79f, 3.59f, 14.83f, 2f, 12.5f, 2f)
                    curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                    curveToRelative(0f, 1.43f, 0.6f, 2.71f, 1.55f, 3.62f)
                    lineToRelative(-2.35f, 3.9f)
                    curveTo(6.02f, 14.66f, 5.5f, 15.27f, 5.5f, 16f)
                    curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                    reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                    curveToRelative(0f, -0.16f, -0.02f, -0.31f, -0.07f, -0.45f)
                    lineToRelative(2.86f, -4.75f)
                    curveToRelative(0.25f, -0.41f, 0.13f, -0.95f, -0.28f, -1.19f)
                    curveTo(10.11f, 9.08f, 9.5f, 8.11f, 9.5f, 7f)
                    curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                    curveToRelative(1.38f, 0f, 2.54f, 0.93f, 2.89f, 2.2f)
                    curveTo(15.52f, 6.66f, 15.9f, 7f, 16.37f, 7f)
                    close()
                    moveTo(17f, 13f)
                    curveToRelative(-0.38f, 0f, -0.75f, 0.07f, -1.09f, 0.2f)
                    curveToRelative(-0.4f, 0.16f, -0.86f, -0.04f, -1.08f, -0.41f)
                    lineToRelative(-2.6f, -4.32f)
                    curveTo(11.53f, 8.35f, 11f, 7.74f, 11f, 7f)
                    curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveTo(14f, 6.17f, 14f, 7f)
                    curveToRelative(0f, 0.15f, -0.02f, 0.29f, -0.06f, 0.43f)
                    lineToRelative(2.19f, 3.65f)
                    curveTo(16.41f, 11.03f, 16.7f, 11f, 17f, 11f)
                    lineToRelative(0f, 0f)
                    curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                    curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                    curveToRelative(-0.86f, 0f, -1.68f, -0.22f, -2.39f, -0.61f)
                    curveToRelative(-0.92f, -0.5f, -0.58f, -1.89f, 0.47f, -1.89f)
                    curveToRelative(0.17f, 0f, 0.34f, 0.05f, 0.49f, 0.14f)
                    curveTo(15.99f, 18.87f, 16.48f, 19f, 17f, 19f)
                    curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                    reflectiveCurveTo(18.65f, 13f, 17f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Webhook!!
    }

private var _Webhook: ImageVector? = null

