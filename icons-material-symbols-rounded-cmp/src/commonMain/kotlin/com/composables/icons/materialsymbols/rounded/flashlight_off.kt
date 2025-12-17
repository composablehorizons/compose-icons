package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Flashlight_off: ImageVector
    get() {
        if (_Flashlight_off != null) return _Flashlight_off!!
        
        _Flashlight_off = ImageVector.Builder(
            name = "flashlight_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(764f, 876f)
                lineTo(640f, 752f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(400f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-368f)
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
                close()
                moveToRelative(-364f, -76f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-128f)
                lineTo(400f, 512f)
                verticalLineToRelative(288f)
                close()
                moveToRelative(320f, -640f)
                verticalLineToRelative(136f)
                quadToRelative(0f, 12f, -3f, 23f)
                reflectiveQuadToRelative(-10f, 21f)
                lineToRelative(-74f, 113f)
                quadToRelative(-11f, 17f, -26.5f, 18f)
                reflectiveQuadToRelative(-28.5f, -7f)
                quadToRelative(-13f, -8f, -17.5f, -23f)
                reflectiveQuadToRelative(6.5f, -32f)
                lineToRelative(73f, -113f)
                verticalLineToRelative(-16f)
                horizontalLineTo(410f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(371f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(411f, 200f)
                horizontalLineToRelative(229f)
                verticalLineToRelative(-40f)
                horizontalLineTo(289f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(250f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(290f, 80f)
                horizontalLineToRelative(350f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 160f)
                close()
                moveTo(480f, 592f)
                close()
                moveToRelative(-70f, -312f)
                close()
            }
        }.build()
        
        return _Flashlight_off!!
    }

private var _Flashlight_off: ImageVector? = null

