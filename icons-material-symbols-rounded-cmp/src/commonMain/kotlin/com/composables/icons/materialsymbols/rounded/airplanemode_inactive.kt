package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Airplanemode_inactive: ImageVector
    get() {
        if (_Airplanemode_inactive != null) return _Airplanemode_inactive!!
        
        _Airplanemode_inactive = ImageVector.Builder(
            name = "airplanemode_inactive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(370f, 871f)
                quadToRelative(-11f, 3f, -20.5f, -4f)
                reflectiveQuadToRelative(-9.5f, -19f)
                verticalLineToRelative(-16f)
                quadToRelative(0f, -6f, 2.5f, -10.5f)
                reflectiveQuadToRelative(7.5f, -8.5f)
                lineToRelative(70f, -53f)
                verticalLineToRelative(-220f)
                lineToRelative(-296f, 87f)
                quadToRelative(-17f, 5f, -30.5f, -5.5f)
                reflectiveQuadTo(80f, 594f)
                verticalLineToRelative(-14f)
                quadToRelative(0f, -9f, 4.5f, -17f)
                reflectiveQuadTo(97f, 550f)
                lineToRelative(215f, -126f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(540f, 652f)
                verticalLineToRelative(108f)
                lineToRelative(69f, 51f)
                quadToRelative(5f, 4f, 8f, 10f)
                reflectiveQuadToRelative(3f, 13f)
                verticalLineToRelative(8f)
                quadToRelative(0f, 14f, -11.5f, 22.5f)
                reflectiveQuadTo(583f, 869f)
                lineToRelative(-103f, -29f)
                close()
                moveToRelative(0f, -760f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(220f)
                lineToRelative(321f, 189f)
                quadToRelative(9f, 5f, 14f, 13.5f)
                reflectiveQuadToRelative(5f, 19.5f)
                verticalLineToRelative(7f)
                quadToRelative(0f, 20f, -15f, 31f)
                reflectiveQuadToRelative(-34f, 6f)
                lineToRelative(-129f, -39f)
                lineToRelative(-282f, -281f)
                verticalLineToRelative(-166f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                close()
            }
        }.build()
        
        return _Airplanemode_inactive!!
    }

private var _Airplanemode_inactive: ImageVector? = null

