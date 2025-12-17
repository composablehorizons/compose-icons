package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Spatial_audio: ImageVector
    get() {
        if (_Spatial_audio != null) return _Spatial_audio!!
        
        _Spatial_audio = ImageVector.Builder(
            name = "spatial_audio",
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
                        moveTo(22.11f, 7.95f)
                        curveToRelative(-1.89f, -0.23f, -5.57f, -1.83f, -6.09f, -6.09f)
                        curveTo(15.96f, 1.36f, 15.54f, 1f, 15.04f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.6f, 0f, -1.07f, 0.53f, -1f, 1.13f)
                        curveToRelative(0.31f, 2.43f, 2.38f, 7.12f, 7.8f, 7.8f)
                        curveToRelative(0.6f, 0.08f, 1.13f, -0.4f, 1.13f, -1f)
                        verticalLineToRelative(0f)
                        curveTo(22.97f, 8.43f, 22.6f, 8.01f, 22.11f, 7.95f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.71f, 5.83f)
                        curveToRelative(0.64f, 0.17f, 1.26f, -0.31f, 1.26f, -0.97f)
                        curveToRelative(0f, -0.47f, -0.34f, -0.85f, -0.79f, -0.97f)
                        curveToRelative(-0.49f, -0.14f, -1.72f, -0.68f, -2.11f, -2.13f)
                        curveTo(19.95f, 1.32f, 19.57f, 1f, 19.11f, 1f)
                        horizontalLineTo(19.1f)
                        curveToRelative(-0.66f, 0f, -1.14f, 0.64f, -0.96f, 1.28f)
                        curveTo(18.74f, 4.5f, 20.58f, 5.53f, 21.71f, 5.83f)
                        close()
                    }
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
                        verticalLineTo(21f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-2.78f)
                        curveTo(18f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Spatial_audio!!
    }

private var _Spatial_audio: ImageVector? = null

