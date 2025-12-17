package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Subtitles_off: ImageVector
    get() {
        if (_Subtitles_off != null) return _Subtitles_off!!
        
        _Subtitles_off = ImageVector.Builder(
            name = "subtitles_off",
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
                        moveTo(6.83f, 4f)
                        lineTo(14.83f, 12f)
                        lineTo(20f, 12f)
                        lineTo(20f, 14f)
                        lineTo(16.83f, 14f)
                        lineTo(22f, 19.17f)
                        lineTo(22f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1.04f, 3.87f)
                        lineTo(2f, 4.83f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(15.17f)
                        lineToRelative(2.96f, 2.96f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.45f, 2.45f)
                        lineTo(1.04f, 3.87f)
                        close()
                        moveTo(4f, 12f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(4f)
                        verticalLineTo(12f)
                        close()
                        moveTo(4f, 16f)
                        horizontalLineToRelative(9.17f)
                        lineTo(14f, 16.83f)
                        verticalLineTo(18f)
                        horizontalLineTo(4f)
                        verticalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Subtitles_off!!
    }

private var _Subtitles_off: ImageVector? = null

