package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CurrencyYen: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                close()
                moveTo(9.624f, 7.084f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.248f, 0.832f)
                lineToRelative(2.223f, 3.334f)
                horizontalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.599f)
                lineToRelative(2.223f, -3.334f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.248f, -0.832f)
                lineTo(12f, 10.648f)
                lineTo(9.624f, 7.084f)
                close()
            }
        }.build()
        
        return _CurrencyYen!!
    }

private var _CurrencyYen: ImageVector? = null

