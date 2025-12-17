package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Filter_alt_off: ImageVector
    get() {
        if (_Filter_alt_off != null) return _Filter_alt_off!!
        
        _Filter_alt_off = ImageVector.Builder(
            name = "filter_alt_off",
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
                        moveTo(21.05f, 4f)
                        lineTo(6.83f, 4f)
                        lineTo(14.8f, 11.97f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineTo(10f, 13f)
                        lineTo(10f, 20f)
                        lineTo(14f, 20f)
                        lineTo(14f, 16.83f)
                        lineTo(19.78f, 22.61f)
                        lineTo(21.19f, 21.19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Filter_alt_off!!
    }

private var _Filter_alt_off: ImageVector? = null

