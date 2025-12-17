package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Shutter_speed: ImageVector
    get() {
        if (_Shutter_speed != null) return _Shutter_speed!!
        
        _Shutter_speed = ImageVector.Builder(
            name = "shutter_speed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadTo(225f, 774f)
                quadToRelative(-49f, -49f, -77f, -114.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -74f, 28.5f, -139.5f)
                reflectiveQuadTo(226f, 266f)
                quadToRelative(49f, -49f, 114.5f, -77.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(63f, 0f, 120f, 21f)
                reflectiveQuadToRelative(104f, 59f)
                lineToRelative(58f, -58f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 58f)
                quadToRelative(36f, 47f, 57f, 104f)
                reflectiveQuadToRelative(21f, 120f)
                quadToRelative(0f, 74f, -28f, 139.5f)
                reflectiveQuadTo(735f, 774f)
                quadToRelative(-49f, 49f, -114.5f, 77.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(117f, 0f, 198.5f, -81.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(0f, -360f)
                horizontalLineToRelative(226f)
                quadToRelative(-18f, -51f, -56f, -89.5f)
                reflectiveQuadTo(564f, 295f)
                lineToRelative(-84f, 145f)
                close()
                moveToRelative(-69f, 40f)
                lineToRelative(113f, -196f)
                quadToRelative(-51f, -10f, -102.5f, 3f)
                reflectiveQuadTo(327f, 335f)
                lineToRelative(84f, 145f)
                close()
                moveToRelative(-167f, 80f)
                horizontalLineToRelative(167f)
                lineTo(298f, 364f)
                quadToRelative(-35f, 39f, -49f, 90.5f)
                reflectiveQuadTo(244f, 560f)
                close()
                moveToRelative(152f, 185f)
                lineToRelative(84f, -145f)
                horizontalLineTo(254f)
                quadToRelative(17f, 50f, 55.5f, 89f)
                reflectiveQuadToRelative(86.5f, 56f)
                close()
                moveToRelative(40f, 11f)
                quadToRelative(57f, 11f, 109f, -4.5f)
                reflectiveQuadToRelative(88f, -46.5f)
                lineToRelative(-84f, -145f)
                lineToRelative(-113f, 196f)
                close()
                moveToRelative(226f, -80f)
                quadToRelative(36f, -41f, 49.5f, -91.5f)
                reflectiveQuadTo(716f, 480f)
                horizontalLineTo(549f)
                lineToRelative(113f, 196f)
                close()
            }
        }.build()
        
        return _Shutter_speed!!
    }

private var _Shutter_speed: ImageVector? = null

