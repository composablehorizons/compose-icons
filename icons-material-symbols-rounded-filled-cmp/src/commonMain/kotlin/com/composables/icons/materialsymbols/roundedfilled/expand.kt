package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Expand: ImageVector
    get() {
        if (_Expand != null) return _Expand!!
        
        _Expand = ImageVector.Builder(
            name = "expand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 800f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -137f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(348f, 628f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(348f, 572f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(404f, 571f)
                lineToRelative(36f, 35f)
                verticalLineToRelative(-252f)
                lineToRelative(-36f, 35f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(348f, 388f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(104f, 104f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(612f, 388f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(556f, 389f)
                lineToRelative(-36f, -35f)
                verticalLineToRelative(252f)
                lineToRelative(36f, -35f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(508f, 732f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadToRelative(-15f, 2.5f)
                close()
                moveTo(200f, 160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 160f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Expand!!
    }

private var _Expand: ImageVector? = null

