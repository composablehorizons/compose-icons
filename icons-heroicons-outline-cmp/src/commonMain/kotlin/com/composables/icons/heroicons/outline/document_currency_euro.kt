package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.DocumentCurrencyEuro: ImageVector
    get() {
        if (_DocumentCurrencyEuro != null) return _DocumentCurrencyEuro!!
        
        _DocumentCurrencyEuro = ImageVector.Builder(
            name = "document-currency-euro",
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
                moveTo(19.5f, 14.25f)
                verticalLineToRelative(-2.625f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -3.375f, -3.375f)
                horizontalLineToRelative(-1.5f)
                arcTo(1.125f, 1.125f, 0f, false, true, 13.5f, 7.125f)
                verticalLineToRelative(-1.5f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -3.375f, -3.375f)
                horizontalLineTo(8.25f)
                moveToRelative(0f, 11.625f)
                horizontalLineToRelative(4.5f)
                moveToRelative(-4.5f, 2.25f)
                horizontalLineToRelative(4.5f)
                moveToRelative(2.121f, 1.527f)
                curveToRelative(-1.171f, 1.464f, -3.07f, 1.464f, -4.242f, 0f)
                curveToRelative(-1.172f, -1.465f, -1.172f, -3.84f, 0f, -5.304f)
                curveToRelative(1.171f, -1.464f, 3.07f, -1.464f, 4.242f, 0f)
                moveTo(10.5f, 2.25f)
                horizontalLineTo(5.625f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(17.25f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(12.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineTo(11.25f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, -9f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyEuro!!
    }

private var _DocumentCurrencyEuro: ImageVector? = null

