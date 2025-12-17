package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Airplane_ticket: ImageVector
    get() {
        if (_Airplane_ticket != null) return _Airplane_ticket!!
        
        _Airplane_ticket = ImageVector.Builder(
            name = "airplane_ticket",
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
                        moveTo(20.19f, 4f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 4f, 2.01f, 4.9f, 2.01f, 6f)
                        verticalLineToRelative(4f)
                        curveTo(3.11f, 10f, 4f, 10.9f, 4f, 12f)
                        reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        curveTo(22f, 4.9f, 21.19f, 4f, 20.19f, 4f)
                        close()
                        moveTo(20f, 18f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-2.54f)
                        curveToRelative(1.19f, -0.69f, 2f, -1.99f, 2f, -3.46f)
                        curveToRelative(0f, -1.48f, -0.8f, -2.77f, -1.99f, -3.46f)
                        lineTo(4f, 6f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(18f)
                        close()
                        moveTo(8.87f, 15.66f)
                        lineToRelative(-1.66f, -2.88f)
                        lineToRelative(0.93f, -0.25f)
                        lineToRelative(1.26f, 0.99f)
                        lineToRelative(2.39f, -0.64f)
                        lineToRelative(-2.4f, -4.16f)
                        lineToRelative(1.4f, -0.38f)
                        lineToRelative(4.01f, 3.74f)
                        lineToRelative(2.44f, -0.65f)
                        curveToRelative(0.51f, -0.14f, 1.04f, 0.17f, 1.18f, 0.68f)
                        curveToRelative(0.13f, 0.51f, -0.17f, 1.04f, -0.69f, 1.19f)
                        lineTo(8.87f, 15.66f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Airplane_ticket!!
    }

private var _Airplane_ticket: ImageVector? = null

