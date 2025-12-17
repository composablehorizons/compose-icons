package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Emoji_emotions: ImageVector
    get() {
        if (_Emoji_emotions != null) return _Emoji_emotions!!
        
        _Emoji_emotions = ImageVector.Builder(
            name = "emoji_emotions",
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
                        moveTo(17f, 9.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 11f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 14f, 9.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 17f, 9.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 9.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 11f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 7f, 9.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10f, 9.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 18f)
                        curveToRelative(2.28f, 0f, 4.22f, -1.66f, 5f, -4f)
                        horizontalLineTo(7f)
                        curveTo(7.78f, 16.34f, 9.72f, 18f, 12f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.99f, 2f)
                        curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.47f, 10f, 9.99f, 10f)
                        curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                        curveTo(22f, 6.48f, 17.52f, 2f, 11.99f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                        curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                        curveTo(20f, 16.42f, 16.42f, 20f, 12f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Emoji_emotions!!
    }

private var _Emoji_emotions: ImageVector? = null

