package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Devices_wearables: ImageVector
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
                verticalLineToRelative(154f)
                quadToRelative(-23f, 12f, -43f, 27.5f)
                reflectiveQuadTo(480f, 376f)
                verticalLineToRelative(-96f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(257f)
                quadToRelative(17f, 51f, 51f, 92f)
                reflectiveQuadToRelative(81f, 68f)
                quadToRelative(-11f, 19f, -29.5f, 29.5f)
                reflectiveQuadTo(480f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(440f, 0f)
                verticalLineToRelative(-104f)
                quadToRelative(-56f, -28f, -88f, -80.5f)
                reflectiveQuadTo(480f, 580f)
                quadToRelative(0f, -63f, 32f, -115.5f)
                reflectiveQuadToRelative(88f, -80.5f)
                verticalLineToRelative(-104f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(104f)
                quadToRelative(56f, 28f, 88f, 80.5f)
                reflectiveQuadTo(920f, 580f)
                quadToRelative(0f, 63f, -32f, 115.5f)
                reflectiveQuadTo(800f, 776f)
                verticalLineToRelative(104f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Devices_wearables!!
    }

private var _Devices_wearables: ImageVector? = null

