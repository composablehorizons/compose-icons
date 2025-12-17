package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Open_in_new: ImageVector
    get() {
        if (_Open_in_new != null) return _Open_in_new!!
        
        _Open_in_new = ImageVector.Builder(
            name = "open_in_new",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineTo(120f)
                close()
                moveToRelative(268f, -212f)
                lineToRelative(-56f, -56f)
                lineToRelative(372f, -372f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-144f)
                lineTo(388f, 628f)
                close()
            }
        }.build()
        
        return _Open_in_new!!
    }

private var _Open_in_new: ImageVector? = null

