package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Filter_alt_off: ImageVector
    get() {
        if (_Filter_alt_off != null) return _Filter_alt_off!!
        
        _Filter_alt_off = ImageVector.Builder(
            name = "filter_alt_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(592f, 479f)
                lineTo(273f, 160f)
                horizontalLineToRelative(569f)
                lineTo(592f, 479f)
                close()
                moveTo(791f, 904f)
                lineTo(560f, 673f)
                verticalLineToRelative(127f)
                horizontalLineTo(400f)
                verticalLineToRelative(-287f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                close()
            }
        }.build()
        
        return _Filter_alt_off!!
    }

private var _Filter_alt_off: ImageVector? = null

