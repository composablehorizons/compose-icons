package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Self_improvement: ImageVector
    get() {
        if (_Self_improvement != null) return _Self_improvement!!
        
        _Self_improvement = ImageVector.Builder(
            name = "self_improvement",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 8f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 14.94f)
                        lineTo(21f, 14.94f)
                        curveToRelative(0f, -0.5f, -0.36f, -0.93f, -0.85f, -0.98f)
                        curveToRelative(-1.88f, -0.21f, -3.49f, -1.13f, -4.75f, -2.63f)
                        lineToRelative(-1.34f, -1.6f)
                        curveTo(13.68f, 9.26f, 13.12f, 9f, 12.53f, 9f)
                        horizontalLineToRelative(-1.05f)
                        curveToRelative(-0.59f, 0f, -1.15f, 0.26f, -1.53f, 0.72f)
                        lineToRelative(-1.34f, 1.6f)
                        curveToRelative(-1.25f, 1.5f, -2.87f, 2.42f, -4.75f, 2.63f)
                        curveTo(3.36f, 14.01f, 3f, 14.44f, 3f, 14.94f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.6f, 0.53f, 1.07f, 1.13f, 1f)
                        curveToRelative(2.3f, -0.27f, 4.32f, -1.39f, 5.87f, -3.19f)
                        verticalLineTo(15f)
                        lineToRelative(-3.76f, 1.5f)
                        curveToRelative(-0.65f, 0.26f, -1.16f, 0.83f, -1.23f, 1.53f)
                        curveTo(4.91f, 19.1f, 5.74f, 20f, 6.79f, 20f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(-0.5f)
                        curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                        reflectiveCurveTo(14.78f, 18f, 14.5f, 18f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                        verticalLineTo(20f)
                        lineToRelative(7.1f, 0f)
                        curveToRelative(0.85f, 0f, 1.65f, -0.54f, 1.85f, -1.37f)
                        curveToRelative(0.21f, -0.89f, -0.27f, -1.76f, -1.08f, -2.08f)
                        lineTo(14f, 15f)
                        verticalLineToRelative(-2.25f)
                        curveToRelative(1.56f, 1.8f, 3.57f, 2.91f, 5.87f, 3.19f)
                        curveTo(20.47f, 16f, 21f, 15.54f, 21f, 14.94f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Self_improvement!!
    }

private var _Self_improvement: ImageVector? = null

