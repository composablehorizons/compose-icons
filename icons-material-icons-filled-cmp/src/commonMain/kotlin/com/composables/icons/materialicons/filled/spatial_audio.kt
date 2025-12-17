package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Spatial_audio: ImageVector
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
            }
            group {
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
                        verticalLineTo(21f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-2.78f)
                        curveTo(18f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 1f)
                        horizontalLineToRelative(-2f)
                        curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
                        verticalLineTo(8f)
                        curveTo(19.14f, 8f, 16f, 4.86f, 16f, 1f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 1f)
                        horizontalLineToRelative(-2f)
                        curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                        verticalLineTo(4f)
                        curveTo(21.35f, 4f, 20f, 2.65f, 20f, 1f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Spatial_audio!!
    }

private var _Spatial_audio: ImageVector? = null

