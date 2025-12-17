package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Reset_wrench: ImageVector
    get() {
        if (_Reset_wrench != null) return _Reset_wrench!!
        
        _Reset_wrench = ImageVector.Builder(
            name = "reset_wrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(653f, 752f)
                lineToRelative(-46f, 46f)
                quadToRelative(-17f, 17f, -42f, 17.5f)
                reflectiveQuadTo(522f, 798f)
                quadToRelative(-17f, -17f, -17f, -42.5f)
                reflectiveQuadToRelative(17f, -42.5f)
                lineToRelative(46f, -46f)
                quadToRelative(-4f, -11f, -6f, -23f)
                reflectiveQuadToRelative(-2f, -24f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(9f, 0f, 18f, 0.5f)
                reflectiveQuadToRelative(17f, 3.5f)
                quadToRelative(11f, 4f, 13.5f, 16.5f)
                reflectiveQuadTo(743f, 521f)
                lineToRelative(-43f, 43f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(43f, -43f)
                quadToRelative(8f, -8f, 20.5f, -5.5f)
                reflectiveQuadTo(836f, 585f)
                quadToRelative(3f, 8f, 3.5f, 17f)
                reflectiveQuadToRelative(0.5f, 18f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                quadToRelative(-13f, 0f, -24.5f, -2f)
                reflectiveQuadToRelative(-22.5f, -6f)
                close()
                moveToRelative(-399f, 8f)
                quadToRelative(-62f, -50f, -98f, -122.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(111f, 0f, 199f, 60f)
                reflectiveQuadToRelative(130f, 155f)
                quadToRelative(7f, 16f, 0f, 31f)
                reflectiveQuadToRelative(-23f, 21f)
                quadToRelative(-15f, 5f, -29.5f, -2f)
                reflectiveQuadTo(735f, 363f)
                quadToRelative(-33f, -72f, -101.5f, -117.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 72f, 32.5f, 132f)
                reflectiveQuadToRelative(87.5f, 98f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 760f)
                horizontalLineToRelative(54f)
                close()
            }
        }.build()
        
        return _Reset_wrench!!
    }

private var _Reset_wrench: ImageVector? = null

