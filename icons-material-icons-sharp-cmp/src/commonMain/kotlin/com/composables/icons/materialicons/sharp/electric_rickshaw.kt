package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Electric_rickshaw: ImageVector
    get() {
        if (_Electric_rickshaw != null) return _Electric_rickshaw!!
        
        _Electric_rickshaw = ImageVector.Builder(
            name = "electric_rickshaw",
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
                        moveTo(21f, 11.18f)
                        verticalLineTo(9f)
                        lineToRelative(-5f, -6f)
                        horizontalLineTo(1f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(2.18f)
                        curveTo(3.6f, 16.16f, 4.7f, 17f, 6f, 17f)
                        reflectiveCurveToRelative(2.4f, -0.84f, 2.82f, -2f)
                        horizontalLineToRelative(8.37f)
                        curveToRelative(0.48f, 1.34f, 1.86f, 2.25f, 3.42f, 1.94f)
                        curveToRelative(1.16f, -0.23f, 2.11f, -1.17f, 2.33f, -2.33f)
                        curveTo(23.25f, 13.05f, 22.34f, 11.66f, 21f, 11.18f)
                        close()
                        moveTo(18.4f, 9f)
                        horizontalLineTo(16f)
                        verticalLineTo(6.12f)
                        lineTo(18.4f, 9f)
                        close()
                        moveTo(3f, 5f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(3f)
                        verticalLineTo(5f)
                        close()
                        moveTo(6f, 15f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(6.55f, 15f, 6f, 15f)
                        close()
                        moveTo(9f, 13f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(9f)
                        horizontalLineTo(9f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(8f)
                        horizontalLineTo(9f)
                        close()
                        moveTo(20f, 15f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(20.55f, 15f, 20f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 20f)
                        lineTo(11f, 20f)
                        lineTo(11f, 18f)
                        lineTo(17f, 21f)
                        lineTo(13f, 21f)
                        lineTo(13f, 23f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Electric_rickshaw!!
    }

private var _Electric_rickshaw: ImageVector? = null

