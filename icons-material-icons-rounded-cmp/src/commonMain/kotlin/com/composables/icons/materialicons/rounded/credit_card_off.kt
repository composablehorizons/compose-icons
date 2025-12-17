package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Credit_card_off: ImageVector
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
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(0f, 0f)
                curveTo(1f, 3.2f, 1f, 3.83f, 1.39f, 4.22f)
                lineToRelative(0.84f, 0.84f)
                curveTo(2.09f, 5.34f, 2.01f, 5.66f, 2.01f, 6f)
                lineTo(2f, 18f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(13.17f)
                lineToRelative(2.61f, 2.61f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                verticalLineToRelative(0f)
                curveTo(21.58f, 22.22f, 21.58f, 21.58f, 21.19f, 21.19f)
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

