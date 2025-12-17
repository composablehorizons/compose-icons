package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Credit_card_off: ImageVector
    get() {
        if (_Credit_card_off != null) return _Credit_card_off!!
        
        _Credit_card_off = ImageVector.Builder(
            name = "credit_card_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.83f, 4f)
                horizontalLineTo(22f)
                verticalLineToRelative(15.17f)
                lineTo(14.83f, 12f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineToRelative(-9.17f)
                lineTo(6.83f, 4f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(17.17f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(4.83f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(9.17f, 12f)
                lineToRelative(-4f, -4f)
                horizontalLineTo(4f)
                verticalLineToRelative(4f)
                horizontalLineTo(9.17f)
                close()
            }
        }.build()
        
        return _Credit_card_off!!
    }

private var _Credit_card_off: ImageVector? = null

