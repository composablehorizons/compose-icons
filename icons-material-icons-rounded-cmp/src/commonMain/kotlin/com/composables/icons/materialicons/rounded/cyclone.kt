package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cyclone: ImageVector
    get() {
        if (_Cyclone != null) return _Cyclone!!
        
        _Cyclone = ImageVector.Builder(
            name = "cyclone",
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
                        moveTo(12f, 8f)
                        curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        curveTo(16f, 9.79f, 14.21f, 8f, 12f, 8f)
                        close()
                        moveTo(12f, 14f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        curveTo(14f, 13.1f, 13.1f, 14f, 12f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 6.11f)
                        lineTo(22f, 6.11f)
                        curveToRelative(0f, -0.46f, -0.3f, -0.86f, -0.74f, -0.97f)
                        curveTo(19.23f, 4.6f, 16.03f, 4f, 12f, 4f)
                        curveTo(9.85f, 4f, 7.89f, 4.86f, 6.46f, 6.24f)
                        curveToRelative(0.1f, -0.65f, 0.28f, -1.69f, 0.62f, -2.96f)
                        curveTo(7.25f, 2.64f, 6.78f, 2f, 6.11f, 2f)
                        horizontalLineToRelative(0f)
                        curveTo(5.66f, 2f, 5.26f, 2.3f, 5.14f, 2.74f)
                        curveTo(4.6f, 4.77f, 4f, 7.97f, 4f, 12f)
                        curveToRelative(0f, 2.15f, 0.86f, 4.11f, 2.24f, 5.54f)
                        curveToRelative(-0.65f, -0.1f, -1.69f, -0.28f, -2.96f, -0.62f)
                        curveTo(2.64f, 16.75f, 2f, 17.22f, 2f, 17.89f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.46f, 0.3f, 0.86f, 0.74f, 0.97f)
                        curveTo(4.77f, 19.4f, 7.97f, 20f, 12f, 20f)
                        curveToRelative(2.15f, 0f, 4.11f, -0.86f, 5.54f, -2.24f)
                        curveToRelative(-0.1f, 0.65f, -0.28f, 1.69f, -0.62f, 2.96f)
                        curveToRelative(-0.17f, 0.64f, 0.3f, 1.28f, 0.97f, 1.28f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.46f, 0f, 0.86f, -0.3f, 0.97f, -0.74f)
                        curveTo(19.4f, 19.23f, 20f, 16.03f, 20f, 12f)
                        curveToRelative(0f, -2.15f, -0.86f, -4.11f, -2.24f, -5.54f)
                        curveToRelative(0.65f, 0.1f, 1.69f, 0.28f, 2.96f, 0.62f)
                        curveTo(21.36f, 7.25f, 22f, 6.78f, 22f, 6.11f)
                        close()
                        moveTo(12f, 18f)
                        curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                        reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                        reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                        reflectiveCurveTo(15.31f, 18f, 12f, 18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cyclone!!
    }

private var _Cyclone: ImageVector? = null

