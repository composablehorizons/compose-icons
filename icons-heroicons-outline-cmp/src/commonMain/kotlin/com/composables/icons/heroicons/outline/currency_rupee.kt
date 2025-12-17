package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CurrencyRupee: ImageVector
    get() {
        if (_CurrencyRupee != null) return _CurrencyRupee!!
        
        _CurrencyRupee = ImageVector.Builder(
            name = "currency-rupee",
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
                moveTo(15f, 8.25f)
                horizontalLineTo(9f)
                moveToRelative(6f, 3f)
                horizontalLineTo(9f)
                moveToRelative(3f, 6f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(1.5f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, true, true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, false, true, 18f, 0f)
                close()
            }
        }.build()
        
        return _CurrencyRupee!!
    }

private var _CurrencyRupee: ImageVector? = null

