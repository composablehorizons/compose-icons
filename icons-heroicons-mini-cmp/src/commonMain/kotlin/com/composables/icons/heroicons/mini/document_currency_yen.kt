package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.DocumentCurrencyYen: ImageVector
    get() {
        if (_DocumentCurrencyYen != null) return _DocumentCurrencyYen!!
        
        _DocumentCurrencyYen = ImageVector.Builder(
            name = "document-currency-yen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 3.5f)
                verticalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 18f)
                horizontalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(7.621f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineToRelative(-4.12f, -4.122f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.378f, 2f)
                horizontalLineTo(4.5f)
                close()
                moveToRelative(3.846f, 4.294f)
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
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.5f, 0f)
                verticalLineTo(14f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineToRelative(-2.306f)
                lineToRelative(1.902f, -2.794f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.192f, -0.912f)
                lineTo(10f, 8.765f)
                lineToRelative(-1.654f, -2.47f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyYen!!
    }

private var _DocumentCurrencyYen: ImageVector? = null

