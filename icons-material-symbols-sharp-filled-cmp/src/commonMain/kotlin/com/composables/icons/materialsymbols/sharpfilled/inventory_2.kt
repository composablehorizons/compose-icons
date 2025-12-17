package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Inventory_2: ImageVector
    get() {
        if (_Inventory_2 != null) return _Inventory_2!!
        
        _Inventory_2 = ImageVector.Builder(
            name = "inventory_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-520f)
                horizontalLineTo(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(520f)
                horizontalLineTo(120f)
                close()
                moveToRelative(40f, -600f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(200f, 280f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Inventory_2!!
    }

private var _Inventory_2: ImageVector? = null

