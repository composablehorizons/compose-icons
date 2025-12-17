package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Keyboard_command_key: ImageVector
    get() {
        if (_Keyboard_command_key != null) return _Keyboard_command_key!!
        
        _Keyboard_command_key = ImageVector.Builder(
            name = "keyboard_command_key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 840f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-60f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(60f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-60f)
                horizontalLineTo(400f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 700f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 700f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 760f)
                close()
                moveToRelative(440f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(760f, 700f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(700f, 640f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(700f, 760f)
                close()
                moveTo(400f, 560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(400f)
                verticalLineToRelative(160f)
                close()
                moveTo(260f, 320f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(260f, 200f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 260f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 320f)
                close()
                moveToRelative(380f, 0f)
                horizontalLineToRelative(60f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(760f, 260f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(700f, 200f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(640f, 260f)
                verticalLineToRelative(60f)
                close()
            }
        }.build()
        
        return _Keyboard_command_key!!
    }

private var _Keyboard_command_key: ImageVector? = null

