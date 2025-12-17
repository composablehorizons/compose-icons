package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Climate_mini_split: ImageVector
    get() {
        if (_Climate_mini_split != null) return _Climate_mini_split!!
        
        _Climate_mini_split = ImageVector.Builder(
            name = "climate_mini_split",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 480f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(400f)
                horizontalLineTo(720f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                close()
                moveToRelative(40f, -80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineTo(320f)
                close()
                moveToRelative(120f, 320f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, -240f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                verticalLineToRelative(80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(600f, 560f)
                close()
            }
        }.build()
        
        return _Climate_mini_split!!
    }

private var _Climate_mini_split: ImageVector? = null

