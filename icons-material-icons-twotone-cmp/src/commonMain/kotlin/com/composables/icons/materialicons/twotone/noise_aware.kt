package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Noise_aware: ImageVector
    get() {
        if (_Noise_aware != null) return _Noise_aware!!
        
        _Noise_aware = ImageVector.Builder(
            name = "noise_aware",
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
                        moveTo(4.07f, 13f)
                        horizontalLineTo(2.05f)
                        curveToRelative(0.2f, 2.01f, 1f, 3.84f, 2.21f, 5.33f)
                        lineToRelative(1.43f, -1.43f)
                        curveTo(4.83f, 15.79f, 4.25f, 14.46f, 4.07f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5.69f, 7.1f)
                        lineTo(4.26f, 5.67f)
                        curveTo(3.05f, 7.16f, 2.25f, 8.99f, 2.05f, 11f)
                        horizontalLineToRelative(2.02f)
                        curveTo(4.25f, 9.54f, 4.83f, 8.21f, 5.69f, 7.1f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 4.07f)
                        verticalLineTo(2.05f)
                        curveToRelative(-2.01f, 0.2f, -3.84f, 1f, -5.33f, 2.21f)
                        lineTo(7.1f, 5.69f)
                        curveTo(8.21f, 4.83f, 9.54f, 4.25f, 11f, 4.07f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.33f, 4.26f)
                        curveTo(16.84f, 3.05f, 15.01f, 2.25f, 13f, 2.05f)
                        verticalLineToRelative(2.02f)
                        curveToRelative(1.46f, 0.18f, 2.79f, 0.76f, 3.9f, 1.62f)
                        lineTo(18.33f, 4.26f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.31f, 16.9f)
                        lineToRelative(1.43f, 1.43f)
                        curveToRelative(1.21f, -1.48f, 2.01f, -3.32f, 2.21f, -5.33f)
                        horizontalLineToRelative(-2.02f)
                        curveTo(19.75f, 14.46f, 19.17f, 15.79f, 18.31f, 16.9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.93f, 11f)
                        horizontalLineToRelative(2.02f)
                        curveToRelative(-0.2f, -2.01f, -1f, -3.84f, -2.21f, -5.33f)
                        lineTo(18.31f, 7.1f)
                        curveTo(19.17f, 8.21f, 19.75f, 9.54f, 19.93f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 19.93f)
                        verticalLineToRelative(2.02f)
                        curveToRelative(2.01f, -0.2f, 3.84f, -1f, 5.33f, -2.21f)
                        lineToRelative(-1.43f, -1.43f)
                        curveTo(15.79f, 19.17f, 14.46f, 19.75f, 13f, 19.93f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5.67f, 19.74f)
                        curveToRelative(1.48f, 1.21f, 3.32f, 2.01f, 5.33f, 2.21f)
                        verticalLineToRelative(-2.02f)
                        curveToRelative(-1.46f, -0.18f, -2.79f, -0.76f, -3.9f, -1.62f)
                        lineTo(5.67f, 19.74f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 12f)
                        arcTo(5f, 5f, 0f, false, true, 12f, 17f)
                        arcTo(5f, 5f, 0f, false, true, 7f, 12f)
                        arcTo(5f, 5f, 0f, false, true, 17f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Noise_aware!!
    }

private var _Noise_aware: ImageVector? = null

