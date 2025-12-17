package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bluetooth_drive: ImageVector
    get() {
        if (_Bluetooth_drive != null) return _Bluetooth_drive!!
        
        _Bluetooth_drive = ImageVector.Builder(
            name = "bluetooth_drive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 640f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(260f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 640f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(620f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(560f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(620f, 640f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(140f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 780f)
                verticalLineToRelative(-286f)
                quadToRelative(0f, -7f, 1f, -14f)
                reflectiveQuadToRelative(3f, -13f)
                lineToRelative(75f, -213f)
                quadToRelative(8f, -24f, 29f, -39f)
                reflectiveQuadToRelative(47f, -15f)
                horizontalLineToRelative(325f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 280f)
                horizontalLineTo(234f)
                lineToRelative(-42f, 120f)
                horizontalLineToRelative(368f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 480f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 520f)
                verticalLineToRelative(260f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(740f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(680f, 780f)
                verticalLineToRelative(-20f)
                horizontalLineTo(200f)
                close()
                moveToRelative(538f, -520f)
                lineToRelative(-98f, -98f)
                quadToRelative(-6f, -6f, -6f, -14f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(78f, 78f)
                verticalLineToRelative(-123f)
                quadToRelative(0f, -14f, 12f, -19f)
                reflectiveQuadToRelative(22f, 5f)
                lineToRelative(86f, 87f)
                quadToRelative(6f, 6f, 6f, 14f)
                reflectiveQuadToRelative(-6f, 14f)
                lineToRelative(-72f, 70f)
                lineToRelative(72f, 72f)
                quadToRelative(6f, 6f, 6f, 14f)
                reflectiveQuadToRelative(-6f, 14f)
                lineToRelative(-86f, 86f)
                quadToRelative(-10f, 10f, -22f, 5f)
                reflectiveQuadToRelative(-12f, -19f)
                verticalLineToRelative(-124f)
                lineToRelative(-78f, 78f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-6f, -6f, -6f, -14f)
                reflectiveQuadToRelative(6f, -14f)
                lineToRelative(98f, -98f)
                close()
                moveToRelative(48f, -48f)
                lineToRelative(38f, -36f)
                lineToRelative(-38f, -38f)
                verticalLineToRelative(74f)
                close()
                moveToRelative(0f, 172f)
                lineToRelative(38f, -38f)
                lineToRelative(-38f, -38f)
                verticalLineToRelative(76f)
                close()
                moveTo(160f, 480f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                close()
            }
        }.build()
        
        return _Bluetooth_drive!!
    }

private var _Bluetooth_drive: ImageVector? = null

