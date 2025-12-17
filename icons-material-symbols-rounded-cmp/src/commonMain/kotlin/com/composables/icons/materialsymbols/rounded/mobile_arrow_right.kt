package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mobile_arrow_right: ImageVector
    get() {
        if (_Mobile_arrow_right != null) return _Mobile_arrow_right!!
        
        _Mobile_arrow_right = ImageVector.Builder(
            name = "mobile_arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(404f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-720f)
                horizontalLineTo(280f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-720f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(206f, -320f)
                lineToRelative(-35f, 36f)
                quadToRelative(-11f, 11f, -11f, 27.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(104f, -104f)
                quadToRelative(6f, -6f, 8.5f, -13f)
                reflectiveQuadToRelative(2.5f, -15f)
                quadToRelative(0f, -8f, -2.5f, -15f)
                reflectiveQuadToRelative(-8.5f, -13f)
                lineTo(508f, 348f)
                quadToRelative(-11f, -11f, -27.5f, -11.5f)
                reflectiveQuadTo(452f, 348f)
                quadToRelative(-11f, 11f, -11.5f, 27.5f)
                reflectiveQuadTo(451f, 404f)
                lineToRelative(35f, 36f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 520f)
                horizontalLineToRelative(126f)
                close()
            }
        }.build()
        
        return _Mobile_arrow_right!!
    }

private var _Mobile_arrow_right: ImageVector? = null

