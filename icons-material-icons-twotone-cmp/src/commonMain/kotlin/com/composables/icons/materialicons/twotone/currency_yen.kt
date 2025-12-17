package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Currency_yen: ImageVector
    get() {
        if (_Currency_yen != null) return _Currency_yen!!
        
        _Currency_yen = ImageVector.Builder(
            name = "currency_yen",
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
                    moveTo(13.92f, 11f)
                    lineTo(18f, 11f)
                    lineTo(18f, 13f)
                    lineTo(13f, 13f)
                    lineTo(13f, 15f)
                    lineTo(18f, 15f)
                    lineTo(18f, 17f)
                    lineTo(13f, 17f)
                    lineTo(13f, 21f)
                    lineTo(11f, 21f)
                    lineTo(11f, 17f)
                    lineTo(6f, 17f)
                    lineTo(6f, 15f)
                    lineTo(11f, 15f)
                    lineTo(11f, 13f)
                    lineTo(6f, 13f)
                    lineTo(6f, 11f)
                    lineTo(10.08f, 11f)
                    lineTo(5f, 3f)
                    lineTo(7.37f, 3f)
                    lineTo(12f, 10.29f)
                    lineTo(16.63f, 3f)
                    lineTo(19f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Currency_yen!!
    }

private var _Currency_yen: ImageVector? = null

