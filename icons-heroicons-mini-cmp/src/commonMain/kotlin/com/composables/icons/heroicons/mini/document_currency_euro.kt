package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.DocumentCurrencyEuro: ImageVector
    get() {
        if (_DocumentCurrencyEuro != null) return _DocumentCurrencyEuro!!
        
        _DocumentCurrencyEuro = ImageVector.Builder(
            name = "document-currency-euro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 3.5f)
                verticalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 18f)
                horizontalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(7.621f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineToRelative(-4.12f, -4.122f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.378f, 2f)
                horizontalLineTo(4.5f)
                close()
                moveToRelative(4.298f, 6.45f)
                curveToRelative(0.512f, -0.67f, 1.135f, -0.95f, 1.702f, -0.95f)
                reflectiveCurveToRelative(1.19f, 0.28f, 1.702f, 0.95f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.192f, -0.91f)
                curveTo(12.637f, 6.55f, 11.596f, 6f, 10.5f, 6f)
                reflectiveCurveToRelative(-2.137f, 0.55f, -2.894f, 1.54f)
                arcTo(5.205f, 5.205f, 0f, false, false, 6.83f, 9f)
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
        
        return _DocumentCurrencyEuro!!
    }

private var _DocumentCurrencyEuro: ImageVector? = null

