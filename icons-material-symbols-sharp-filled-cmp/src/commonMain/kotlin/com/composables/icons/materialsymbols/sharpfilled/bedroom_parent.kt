package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bedroom_parent: ImageVector
    get() {
        if (_Bedroom_parent != null) return _Bedroom_parent!!
        
        _Bedroom_parent = ImageVector.Builder(
            name = "bedroom_parent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-140f)
                horizontalLineTo(230f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(260f)
                close()
                moveToRelative(310f, -260f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(510f)
                close()
                moveToRelative(-220f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(290f)
                close()
                moveToRelative(-30f, 140f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(260f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Bedroom_parent!!
    }

private var _Bedroom_parent: ImageVector? = null

