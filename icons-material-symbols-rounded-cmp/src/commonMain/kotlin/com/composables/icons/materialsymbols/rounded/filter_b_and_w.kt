package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Filter_b_and_w: ImageVector
    get() {
        if (_Filter_b_and_w != null) return _Filter_b_and_w!!
        
        _Filter_b_and_w = ImageVector.Builder(
            name = "filter_b_and_w",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                close()
                moveToRelative(-560f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-320f)
                lineToRelative(280f, 320f)
                verticalLineToRelative(-560f)
                horizontalLineTo(480f)
                verticalLineToRelative(240f)
                lineTo(200f, 760f)
                close()
            }
        }.build()
        
        return _Filter_b_and_w!!
    }

private var _Filter_b_and_w: ImageVector? = null

