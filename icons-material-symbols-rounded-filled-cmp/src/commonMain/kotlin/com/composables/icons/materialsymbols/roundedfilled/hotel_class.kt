package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hotel_class: ImageVector
    get() {
        if (_Hotel_class != null) return _Hotel_class!!
        
        _Hotel_class = ImageVector.Builder(
            name = "hotel_class",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(668f, 580f)
                lineToRelative(152f, -130f)
                lineToRelative(26f, 2f)
                quadToRelative(17f, 2f, 26.5f, 14f)
                reflectiveQuadToRelative(9.5f, 26f)
                quadToRelative(0f, 8f, -3f, 16f)
                reflectiveQuadToRelative(-11f, 14f)
                lineToRelative(-104f, 91f)
                lineToRelative(31f, 135f)
                quadToRelative(1f, 2f, 1f, 4.5f)
                verticalLineToRelative(4.5f)
                quadToRelative(0f, 17f, -12f, 28.5f)
                reflectiveQuadTo(756f, 797f)
                quadToRelative(-5f, 0f, -10.5f, -1.5f)
                reflectiveQuadTo(735f, 791f)
                lineToRelative(-21f, -13f)
                lineToRelative(-46f, -198f)
                close()
                moveToRelative(-94f, -292f)
                lineToRelative(-42f, -98f)
                lineToRelative(9f, -22f)
                quadToRelative(5f, -12f, 15.5f, -18.5f)
                reflectiveQuadTo(578f, 143f)
                quadToRelative(11f, 0f, 21.5f, 6f)
                reflectiveQuadToRelative(15.5f, 18f)
                lineToRelative(55f, 130f)
                lineToRelative(-96f, -9f)
                close()
                moveTo(194f, 748f)
                lineToRelative(44f, -189f)
                lineTo(91f, 432f)
                quadToRelative(-8f, -6f, -10.5f, -14f)
                reflectiveQuadTo(78f, 402f)
                quadToRelative(0f, -14f, 9.5f, -26f)
                reflectiveQuadToRelative(26.5f, -14f)
                lineToRelative(194f, -17f)
                lineToRelative(75f, -178f)
                quadToRelative(5f, -12f, 15.5f, -18f)
                reflectiveQuadToRelative(21.5f, -6f)
                quadToRelative(11f, 0f, 21.5f, 6f)
                reflectiveQuadToRelative(15.5f, 18f)
                lineToRelative(75f, 178f)
                lineToRelative(194f, 17f)
                quadToRelative(17f, 2f, 26.5f, 14f)
                reflectiveQuadToRelative(9.5f, 26f)
                quadToRelative(0f, 8f, -2.5f, 16f)
                reflectiveQuadTo(749f, 432f)
                lineTo(602f, 559f)
                lineToRelative(44f, 189f)
                quadToRelative(1f, 3f, 1f, 9f)
                quadToRelative(0f, 17f, -12f, 28.5f)
                reflectiveQuadTo(607f, 797f)
                quadToRelative(-3f, 0f, -21f, -6f)
                lineTo(420f, 691f)
                lineTo(254f, 791f)
                quadToRelative(-5f, 3f, -10.5f, 4.5f)
                reflectiveQuadTo(233f, 797f)
                quadToRelative(-18f, 0f, -31f, -14.5f)
                reflectiveQuadToRelative(-8f, -34.5f)
                close()
            }
        }.build()
        
        return _Hotel_class!!
    }

private var _Hotel_class: ImageVector? = null

