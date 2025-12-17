package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CurrencyPound: ImageVector
    get() {
        if (_CurrencyPound != null) return _CurrencyPound!!
        
        _CurrencyPound = ImageVector.Builder(
            name = "currency-pound",
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
                moveTo(8.732f, 6.232f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 3.536f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                arcTo(4f, 4f, 0f, false, false, 6.5f, 8f)
                verticalLineToRelative(0.165f)
                curveToRelative(0f, 0.364f, 0.034f, 0.728f, 0.1f, 1.085f)
                horizontalLineToRelative(-0.35f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.737f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, -0.367f, 3.072f)
                lineToRelative(-0.055f, 0.123f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.848f, 1.037f)
                lineToRelative(1.272f, -0.283f)
                arcToRelative(3.493f, 3.493f, 0f, false, true, 1.604f, 0.021f)
                arcToRelative(4.992f, 4.992f, 0f, false, false, 2.422f, 0f)
                lineToRelative(0.97f, -0.242f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.363f, -1.456f)
                lineToRelative(-0.971f, 0.243f)
                arcToRelative(3.491f, 3.491f, 0f, false, true, -1.694f, 0f)
                arcToRelative(4.992f, 4.992f, 0f, false, false, -2.258f, -0.038f)
                curveToRelative(0.19f, -0.811f, 0.227f, -1.651f, 0.111f, -2.477f)
                horizontalLineTo(9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(8.136f)
                arcTo(4.397f, 4.397f, 0f, false, true, 8f, 8.165f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.641f, 0.244f, -1.28f, 0.732f, -1.768f)
                close()
            }
        }.build()
        
        return _CurrencyPound!!
    }

private var _CurrencyPound: ImageVector? = null

