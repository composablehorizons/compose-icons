package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Horizontal_distribute: ImageVector
    get() {
        if (_Horizontal_distribute != null) return _Horizontal_distribute!!
        
        _Horizontal_distribute = ImageVector.Builder(
            name = "horizontal_distribute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(340f, -200f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineTo(420f)
                close()
                moveTo(800f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(800f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Horizontal_distribute!!
    }

private var _Horizontal_distribute: ImageVector? = null

