package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Psychology: ImageVector
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
                        moveTo(13f, 8.57f)
                        curveToRelative(-0.79f, 0f, -1.43f, 0.64f, -1.43f, 1.43f)
                        reflectiveCurveToRelative(0.64f, 1.43f, 1.43f, 1.43f)
                        reflectiveCurveToRelative(1.43f, -0.64f, 1.43f, -1.43f)
                        reflectiveCurveTo(13.79f, 8.57f, 13f, 8.57f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 3f)
                        curveTo(9.25f, 3f, 6.2f, 5.94f, 6.02f, 9.64f)
                        lineTo(4.1f, 12.2f)
                        curveTo(3.85f, 12.53f, 4.09f, 13f, 4.5f, 13f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(-4.68f)
                        curveToRelative(2.36f, -1.12f, 4f, -3.53f, 4f, -6.32f)
                        curveTo(20f, 6.13f, 16.87f, 3f, 13f, 3f)
                        close()
                        moveTo(16f, 10f)
                        curveToRelative(0f, 0.13f, -0.01f, 0.26f, -0.02f, 0.39f)
                        lineToRelative(0.83f, 0.66f)
                        curveToRelative(0.08f, 0.06f, 0.1f, 0.16f, 0.05f, 0.25f)
                        lineToRelative(-0.8f, 1.39f)
                        curveToRelative(-0.05f, 0.09f, -0.16f, 0.12f, -0.24f, 0.09f)
                        lineToRelative(-0.99f, -0.4f)
                        curveToRelative(-0.21f, 0.16f, -0.43f, 0.29f, -0.67f, 0.39f)
                        lineTo(14f, 13.83f)
                        curveToRelative(-0.01f, 0.1f, -0.1f, 0.17f, -0.2f, 0.17f)
                        horizontalLineToRelative(-1.6f)
                        curveToRelative(-0.1f, 0f, -0.18f, -0.07f, -0.2f, -0.17f)
                        lineToRelative(-0.15f, -1.06f)
                        curveToRelative(-0.25f, -0.1f, -0.47f, -0.23f, -0.68f, -0.39f)
                        lineToRelative(-0.99f, 0.4f)
                        curveToRelative(-0.09f, 0.03f, -0.2f, 0f, -0.25f, -0.09f)
                        lineToRelative(-0.8f, -1.39f)
                        curveToRelative(-0.05f, -0.08f, -0.03f, -0.19f, 0.05f, -0.25f)
                        lineToRelative(0.84f, -0.66f)
                        curveTo(10.01f, 10.26f, 10f, 10.13f, 10f, 10f)
                        curveToRelative(0f, -0.13f, 0.02f, -0.27f, 0.04f, -0.39f)
                        lineTo(9.19f, 8.95f)
                        curveToRelative(-0.08f, -0.06f, -0.1f, -0.16f, -0.05f, -0.26f)
                        lineToRelative(0.8f, -1.38f)
                        curveToRelative(0.05f, -0.09f, 0.15f, -0.12f, 0.24f, -0.09f)
                        lineToRelative(1f, 0.4f)
                        curveToRelative(0.2f, -0.15f, 0.43f, -0.29f, 0.67f, -0.39f)
                        lineToRelative(0.15f, -1.06f)
                        curveTo(12.02f, 6.07f, 12.1f, 6f, 12.2f, 6f)
                        horizontalLineToRelative(1.6f)
                        curveToRelative(0.1f, 0f, 0.18f, 0.07f, 0.2f, 0.17f)
                        lineToRelative(0.15f, 1.06f)
                        curveToRelative(0.24f, 0.1f, 0.46f, 0.23f, 0.67f, 0.39f)
                        lineToRelative(1f, -0.4f)
                        curveToRelative(0.09f, -0.03f, 0.2f, 0f, 0.24f, 0.09f)
                        lineToRelative(0.8f, 1.38f)
                        curveToRelative(0.05f, 0.09f, 0.03f, 0.2f, -0.05f, 0.26f)
                        lineToRelative(-0.85f, 0.66f)
                        curveTo(15.99f, 9.73f, 16f, 9.86f, 16f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Psychology!!
    }

private var _Psychology: ImageVector? = null

