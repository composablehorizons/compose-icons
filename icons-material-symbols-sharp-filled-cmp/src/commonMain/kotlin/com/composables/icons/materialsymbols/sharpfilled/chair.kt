package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chair: ImageVector
    get() {
        if (_Chair != null) return _Chair!!
        
        _Chair = ImageVector.Builder(
            name = "chair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineTo(40f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(360f)
                horizontalLineTo(800f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -320f)
                verticalLineToRelative(-200f)
                horizontalLineTo(160f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(200f)
                horizontalLineTo(680f)
                verticalLineToRelative(200f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Chair!!
    }

private var _Chair: ImageVector? = null

