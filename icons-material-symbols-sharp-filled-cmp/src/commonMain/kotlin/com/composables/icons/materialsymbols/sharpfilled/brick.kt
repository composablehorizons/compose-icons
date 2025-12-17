package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Brick: ImageVector
    get() {
        if (_Brick != null) return _Brick!!
        
        _Brick = ImageVector.Builder(
            name = "brick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(480f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Brick!!
    }

private var _Brick: ImageVector? = null

