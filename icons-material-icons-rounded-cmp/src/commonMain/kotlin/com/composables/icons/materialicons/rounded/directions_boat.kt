package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Directions_boat: ImageVector
    get() {
        if (_Directions_boat != null) return _Directions_boat!!
        
        _Directions_boat = ImageVector.Builder(
            name = "directions_boat",
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
                        curveToRelative(-1.19f, 0f, -2.38f, -0.35f, -3.47f, -0.98f)
                        curveToRelative(-0.33f, -0.19f, -0.73f, -0.19f, -1.07f, 0f)
                        curveToRelative(-2.17f, 1.26f, -4.76f, 1.26f, -6.93f, 0f)
                        curveToRelative(-0.33f, -0.19f, -0.73f, -0.19f, -1.07f, 0f)
                        curveTo(6.38f, 20.65f, 5.19f, 21f, 4f, 21f)
                        horizontalLineTo(3f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(1.38f, 0f, 2.74f, -0.35f, 4f, -0.99f)
                        curveToRelative(2.52f, 1.29f, 5.48f, 1.29f, 8f, 0f)
                        curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4f, 0.99f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(20f)
                        close()
                        moveTo(3.95f, 19f)
                        horizontalLineTo(4f)
                        curveToRelative(1.27f, 0f, 2.42f, -0.55f, 3.33f, -1.33f)
                        curveToRelative(0.39f, -0.34f, 0.95f, -0.34f, 1.34f, 0f)
                        curveTo(9.58f, 18.45f, 10.73f, 19f, 12f, 19f)
                        reflectiveCurveToRelative(2.42f, -0.55f, 3.33f, -1.33f)
                        curveToRelative(0.39f, -0.34f, 0.95f, -0.34f, 1.34f, 0f)
                        curveTo(17.58f, 18.45f, 18.73f, 19f, 20f, 19f)
                        horizontalLineToRelative(0.05f)
                        lineToRelative(1.9f, -6.68f)
                        curveToRelative(0.11f, -0.37f, 0.04f, -1.06f, -0.66f, -1.28f)
                        lineTo(20f, 10.62f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(2f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-4f)
                        curveTo(9.45f, 1f, 9f, 1.45f, 9f, 2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 4f, 4f, 4.9f, 4f, 6f)
                        verticalLineToRelative(4.62f)
                        lineToRelative(-1.29f, 0.42f)
                        curveToRelative(-0.63f, 0.19f, -0.81f, 0.84f, -0.66f, 1.28f)
                        lineTo(3.95f, 19f)
                        close()
                        moveTo(6f, 6f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(3.97f)
                        lineTo(12.62f, 8.2f)
                        curveToRelative(-0.41f, -0.13f, -0.84f, -0.13f, -1.25f, 0f)
                        lineTo(6f, 9.97f)
                        verticalLineTo(6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Directions_boat!!
    }

private var _Directions_boat: ImageVector? = null

