package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Build_circle: ImageVector
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
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                        curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.49f, 11.38f)
                        curveToRelative(0.43f, -1.22f, 0.17f, -2.64f, -0.81f, -3.62f)
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
                        lineTo(13.49f, 11.38f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Build_circle!!
    }

private var _Build_circle: ImageVector? = null

