package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Place_item: ImageVector
    get() {
        if (_Place_item != null) return _Place_item!!
        
        _Place_item = ImageVector.Builder(
            name = "place_item",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-400f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(560f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, -200f)
                lineTo(320f, 480f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 63f)
                verticalLineToRelative(-487f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(487f)
                lineToRelative(64f, -63f)
                lineToRelative(56f, 56f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Place_item!!
    }

private var _Place_item: ImageVector? = null

