package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Currency_yuan: ImageVector
    get() {
        if (_Currency_yuan != null) return _Currency_yuan!!
        
        _Currency_yuan = ImageVector.Builder(
            name = "currency_yuan",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13.28f, 12f)
                    lineTo(18f, 12f)
                    lineTo(18f, 14f)
                    lineTo(13f, 14f)
                    lineTo(13f, 21f)
                    lineTo(11f, 21f)
                    lineTo(11f, 14f)
                    lineTo(6f, 14f)
                    lineTo(6f, 12f)
                    lineTo(10.72f, 12f)
                    lineTo(5f, 3f)
                    lineTo(7.37f, 3f)
                    lineTo(12f, 10.29f)
                    lineTo(16.63f, 3f)
                    lineTo(19f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Currency_yuan!!
    }

private var _Currency_yuan: ImageVector? = null

