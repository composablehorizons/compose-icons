package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.DocumentCurrencyDollar: ImageVector
    get() {
        if (_DocumentCurrencyDollar != null) return _DocumentCurrencyDollar!!
        
        _DocumentCurrencyDollar = ImageVector.Builder(
            name = "document-currency-dollar",
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
                moveToRelative(3.75f, 9f)
                verticalLineToRelative(7.5f)
                moveToRelative(2.25f, -6.466f)
                arcToRelative(9.016f, 9.016f, 0f, false, false, -3.461f, -0.203f)
                curveToRelative(-0.536f, 0.072f, -0.974f, 0.478f, -1.021f, 1.017f)
                arcToRelative(4.559f, 4.559f, 0f, false, false, -0.018f, 0.402f)
                curveToRelative(0f, 0.464f, 0.336f, 0.844f, 0.775f, 0.994f)
                lineToRelative(2.95f, 1.012f)
                curveToRelative(0.44f, 0.15f, 0.775f, 0.53f, 0.775f, 0.994f)
                curveToRelative(0f, 0.136f, -0.006f, 0.27f, -0.018f, 0.402f)
                curveToRelative(-0.047f, 0.539f, -0.485f, 0.945f, -1.021f, 1.017f)
                arcToRelative(9.077f, 9.077f, 0f, false, true, -3.461f, -0.203f)
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
        
        return _DocumentCurrencyDollar!!
    }

private var _DocumentCurrencyDollar: ImageVector? = null

