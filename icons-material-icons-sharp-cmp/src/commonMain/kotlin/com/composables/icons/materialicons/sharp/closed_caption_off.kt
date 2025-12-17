package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Closed_caption_off: ImageVector
    get() {
        if (_Closed_caption_off != null) return _Closed_caption_off!!
        
        _Closed_caption_off = ImageVector.Builder(
            name = "closed_caption_off",
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
                        moveTo(21f, 4f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(18f)
                        verticalLineTo(4f)
                        close()
                        moveTo(11f, 11f)
                        horizontalLineTo(9.5f)
                        verticalLineToRelative(-0.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(13f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(6f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(11f)
                        close()
                        moveTo(18f, 11f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(-0.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(13f)
                        horizontalLineTo(18f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Closed_caption_off!!
    }

private var _Closed_caption_off: ImageVector? = null

