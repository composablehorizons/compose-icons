package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Devices_wearables: ImageVector
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
                quadToRelative(17f, 51f, 51f, 92f)
                reflectiveQuadToRelative(81f, 68f)
                verticalLineToRelative(40f)
                horizontalLineTo(80f)
                close()
                moveToRelative(520f, 0f)
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

