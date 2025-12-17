package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Cameraswitch: ImageVector
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
                        moveTo(8.57f, 0.51f)
                        lineToRelative(4.48f, 4.48f)
                        verticalLineTo(2.04f)
                        curveToRelative(4.72f, 0.47f, 8.48f, 4.23f, 8.95f, 8.95f)
                        curveToRelative(0f, 0f, 2f, 0f, 2f, 0f)
                        curveTo(23.34f, 3.02f, 15.49f, -1.59f, 8.57f, 0.51f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.95f, 21.96f)
                        curveTo(6.23f, 21.49f, 2.47f, 17.73f, 2f, 13.01f)
                        curveToRelative(0f, 0f, -2f, 0f, -2f, 0f)
                        curveToRelative(0.66f, 7.97f, 8.51f, 12.58f, 15.43f, 10.48f)
                        lineToRelative(-4.48f, -4.48f)
                        verticalLineTo(21.96f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cameraswitch!!
    }

private var _Cameraswitch: ImageVector? = null

