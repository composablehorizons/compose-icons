package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Timer_off: ImageVector
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
                        moveTo(12f, 20f)
                        curveToRelative(1.47f, 0f, 2.83f, -0.45f, 3.95f, -1.22f)
                        lineTo(6.22f, 9.05f)
                        curveTo(5.45f, 10.17f, 5f, 11.53f, 5f, 13f)
                        curveTo(5f, 16.87f, 8.13f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 6f)
                        curveToRelative(-0.94f, 0f, -1.83f, 0.19f, -2.65f, 0.52f)
                        lineTo(11f, 8.17f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2.17f)
                        lineToRelative(5.48f, 5.48f)
                        curveTo(18.81f, 14.83f, 19f, 13.94f, 19f, 13f)
                        curveTo(19f, 9.13f, 15.87f, 6f, 12f, 6f)
                        close()
                    }
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
                        moveTo(12f, 6f)
                        curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                        curveToRelative(0f, 0.94f, -0.19f, 1.83f, -0.52f, 2.65f)
                        lineToRelative(1.5f, 1.5f)
                        curveTo(20.63f, 15.91f, 21f, 14.5f, 21f, 13f)
                        curveToRelative(0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f)
                        lineToRelative(1.42f, -1.42f)
                        curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f)
                        lineToRelative(-1.42f, 1.42f)
                        curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                        curveToRelative(-1.5f, 0f, -2.91f, 0.37f, -4.15f, 1.02f)
                        lineToRelative(1.5f, 1.5f)
                        curveTo(10.17f, 6.19f, 11.06f, 6f, 12f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 8f)
                        lineTo(11f, 8.17f)
                        lineTo(13f, 10.17f)
                        lineTo(13f, 8f)
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
                        moveTo(12f, 20f)
                        curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                        curveToRelative(0f, -1.47f, 0.45f, -2.83f, 1.22f, -3.95f)
                        lineToRelative(9.73f, 9.73f)
                        curveTo(14.83f, 19.55f, 13.47f, 20f, 12f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Timer_off!!
    }

private var _Timer_off: ImageVector? = null

