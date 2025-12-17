package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Front_hand: ImageVector
    get() {
        if (_Front_hand != null) return _Front_hand!!
        
        _Front_hand = ImageVector.Builder(
            name = "front_hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-160f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(500f, 920f)
                quadToRelative(-142f, 0f, -241f, -99f)
                reflectiveQuadToRelative(-99f, -241f)
                verticalLineToRelative(-420f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(420f)
                quadToRelative(0f, 109f, 75.5f, 184.5f)
                reflectiveQuadTo(500f, 840f)
                quadToRelative(109f, 0f, 184.5f, -75.5f)
                reflectiveQuadTo(760f, 580f)
                verticalLineToRelative(-140f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 480f)
                verticalLineToRelative(160f)
                horizontalLineTo(600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(520f, 720f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(247f)
                quadToRelative(10f, -3f, 19.5f, -5f)
                reflectiveQuadToRelative(20.5f, -2f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 142f, -99f, 241f)
                reflectiveQuadTo(500f, 920f)
                close()
                moveToRelative(40f, -320f)
                close()
            }
        }.build()
        
        return _Front_hand!!
    }

private var _Front_hand: ImageVector? = null

