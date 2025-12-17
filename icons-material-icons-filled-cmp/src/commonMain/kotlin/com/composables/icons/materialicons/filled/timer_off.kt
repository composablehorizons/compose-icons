package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Timer_off: ImageVector
    get() {
        if (_Timer_off != null) return _Timer_off!!
        
        _Timer_off = ImageVector.Builder(
            name = "timer_off",
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
                        moveTo(9f, 1f)
                        horizontalLineTo(15f)
                        verticalLineTo(3f)
                        horizontalLineTo(9f)
                        verticalLineTo(1f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 8f)
                        verticalLineToRelative(2.17f)
                        lineToRelative(6.98f, 6.98f)
                        curveTo(20.63f, 15.91f, 21f, 14.5f, 21f, 13f)
                        curveToRelative(0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f)
                        lineToRelative(1.42f, -1.42f)
                        curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f)
                        lineToRelative(-1.42f, 1.42f)
                        curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                        curveToRelative(-1.5f, 0f, -2.91f, 0.37f, -4.15f, 1.02f)
                        lineTo(10.83f, 8f)
                        horizontalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineToRelative(3.4f, 3.4f)
                        curveTo(3.67f, 9.12f, 3f, 10.98f, 3f, 13f)
                        curveToRelative(0f, 4.97f, 4.02f, 9f, 9f, 9f)
                        curveToRelative(2.02f, 0f, 3.88f, -0.67f, 5.38f, -1.79f)
                        lineToRelative(2.4f, 2.4f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Timer_off!!
    }

private var _Timer_off: ImageVector? = null

