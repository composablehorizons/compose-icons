package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Vitals: ImageVector
    get() {
        if (_Vitals != null) return _Vitals!!
        
        _Vitals = ImageVector.Builder(
            name = "vitals",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.7f)
                lineTo(9f, 17.1f)
                lineToRelative(6f, -15.825f)
                lineTo(18.7f, 11f)
                horizontalLineTo(23f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.7f)
                lineTo(15f, 6.9f)
                lineTo(9f, 22.725f)
                lineTo(5.3f, 13f)
                close()
            }
        }.build()
        
        return _Vitals!!
    }

private var _Vitals: ImageVector? = null

