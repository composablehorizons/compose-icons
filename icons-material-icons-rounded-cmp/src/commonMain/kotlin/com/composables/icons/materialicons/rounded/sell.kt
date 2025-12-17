package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sell: ImageVector
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
                    moveTo(21.41f, 11.41f)
                    lineToRelative(-8.83f, -8.83f)
                    curveTo(12.21f, 2.21f, 11.7f, 2f, 11.17f, 2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                    verticalLineToRelative(7.17f)
                    curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                    lineToRelative(8.83f, 8.83f)
                    curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                    lineToRelative(7.17f, -7.17f)
                    curveTo(22.2f, 13.46f, 22.2f, 12.2f, 21.41f, 11.41f)
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

