package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.DocumentCurrencyYen: ImageVector
    get() {
        if (_DocumentCurrencyYen != null) return _DocumentCurrencyYen!!
        
        _DocumentCurrencyYen = ImageVector.Builder(
            name = "document-currency-yen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.75f, 3.375f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineTo(9f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 3.75f, 3.75f)
                verticalLineToRelative(1.875f)
                curveToRelative(0f, 1.036f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineTo(16.5f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 3.75f, 3.75f)
                verticalLineToRelative(7.875f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineTo(5.625f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, -1.875f, -1.875f)
                verticalLineTo(3.375f)
                close()
                moveToRelative(10.5f, 1.875f)
                arcToRelative(5.23f, 5.23f, 0f, false, false, -1.279f, -3.434f)
                arcToRelative(9.768f, 9.768f, 0f, false, true, 6.963f, 6.963f)
                arcTo(5.23f, 5.23f, 0f, false, false, 16.5f, 7.5f)
                horizontalLineToRelative(-1.875f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, -0.375f, -0.375f)
                verticalLineTo(5.25f)
                close()
                moveToRelative(-3.9f, 5.55f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.2f, 0.9f)
                lineToRelative(1.912f, 2.55f)
                horizontalLineTo(9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.5f, 0f)
                verticalLineTo(18f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineToRelative(-1.313f)
                lineToRelative(1.913f, -2.55f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.2f, -0.9f)
                lineTo(12f, 13f)
                lineToRelative(-1.65f, -2.2f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyYen!!
    }

private var _DocumentCurrencyYen: ImageVector? = null

