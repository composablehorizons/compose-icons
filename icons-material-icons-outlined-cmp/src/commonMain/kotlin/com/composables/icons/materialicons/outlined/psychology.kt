package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Psychology: ImageVector
    get() {
        if (_Psychology != null) return _Psychology!!
        
        _Psychology = ImageVector.Builder(
            name = "psychology",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.82f, 7.22f)
                        lineToRelative(-1f, 0.4f)
                        curveToRelative(-0.21f, -0.16f, -0.43f, -0.29f, -0.67f, -0.39f)
                        lineTo(14f, 6.17f)
                        curveTo(13.98f, 6.07f, 13.9f, 6f, 13.8f, 6f)
                        horizontalLineToRelative(-1.6f)
                        curveToRelative(-0.1f, 0f, -0.18f, 0.07f, -0.19f, 0.17f)
                        lineToRelative(-0.15f, 1.06f)
                        curveToRelative(-0.24f, 0.1f, -0.47f, 0.23f, -0.67f, 0.39f)
                        lineToRelative(-1f, -0.4f)
                        curveToRelative(-0.09f, -0.03f, -0.2f, 0f, -0.24f, 0.09f)
                        lineToRelative(-0.8f, 1.38f)
                        curveToRelative(-0.05f, 0.09f, -0.03f, 0.2f, 0.05f, 0.26f)
                        lineToRelative(0.85f, 0.66f)
                        curveTo(10.02f, 9.73f, 10f, 9.87f, 10f, 10f)
                        curveToRelative(0f, 0.13f, 0.01f, 0.26f, 0.03f, 0.39f)
                        lineToRelative(-0.84f, 0.66f)
                        curveToRelative(-0.08f, 0.06f, -0.1f, 0.17f, -0.05f, 0.25f)
                        lineToRelative(0.8f, 1.39f)
                        curveToRelative(0.05f, 0.09f, 0.15f, 0.12f, 0.25f, 0.09f)
                        lineToRelative(0.99f, -0.4f)
                        curveToRelative(0.21f, 0.16f, 0.43f, 0.29f, 0.68f, 0.39f)
                        lineTo(12f, 13.83f)
                        curveToRelative(0.02f, 0.1f, 0.1f, 0.17f, 0.2f, 0.17f)
                        horizontalLineToRelative(1.6f)
                        curveToRelative(0.1f, 0f, 0.18f, -0.07f, 0.2f, -0.17f)
                        lineToRelative(0.15f, -1.06f)
                        curveToRelative(0.24f, -0.1f, 0.47f, -0.23f, 0.67f, -0.39f)
                        lineToRelative(0.99f, 0.4f)
                        curveToRelative(0.09f, 0.04f, 0.2f, 0f, 0.24f, -0.09f)
                        lineToRelative(0.8f, -1.39f)
                        curveToRelative(0.05f, -0.09f, 0.03f, -0.19f, -0.05f, -0.25f)
                        lineToRelative(-0.83f, -0.66f)
                        curveTo(15.99f, 10.26f, 16f, 10.13f, 16f, 10f)
                        curveToRelative(0f, -0.14f, -0.01f, -0.27f, -0.03f, -0.39f)
                        lineToRelative(0.85f, -0.66f)
                        curveToRelative(0.08f, -0.06f, 0.1f, -0.17f, 0.05f, -0.26f)
                        lineToRelative(-0.8f, -1.38f)
                        curveTo(16.02f, 7.22f, 15.91f, 7.19f, 15.82f, 7.22f)
                        close()
                        moveTo(13f, 11.43f)
                        curveToRelative(-0.79f, 0f, -1.43f, -0.64f, -1.43f, -1.43f)
                        reflectiveCurveTo(12.21f, 8.57f, 13f, 8.57f)
                        reflectiveCurveToRelative(1.43f, 0.64f, 1.43f, 1.43f)
                        reflectiveCurveTo(13.79f, 11.43f, 13f, 11.43f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.94f, 9.06f)
                        curveToRelative(-0.43f, -3.27f, -3.23f, -5.86f, -6.53f, -6.05f)
                        curveTo(13.27f, 3f, 13.14f, 3f, 13f, 3f)
                        curveTo(9.47f, 3f, 6.57f, 5.61f, 6.08f, 9f)
                        lineToRelative(-1.93f, 3.48f)
                        curveTo(3.74f, 13.14f, 4.22f, 14f, 5f, 14f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(-4.68f)
                        curveTo(18.62f, 15.07f, 20.35f, 12.24f, 19.94f, 9.06f)
                        close()
                        moveTo(14.89f, 14.63f)
                        lineTo(14f, 15.05f)
                        verticalLineTo(19f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-4f)
                        horizontalLineTo(6.7f)
                        lineToRelative(1.33f, -2.33f)
                        curveTo(8.21f, 7.06f, 10.35f, 5f, 13f, 5f)
                        curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                        curveTo(18f, 12.09f, 16.71f, 13.88f, 14.89f, 14.63f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Psychology!!
    }

private var _Psychology: ImageVector? = null

