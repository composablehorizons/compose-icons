package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Devices_wearables: ImageVector
    get() {
        if (_Devices_wearables != null) return _Devices_wearables!!
        
        _Devices_wearables = ImageVector.Builder(
            name = "devices_wearables",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 720f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 160f)
                verticalLineToRelative(145f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 345f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 305f)
                verticalLineToRelative(-25f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(216f)
                quadToRelative(19f, 0f, 34f, 10.5f)
                reflectiveQuadToRelative(23f, 27.5f)
                quadToRelative(15f, 30f, 37f, 56f)
                reflectiveQuadToRelative(49f, 46f)
                quadToRelative(7f, 5f, 10.5f, 12f)
                reflectiveQuadToRelative(3.5f, 15f)
                quadToRelative(0f, 15f, -13f, 24f)
                reflectiveQuadToRelative(-30f, 9f)
                horizontalLineTo(160f)
                close()
                moveToRelative(440f, -40f)
                verticalLineToRelative(-64f)
                quadToRelative(-56f, -28f, -88f, -80.5f)
                reflectiveQuadTo(480f, 580f)
                quadToRelative(0f, -63f, 32f, -115.5f)
                reflectiveQuadToRelative(88f, -80.5f)
                verticalLineToRelative(-64f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 280f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 320f)
                verticalLineToRelative(64f)
                quadToRelative(56f, 28f, 88f, 80.5f)
                reflectiveQuadTo(920f, 580f)
                quadToRelative(0f, 63f, -32f, 115.5f)
                reflectiveQuadTo(800f, 776f)
                verticalLineToRelative(64f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 840f)
                close()
            }
        }.build()
        
        return _Devices_wearables!!
    }

private var _Devices_wearables: ImageVector? = null

