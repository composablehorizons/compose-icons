package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Subtitles_off: ImageVector
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
                        horizontalLineTo(19f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(-2.17f)
                        lineToRelative(4.93f, 4.93f)
                        curveTo(21.91f, 18.65f, 22f, 18.34f, 22f, 18f)
                        verticalLineTo(6f)
                        curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 20f)
                        lineToRelative(-6f, -6f)
                        lineToRelative(-1.71f, -1.71f)
                        lineTo(12f, 12f)
                        lineTo(3.16f, 3.16f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(0.49f, 0.49f)
                        curveTo(2.09f, 5.35f, 2f, 5.66f, 2f, 6f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(13.17f)
                        lineToRelative(2.25f, 2.25f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(20f, 20f)
                        close()
                        moveTo(8f, 13f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(5f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(2f)
                        curveTo(7.55f, 12f, 8f, 12.45f, 8f, 13f)
                        close()
                        moveTo(14f, 17f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(5f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(8f)
                        curveToRelative(0.08f, 0f, 0.14f, 0.03f, 0.21f, 0.04f)
                        lineToRelative(0.74f, 0.74f)
                        curveTo(13.97f, 16.86f, 14f, 16.92f, 14f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Subtitles_off!!
    }

private var _Subtitles_off: ImageVector? = null

