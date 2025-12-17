package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Battery_2_bar: ImageVector
    get() {
        if (_Battery_2_bar != null) return _Battery_2_bar!!
        
        _Battery_2_bar = ImageVector.Builder(
            name = "battery_2_bar",
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
                moveToRelative(80f, -240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-400f)
                horizontalLineTo(360f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Battery_2_bar!!
    }

private var _Battery_2_bar: ImageVector? = null

