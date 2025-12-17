package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Volunteer_activism: ImageVector
    get() {
        if (_Volunteer_activism != null) return _Volunteer_activism!!
        
        _Volunteer_activism = ImageVector.Builder(
            name = "volunteer_activism",
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
                        moveTo(3f, 11f)
                        lineTo(3f, 11f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(7f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(0f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-7f)
                        curveTo(5f, 11.9f, 4.1f, 11f, 3f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 5.3f)
                        curveTo(10f, 3.45f, 11.45f, 2f, 13.3f, 2f)
                        curveToRelative(1.04f, 0f, 2.05f, 0.49f, 2.7f, 1.25f)
                        curveTo(16.65f, 2.49f, 17.66f, 2f, 18.7f, 2f)
                        curveTo(20.55f, 2f, 22f, 3.45f, 22f, 5.3f)
                        curveToRelative(0f, 2.1f, -2.5f, 4.51f, -5.33f, 7.09f)
                        curveToRelative(-0.38f, 0.35f, -0.97f, 0.35f, -1.35f, 0f)
                        curveTo(12.5f, 9.81f, 10f, 7.4f, 10f, 5.3f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.99f, 17f)
                        horizontalLineToRelative(-6.83f)
                        curveToRelative(-0.11f, 0f, -0.22f, -0.02f, -0.33f, -0.06f)
                        lineToRelative(-1.47f, -0.51f)
                        curveToRelative(-0.26f, -0.09f, -0.39f, -0.37f, -0.3f, -0.63f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.09f, -0.26f, 0.38f, -0.4f, 0.64f, -0.3f)
                        lineToRelative(1.12f, 0.43f)
                        curveToRelative(0.11f, 0.04f, 0.24f, 0.07f, 0.36f, 0.07f)
                        horizontalLineToRelative(2.63f)
                        curveToRelative(0.65f, 0f, 1.18f, -0.53f, 1.18f, -1.18f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f)
                        lineTo(9.3f, 11.13f)
                        curveTo(9.08f, 11.04f, 8.84f, 11f, 8.6f, 11f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(9.02f)
                        lineToRelative(6.37f, 1.81f)
                        curveToRelative(0.41f, 0.12f, 0.85f, 0.1f, 1.25f, -0.05f)
                        lineTo(22f, 19f)
                        lineToRelative(0f, 0f)
                        curveTo(22f, 17.89f, 21.1f, 17f, 19.99f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Volunteer_activism!!
    }

private var _Volunteer_activism: ImageVector? = null

