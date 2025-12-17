package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CurrencyRupee: ImageVector
    get() {
        if (_CurrencyRupee != null) return _CurrencyRupee!!
        
        _CurrencyRupee = ImageVector.Builder(
            name = "currency-rupee",
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
                moveTo(4.75f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(6.5f)
                curveToRelative(0.698f, 0f, 1.3f, 0.409f, 1.582f, 1f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3.332f)
                curveTo(7.8f, 8.591f, 7.198f, 9f, 6.5f, 9f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.53f, 1.28f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineTo(6.56f, 10.5f)
                arcTo(3.251f, 3.251f, 0f, false, false, 9.663f, 8f)
                horizontalLineToRelative(1.587f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(9.663f)
                arcToRelative(3.232f, 3.232f, 0f, false, false, -0.424f, -1f)
                horizontalLineToRelative(2.011f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }.build()
        
        return _CurrencyRupee!!
    }

private var _CurrencyRupee: ImageVector? = null

