package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.View_in_ar: ImageVector
    get() {
        if (_View_in_ar != null) return _View_in_ar!!
        
        _View_in_ar = ImageVector.Builder(
            name = "view_in_ar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 779f)
                lineTo(240f, 664f)
                quadToRelative(-19f, -11f, -29.5f, -29.5f)
                reflectiveQuadTo(200f, 595f)
                verticalLineToRelative(-230f)
                quadToRelative(0f, -21f, 10.5f, -39.5f)
                reflectiveQuadTo(240f, 296f)
                lineToRelative(200f, -115f)
                quadToRelative(19f, -11f, 40f, -11f)
                reflectiveQuadToRelative(40f, 11f)
                lineToRelative(200f, 115f)
                quadToRelative(19f, 11f, 29.5f, 29.5f)
                reflectiveQuadTo(760f, 365f)
                verticalLineToRelative(230f)
                quadToRelative(0f, 21f, -10.5f, 39.5f)
                reflectiveQuadTo(720f, 664f)
                lineTo(520f, 779f)
                quadToRelative(-19f, 11f, -40f, 11f)
                reflectiveQuadToRelative(-40f, -11f)
                close()
                moveTo(80f, 280f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveTo(280f, 880f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(680f)
                close()
                moveToRelative(120f, -600f)
                verticalLineToRelative(-120f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-478f, 61f)
                lineToRelative(-42f, 24f)
                verticalLineToRelative(45f)
                lineToRelative(160f, 93f)
                verticalLineToRelative(184f)
                lineToRelative(40f, 23f)
                lineToRelative(40f, -23f)
                verticalLineToRelative(-184f)
                lineToRelative(160f, -93f)
                verticalLineToRelative(-45f)
                lineToRelative(-42f, -24f)
                lineToRelative(-158f, 93f)
                lineToRelative(-158f, -93f)
                close()
            }
        }.build()
        
        return _View_in_ar!!
    }

private var _View_in_ar: ImageVector? = null

