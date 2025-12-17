package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Shelf_position: ImageVector
    get() {
        if (_Shelf_position != null) return _Shelf_position!!
        
        _Shelf_position = ImageVector.Builder(
            name = "shelf_position",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(200f)
                horizontalLineTo(120f)
                close()
                moveToRelative(540f, -280f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(440f)
                horizontalLineTo(660f)
                close()
                moveToRelative(-540f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(440f)
                horizontalLineTo(120f)
                close()
                moveToRelative(260f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(440f)
                horizontalLineTo(380f)
                close()
            }
        }.build()
        
        return _Shelf_position!!
    }

private var _Shelf_position: ImageVector? = null

