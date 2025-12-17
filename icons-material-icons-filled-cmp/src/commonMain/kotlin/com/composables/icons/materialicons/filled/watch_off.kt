package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Watch_off: ImageVector
    get() {
        if (_Watch_off != null) return _Watch_off!!
        
        _Watch_off = ImageVector.Builder(
            name = "watch_off",
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
                        moveTo(12f, 7f)
                        curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                        curveToRelative(0f, 0.64f, -0.13f, 1.25f, -0.35f, 1.82f)
                        lineToRelative(1.5f, 1.5f)
                        curveTo(18.69f, 14.33f, 19f, 13.2f, 19f, 12f)
                        curveToRelative(0f, -2.22f, -1.03f, -4.19f, -2.64f, -5.47f)
                        lineTo(15f, 2f)
                        horizontalLineTo(9f)
                        lineTo(8.04f, 5.21f)
                        lineToRelative(2.14f, 2.14f)
                        curveTo(10.75f, 7.13f, 11.36f, 7f, 12f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineToRelative(4.46f, 4.46f)
                        curveTo(5.31f, 9.67f, 5f, 10.8f, 5f, 12f)
                        curveToRelative(0f, 2.22f, 1.03f, 4.19f, 2.64f, 5.47f)
                        lineTo(9f, 22f)
                        horizontalLineToRelative(6f)
                        lineToRelative(0.96f, -3.21f)
                        lineToRelative(3.82f, 3.82f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        close()
                        moveTo(12f, 17f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        curveToRelative(0f, -0.64f, 0.13f, -1.25f, 0.35f, -1.82f)
                        lineToRelative(6.47f, 6.47f)
                        curveTo(13.25f, 16.87f, 12.64f, 17f, 12f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Watch_off!!
    }

private var _Watch_off: ImageVector? = null

