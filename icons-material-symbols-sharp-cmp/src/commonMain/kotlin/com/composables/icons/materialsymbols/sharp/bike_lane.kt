package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bike_lane: ImageVector
    get() {
        if (_Bike_lane != null) return _Bike_lane!!
        
        _Bike_lane = ImageVector.Builder(
            name = "bike_lane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 800f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(720f, 640f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(640f, 720f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(720f, 800f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveTo(600f, 340f)
                quadToRelative(-29f, 0f, -49.5f, -20.5f)
                reflectiveQuadTo(530f, 270f)
                quadToRelative(0f, -29f, 20.5f, -49.5f)
                reflectiveQuadTo(600f, 200f)
                quadToRelative(29f, 0f, 49.5f, 20.5f)
                reflectiveQuadTo(670f, 270f)
                quadToRelative(0f, 29f, -20.5f, 49.5f)
                reflectiveQuadTo(600f, 340f)
                close()
                moveTo(440f, 760f)
                verticalLineToRelative(-147f)
                lineToRelative(-93f, -77f)
                quadToRelative(-26f, -23f, -27.5f, -58f)
                reflectiveQuadToRelative(24.5f, -59f)
                lineToRelative(80f, -77f)
                quadToRelative(23f, -23f, 56f, -22.5f)
                reflectiveQuadToRelative(56f, 23.5f)
                lineToRelative(63f, 56f)
                quadToRelative(26f, 20f, 57f, 30.5f)
                reflectiveQuadToRelative(64f, 10.5f)
                verticalLineToRelative(80f)
                quadToRelative(-60f, 0f, -113f, -24f)
                reflectiveQuadToRelative(-93f, -67f)
                lineToRelative(-74f, 71f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-200f, 40f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(320f, 720f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 800f)
                close()
                moveToRelative(-69f, -470f)
                lineToRelative(138f, -138f)
                lineToRelative(-41f, -42f)
                lineToRelative(-96f, 96f)
                lineToRelative(-40f, -40f)
                lineToRelative(-42f, 43f)
                lineToRelative(81f, 81f)
                close()
                moveToRelative(69f, 550f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 720f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(240f, 880f)
                close()
                moveToRelative(-40f, -440f)
                quadToRelative(-69f, -17f, -114.5f, -79.5f)
                reflectiveQuadTo(40f, 222f)
                verticalLineToRelative(-120f)
                lineToRelative(160f, -62f)
                lineToRelative(160f, 62f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 76f, -45.5f, 138.5f)
                reflectiveQuadTo(200f, 440f)
                close()
            }
        }.build()
        
        return _Bike_lane!!
    }

private var _Bike_lane: ImageVector? = null

