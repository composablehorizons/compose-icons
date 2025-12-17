package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mic_external_off: ImageVector
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
                        moveTo(14f, 6f)
                        curveToRelative(0f, -1.24f, 1.14f, -2.22f, 2.42f, -1.96f)
                        curveTo(17.36f, 4.24f, 18f, 5.13f, 18f, 6.09f)
                        verticalLineToRelative(9.08f)
                        lineToRelative(2f, 2f)
                        verticalLineTo(6.16f)
                        curveToRelative(0f, -2.08f, -1.68f, -4.03f, -3.76f, -4.15f)
                        curveTo(13.92f, 1.87f, 12f, 3.71f, 12f, 6f)
                        verticalLineToRelative(3.17f)
                        lineToRelative(2f, 2f)
                        verticalLineTo(6f)
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
                        moveTo(1.39f, 2.81f)
                        lineTo(1.39f, 2.81f)
                        curveTo(1f, 3.2f, 1f, 3.83f, 1.39f, 4.22f)
                        lineTo(5.17f, 8f)
                        horizontalLineTo(5.1f)
                        curveToRelative(-0.59f, 0f, -1.05f, 0.51f, -1f, 1.1f)
                        lineToRelative(0.85f, 8.45f)
                        curveTo(4.98f, 17.81f, 5.2f, 18f, 5.45f, 18f)
                        horizontalLineTo(6f)
                        curveToRelative(0f, 2.34f, 2.01f, 4.21f, 4.39f, 3.98f)
                        curveToRelative(2.08f, -0.2f, 3.61f, -2.06f, 3.61f, -4.15f)
                        lineToRelative(0f, -1f)
                        lineToRelative(5.78f, 5.78f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        curveTo(2.42f, 2.42f, 1.78f, 2.42f, 1.39f, 2.81f)
                        close()
                        moveTo(12f, 17.91f)
                        curveToRelative(0f, 0.96f, -0.64f, 1.86f, -1.58f, 2.05f)
                        curveTo(9.14f, 20.22f, 8f, 19.24f, 8f, 18f)
                        horizontalLineToRelative(0.55f)
                        curveToRelative(0.26f, 0f, 0.47f, -0.19f, 0.5f, -0.45f)
                        lineToRelative(0.52f, -5.16f)
                        lineTo(12f, 14.83f)
                        verticalLineTo(17.91f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mic_external_off!!
    }

private var _Mic_external_off: ImageVector? = null

