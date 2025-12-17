package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Build_circle: ImageVector
    get() {
        if (_Build_circle != null) return _Build_circle!!
        
        _Build_circle = ImageVector.Builder(
            name = "build_circle",
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
                        moveTo(12f, 4f)
                        curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                        curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                        curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                        curveTo(20f, 7.59f, 16.41f, 4f, 12f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                        curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                        curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.68f, 7.76f)
                        curveToRelative(-1.11f, -1.11f, -2.79f, -1.3f, -4.1f, -0.59f)
                        lineToRelative(2.35f, 2.35f)
                        lineToRelative(-1.41f, 1.41f)
                        lineTo(7.17f, 8.58f)
                        curveToRelative(-0.71f, 1.32f, -0.52f, 2.99f, 0.59f, 4.1f)
                        curveToRelative(0.98f, 0.98f, 2.4f, 1.24f, 3.62f, 0.81f)
                        lineToRelative(3.41f, 3.41f)
                        curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                        lineToRelative(1.4f, -1.4f)
                        curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                        lineToRelative(-3.41f, -3.41f)
                        curveTo(13.92f, 10.15f, 13.66f, 8.74f, 12.68f, 7.76f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Build_circle!!
    }

private var _Build_circle: ImageVector? = null

