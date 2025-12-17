package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Subtitles_off: ImageVector
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
                        lineToRelative(2f, 2f)
                        horizontalLineTo(20f)
                        verticalLineToRelative(11.17f)
                        lineToRelative(1.76f, 1.76f)
                        curveTo(21.91f, 18.65f, 22f, 18.34f, 22f, 18f)
                        verticalLineTo(6f)
                        curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 10f)
                        lineTo(12.83f, 10f)
                        lineTo(14.83f, 12f)
                        lineTo(18f, 12f)
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
                        moveTo(4f, 6.83f)
                        lineTo(7.17f, 10f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-1.17f)
                        lineTo(11.17f, 14f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(7.17f)
                        lineToRelative(2f, 2f)
                        horizontalLineTo(4f)
                        verticalLineTo(6.83f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Subtitles_off!!
    }

private var _Subtitles_off: ImageVector? = null

