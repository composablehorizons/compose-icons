package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bluetooth_drive: ImageVector
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
                moveTo(120f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-320f)
                lineToRelative(84f, -240f)
                quadToRelative(6f, -18f, 21.5f, -29f)
                reflectiveQuadToRelative(34.5f, -11f)
                horizontalLineToRelative(380f)
                verticalLineToRelative(80f)
                horizontalLineTo(234f)
                lineToRelative(-42f, 120f)
                horizontalLineToRelative(408f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(160f, 840f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(626f, -400f)
                verticalLineToRelative(-152f)
                lineToRelative(-92f, 92f)
                lineToRelative(-28f, -28f)
                lineToRelative(112f, -112f)
                lineToRelative(-112f, -112f)
                lineToRelative(28f, -28f)
                lineToRelative(92f, 92f)
                verticalLineToRelative(-152f)
                horizontalLineToRelative(20f)
                lineToRelative(114f, 116f)
                lineToRelative(-86f, 84f)
                lineToRelative(86f, 86f)
                lineToRelative(-114f, 114f)
                horizontalLineToRelative(-20f)
                close()
                moveToRelative(40f, -248f)
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

