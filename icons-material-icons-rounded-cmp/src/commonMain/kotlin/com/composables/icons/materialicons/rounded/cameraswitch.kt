package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cameraswitch: ImageVector
    get() {
        if (_Cameraswitch != null) return _Cameraswitch!!
        
        _Cameraswitch = ImageVector.Builder(
            name = "cameraswitch",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(16f, 7f)
                        horizontalLineToRelative(-1f)
                        lineToRelative(-1f, -1f)
                        horizontalLineToRelative(-4f)
                        lineTo(9f, 7f)
                        horizontalLineTo(8f)
                        curveTo(6.9f, 7f, 6f, 7.9f, 6f, 9f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(8f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(9f)
                        curveTo(18f, 7.9f, 17.1f, 7f, 16f, 7f)
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
                        moveTo(9.45f, 0.28f)
                        curveTo(9.05f, 0.36f, 8.9f, 0.84f, 9.19f, 1.12f)
                        lineToRelative(3.01f, 3.01f)
                        curveToRelative(0.32f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f)
                        verticalLineTo(2.04f)
                        curveToRelative(4.45f, 0.44f, 8.06f, 3.82f, 8.84f, 8.17f)
                        curveToRelative(0.08f, 0.46f, 0.5f, 0.78f, 0.97f, 0.78f)
                        curveToRelative(0.62f, 0f, 1.09f, -0.57f, 0.98f, -1.18f)
                        curveTo(22.61f, 2.89f, 15.79f, -1.12f, 9.45f, 0.28f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.8f, 19.87f)
                        curveToRelative(-0.32f, -0.32f, -0.85f, -0.09f, -0.85f, 0.35f)
                        verticalLineToRelative(1.74f)
                        curveToRelative(-4.45f, -0.44f, -8.06f, -3.82f, -8.84f, -8.17f)
                        curveToRelative(-0.08f, -0.46f, -0.5f, -0.78f, -0.97f, -0.78f)
                        curveToRelative(-0.62f, 0f, -1.09f, 0.57f, -0.98f, 1.18f)
                        curveToRelative(1.24f, 6.92f, 8.06f, 10.93f, 14.4f, 9.53f)
                        curveToRelative(0.39f, -0.09f, 0.55f, -0.56f, 0.26f, -0.85f)
                        lineTo(11.8f, 19.87f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cameraswitch!!
    }

private var _Cameraswitch: ImageVector? = null

