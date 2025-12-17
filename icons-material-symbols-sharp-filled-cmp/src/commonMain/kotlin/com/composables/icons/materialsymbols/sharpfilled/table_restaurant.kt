package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Table_restaurant: ImageVector
    get() {
        if (_Table_restaurant != null) return _Table_restaurant!!
        
        _Table_restaurant = ImageVector.Builder(
            name = "table_restaurant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(672f, 440f)
                horizontalLineTo(289f)
                lineToRelative(-11f, 80f)
                horizontalLineToRelative(404f)
                lineToRelative(-10f, -80f)
                close()
                moveTo(160f, 800f)
                lineToRelative(49f, -360f)
                horizontalLineTo(67f)
                lineToRelative(80f, -280f)
                horizontalLineToRelative(666f)
                lineToRelative(80f, 280f)
                horizontalLineTo(752f)
                lineToRelative(48f, 360f)
                horizontalLineToRelative(-80f)
                lineToRelative(-27f, -200f)
                horizontalLineTo(267f)
                lineToRelative(-27f, 200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Table_restaurant!!
    }

private var _Table_restaurant: ImageVector? = null

