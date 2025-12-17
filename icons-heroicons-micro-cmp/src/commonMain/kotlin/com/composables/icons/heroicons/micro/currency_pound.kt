package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CurrencyPound: ImageVector
    get() {
        if (_CurrencyPound != null) return _CurrencyPound!!
        
        _CurrencyPound = ImageVector.Builder(
            name = "currency-pound",
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
                moveTo(7.94f, 4.94f)
                curveToRelative(-0.294f, 0.293f, -0.44f, 0.675f, -0.44f, 1.06f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, 1.5f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.263f, -0.045f, 0.516f, -0.128f, 0.75f)
                horizontalLineToRelative(3.878f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(0.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 6f, 9.75f)
                verticalLineToRelative(-1f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, true, 5.121f, -2.121f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.121f, 0f)
                close()
            }
        }.build()
        
        return _CurrencyPound!!
    }

private var _CurrencyPound: ImageVector? = null

