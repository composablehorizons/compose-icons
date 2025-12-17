package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bike_scooter: ImageVector
    get() {
        if (_Bike_scooter != null) return _Bike_scooter!!
        
        _Bike_scooter = ImageVector.Builder(
            name = "bike_scooter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(164f)
                quadToRelative(11f, -68f, 56.5f, -119f)
                reflectiveQuadTo(332f, 490f)
                lineToRelative(-58f, -250f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(114f)
                quadToRelative(27f, 0f, 49.5f, 17.5f)
                reflectiveQuadTo(352f, 222f)
                lineToRelative(78f, 338f)
                horizontalLineToRelative(-30f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(40f)
                horizontalLineTo(0f)
                close()
                moveToRelative(400f, 80f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 760f)
                close()
                moveToRelative(360f, -40f)
                quadToRelative(-72f, 0f, -126.5f, -44.5f)
                reflectiveQuadTo(564f, 560f)
                horizontalLineToRelative(-94f)
                lineToRelative(-18f, -80f)
                horizontalLineToRelative(112f)
                quadToRelative(5f, -23f, 13.5f, -43f)
                reflectiveQuadToRelative(22.5f, -37f)
                horizontalLineTo(434f)
                lineToRelative(-18f, -80f)
                horizontalLineToRelative(226f)
                lineToRelative(-44f, -120f)
                horizontalLineToRelative(-64f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(494f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(534f, 120f)
                horizontalLineToRelative(64f)
                quadToRelative(26f, 0f, 46.5f, 14f)
                reflectiveQuadToRelative(29.5f, 38f)
                lineToRelative(54f, 146f)
                horizontalLineToRelative(32f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 518f)
                quadToRelative(0f, 85f, -58.5f, 143.5f)
                reflectiveQuadTo(760f, 720f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(51f, 0f, 85.5f, -35f)
                reflectiveQuadToRelative(34.5f, -85f)
                quadToRelative(0f, -51f, -34.5f, -85.5f)
                reflectiveQuadTo(760f, 400f)
                horizontalLineToRelative(-4f)
                lineToRelative(26f, 69f)
                quadToRelative(6f, 16f, -1f, 30.5f)
                reflectiveQuadTo(758f, 520f)
                quadToRelative(-16f, 6f, -31f, -1f)
                reflectiveQuadToRelative(-21f, -23f)
                lineToRelative(-24f, -68f)
                quadToRelative(-20f, 17f, -31f, 40f)
                reflectiveQuadToRelative(-11f, 52f)
                quadToRelative(0f, 50f, 34.5f, 85f)
                reflectiveQuadToRelative(85.5f, 35f)
                close()
                moveToRelative(-360f, 80f)
                close()
                moveToRelative(360f, -200f)
                close()
            }
        }.build()
        
        return _Bike_scooter!!
    }

private var _Bike_scooter: ImageVector? = null

