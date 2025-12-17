package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mic_external_off: ImageVector
    get() {
        if (_Mic_external_off != null) return _Mic_external_off!!
        
        _Mic_external_off = ImageVector.Builder(
            name = "mic_external_off",
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
                        moveTo(6.21f, 10f)
                        lineTo(6.81f, 16f)
                        lineTo(7.19f, 16f)
                        lineTo(7.73f, 10.56f)
                        lineTo(7.17f, 10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 5f)
                        curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                        curveTo(6.38f, 2f, 5.81f, 2.19f, 5.33f, 2.5f)
                        lineToRelative(4.15f, 4.15f)
                        curveTo(9.8f, 6.18f, 10f, 5.61f, 10f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 6f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(9.17f)
                        lineToRelative(2f, 2f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                        reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                        verticalLineToRelative(3.17f)
                        lineToRelative(2f, 2f)
                        verticalLineTo(6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.1f, 2.1f)
                        lineTo(0.69f, 3.51f)
                        lineTo(5.17f, 8f)
                        horizontalLineTo(4f)
                        lineToRelative(1f, 10f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                        verticalLineToRelative(-1.17f)
                        lineToRelative(6.49f, 6.49f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.1f, 2.1f)
                        close()
                        moveTo(7.19f, 16f)
                        horizontalLineTo(6.81f)
                        lineToRelative(-0.6f, -6f)
                        horizontalLineToRelative(0.96f)
                        lineToRelative(0.56f, 0.56f)
                        lineTo(7.19f, 16f)
                        close()
                        moveTo(12f, 18f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                        horizontalLineToRelative(1f)
                        lineToRelative(0.56f, -5.61f)
                        lineTo(12f, 14.83f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mic_external_off!!
    }

private var _Mic_external_off: ImageVector? = null

