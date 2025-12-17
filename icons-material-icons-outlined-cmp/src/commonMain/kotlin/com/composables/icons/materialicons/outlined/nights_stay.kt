package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Nights_stay: ImageVector
    get() {
        if (_Nights_stay != null) return _Nights_stay!!
        
        _Nights_stay = ImageVector.Builder(
            name = "nights_stay",
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
                        moveTo(19.78f, 17.51f)
                        curveToRelative(-2.47f, 0f, -6.57f, -1.33f, -8.68f, -5.43f)
                        curveTo(8.77f, 7.57f, 10.6f, 3.6f, 11.63f, 2.01f)
                        curveTo(6.27f, 2.2f, 1.98f, 6.59f, 1.98f, 12f)
                        curveToRelative(0f, 0.14f, 0.02f, 0.28f, 0.02f, 0.42f)
                        curveTo(2.61f, 12.16f, 3.28f, 12f, 3.98f, 12f)
                        curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                        curveToRelative(0f, -3.09f, 1.73f, -5.77f, 4.3f, -7.1f)
                        curveTo(7.78f, 7.09f, 7.74f, 9.94f, 9.32f, 13f)
                        curveToRelative(1.57f, 3.04f, 4.18f, 4.95f, 6.8f, 5.86f)
                        curveToRelative(-1.23f, 0.74f, -2.65f, 1.15f, -4.13f, 1.15f)
                        curveToRelative(-0.5f, 0f, -1f, -0.05f, -1.48f, -0.14f)
                        curveToRelative(-0.37f, 0.7f, -0.94f, 1.27f, -1.64f, 1.64f)
                        curveToRelative(0.98f, 0.32f, 2.03f, 0.5f, 3.11f, 0.5f)
                        curveToRelative(3.5f, 0f, 6.58f, -1.8f, 8.37f, -4.52f)
                        curveTo(20.18f, 17.5f, 19.98f, 17.51f, 19.78f, 17.51f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 16f)
                        lineToRelative(-0.18f, 0f)
                        curveTo(6.4f, 14.84f, 5.3f, 14f, 4f, 14f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                        curveToRelative(0.62f, 0f, 2.49f, 0f, 3f, 0f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        curveTo(9f, 16.9f, 8.1f, 16f, 7f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Nights_stay!!
    }

private var _Nights_stay: ImageVector? = null

