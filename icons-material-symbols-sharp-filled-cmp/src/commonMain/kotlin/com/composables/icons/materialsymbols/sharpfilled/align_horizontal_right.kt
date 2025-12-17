package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Align_horizontal_right: ImageVector
    get() {
        if (_Align_horizontal_right != null) return _Align_horizontal_right!!
        
        _Align_horizontal_right = ImageVector.Builder(
            name = "align_horizontal_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(800f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(320f, 680f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                close()
                moveTo(80f, 400f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Align_horizontal_right!!
    }

private var _Align_horizontal_right: ImageVector? = null

