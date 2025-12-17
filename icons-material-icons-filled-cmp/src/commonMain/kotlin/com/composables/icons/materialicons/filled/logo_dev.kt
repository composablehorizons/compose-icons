package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Logo_dev: ImageVector
    get() {
        if (_Logo_dev != null) return _Logo_dev!!
        
        _Logo_dev = ImageVector.Builder(
            name = "logo_dev",
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
                        moveTo(19f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(7.68f, 14.98f)
                        horizontalLineTo(6f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(1.71f)
                        curveToRelative(1.28f, 0f, 1.71f, 1.03f, 1.71f, 1.71f)
                        lineToRelative(0f, 2.56f)
                        curveTo(9.42f, 13.95f, 9f, 14.98f, 7.68f, 14.98f)
                        close()
                        moveTo(12.38f, 11.46f)
                        verticalLineToRelative(1.07f)
                        horizontalLineToRelative(-1.18f)
                        verticalLineToRelative(1.39f)
                        horizontalLineToRelative(1.93f)
                        verticalLineToRelative(1.07f)
                        horizontalLineToRelative(-2.25f)
                        curveToRelative(-0.4f, 0.01f, -0.74f, -0.31f, -0.75f, -0.71f)
                        verticalLineTo(9.75f)
                        curveToRelative(-0.01f, -0.4f, 0.31f, -0.74f, 0.71f, -0.75f)
                        horizontalLineToRelative(2.28f)
                        lineToRelative(0f, 1.07f)
                        horizontalLineToRelative(-1.92f)
                        verticalLineToRelative(1.39f)
                        horizontalLineTo(12.38f)
                        close()
                        moveTo(16.88f, 14.23f)
                        curveToRelative(-0.48f, 1.11f, -1.33f, 0.89f, -1.71f, 0f)
                        lineTo(13.77f, 9f)
                        horizontalLineToRelative(1.18f)
                        lineToRelative(1.07f, 4.11f)
                        lineTo(17.09f, 9f)
                        horizontalLineToRelative(1.18f)
                        lineTo(16.88f, 14.23f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.77f, 10.12f)
                        horizontalLineTo(7.14f)
                        verticalLineToRelative(3.77f)
                        horizontalLineToRelative(0.63f)
                        curveToRelative(0.14f, 0f, 0.28f, -0.05f, 0.42f, -0.16f)
                        curveToRelative(0.14f, -0.1f, 0.21f, -0.26f, 0.21f, -0.47f)
                        verticalLineToRelative(-2.52f)
                        curveToRelative(0f, -0.21f, -0.07f, -0.37f, -0.21f, -0.47f)
                        curveTo(8.05f, 10.17f, 7.91f, 10.12f, 7.77f, 10.12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Logo_dev!!
    }

private var _Logo_dev: ImageVector? = null

