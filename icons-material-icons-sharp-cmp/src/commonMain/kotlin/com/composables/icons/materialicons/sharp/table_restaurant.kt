package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Table_restaurant: ImageVector
    get() {
        if (_Table_restaurant != null) return _Table_restaurant!!
        
        _Table_restaurant = ImageVector.Builder(
            name = "table_restaurant",
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
                        moveTo(22.33f, 11f)
                        lineToRelative(-2f, -7f)
                        horizontalLineTo(3.67f)
                        lineToRelative(-2f, 7f)
                        horizontalLineTo(5.2f)
                        lineTo(4f, 20f)
                        horizontalLineToRelative(2f)
                        lineToRelative(0.67f, -5f)
                        horizontalLineToRelative(10.67f)
                        lineTo(18f, 20f)
                        horizontalLineToRelative(2f)
                        lineToRelative(-1.2f, -9f)
                        horizontalLineTo(22.33f)
                        close()
                        moveTo(6.93f, 13f)
                        lineToRelative(0.27f, -2f)
                        horizontalLineToRelative(9.6f)
                        lineToRelative(0.27f, 2f)
                        horizontalLineTo(6.93f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Table_restaurant!!
    }

private var _Table_restaurant: ImageVector? = null

