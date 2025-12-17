package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Currency_franc: ImageVector
    get() {
        if (_Currency_franc != null) return _Currency_franc!!
        
        _Currency_franc = ImageVector.Builder(
            name = "currency_franc",
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
                    moveTo(18f, 5f)
                    lineTo(18f, 3f)
                    lineTo(7f, 3f)
                    lineTo(7f, 16f)
                    lineTo(5f, 16f)
                    lineTo(5f, 18f)
                    lineTo(7f, 18f)
                    lineTo(7f, 21f)
                    lineTo(9f, 21f)
                    lineTo(9f, 18f)
                    lineTo(13f, 18f)
                    lineTo(13f, 16f)
                    lineTo(9f, 16f)
                    lineTo(9f, 13f)
                    lineTo(17f, 13f)
                    lineTo(17f, 11f)
                    lineTo(9f, 11f)
                    lineTo(9f, 5f)
                    close()
                }
            }
        }.build()
        
        return _Currency_franc!!
    }

private var _Currency_franc: ImageVector? = null

