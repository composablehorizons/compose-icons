package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bike_scooter: ImageVector
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
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(218f)
                lineToRelative(92f, 400f)
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
                moveToRelative(360f, -120f)
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
                horizontalLineTo(494f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(161f)
                lineToRelative(73f, 198f)
                horizontalLineToRelative(32f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 518f)
                quadToRelative(0f, 85f, -58.5f, 143.5f)
                reflectiveQuadTo(760f, 720f)
                close()
                moveToRelative(-40f, -186f)
                lineToRelative(76f, -28f)
                lineToRelative(-40f, -106f)
                lineToRelative(-74f, 28f)
                lineToRelative(38f, 106f)
                close()
            }
        }.build()
        
        return _Bike_scooter!!
    }

private var _Bike_scooter: ImageVector? = null

