package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CurrencyYen: ImageVector
    get() {
        if (_CurrencyYen != null) return _CurrencyYen!!
        
        _CurrencyYen = ImageVector.Builder(
            name = "currency-yen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(9f, 7.5f)
                lineToRelative(3f, 4.5f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, -4.5f)
                moveTo(12f, 12f)
                verticalLineToRelative(5.25f)
                moveTo(15f, 12f)
                horizontalLineTo(9f)
                moveToRelative(6f, 3f)
                horizontalLineTo(9f)
                moveToRelative(12f, -3f)
                arcToRelative(9f, 9f, 0f, true, true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, false, true, 18f, 0f)
                close()
            }
        }.build()
        
        return _CurrencyYen!!
    }

private var _CurrencyYen: ImageVector? = null

