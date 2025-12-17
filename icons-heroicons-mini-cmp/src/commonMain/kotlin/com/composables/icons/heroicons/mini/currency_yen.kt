package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CurrencyYen: ImageVector
    get() {
        if (_CurrencyYen != null) return _CurrencyYen!!
        
        _CurrencyYen = ImageVector.Builder(
            name = "currency-yen",
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
                moveTo(7.346f, 5.294f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.192f, 0.912f)
                lineTo(9.056f, 10f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(14f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineToRelative(-2.306f)
                lineToRelative(2.902f, -3.794f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.192f, -0.912f)
                lineTo(10f, 8.765f)
                lineToRelative(-2.654f, -3.47f)
                close()
            }
        }.build()
        
        return _CurrencyYen!!
    }

private var _CurrencyYen: ImageVector? = null

