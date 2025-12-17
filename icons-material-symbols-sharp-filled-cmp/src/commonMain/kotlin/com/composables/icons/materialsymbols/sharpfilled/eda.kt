package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Eda: ImageVector
    get() {
        if (_Eda != null) return _Eda!!
        
        _Eda = ImageVector.Builder(
            name = "eda",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 920f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(218f)
                lineToRelative(136f, 181f)
                lineToRelative(247f, -247f)
                lineToRelative(94f, -57f)
                lineToRelative(106f, 79f)
                lineTo(597f, 920f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -440f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(383f)
                lineTo(482f, 699f)
                lineTo(378f, 560f)
                horizontalLineTo(120f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Eda!!
    }

private var _Eda: ImageVector? = null

