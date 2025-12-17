package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Spatial_audio_off: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 9f)
                    arcTo(4f, 4f, 0f, false, true, 10f, 13f)
                    arcTo(4f, 4f, 0f, false, true, 6f, 9f)
                    arcTo(4f, 4f, 0f, false, true, 14f, 9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16.39f, 15.56f)
                    curveTo(14.71f, 14.7f, 12.53f, 14f, 10f, 14f)
                    curveToRelative(-2.53f, 0f, -4.71f, 0.7f, -6.39f, 1.56f)
                    curveTo(2.61f, 16.07f, 2f, 17.1f, 2f, 18.22f)
                    lineTo(2f, 19f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    lineToRelative(0f, -0.78f)
                    curveTo(18f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f)
                    close()
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.11f, 1.85f)
                        curveToRelative(-0.37f, -0.48f, -1.08f, -0.52f, -1.5f, -0.09f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.35f, 0.35f, -0.39f, 0.91f, -0.09f, 1.3f)
                        curveToRelative(1.17f, 1.5f, 2.64f, 5.23f, 0f, 8.61f)
                        curveToRelative(-0.3f, 0.39f, -0.26f, 0.95f, 0.09f, 1.3f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.43f, 0.43f, 1.13f, 0.38f, 1.5f, -0.09f)
                        curveTo(22.61f, 10.95f, 24.46f, 6.16f, 21.11f, 1.85f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.31f, 4.84f)
                        curveToRelative(-0.33f, -0.57f, -1.11f, -0.67f, -1.58f, -0.21f)
                        curveToRelative(-0.33f, 0.33f, -0.36f, 0.84f, -0.13f, 1.25f)
                        curveToRelative(0.25f, 0.44f, 0.74f, 1.69f, -0.01f, 2.99f)
                        curveToRelative(-0.23f, 0.4f, -0.19f, 0.9f, 0.14f, 1.22f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.47f, 0.47f, 1.25f, 0.35f, 1.58f, -0.22f)
                        curveTo(19.47f, 7.88f, 18.89f, 5.85f, 18.31f, 4.84f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Spatial_audio_off!!
    }

private var _Spatial_audio_off: ImageVector? = null

