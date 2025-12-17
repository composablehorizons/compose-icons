package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Browse_activity: ImageVector
    get() {
        if (_Browse_activity != null) return _Browse_activity!!
        
        _Browse_activity = ImageVector.Builder(
            name = "browse_activity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 760f)
                horizontalLineToRelative(800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 840f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(215f)
                lineToRelative(69f, 138f)
                quadToRelative(5f, 10f, 14.5f, 16f)
                reflectiveQuadToRelative(20.5f, 6f)
                quadToRelative(11f, 0f, 21f, -5f)
                reflectiveQuadToRelative(15f, -15f)
                lineToRelative(123f, -215f)
                lineToRelative(26f, 53f)
                quadToRelative(5f, 11f, 15f, 16.5f)
                reflectiveQuadToRelative(21f, 5.5f)
                horizontalLineToRelative(260f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(243f, -245f)
                lineToRelative(-47f, -93f)
                quadToRelative(-5f, -10f, -15f, -16f)
                reflectiveQuadToRelative(-21f, -6f)
                horizontalLineTo(80f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(160f)
                horizontalLineTo(645f)
                lineToRelative(-49f, -98f)
                quadToRelative(-5f, -11f, -15f, -16.5f)
                reflectiveQuadToRelative(-21f, -5.5f)
                quadToRelative(-11f, 0f, -20f, 5.5f)
                reflectiveQuadTo(526f, 260f)
                lineTo(403f, 475f)
                close()
            }
        }.build()
        
        return _Browse_activity!!
    }

private var _Browse_activity: ImageVector? = null

