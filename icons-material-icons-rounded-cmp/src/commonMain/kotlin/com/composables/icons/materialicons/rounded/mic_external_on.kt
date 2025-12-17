package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mic_external_on: ImageVector
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
                        moveTo(16.24f, 2.01f)
                        curveTo(18.32f, 2.13f, 20f, 4.08f, 20f, 6.16f)
                        lineTo(20f, 21f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        lineToRelative(0f, -14.91f)
                        curveToRelative(0f, -0.96f, -0.64f, -1.86f, -1.58f, -2.05f)
                        curveTo(15.14f, 3.78f, 14f, 4.76f, 14f, 6f)
                        lineToRelative(0f, 11.84f)
                        curveToRelative(0f, 2.08f, -1.68f, 4.03f, -3.76f, 4.15f)
                        curveTo(7.92f, 22.13f, 6f, 20.29f, 6f, 18f)
                        horizontalLineTo(5.45f)
                        curveToRelative(-0.26f, 0f, -0.47f, -0.19f, -0.5f, -0.45f)
                        lineTo(4.11f, 9.1f)
                        curveTo(4.05f, 8.51f, 4.51f, 8f, 5.1f, 8f)
                        horizontalLineTo(8.9f)
                        curveToRelative(0.59f, 0f, 1.05f, 0.51f, 1f, 1.1f)
                        lineToRelative(-0.85f, 8.45f)
                        curveTo(9.02f, 17.81f, 8.8f, 18f, 8.55f, 18f)
                        horizontalLineTo(8f)
                        curveToRelative(0f, 1.24f, 1.14f, 2.22f, 2.42f, 1.96f)
                        curveToRelative(0.94f, -0.19f, 1.58f, -1.09f, 1.58f, -2.05f)
                        lineTo(12f, 6f)
                        curveTo(12f, 3.71f, 13.92f, 1.87f, 16.24f, 2.01f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mic_external_on!!
    }

private var _Mic_external_on: ImageVector? = null

