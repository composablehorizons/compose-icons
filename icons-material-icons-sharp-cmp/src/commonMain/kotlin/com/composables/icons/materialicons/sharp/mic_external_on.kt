package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mic_external_on: ImageVector
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
                        moveTo(9.22f, 7f)
                        horizontalLineTo(4.78f)
                        curveTo(4.3f, 6.47f, 4f, 5.77f, 4f, 5f)
                        curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                        reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                        curveTo(10f, 5.77f, 9.7f, 6.47f, 9.22f, 7f)
                        close()
                        moveTo(20f, 2f)
                        verticalLineToRelative(20f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(18f)
                        horizontalLineTo(6f)
                        curveToRelative(0f, 0f, 0f, -1.79f, 0f, -4f)
                        horizontalLineTo(5f)
                        lineTo(4f, 8f)
                        horizontalLineToRelative(6f)
                        lineTo(9f, 18f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(2f)
                        horizontalLineTo(20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mic_external_on!!
    }

private var _Mic_external_on: ImageVector? = null

