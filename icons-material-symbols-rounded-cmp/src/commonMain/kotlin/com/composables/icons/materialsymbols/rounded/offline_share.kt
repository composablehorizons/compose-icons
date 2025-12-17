package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Offline_share: ImageVector
    get() {
        if (_Offline_share != null) return _Offline_share!!
        
        _Offline_share = ImageVector.Builder(
            name = "offline_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 840f)
                verticalLineToRelative(-600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 240f)
                verticalLineToRelative(600f)
                horizontalLineToRelative(360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineTo(240f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 680f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 40f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 120f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 760f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-320f)
                horizontalLineTo(400f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(166f, -150f)
                horizontalLineToRelative(-66f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(470f, 480f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(440f, 450f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 350f)
                horizontalLineToRelative(86f)
                lineToRelative(-7f, -7f)
                quadToRelative(-9f, -9f, -9f, -21f)
                reflectiveQuadToRelative(9f, -21f)
                quadToRelative(9f, -9f, 21f, -9f)
                reflectiveQuadToRelative(21f, 9f)
                lineToRelative(65f, 65f)
                quadToRelative(6f, 6f, 6f, 14f)
                reflectiveQuadToRelative(-6f, 14f)
                lineToRelative(-65f, 65f)
                quadToRelative(-9f, 9f, -21f, 9f)
                reflectiveQuadToRelative(-21f, -9f)
                quadToRelative(-9f, -9f, -9f, -21f)
                reflectiveQuadToRelative(9f, -21f)
                lineToRelative(7f, -7f)
                close()
                moveTo(400f, 160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                horizontalLineTo(400f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 480f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Offline_share!!
    }

private var _Offline_share: ImageVector? = null

