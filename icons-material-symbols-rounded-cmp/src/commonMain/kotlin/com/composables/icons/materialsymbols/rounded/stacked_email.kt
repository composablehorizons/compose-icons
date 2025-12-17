package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stacked_email: ImageVector
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
                moveTo(280f, 680f)
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
                moveToRelative(257f, -204f)
                lineTo(280f, 297f)
                verticalLineToRelative(303f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-303f)
                lineTo(583f, 476f)
                quadToRelative(-11f, 8f, -23f, 8f)
                reflectiveQuadToRelative(-23f, -8f)
                close()
                moveToRelative(23f, -82f)
                lineToRelative(280f, -194f)
                horizontalLineTo(280f)
                lineToRelative(280f, 194f)
                close()
                moveTo(120f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                verticalLineToRelative(-460f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 260f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(120f, 300f)
                verticalLineToRelative(460f)
                horizontalLineToRelative(620f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(780f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(740f, 840f)
                horizontalLineTo(120f)
                close()
                moveToRelative(720f, -546f)
                verticalLineToRelative(-94f)
                horizontalLineTo(280f)
                verticalLineToRelative(94f)
                verticalLineToRelative(-94f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(94f)
                close()
            }
        }.build()
        
        return _Stacked_email!!
    }

private var _Stacked_email: ImageVector? = null

