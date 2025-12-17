package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Air_purifier: ImageVector
    get() {
        if (_Air_purifier != null) return _Air_purifier!!
        
        _Air_purifier = ImageVector.Builder(
            name = "air_purifier",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(280f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 320f)
                quadToRelative(-16f, 0f, -28f, -12.5f)
                reflectiveQuadTo(640f, 280f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(560f, 200f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 280f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 680f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 720f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                close()
                moveToRelative(300f, -120f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(420f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(500f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(420f, 560f)
                close()
                moveToRelative(465f, -200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(845f, 400f)
                quadToRelative(-10f, 0f, -17f, 4.5f)
                reflectiveQuadTo(816f, 418f)
                quadToRelative(-15f, 29f, -41.5f, 45.5f)
                reflectiveQuadTo(716f, 480f)
                quadToRelative(-17f, 0f, -29f, -11.5f)
                reflectiveQuadTo(675f, 440f)
                quadToRelative(0f, -17f, 12f, -28.5f)
                reflectiveQuadToRelative(29f, -11.5f)
                quadToRelative(9f, 0f, 16f, -4.5f)
                reflectiveQuadToRelative(12f, -13.5f)
                quadToRelative(15f, -29f, 42f, -45.5f)
                reflectiveQuadToRelative(59f, -16.5f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(885f, 360f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(0f, 17f, -12f, 28.5f)
                reflectiveQuadTo(844f, 560f)
                quadToRelative(-9f, 0f, -16f, 4.5f)
                reflectiveQuadTo(816f, 578f)
                quadToRelative(-15f, 29f, -41.5f, 45.5f)
                reflectiveQuadTo(716f, 640f)
                quadToRelative(-17f, 0f, -29f, -11.5f)
                reflectiveQuadTo(675f, 600f)
                quadToRelative(0f, -17f, 12f, -28.5f)
                reflectiveQuadToRelative(29f, -11.5f)
                quadToRelative(9f, 0f, 16f, -4.5f)
                reflectiveQuadToRelative(12f, -13.5f)
                quadToRelative(15f, -29f, 41.5f, -45.5f)
                reflectiveQuadTo(844f, 480f)
                quadToRelative(17f, 0f, 29f, 11.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                close()
                moveTo(640f, 760f)
                horizontalLineTo(200f)
                horizontalLineToRelative(440f)
                horizontalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                close()
            }
        }.build()
        
        return _Air_purifier!!
    }

private var _Air_purifier: ImageVector? = null

