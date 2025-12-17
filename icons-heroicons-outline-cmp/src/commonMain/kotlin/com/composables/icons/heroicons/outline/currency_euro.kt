package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CurrencyEuro: ImageVector
    get() {
        if (_CurrencyEuro != null) return _CurrencyEuro!!
        
        _CurrencyEuro = ImageVector.Builder(
            name = "currency-euro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(14.25f, 7.756f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, 0f, 8.488f)
                moveTo(7.5f, 10.5f)
                horizontalLineToRelative(5.25f)
                moveToRelative(-5.25f, 3f)
                horizontalLineToRelative(5.25f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, true, true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, false, true, 18f, 0f)
                close()
            }
        }.build()
        
        return _CurrencyEuro!!
    }

private var _CurrencyEuro: ImageVector? = null

