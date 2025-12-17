package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.DocumentCurrencyPound: ImageVector
    get() {
        if (_DocumentCurrencyPound != null) return _DocumentCurrencyPound!!
        
        _DocumentCurrencyPound = ImageVector.Builder(
            name = "document-currency-pound",
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
                moveToRelative(5f, 7f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.56f, -1.06f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.062f, -1.061f)
                arcTo(3f, 3f, 0f, false, false, 8f, 9f)
                verticalLineToRelative(1.25f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineTo(9.372f)
                curveToRelative(0.083f, -0.235f, 0.128f, -0.487f, 0.128f, -0.75f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyPound!!
    }

private var _DocumentCurrencyPound: ImageVector? = null

