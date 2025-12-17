package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Credit_card_off: ImageVector
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
                moveTo(21.9f, 21.9f)
                lineTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineToRelative(1.55f, 1.55f)
                curveTo(2.09f, 5.34f, 2.01f, 5.66f, 2.01f, 6f)
                lineTo(2f, 18f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(13.17f)
                lineToRelative(3.31f, 3.31f)
                lineTo(21.9f, 21.9f)
                close()
                moveTo(4f, 12f)
                verticalLineTo(8f)
                horizontalLineToRelative(1.17f)
                lineToRelative(4f, 4f)
                horizontalLineTo(4f)
                close()
                moveTo(6.83f, 4f)
                horizontalLineTo(20f)
                curveToRelative(1.11f, 0f, 2f, 0.89f, 2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.34f, -0.08f, 0.66f, -0.23f, 0.94f)
                lineTo(14.83f, 12f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineToRelative(-9.17f)
                lineTo(6.83f, 4f)
                close()
            }
        }.build()
        
        return _Credit_card_off!!
    }

private var _Credit_card_off: ImageVector? = null

