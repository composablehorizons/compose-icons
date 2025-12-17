package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Chef_hat: ImageVector
    get() {
        if (_Chef_hat != null) return _Chef_hat!!
        
        _Chef_hat = ImageVector.Builder(
            name = "chef_hat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 560f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 520f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 400f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 560f)
                close()
                moveToRelative(-200f, 80f)
                verticalLineToRelative(-140f)
                quadToRelative(-46f, -23f, -73f, -66.5f)
                reflectiveQuadTo(100f, 339f)
                quadToRelative(0f, -75f, 51.5f, -127f)
                reflectiveQuadTo(278f, 160f)
                quadToRelative(12f, 0f, 24.5f, 2f)
                reflectiveQuadToRelative(24.5f, 5f)
                quadToRelative(25f, -41f, 65f, -64f)
                reflectiveQuadToRelative(88f, -23f)
                quadToRelative(48f, 0f, 88f, 23f)
                reflectiveQuadToRelative(65f, 64f)
                quadToRelative(12f, -3f, 24f, -5f)
                reflectiveQuadToRelative(25f, -2f)
                quadToRelative(75f, 0f, 126.5f, 52f)
                reflectiveQuadTo(860f, 339f)
                quadToRelative(0f, 51f, -27f, 94.5f)
                reflectiveQuadTo(760f, 500f)
                verticalLineToRelative(140f)
                horizontalLineTo(200f)
                close()
                moveToRelative(360f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 520f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 400f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 560f)
                close()
                moveTo(280f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Chef_hat!!
    }

private var _Chef_hat: ImageVector? = null

