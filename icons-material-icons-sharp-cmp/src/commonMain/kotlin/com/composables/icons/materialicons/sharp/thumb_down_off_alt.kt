package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Thumb_down_off_alt: ImageVector
    get() {
        if (_Thumb_down_off_alt != null) return _Thumb_down_off_alt!!
        
        _Thumb_down_off_alt = ImageVector.Builder(
            name = "thumb_down_off_alt",
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
                        moveTo(19f, 3f)
                        horizontalLineTo(23f)
                        verticalLineTo(15f)
                        horizontalLineTo(19f)
                        verticalLineTo(3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1f, 11.6f)
                        verticalLineTo(16f)
                        horizontalLineToRelative(8.31f)
                        lineToRelative(-1.12f, 5.38f)
                        lineTo(9.83f, 23f)
                        lineTo(17f, 15.82f)
                        verticalLineTo(3f)
                        horizontalLineTo(4.69f)
                        lineTo(1f, 11.6f)
                        close()
                        moveTo(15f, 5f)
                        verticalLineToRelative(9.99f)
                        lineToRelative(-4.34f, 4.35f)
                        lineToRelative(0.61f, -2.93f)
                        lineToRelative(0.5f, -2.41f)
                        horizontalLineTo(9.31f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(-1.99f)
                        lineTo(6.01f, 5f)
                        horizontalLineTo(15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Thumb_down_off_alt!!
    }

private var _Thumb_down_off_alt: ImageVector? = null

