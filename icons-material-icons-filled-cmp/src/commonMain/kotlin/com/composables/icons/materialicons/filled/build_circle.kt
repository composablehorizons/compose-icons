package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Build_circle: ImageVector
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
                        moveTo(16.9f, 15.49f)
                        lineToRelative(-1.4f, 1.4f)
                        curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                        lineToRelative(-3.41f, -3.41f)
                        curveToRelative(-1.22f, 0.43f, -2.64f, 0.17f, -3.62f, -0.81f)
                        curveToRelative(-1.11f, -1.11f, -1.3f, -2.79f, -0.59f, -4.1f)
                        lineToRelative(2.35f, 2.35f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(8.58f, 7.17f)
                        curveToRelative(1.32f, -0.71f, 2.99f, -0.52f, 4.1f, 0.59f)
                        curveToRelative(0.98f, 0.98f, 1.24f, 2.4f, 0.81f, 3.62f)
                        lineToRelative(3.41f, 3.41f)
                        curveTo(17.09f, 14.98f, 17.09f, 15.3f, 16.9f, 15.49f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Build_circle!!
    }

private var _Build_circle: ImageVector? = null

