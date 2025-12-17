package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Joystick: ImageVector
    get() {
        if (_Joystick != null) return _Joystick!!
        
        _Joystick = ImageVector.Builder(
            name = "joystick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 331f)
                verticalLineToRelative(-17f)
                quadToRelative(-44f, -13f, -72f, -49.5f)
                reflectiveQuadTo(340f, 180f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 48f, -28f, 84.5f)
                reflectiveQuadTo(520f, 314f)
                verticalLineToRelative(17f)
                lineToRelative(280f, 161f)
                quadToRelative(19f, 11f, 29.5f, 29.5f)
                reflectiveQuadTo(840f, 562f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 22f, -10.5f, 40.5f)
                reflectiveQuadTo(800f, 708f)
                lineTo(520f, 869f)
                quadToRelative(-19f, 11f, -40f, 11f)
                reflectiveQuadToRelative(-40f, -11f)
                lineTo(160f, 708f)
                quadToRelative(-19f, -11f, -29.5f, -29.5f)
                reflectiveQuadTo(120f, 638f)
                verticalLineToRelative(-76f)
                quadToRelative(0f, -22f, 10.5f, -40.5f)
                reflectiveQuadTo(160f, 492f)
                lineToRelative(280f, -161f)
                close()
                moveTo(272f, 520f)
                lineToRelative(208f, 120f)
                lineToRelative(208f, -120f)
                lineToRelative(-168f, -97f)
                verticalLineToRelative(137f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-137f)
                lineToRelative(-168f, 97f)
                close()
            }
        }.build()
        
        return _Joystick!!
    }

private var _Joystick: ImageVector? = null

