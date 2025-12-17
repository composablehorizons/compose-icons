package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CurrencyYen: ImageVector
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
                moveTo(8.75f, 14f)
                verticalLineToRelative(-2.629f)
                horizontalLineToRelative(2.446f)
                verticalLineToRelative(-0.967f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(-1.31f)
                horizontalLineToRelative(2.445f)
                verticalLineToRelative(-0.967f)
                horizontalLineTo(9.128f)
                lineTo(12.5f, 2f)
                horizontalLineToRelative(-1.699f)
                lineTo(8.047f, 7.327f)
                horizontalLineToRelative(-0.086f)
                lineTo(5.207f, 2f)
                horizontalLineTo(3.5f)
                lineToRelative(3.363f, 6.127f)
                horizontalLineTo(4.778f)
                verticalLineToRelative(0.968f)
                horizontalLineTo(7.25f)
                verticalLineToRelative(1.31f)
                horizontalLineTo(4.78f)
                verticalLineToRelative(0.966f)
                horizontalLineToRelative(2.47f)
                verticalLineTo(14f)
                horizontalLineToRelative(1.502f)
                close()
            }
        }.build()
        
        return _CurrencyYen!!
    }

private var _CurrencyYen: ImageVector? = null

