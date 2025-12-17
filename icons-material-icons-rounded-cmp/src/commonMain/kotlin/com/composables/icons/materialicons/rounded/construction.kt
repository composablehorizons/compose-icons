package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Construction: ImageVector
    get() {
        if (_Construction != null) return _Construction!!
        
        _Construction = ImageVector.Builder(
            name = "construction",
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
                        moveTo(20.99f, 17.99f)
                        lineToRelative(-4.94f, -4.94f)
                        lineToRelative(-2.12f, 2.12f)
                        lineToRelative(4.94f, 4.94f)
                        curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                        curveTo(21.57f, 19.52f, 21.57f, 18.57f, 20.99f, 17.99f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.65f, 10f)
                        curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                        curveToRelative(0f, -0.58f, -0.16f, -1.12f, -0.41f, -1.6f)
                        lineToRelative(-2.7f, 2.7f)
                        lineToRelative(-1.49f, -1.49f)
                        lineToRelative(2.7f, -2.7f)
                        curveTo(18.77f, 3.16f, 18.23f, 3f, 17.65f, 3f)
                        curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                        curveToRelative(0f, 0.41f, 0.08f, 0.8f, 0.21f, 1.16f)
                        lineToRelative(-1.85f, 1.85f)
                        lineToRelative(-1.78f, -1.78f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(-0.71f, -0.71f)
                        lineToRelative(2.12f, -2.12f)
                        curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                        lineTo(5.08f, 6.32f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(0.71f, 0.71f)
                        horizontalLineTo(3.25f)
                        curveToRelative(-0.19f, 0f, -0.37f, 0.07f, -0.5f, 0.21f)
                        curveToRelative(-0.28f, 0.28f, -0.28f, 0.72f, 0f, 1f)
                        lineToRelative(2.54f, 2.54f)
                        curveToRelative(0.28f, 0.28f, 0.72f, 0.28f, 1f, 0f)
                        curveToRelative(0.13f, -0.13f, 0.21f, -0.31f, 0.21f, -0.5f)
                        verticalLineTo(9.15f)
                        lineTo(7.2f, 9.85f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(1.78f, 1.78f)
                        lineToRelative(-6.35f, 6.35f)
                        curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                        verticalLineToRelative(0f)
                        curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                        lineTo(16.48f, 9.79f)
                        curveTo(16.85f, 9.92f, 17.24f, 10f, 17.65f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Construction!!
    }

private var _Construction: ImageVector? = null

