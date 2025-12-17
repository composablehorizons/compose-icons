package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Subtitles_off: ImageVector
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
                        moveTo(20f, 4f)
                        horizontalLineTo(6.83f)
                        lineToRelative(8f, 8f)
                        horizontalLineTo(20f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-3.17f)
                        lineToRelative(4.93f, 4.93f)
                        curveTo(21.91f, 18.65f, 22f, 18.34f, 22f, 18f)
                        verticalLineTo(6f)
                        curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1.04f, 3.87f)
                        lineToRelative(1.2f, 1.2f)
                        curveTo(2.09f, 5.35f, 2f, 5.66f, 2f, 6f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(13.17f)
                        lineToRelative(2.96f, 2.96f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.45f, 2.45f)
                        lineTo(1.04f, 3.87f)
                        close()
                        moveTo(8f, 12f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(8f)
                        close()
                        moveTo(14f, 16.83f)
                        verticalLineTo(18f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(9.17f)
                        lineTo(14f, 16.83f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Subtitles_off!!
    }

private var _Subtitles_off: ImageVector? = null

