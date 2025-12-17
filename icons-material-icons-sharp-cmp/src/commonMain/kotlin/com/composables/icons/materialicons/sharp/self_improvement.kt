package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Self_improvement: ImageVector
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
                        moveTo(21f, 16f)
                        verticalLineToRelative(-2f)
                        curveToRelative(-2.24f, 0f, -4.16f, -0.96f, -5.6f, -2.68f)
                        lineToRelative(-1.34f, -1.6f)
                        curveTo(13.68f, 9.26f, 13.12f, 9f, 12.53f, 9f)
                        horizontalLineToRelative(-1.05f)
                        curveToRelative(-0.59f, 0f, -1.15f, 0.26f, -1.53f, 0.72f)
                        lineToRelative(-1.34f, 1.6f)
                        curveTo(7.16f, 13.04f, 5.24f, 14f, 3f, 14f)
                        verticalLineToRelative(2f)
                        curveToRelative(2.77f, 0f, 5.19f, -1.17f, 7f, -3.25f)
                        verticalLineTo(15f)
                        lineToRelative(-3.88f, 1.55f)
                        curveTo(5.45f, 16.82f, 5f, 17.48f, 5f, 18.21f)
                        curveTo(5f, 19.2f, 5.8f, 20f, 6.79f, 20f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(-0.5f)
                        curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                        reflectiveCurveTo(14.78f, 18f, 14.5f, 18f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(7.21f)
                        curveTo(18.2f, 20f, 19f, 19.2f, 19f, 18.21f)
                        curveToRelative(0f, -0.73f, -0.45f, -1.39f, -1.12f, -1.66f)
                        lineTo(14f, 15f)
                        verticalLineToRelative(-2.25f)
                        curveTo(15.81f, 14.83f, 18.23f, 16f, 21f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Self_improvement!!
    }

private var _Self_improvement: ImageVector? = null

