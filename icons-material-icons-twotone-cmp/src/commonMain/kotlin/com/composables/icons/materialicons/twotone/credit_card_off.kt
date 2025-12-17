package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Credit_card_off: ImageVector
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
                moveTo(20f, 17.17f)
                verticalLineTo(12f)
                horizontalLineToRelative(-5.17f)
                lineTo(20f, 17.17f)
                close()
                moveTo(10.83f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(8.83f)
                lineTo(10.83f, 8f)
                close()
                moveTo(4f, 6.83f)
                verticalLineTo(8f)
                horizontalLineToRelative(1.17f)
                lineTo(4f, 6.83f)
                close()
                moveTo(15.17f, 18f)
                lineToRelative(-6f, -6f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineTo(15.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.83f, 4f)
                horizontalLineTo(20f)
                curveToRelative(1.11f, 0f, 2f, 0.89f, 2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.34f, -0.08f, 0.66f, -0.23f, 0.94f)
                lineTo(20f, 17.17f)
                verticalLineTo(12f)
                horizontalLineToRelative(-5.17f)
                lineToRelative(-4f, -4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(8.83f)
                lineTo(6.83f, 4f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(17.17f, 20f)
                horizontalLineTo(4f)
                curveToRelative(-1.11f, 0f, -2f, -0.89f, -2f, -2f)
                lineTo(2.01f, 6f)
                curveToRelative(0f, -0.34f, 0.08f, -0.66f, 0.23f, -0.93f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(4f, 6.83f)
                verticalLineTo(8f)
                horizontalLineToRelative(1.17f)
                lineTo(4f, 6.83f)
                close()
                moveTo(15.17f, 18f)
                lineToRelative(-6f, -6f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineTo(15.17f)
                close()
            }
        }.build()
        
        return _Credit_card_off!!
    }

private var _Credit_card_off: ImageVector? = null

