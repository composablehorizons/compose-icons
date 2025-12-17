package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Price_check: ImageVector
    get() {
        if (_Price_check != null) return _Price_check!!
        
        _Price_check = ImageVector.Builder(
            name = "price_check",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(11f, 8f)
                        lineTo(6f, 8f)
                        lineTo(6f, 6f)
                        lineTo(11f, 6f)
                        lineTo(11f, 4f)
                        lineTo(8.5f, 4f)
                        lineTo(8.5f, 3f)
                        lineTo(6.5f, 3f)
                        lineTo(6.5f, 4f)
                        lineTo(4f, 4f)
                        lineTo(4f, 10f)
                        lineTo(9f, 10f)
                        lineTo(9f, 12f)
                        lineTo(4f, 12f)
                        lineTo(4f, 14f)
                        lineTo(6.5f, 14f)
                        lineTo(6.5f, 15f)
                        lineTo(8.5f, 15f)
                        lineTo(8.5f, 14f)
                        lineTo(11f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.59f, 12.52f)
                        lineTo(13.93f, 18.17f)
                        lineTo(11.1f, 15.34f)
                        lineTo(9.69f, 16.76f)
                        lineTo(13.93f, 21f)
                        lineTo(21f, 13.93f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Price_check!!
    }

private var _Price_check: ImageVector? = null

