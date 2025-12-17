package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Emoji_people: ImageVector
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
                        curveTo(8.24f, 6.99f, 6f, 4.75f, 6f, 2f)
                        horizontalLineTo(4f)
                        curveToRelative(0f, 3.16f, 2.11f, 5.84f, 5f, 6.71f)
                        verticalLineTo(22f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(10.05f)
                        lineTo(18.95f, 14f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(15.89f, 8.11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Emoji_people!!
    }

private var _Emoji_people: ImageVector? = null

