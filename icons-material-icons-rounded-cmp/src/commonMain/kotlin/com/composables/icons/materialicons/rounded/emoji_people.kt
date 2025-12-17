package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Emoji_people: ImageVector
    get() {
        if (_Emoji_people != null) return _Emoji_people!!
        
        _Emoji_people = ImageVector.Builder(
            name = "emoji_people",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 4f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 4f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.89f, 8.11f)
                        curveTo(15.5f, 7.72f, 14.83f, 7f, 13.53f, 7f)
                        curveToRelative(-0.21f, 0f, -1.42f, 0f, -2.54f, 0f)
                        curveTo(8.53f, 6.99f, 6.48f, 5.2f, 6.07f, 2.85f)
                        curveTo(5.99f, 2.36f, 5.58f, 2f, 5.09f, 2f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.61f, 0f, -1.09f, 0.54f, -1f, 1.14f)
                        curveTo(4.53f, 5.8f, 6.47f, 7.95f, 9f, 8.71f)
                        verticalLineTo(21f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(10.05f)
                        lineToRelative(3.24f, 3.24f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        verticalLineToRelative(0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(15.89f, 8.11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Emoji_people!!
    }

private var _Emoji_people: ImageVector? = null

