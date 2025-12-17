package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flight_takeoff: ImageVector
    get() {
        if (_Flight_takeoff != null) return _Flight_takeoff!!
        
        _Flight_takeoff = ImageVector.Builder(
            name = "flight_takeoff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 840f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 760f)
                horizontalLineToRelative(640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 840f)
                close()
                moveTo(212f, 496f)
                lineToRelative(192f, -52f)
                lineToRelative(-139f, -236f)
                quadToRelative(-8f, -14f, -3f, -30f)
                reflectiveQuadToRelative(22f, -21f)
                lineToRelative(17f, -5f)
                quadToRelative(9f, -3f, 18f, -1f)
                reflectiveQuadToRelative(16f, 8f)
                lineToRelative(259f, 233f)
                lineToRelative(200f, -54f)
                quadToRelative(32f, -9f, 58f, 12f)
                reflectiveQuadToRelative(26f, 56f)
                quadToRelative(0f, 22f, -13.5f, 39f)
                reflectiveQuadTo(830f, 468f)
                lineTo(223f, 632f)
                quadToRelative(-13f, 4f, -25f, -1f)
                reflectiveQuadToRelative(-19f, -17f)
                lineTo(98f, 476f)
                quadToRelative(-7f, -11f, -1.5f, -23f)
                reflectiveQuadToRelative(18.5f, -14f)
                lineToRelative(15f, -3f)
                quadToRelative(6f, -1f, 11f, 0.5f)
                reflectiveQuadToRelative(10f, 5.5f)
                lineToRelative(61f, 54f)
                close()
            }
        }.build()
        
        return _Flight_takeoff!!
    }

private var _Flight_takeoff: ImageVector? = null

