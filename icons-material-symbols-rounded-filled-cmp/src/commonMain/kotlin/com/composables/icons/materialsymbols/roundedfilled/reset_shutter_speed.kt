package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Reset_shutter_speed: ImageVector
    get() {
        if (_Reset_shutter_speed != null) return _Reset_shutter_speed!!
        
        _Reset_shutter_speed = ImageVector.Builder(
            name = "reset_shutter_speed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(0f, -45f, 18.5f, -83f)
                reflectiveQuadToRelative(49.5f, -66f)
                lineToRelative(86f, 149f)
                horizontalLineTo(480f)
                close()
                moveToRelative(100f, 172f)
                quadToRelative(-37f, -21f, -62f, -55f)
                reflectiveQuadToRelative(-34f, -77f)
                horizontalLineToRelative(173f)
                lineToRelative(-77f, 132f)
                close()
                moveToRelative(77f, -212f)
                lineToRelative(-77f, -132f)
                quadToRelative(23f, -13f, 48f, -20.5f)
                reflectiveQuadToRelative(52f, -7.5f)
                quadToRelative(17f, 0f, 32.5f, 3f)
                reflectiveQuadToRelative(30.5f, 8f)
                lineToRelative(-86f, 149f)
                close()
                moveToRelative(23f, 240f)
                quadToRelative(-17f, 0f, -32.5f, -3f)
                reflectiveQuadTo(617f, 869f)
                lineToRelative(86f, -149f)
                lineToRelative(77f, 132f)
                quadToRelative(-23f, 13f, -48f, 20.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(23f, -240f)
                lineToRelative(77f, -132f)
                quadToRelative(37f, 21f, 62f, 55f)
                reflectiveQuadToRelative(34f, 77f)
                horizontalLineTo(703f)
                close()
                moveToRelative(109f, 189f)
                lineToRelative(-86f, -149f)
                horizontalLineToRelative(154f)
                quadToRelative(0f, 45f, -18f, 83f)
                reflectiveQuadToRelative(-50f, 66f)
                close()
                moveTo(480f, 200f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 72f, 32.5f, 132f)
                reflectiveQuadToRelative(87.5f, 98f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 760f)
                horizontalLineToRelative(54f)
                quadToRelative(-62f, -50f, -98f, -122.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(65f, 0f, 139f, 38f)
                reflectiveQuadToRelative(195f, 187f)
                quadToRelative(11f, 13f, 3.5f, 28.5f)
                reflectiveQuadTo(792f, 397f)
                quadToRelative(-16f, 7f, -32f, 0.5f)
                reflectiveQuadTo(739f, 375f)
                quadToRelative(-20f, -68f, -91.5f, -121.5f)
                reflectiveQuadTo(480f, 200f)
                close()
            }
        }.build()
        
        return _Reset_shutter_speed!!
    }

private var _Reset_shutter_speed: ImageVector? = null

