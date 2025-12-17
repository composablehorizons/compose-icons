package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sell: ImageVector
    get() {
        if (_Sell != null) return _Sell!!
        
        _Sell = ImageVector.Builder(
            name = "sell",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22.83f, 12.83f)
                    lineTo(12f, 2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(10f)
                    lineToRelative(10.83f, 10.83f)
                    lineTo(22.83f, 12.83f)
                    close()
                    moveTo(6.5f, 8f)
                    curveTo(5.67f, 8f, 5f, 7.33f, 5f, 6.5f)
                    reflectiveCurveTo(5.67f, 5f, 6.5f, 5f)
                    reflectiveCurveTo(8f, 5.67f, 8f, 6.5f)
                    reflectiveCurveTo(7.33f, 8f, 6.5f, 8f)
                    close()
                }
            }
        }.build()
        
        return _Sell!!
    }

private var _Sell: ImageVector? = null

