package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Align_vertical_center: ImageVector
    get() {
        if (_Align_vertical_center != null) return _Align_vertical_center!!
        
        _Align_vertical_center = ImageVector.Builder(
            name = "align_vertical_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-320f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                verticalLineToRelative(200f)
                horizontalLineTo(560f)
                verticalLineToRelative(-200f)
                horizontalLineTo(400f)
                verticalLineToRelative(320f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Align_vertical_center!!
    }

private var _Align_vertical_center: ImageVector? = null

