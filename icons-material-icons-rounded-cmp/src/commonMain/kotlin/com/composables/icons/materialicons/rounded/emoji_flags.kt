package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Emoji_flags: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 9f)
                    horizontalLineToRelative(-5f)
                    lineToRelative(-0.72f, -1.45f)
                    curveTo(13.11f, 7.21f, 12.76f, 7f, 12.38f, 7f)
                    horizontalLineTo(7f)
                    verticalLineTo(5.72f)
                    curveTo(7.6f, 5.38f, 8f, 4.74f, 8f, 4f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    reflectiveCurveTo(4f, 2.9f, 4f, 4f)
                    curveToRelative(0f, 0.74f, 0.4f, 1.38f, 1f, 1.72f)
                    verticalLineTo(20f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(5f)
                    lineToRelative(0.72f, 1.45f)
                    curveToRelative(0.17f, 0.34f, 0.52f, 0.55f, 0.89f, 0.55f)
                    horizontalLineTo(19f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-8f)
                    curveTo(20f, 9.45f, 19.55f, 9f, 19f, 9f)
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
        }.build()
        
        return _Emoji_flags!!
    }

private var _Emoji_flags: ImageVector? = null

