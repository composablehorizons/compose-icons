package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Compress: ImageVector
    get() {
        if (_Compress != null) return _Compress!!
        
        _Compress = ImageVector.Builder(
            name = "compress",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(4f, 9f)
                        horizontalLineTo(20f)
                        verticalLineTo(11f)
                        horizontalLineTo(4f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 4f)
                        lineTo(13f, 4f)
                        lineTo(13f, 1f)
                        lineTo(11f, 1f)
                        lineTo(11f, 4f)
                        lineTo(8f, 4f)
                        lineTo(12f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 19f)
                        lineTo(11f, 19f)
                        lineTo(11f, 22f)
                        lineTo(13f, 22f)
                        lineTo(13f, 19f)
                        lineTo(16f, 19f)
                        lineTo(12f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 12f)
                        horizontalLineTo(20f)
                        verticalLineTo(14f)
                        horizontalLineTo(4f)
                        verticalLineTo(12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Compress!!
    }

private var _Compress: ImageVector? = null

