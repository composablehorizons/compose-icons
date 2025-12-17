package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Directions_boat_filled: ImageVector
    get() {
        if (_Directions_boat_filled != null) return _Directions_boat_filled!!
        
        _Directions_boat_filled = ImageVector.Builder(
            name = "directions_boat_filled",
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
                        moveTo(20f, 21f)
                        curveToRelative(-1.39f, 0f, -2.78f, -0.47f, -4f, -1.32f)
                        curveToRelative(-2.44f, 1.71f, -5.56f, 1.71f, -8f, 0f)
                        curveTo(6.78f, 20.53f, 5.39f, 21f, 4f, 21f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.38f, 0f, 2.74f, -0.35f, 4f, -0.99f)
                        curveToRelative(2.52f, 1.29f, 5.48f, 1.29f, 8f, 0f)
                        curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4f, 0.99f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(20f)
                        close()
                        moveTo(3.95f, 19f)
                        horizontalLineTo(4f)
                        curveToRelative(1.6f, 0f, 3.02f, -0.88f, 4f, -2f)
                        curveToRelative(0.98f, 1.12f, 2.4f, 2f, 4f, 2f)
                        reflectiveCurveToRelative(3.02f, -0.88f, 4f, -2f)
                        curveToRelative(0.98f, 1.12f, 2.4f, 2f, 4f, 2f)
                        horizontalLineToRelative(0.05f)
                        lineToRelative(2.18f, -7.65f)
                        lineTo(20f, 10.62f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(1f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(6.62f)
                        lineToRelative(-2.23f, 0.73f)
                        lineTo(3.95f, 19f)
                        close()
                        moveTo(6f, 6f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(3.97f)
                        lineTo(12f, 8f)
                        lineTo(6f, 9.97f)
                        verticalLineTo(6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Directions_boat_filled!!
    }

private var _Directions_boat_filled: ImageVector? = null

