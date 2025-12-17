package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Interests: ImageVector
    get() {
        if (_Interests != null) return _Interests!!
        
        _Interests = ImageVector.Builder(
            name = "interests",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 440f)
                lineToRelative(200f, -360f)
                lineToRelative(200f, 360f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, 400f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -67f, 47f, -113.5f)
                reflectiveQuadTo(280f, 520f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(360f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(280f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 760f)
                close()
                moveToRelative(-64f, -400f)
                horizontalLineToRelative(128f)
                lineToRelative(-64f, -115f)
                lineToRelative(-64f, 115f)
                close()
                moveToRelative(304f, 480f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(80f, -320f)
                quadToRelative(-57f, -48f, -95.5f, -81f)
                reflectiveQuadTo(523f, 301f)
                quadToRelative(-23f, -25f, -33f, -47f)
                reflectiveQuadToRelative(-10f, -47f)
                quadToRelative(0f, -45f, 31.5f, -76f)
                reflectiveQuadToRelative(78.5f, -31f)
                quadToRelative(27f, 0f, 50.5f, 12.5f)
                reflectiveQuadTo(680f, 147f)
                quadToRelative(16f, -22f, 39.5f, -34.5f)
                reflectiveQuadTo(770f, 100f)
                quadToRelative(47f, 0f, 78.5f, 31f)
                reflectiveQuadToRelative(31.5f, 76f)
                quadToRelative(0f, 25f, -10f, 47f)
                reflectiveQuadToRelative(-33f, 47f)
                quadToRelative(-23f, 25f, -61.5f, 58f)
                reflectiveQuadTo(680f, 440f)
                close()
                moveToRelative(0f, -105f)
                quadToRelative(72f, -60f, 96f, -85f)
                reflectiveQuadToRelative(24f, -41f)
                quadToRelative(0f, -13f, -7.5f, -21f)
                reflectiveQuadToRelative(-20.5f, -8f)
                quadToRelative(-10f, 0f, -19.5f, 5.5f)
                reflectiveQuadTo(729f, 205f)
                lineToRelative(-49f, 47f)
                lineToRelative(-49f, -47f)
                quadToRelative(-14f, -14f, -23.5f, -19.5f)
                reflectiveQuadTo(588f, 180f)
                quadToRelative(-13f, 0f, -20.5f, 8f)
                reflectiveQuadToRelative(-7.5f, 21f)
                quadToRelative(0f, 16f, 24f, 41f)
                reflectiveQuadToRelative(96f, 85f)
                close()
                moveToRelative(0f, -78f)
                close()
                moveToRelative(-400f, 45f)
                close()
                moveToRelative(0f, 378f)
                close()
                moveToRelative(400f, 0f)
                close()
            }
        }.build()
        
        return _Interests!!
    }

private var _Interests: ImageVector? = null

