package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Battery_3_bar: ImageVector
    get() {
        if (_Battery_3_bar != null) return _Battery_3_bar!!
        
        _Battery_3_bar = ImageVector.Builder(
            name = "battery_3_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(720f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-320f)
                horizontalLineTo(360f)
                verticalLineToRelative(320f)
                close()
            }
        }.build()
        
        return _Battery_3_bar!!
    }

private var _Battery_3_bar: ImageVector? = null

