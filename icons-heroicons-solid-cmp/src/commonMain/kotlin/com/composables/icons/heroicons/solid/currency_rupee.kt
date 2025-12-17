package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CurrencyRupee: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                close()
                moveTo(9f, 7.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 9f, 9f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.98f, 0f, 1.813f, 0.626f, 2.122f, 1.5f)
                horizontalLineTo(9f)
                arcTo(0.75f, 0.75f, 0f, false, false, 9f, 12f)
                horizontalLineToRelative(3.622f)
                arcToRelative(2.251f, 2.251f, 0f, false, true, -2.122f, 1.5f)
                horizontalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.53f, 1.28f)
                lineToRelative(3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(10.8f, 14.988f)
                arcTo(3.752f, 3.752f, 0f, false, false, 14.175f, 12f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-0.825f)
                arcTo(3.733f, 3.733f, 0f, false, false, 13.5f, 9f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(9f)
                close()
            }
        }.build()
        
        return _CurrencyRupee!!
    }

private var _CurrencyRupee: ImageVector? = null

