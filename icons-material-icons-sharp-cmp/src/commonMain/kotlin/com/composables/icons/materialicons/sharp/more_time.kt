package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.More_time: ImageVector
    get() {
        if (_More_time != null) return _More_time!!
        
        _More_time = ImageVector.Builder(
            name = "more_time",
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
                        moveTo(10f, 8f)
                        lineTo(10f, 14f)
                        lineTo(14.7f, 16.9f)
                        lineTo(15.5f, 15.7f)
                        lineTo(11.5f, 13.3f)
                        lineTo(11.5f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.92f, 12f)
                        curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1f)
                        curveToRelative(0f, 3.9f, -3.1f, 7f, -7f, 7f)
                        reflectiveCurveToRelative(-7f, -3.1f, -7f, -7f)
                        curveToRelative(0f, -3.9f, 3.1f, -7f, 7f, -7f)
                        curveToRelative(0.7f, 0f, 1.37f, 0.1f, 2f, 0.29f)
                        verticalLineTo(4.23f)
                        curveTo(12.36f, 4.08f, 11.69f, 4f, 11f, 4f)
                        curveToRelative(-5f, 0f, -9f, 4f, -9f, 9f)
                        reflectiveCurveToRelative(4f, 9f, 9f, 9f)
                        reflectiveCurveToRelative(9f, -4f, 9f, -9f)
                        curveToRelative(0f, -0.34f, -0.02f, -0.67f, -0.06f, -1f)
                        horizontalLineTo(17.92f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 5f)
                        lineTo(20f, 2f)
                        lineTo(18f, 2f)
                        lineTo(18f, 5f)
                        lineTo(15f, 5f)
                        lineTo(15f, 7f)
                        lineTo(18f, 7f)
                        lineTo(18f, 10f)
                        lineTo(20f, 10f)
                        lineTo(20f, 7f)
                        lineTo(23f, 7f)
                        lineTo(23f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _More_time!!
    }

private var _More_time: ImageVector? = null

