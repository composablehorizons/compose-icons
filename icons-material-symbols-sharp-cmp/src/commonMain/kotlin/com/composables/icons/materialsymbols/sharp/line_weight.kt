package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Line_weight: ImageVector
    get() {
        if (_Line_weight != null) return _Line_weight!!
        
        _Line_weight = ImageVector.Builder(
            name = "line_weight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(40f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(120f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -200f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(160f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Line_weight!!
    }

private var _Line_weight: ImageVector? = null

