package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Inbox_customize: ImageVector
    get() {
        if (_Inbox_customize != null) return _Inbox_customize!!
        
        _Inbox_customize = ImageVector.Builder(
            name = "inbox_customize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(681f, 840f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(625f, 756f)
                lineToRelative(-58f, 18f)
                lineToRelative(-40f, -68f)
                lineToRelative(46f, -40f)
                quadToRelative(-2f, -12f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-46f, -40f)
                lineToRelative(40f, -68f)
                lineToRelative(58f, 18f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(669f, 500f)
                lineToRelative(12f, -60f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, 60f)
                quadToRelative(12f, 5f, 22.5f, 10.5f)
                reflectiveQuadTo(817f, 524f)
                lineToRelative(58f, -18f)
                lineToRelative(40f, 68f)
                lineToRelative(-46f, 40f)
                quadToRelative(2f, 12f, 2f, 26f)
                reflectiveQuadToRelative(-2f, 26f)
                lineToRelative(46f, 40f)
                lineToRelative(-40f, 68f)
                lineToRelative(-58f, -18f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(773f, 780f)
                lineToRelative(-12f, 60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-561f, -40f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(306f)
                quadToRelative(-19f, -9f, -39f, -14.5f)
                reflectiveQuadToRelative(-41f, -8.5f)
                verticalLineToRelative(-203f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(168f)
                quadToRelative(9f, 27f, 30f, 47f)
                reflectiveQuadToRelative(47f, 28f)
                quadToRelative(-9f, 54f, 2.5f, 107f)
                reflectiveQuadToRelative(43.5f, 98f)
                horizontalLineTo(120f)
                close()
                moveToRelative(601f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(801f, 640f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(721f, 560f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(641f, 640f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(721f, 720f)
                close()
            }
        }.build()
        
        return _Inbox_customize!!
    }

private var _Inbox_customize: ImageVector? = null

