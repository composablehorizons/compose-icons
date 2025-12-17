package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CurrencyEuro: ImageVector
    get() {
        if (_CurrencyEuro != null) return _CurrencyEuro!!
        
        _CurrencyEuro = ImageVector.Builder(
            name = "currency-euro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                arcTo(7f, 7f, 0f, true, true, 1f, 8f)
                arcToRelative(7f, 7f, 0f, false, true, 14f, 0f)
                close()
                moveTo(6.875f, 6f)
                curveToRelative(0.09f, -0.22f, 0.195f, -0.42f, 0.31f, -0.598f)
                curveToRelative(0.413f, -0.638f, 0.895f, -0.902f, 1.315f, -0.902f)
                curveToRelative(0.264f, 0f, 0.54f, 0.1f, 0.814f, 0.325f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0.953f, -1.158f)
                curveTo(9.772f, 3.259f, 9.169f, 3f, 8.5f, 3f)
                curveToRelative(-1.099f, 0f, -1.992f, 0.687f, -2.574f, 1.587f)
                arcTo(5.518f, 5.518f, 0f, false, false, 5.285f, 6f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.267f)
                arcToRelative(7.372f, 7.372f, 0f, false, false, 0f, 1f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.535f)
                curveToRelative(0.156f, 0.52f, 0.372f, 0.998f, 0.64f, 1.413f)
                curveTo(6.509f, 12.313f, 7.402f, 13f, 8.5f, 13f)
                curveToRelative(0.669f, 0f, 1.272f, -0.26f, 1.767f, -0.667f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.953f, -1.158f)
                curveToRelative(-0.275f, 0.226f, -0.55f, 0.325f, -0.814f, 0.325f)
                curveToRelative(-0.42f, 0f, -0.902f, -0.264f, -1.315f, -0.902f)
                arcToRelative(3.722f, 3.722f, 0f, false, true, -0.31f, -0.598f)
                horizontalLineTo(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(6.521f)
                arcToRelative(5.854f, 5.854f, 0f, false, true, 0f, -1f)
                horizontalLineTo(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(6.875f)
                close()
            }
        }.build()
        
        return _CurrencyEuro!!
    }

private var _CurrencyEuro: ImageVector? = null

