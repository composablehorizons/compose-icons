package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Auto_fix_off: ImageVector
    get() {
        if (_Auto_fix_off != null) return _Auto_fix_off!!
        
        _Auto_fix_off = ImageVector.Builder(
            name = "auto_fix_off",
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
                        moveTo(14.17f, 8.42f)
                        lineTo(15.58f, 9.83f)
                        lineTo(14.12f, 11.29f)
                        lineTo(15.54f, 12.71f)
                        lineTo(18.41f, 9.83f)
                        lineTo(14.17f, 5.59f)
                        lineTo(11.29f, 8.46f)
                        lineTo(12.71f, 9.88f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1.39f, 4.22f)
                        lineTo(8.46f, 11.29f)
                        lineTo(1.59f, 18.17f)
                        lineTo(5.83f, 22.41f)
                        lineTo(12.71f, 15.54f)
                        lineTo(19.78f, 22.61f)
                        lineTo(21.19f, 21.19f)
                        lineTo(2.81f, 2.81f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_fix_off!!
    }

private var _Auto_fix_off: ImageVector? = null

