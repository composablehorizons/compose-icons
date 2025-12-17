package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mic_external_on: ImageVector
    get() {
        if (_Mic_external_on != null) return _Mic_external_on!!
        
        _Mic_external_on = ImageVector.Builder(
            name = "mic_external_on",
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
                        moveTo(6.81f, 16f)
                        lineTo(7.19f, 16f)
                        lineTo(7.79f, 10f)
                        lineTo(6.21f, 10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.22f, 7f)
                        curveTo(9.7f, 6.47f, 10f, 5.77f, 10f, 5f)
                        curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                        reflectiveCurveTo(4f, 3.34f, 4f, 5f)
                        curveToRelative(0f, 0.77f, 0.3f, 1.47f, 0.78f, 2f)
                        horizontalLineTo(9.22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 2f)
                        curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                        horizontalLineToRelative(1f)
                        lineToRelative(1f, -10f)
                        horizontalLineTo(4f)
                        lineToRelative(1f, 10f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(6f)
                        curveTo(20f, 3.79f, 18.21f, 2f, 16f, 2f)
                        close()
                        moveTo(7.19f, 16f)
                        horizontalLineTo(6.81f)
                        lineToRelative(-0.6f, -6f)
                        horizontalLineToRelative(1.58f)
                        lineTo(7.19f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mic_external_on!!
    }

private var _Mic_external_on: ImageVector? = null

