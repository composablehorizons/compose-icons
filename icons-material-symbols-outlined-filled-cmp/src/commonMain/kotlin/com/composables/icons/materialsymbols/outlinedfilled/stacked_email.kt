package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Stacked_email: ImageVector
    get() {
        if (_Stacked_email != null) return _Stacked_email!!
        
        _Stacked_email = ImageVector.Builder(
            name = "stacked_email",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                verticalLineToRelative(-500f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(500f)
                horizontalLineToRelative(660f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 600f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 200f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 680f)
                horizontalLineTo(280f)
                close()
                moveToRelative(280f, -188f)
                lineToRelative(280f, -195f)
                verticalLineToRelative(-97f)
                lineTo(560f, 394f)
                lineTo(280f, 200f)
                verticalLineToRelative(97f)
                lineToRelative(280f, 195f)
                close()
            }
        }.build()
        
        return _Stacked_email!!
    }

private var _Stacked_email: ImageVector? = null

