package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CurrencyBangladeshi: ImageVector
    get() {
        if (_CurrencyBangladeshi != null) return _CurrencyBangladeshi!!
        
        _CurrencyBangladeshi = ImageVector.Builder(
            name = "currency-bangladeshi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 21.75f)
                curveToRelative(5.385f, 0f, 9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                reflectiveCurveTo(2.25f, 6.615f, 2.25f, 12f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                close()
                moveTo(10.5f, 7.963f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.17f, -1.341f)
                lineToRelative(-0.415f, 0.207f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.67f, 1.342f)
                lineTo(9f, 7.963f)
                verticalLineTo(9.75f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                horizontalLineTo(9f)
                verticalLineToRelative(4.688f)
                curveToRelative(0f, 0.563f, 0.26f, 1.198f, 0.867f, 1.525f)
                arcTo(4.501f, 4.501f, 0f, false, false, 16.41f, 14.4f)
                curveToRelative(0.199f, -0.977f, -0.636f, -1.649f, -1.415f, -1.649f)
                horizontalLineToRelative(-0.745f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                horizontalLineToRelative(0.656f)
                arcToRelative(3.002f, 3.002f, 0f, false, true, -4.327f, 1.893f)
                arcToRelative(0.113f, 0.113f, 0f, false, true, -0.045f, -0.051f)
                arcToRelative(0.336f, 0.336f, 0f, false, true, -0.034f, -0.154f)
                verticalLineTo(11.25f)
                horizontalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(7.963f)
                close()
            }
        }.build()
        
        return _CurrencyBangladeshi!!
    }

private var _CurrencyBangladeshi: ImageVector? = null

