package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CurrencyYen: ImageVector
    get() {
        if (_CurrencyYen != null) return _CurrencyYen!!
        
        _CurrencyYen = ImageVector.Builder(
            name = "currency-yen",
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
                moveTo(5.6f, 3.55f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.2f, 0.9f)
                lineTo(7.063f, 8f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(12f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(8.938f)
                lineTo(11.6f, 4.45f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.2f, -0.9f)
                lineTo(8f, 6.75f)
                lineToRelative(-2.4f, -3.2f)
                close()
            }
        }.build()
        
        return _CurrencyYen!!
    }

private var _CurrencyYen: ImageVector? = null

