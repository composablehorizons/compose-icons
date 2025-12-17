package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Auto_fix_high: ImageVector
    get() {
        if (_Auto_fix_high != null) return _Auto_fix_high!!
        
        _Auto_fix_high = ImageVector.Builder(
            name = "auto_fix_high",
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
                        moveTo(20f, 7f)
                        lineTo(20.94f, 4.94f)
                        lineTo(23f, 4f)
                        lineTo(20.94f, 3.06f)
                        lineTo(20f, 1f)
                        lineTo(19.06f, 3.06f)
                        lineTo(17f, 4f)
                        lineTo(19.06f, 4.94f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.5f, 7f)
                        lineTo(9.44f, 4.94f)
                        lineTo(11.5f, 4f)
                        lineTo(9.44f, 3.06f)
                        lineTo(8.5f, 1f)
                        lineTo(7.56f, 3.06f)
                        lineTo(5.5f, 4f)
                        lineTo(7.56f, 4.94f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 12.5f)
                        lineTo(19.06f, 14.56f)
                        lineTo(17f, 15.5f)
                        lineTo(19.06f, 16.44f)
                        lineTo(20f, 18.5f)
                        lineTo(20.94f, 16.44f)
                        lineTo(23f, 15.5f)
                        lineTo(20.94f, 14.56f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.41f, 9.83f)
                        lineToRelative(-4.24f, -4.24f)
                        lineTo(1.59f, 18.17f)
                        lineToRelative(4.24f, 4.24f)
                        lineTo(18.41f, 9.83f)
                        close()
                        moveTo(14.21f, 11.21f)
                        lineToRelative(-1.41f, -1.41f)
                        lineToRelative(1.38f, -1.38f)
                        lineToRelative(1.41f, 1.41f)
                        lineTo(14.21f, 11.21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_fix_high!!
    }

private var _Auto_fix_high: ImageVector? = null

