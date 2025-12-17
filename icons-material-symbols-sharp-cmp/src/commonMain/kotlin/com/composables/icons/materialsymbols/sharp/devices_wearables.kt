package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Devices_wearables: ImageVector
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
                moveTo(160f, 200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                verticalLineToRelative(40f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(234f)
                quadToRelative(-23f, 12f, -43f, 27.5f)
                reflectiveQuadTo(480f, 376f)
                verticalLineToRelative(-96f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(257f)
                quadToRelative(8f, 22f, 18.5f, 42f)
                reflectiveQuadToRelative(24.5f, 38f)
                horizontalLineTo(160f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-16f)
                quadToRelative(15f, 17f, 32f, 31f)
                reflectiveQuadToRelative(37f, 25f)
                verticalLineToRelative(40f)
                horizontalLineTo(80f)
                close()
                moveToRelative(620f, -160f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveTo(600f, 880f)
                verticalLineToRelative(-104f)
                quadToRelative(-54f, -27f, -87f, -79f)
                reflectiveQuadToRelative(-33f, -117f)
                quadToRelative(0f, -65f, 33f, -117f)
                reflectiveQuadToRelative(87f, -79f)
                verticalLineToRelative(-104f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(104f)
                quadToRelative(54f, 27f, 87f, 79f)
                reflectiveQuadToRelative(33f, 117f)
                quadToRelative(0f, 65f, -33f, 117f)
                reflectiveQuadToRelative(-87f, 79f)
                verticalLineToRelative(104f)
                horizontalLineTo(600f)
                close()
                moveTo(160f, 760f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Devices_wearables!!
    }

private var _Devices_wearables: ImageVector? = null

