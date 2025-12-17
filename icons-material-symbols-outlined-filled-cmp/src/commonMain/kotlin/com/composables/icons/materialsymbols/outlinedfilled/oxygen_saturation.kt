package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Oxygen_saturation: ImageVector
    get() {
        if (_Oxygen_saturation != null) return _Oxygen_saturation!!
        
        _Oxygen_saturation = ImageVector.Builder(
            name = "oxygen_saturation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 520f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineToRelative(-93f)
                quadToRelative(11f, -11f, 19.5f, -24.5f)
                reflectiveQuadTo(620f, 467f)
                quadToRelative(4f, -12f, 14.5f, -19.5f)
                reflectiveQuadTo(658f, 440f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-22f)
                quadToRelative(-39f, 0f, -70.5f, 22.5f)
                reflectiveQuadTo(544f, 442f)
                quadToRelative(-5f, 17f, -20f, 27.5f)
                reflectiveQuadTo(491f, 480f)
                horizontalLineToRelative(-22f)
                quadToRelative(-18f, 0f, -33f, -10.5f)
                reflectiveQuadTo(416f, 442f)
                quadToRelative(-12f, -37f, -43.5f, -59.5f)
                reflectiveQuadTo(302f, 360f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(22f)
                quadToRelative(13f, 0f, 23f, 7.5f)
                reflectiveQuadToRelative(15f, 19.5f)
                quadToRelative(5f, 15f, 13.5f, 28.5f)
                reflectiveQuadTo(373f, 520f)
                horizontalLineToRelative(-93f)
                close()
                moveToRelative(40f, 360f)
                quadToRelative(-21f, 0f, -39.5f, -10.5f)
                reflectiveQuadTo(251f, 840f)
                horizontalLineToRelative(-91f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 760f)
                horizontalLineToRelative(91f)
                quadToRelative(11f, -19f, 29.5f, -29.5f)
                reflectiveQuadTo(320f, 720f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 680f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 680f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                quadToRelative(21f, 0f, 39.5f, 10.5f)
                reflectiveQuadTo(709f, 760f)
                horizontalLineToRelative(91f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineToRelative(-91f)
                quadToRelative(-11f, 19f, -29.5f, 29.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Oxygen_saturation!!
    }

private var _Oxygen_saturation: ImageVector? = null

