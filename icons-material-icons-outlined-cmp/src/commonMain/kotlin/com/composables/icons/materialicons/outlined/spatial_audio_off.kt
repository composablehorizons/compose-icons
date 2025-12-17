package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Spatial_audio_off: ImageVector
    get() {
        if (_Spatial_audio_off != null) return _Spatial_audio_off!!
        
        _Spatial_audio_off = ImageVector.Builder(
            name = "spatial_audio_off",
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
                        moveTo(10f, 13f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                        reflectiveCurveTo(6f, 6.79f, 6f, 9f)
                        curveTo(6f, 11.21f, 7.79f, 13f, 10f, 13f)
                        close()
                        moveTo(10f, 7f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                        curveTo(8f, 7.9f, 8.9f, 7f, 10f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.39f, 15.56f)
                        curveTo(14.71f, 14.7f, 12.53f, 14f, 10f, 14f)
                        curveToRelative(-2.53f, 0f, -4.71f, 0.7f, -6.39f, 1.56f)
                        curveTo(2.61f, 16.07f, 2f, 17.1f, 2f, 18.22f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-2.78f)
                        curveTo(18f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f)
                        close()
                        moveTo(16f, 19f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-0.78f)
                        curveToRelative(0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f)
                        curveTo(5.71f, 16.73f, 7.63f, 16f, 10f, 16f)
                        curveToRelative(2.37f, 0f, 4.29f, 0.73f, 5.48f, 1.34f)
                        curveTo(15.8f, 17.5f, 16f, 17.84f, 16f, 18.22f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.36f, 1f)
                        lineToRelative(-1.41f, 1.41f)
                        curveToRelative(2.73f, 2.73f, 2.73f, 7.17f, 0f, 9.9f)
                        lineToRelative(1.41f, 1.41f)
                        curveTo(23.88f, 10.21f, 23.88f, 4.51f, 20.36f, 1f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.54f, 10.9f)
                        curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, 0f, -7.07f)
                        lineToRelative(-1.41f, 1.41f)
                        curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                        lineTo(17.54f, 10.9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Spatial_audio_off!!
    }

private var _Spatial_audio_off: ImageVector? = null

