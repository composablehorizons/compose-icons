package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CurrencyEuro: ImageVector
    get() {
        if (_CurrencyEuro != null) return _CurrencyEuro!!
        
        _CurrencyEuro = ImageVector.Builder(
            name = "currency-euro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 18f)
                arcToRelative(8f, 8f, 0f, true, false, 0f, -16f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                close()
                moveTo(8.798f, 7.45f)
                curveToRelative(0.512f, -0.67f, 1.135f, -0.95f, 1.702f, -0.95f)
                reflectiveCurveToRelative(1.19f, 0.28f, 1.702f, 0.95f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.192f, -0.91f)
                curveTo(12.637f, 5.55f, 11.596f, 5f, 10.5f, 5f)
                reflectiveCurveToRelative(-2.137f, 0.55f, -2.894f, 1.54f)
                arcTo(5.205f, 5.205f, 0f, false, false, 6.83f, 8f)
                horizontalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.77f)
                arcToRelative(6.333f, 6.333f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(-0.77f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.08f)
                curveToRelative(0.183f, 0.528f, 0.442f, 1.023f, 0.776f, 1.46f)
                curveToRelative(0.757f, 0.99f, 1.798f, 1.54f, 2.894f, 1.54f)
                reflectiveCurveToRelative(2.137f, -0.55f, 2.894f, -1.54f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.192f, -0.91f)
                curveToRelative(-0.512f, 0.67f, -1.135f, 0.95f, -1.702f, 0.95f)
                reflectiveCurveToRelative(-1.19f, -0.28f, -1.702f, -0.95f)
                arcToRelative(3.505f, 3.505f, 0f, false, true, -0.343f, -0.55f)
                horizontalLineToRelative(1.795f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(8.026f)
                arcToRelative(4.835f, 4.835f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2.224f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(8.455f)
                curveToRelative(0.098f, -0.195f, 0.212f, -0.38f, 0.343f, -0.55f)
                close()
            }
        }.build()
        
        return _CurrencyEuro!!
    }

private var _CurrencyEuro: ImageVector? = null

