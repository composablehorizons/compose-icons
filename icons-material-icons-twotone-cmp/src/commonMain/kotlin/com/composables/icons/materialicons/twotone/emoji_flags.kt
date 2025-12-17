package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Emoji_flags: ImageVector
    get() {
        if (_Emoji_flags != null) return _Emoji_flags!!
        
        _Emoji_flags = ImageVector.Builder(
            name = "emoji_flags",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 9f)
                        lineTo(7f, 9f)
                        lineTo(7f, 15f)
                        lineTo(13f, 15f)
                        lineTo(14f, 17f)
                        lineTo(18f, 17f)
                        lineTo(18f, 11f)
                        lineTo(13f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 9f)
                        lineToRelative(-1f, -2f)
                        horizontalLineTo(7f)
                        verticalLineTo(5.72f)
                        curveTo(7.6f, 5.38f, 8f, 4.74f, 8f, 4f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        reflectiveCurveTo(4f, 2.9f, 4f, 4f)
                        curveToRelative(0f, 0.74f, 0.4f, 1.38f, 1f, 1.72f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(5f)
                        lineToRelative(1f, 2f)
                        horizontalLineToRelative(7f)
                        verticalLineTo(9f)
                        horizontalLineTo(14f)
                        close()
                        moveTo(18f, 17f)
                        horizontalLineToRelative(-4f)
                        lineToRelative(-1f, -2f)
                        horizontalLineTo(7f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(5f)
                        lineToRelative(1f, 2f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Emoji_flags!!
    }

private var _Emoji_flags: ImageVector? = null

