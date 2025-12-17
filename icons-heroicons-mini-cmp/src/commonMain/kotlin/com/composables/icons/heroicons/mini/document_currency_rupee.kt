package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.DocumentCurrencyRupee: ImageVector
    get() {
        if (_DocumentCurrencyRupee != null) return _DocumentCurrencyRupee!!
        
        _DocumentCurrencyRupee = ImageVector.Builder(
            name = "document-currency-rupee",
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
                moveTo(6f, 5.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6.75f, 5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-2.127f)
                curveToRelative(0.4f, 0.5f, 0.683f, 1.096f, 0.807f, 1.75f)
                horizontalLineToRelative(1.32f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1.32f)
                arcToRelative(4.003f, 4.003f, 0f, false, true, -3.404f, 3.216f)
                lineToRelative(1.754f, 1.754f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineToRelative(-3f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.53f, -1.28f)
                horizontalLineTo(8f)
                curveToRelative(1.12f, 0f, 2.067f, -0.736f, 2.386f, -1.75f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(3.636f)
                arcTo(2.501f, 2.501f, 0f, false, false, 8f, 6.5f)
                horizontalLineTo(6.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 5.75f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyRupee!!
    }

private var _DocumentCurrencyRupee: ImageVector? = null

