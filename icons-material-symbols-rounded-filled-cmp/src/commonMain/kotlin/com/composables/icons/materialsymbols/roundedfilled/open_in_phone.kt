package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Open_in_phone: ImageVector
    get() {
        if (_Open_in_phone != null) return _Open_in_phone!!
        
        _Open_in_phone = ImageVector.Builder(
            name = "open_in_phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(406f, 520f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(286f)
                lineToRelative(-35f, -36f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(428f, 612f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(372f, 612f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(371f, 556f)
                lineToRelative(35f, -36f)
                close()
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 320f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Open_in_phone!!
    }

private var _Open_in_phone: ImageVector? = null

