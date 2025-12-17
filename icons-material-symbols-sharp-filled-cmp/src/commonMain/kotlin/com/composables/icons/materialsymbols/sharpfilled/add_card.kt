package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Add_card: ImageVector
    get() {
        if (_Add_card != null) return _Add_card!!
        
        _Add_card = ImageVector.Builder(
            name = "add_card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveTo(760f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(840f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(320f)
                horizontalLineTo(760f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(560f, 680f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Add_card!!
    }

private var _Add_card: ImageVector? = null

