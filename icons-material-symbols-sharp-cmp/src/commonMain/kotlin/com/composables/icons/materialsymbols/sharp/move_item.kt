package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Move_item: ImageVector
    get() {
        if (_Move_item != null) return _Move_item!!
        
        _Move_item = ImageVector.Builder(
            name = "move_item",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(806f, 520f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(486f)
                lineToRelative(-62f, -62f)
                lineToRelative(56f, -58f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -58f)
                lineToRelative(62f, -62f)
                close()
                moveTo(600f, 360f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Move_item!!
    }

private var _Move_item: ImageVector? = null

