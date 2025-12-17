package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Thumb_up_off_alt: ImageVector
    get() {
        if (_Thumb_up_off_alt != null) return _Thumb_up_off_alt!!
        
        _Thumb_up_off_alt = ImageVector.Builder(
            name = "thumb_up_off_alt",
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
                        moveTo(14.17f, 1f)
                        lineTo(7f, 8.18f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(12.31f)
                        lineTo(23f, 12.4f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(-8.31f)
                        lineToRelative(1.12f, -5.38f)
                        lineTo(14.17f, 1f)
                        close()
                        moveTo(1f, 9f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(12f)
                        horizontalLineTo(1f)
                        verticalLineTo(9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Thumb_up_off_alt!!
    }

private var _Thumb_up_off_alt: ImageVector? = null

