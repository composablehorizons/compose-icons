package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Heart_broken: ImageVector
    get() {
        if (_Heart_broken != null) return _Heart_broken!!
        
        _Heart_broken = ImageVector.Builder(
            name = "heart_broken",
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
                        moveTo(9.23f, 5.42f)
                        curveTo(8.69f, 5.15f, 8.09f, 5f, 7.5f, 5f)
                        curveTo(5.54f, 5f, 4f, 6.54f, 4f, 8.5f)
                        curveToRelative(0f, 2.5f, 2.45f, 4.84f, 6.24f, 8.23f)
                        lineTo(10.77f, 12f)
                        horizontalLineTo(7.35f)
                        lineTo(9.23f, 5.42f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.5f, 5f)
                        curveToRelative(-0.37f, 0f, -0.75f, 0.06f, -1.12f, 0.18f)
                        lineTo(14.77f, 7f)
                        horizontalLineToRelative(2.91f)
                        lineToRelative(-2.56f, 8.53f)
                        curveTo(17.98f, 12.93f, 20f, 10.71f, 20f, 8.5f)
                        curveTo(20f, 6.54f, 18.46f, 5f, 16.5f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.5f, 3f)
                        curveToRelative(-0.96f, 0f, -1.9f, 0.25f, -2.73f, 0.69f)
                        lineTo(12f, 9f)
                        horizontalLineToRelative(3f)
                        lineToRelative(-3f, 10f)
                        lineToRelative(1f, -9f)
                        horizontalLineToRelative(-3f)
                        lineToRelative(1.54f, -5.39f)
                        curveTo(10.47f, 3.61f, 9.01f, 3f, 7.5f, 3f)
                        curveTo(4.42f, 3f, 2f, 5.42f, 2f, 8.5f)
                        curveToRelative(0f, 4.13f, 4.16f, 7.18f, 10f, 12.5f)
                        curveToRelative(5.47f, -4.94f, 10f, -8.26f, 10f, -12.5f)
                        curveTo(22f, 5.42f, 19.58f, 3f, 16.5f, 3f)
                        close()
                        moveTo(10.24f, 16.73f)
                        curveTo(6.45f, 13.34f, 4f, 11f, 4f, 8.5f)
                        curveTo(4f, 6.54f, 5.54f, 5f, 7.5f, 5f)
                        curveToRelative(0.59f, 0f, 1.19f, 0.15f, 1.73f, 0.42f)
                        lineTo(7.35f, 12f)
                        horizontalLineToRelative(3.42f)
                        lineTo(10.24f, 16.73f)
                        close()
                        moveTo(15.13f, 15.53f)
                        lineTo(17.69f, 7f)
                        horizontalLineToRelative(-2.91f)
                        lineToRelative(0.61f, -1.82f)
                        curveTo(15.75f, 5.06f, 16.13f, 5f, 16.5f, 5f)
                        curveTo(18.46f, 5f, 20f, 6.54f, 20f, 8.5f)
                        curveTo(20f, 10.71f, 17.98f, 12.93f, 15.13f, 15.53f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Heart_broken!!
    }

private var _Heart_broken: ImageVector? = null

