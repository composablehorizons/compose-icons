package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Noise_aware: ImageVector
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
                        moveTo(3.23f, 13f)
                        lineTo(3.23f, 13f)
                        curveToRelative(-0.64f, 0f, -1.13f, 0.59f, -0.98f, 1.21f)
                        curveToRelative(0.25f, 1.12f, 0.7f, 2.18f, 1.3f, 3.12f)
                        curveToRelative(0.34f, 0.54f, 1.1f, 0.61f, 1.55f, 0.16f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.32f, -0.32f, 0.4f, -0.83f, 0.15f, -1.21f)
                        curveToRelative(-0.49f, -0.77f, -0.85f, -1.62f, -1.05f, -2.54f)
                        curveTo(4.1f, 13.3f, 3.68f, 13f, 3.23f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5.09f, 6.51f)
                        lineTo(5.09f, 6.51f)
                        curveTo(4.64f, 6.06f, 3.88f, 6.13f, 3.54f, 6.67f)
                        curveToRelative(-0.6f, 0.95f, -1.04f, 2f, -1.3f, 3.12f)
                        curveTo(2.11f, 10.41f, 2.59f, 11f, 3.23f, 11f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.45f, 0f, 0.87f, -0.3f, 0.97f, -0.74f)
                        curveToRelative(0.2f, -0.92f, 0.56f, -1.77f, 1.05f, -2.54f)
                        curveTo(5.49f, 7.34f, 5.42f, 6.83f, 5.09f, 6.51f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 3.23f)
                        lineTo(11f, 3.23f)
                        curveToRelative(0f, -0.64f, -0.59f, -1.13f, -1.21f, -0.98f)
                        curveToRelative(-1.12f, 0.25f, -2.18f, 0.7f, -3.12f, 1.3f)
                        curveToRelative(-0.54f, 0.34f, -0.61f, 1.1f, -0.16f, 1.55f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.32f, 0.32f, 0.83f, 0.4f, 1.21f, 0.15f)
                        curveTo(8.49f, 4.76f, 9.34f, 4.4f, 10.26f, 4.2f)
                        curveTo(10.7f, 4.1f, 11f, 3.68f, 11f, 3.23f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.33f, 3.54f)
                        curveToRelative(-0.95f, -0.6f, -2f, -1.04f, -3.12f, -1.3f)
                        curveTo(13.59f, 2.11f, 13f, 2.59f, 13f, 3.23f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.45f, 0.3f, 0.87f, 0.74f, 0.97f)
                        curveToRelative(0.92f, 0.2f, 1.77f, 0.56f, 2.54f, 1.05f)
                        curveToRelative(0.38f, 0.24f, 0.89f, 0.17f, 1.21f, -0.15f)
                        lineToRelative(0f, 0f)
                        curveTo(17.94f, 4.64f, 17.87f, 3.88f, 17.33f, 3.54f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.91f, 17.49f)
                        lineTo(18.91f, 17.49f)
                        curveToRelative(0.45f, 0.45f, 1.21f, 0.38f, 1.55f, -0.16f)
                        curveToRelative(0.6f, -0.95f, 1.04f, -2f, 1.3f, -3.12f)
                        curveToRelative(0.14f, -0.62f, -0.35f, -1.21f, -0.98f, -1.21f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.45f, 0f, -0.87f, 0.3f, -0.97f, 0.74f)
                        curveToRelative(-0.2f, 0.92f, -0.56f, 1.77f, -1.05f, 2.54f)
                        curveTo(18.51f, 16.66f, 18.58f, 17.17f, 18.91f, 17.49f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.77f, 11f)
                        lineTo(20.77f, 11f)
                        curveToRelative(0.64f, 0f, 1.13f, -0.59f, 0.98f, -1.21f)
                        curveToRelative(-0.25f, -1.12f, -0.7f, -2.18f, -1.3f, -3.12f)
                        curveToRelative(-0.34f, -0.54f, -1.1f, -0.61f, -1.55f, -0.16f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.32f, 0.32f, -0.4f, 0.83f, -0.15f, 1.21f)
                        curveToRelative(0.49f, 0.77f, 0.85f, 1.62f, 1.05f, 2.54f)
                        curveTo(19.9f, 10.7f, 20.32f, 11f, 20.77f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 20.77f)
                        lineTo(13f, 20.77f)
                        curveToRelative(0f, 0.64f, 0.59f, 1.13f, 1.21f, 0.98f)
                        curveToRelative(1.12f, -0.25f, 2.18f, -0.7f, 3.12f, -1.3f)
                        curveToRelative(0.54f, -0.34f, 0.61f, -1.1f, 0.16f, -1.55f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.32f, -0.32f, -0.83f, -0.4f, -1.21f, -0.15f)
                        curveToRelative(-0.77f, 0.49f, -1.62f, 0.85f, -2.54f, 1.05f)
                        curveTo(13.3f, 19.9f, 13f, 20.32f, 13f, 20.77f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6.67f, 20.46f)
                        curveToRelative(0.95f, 0.6f, 2f, 1.04f, 3.12f, 1.3f)
                        curveToRelative(0.62f, 0.14f, 1.21f, -0.35f, 1.21f, -0.98f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.45f, -0.3f, -0.87f, -0.74f, -0.97f)
                        curveToRelative(-0.92f, -0.2f, -1.77f, -0.56f, -2.54f, -1.05f)
                        curveToRelative(-0.38f, -0.24f, -0.89f, -0.17f, -1.21f, 0.15f)
                        lineToRelative(0f, 0f)
                        curveTo(6.06f, 19.36f, 6.13f, 20.12f, 6.67f, 20.46f)
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

