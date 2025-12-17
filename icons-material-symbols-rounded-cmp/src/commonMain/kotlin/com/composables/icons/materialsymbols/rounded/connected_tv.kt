package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Connected_tv: ImageVector
    get() {
        if (_Connected_tv != null) return _Connected_tv!!
        
        _Connected_tv = ImageVector.Builder(
            name = "connected_tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineTo(640f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(80f, -40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(280f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(240f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 640f)
                close()
                moveToRelative(251f, 0f)
                quadToRelative(12f, 0f, 20.5f, -8.5f)
                reflectiveQuadTo(520f, 611f)
                quadToRelative(0f, -121f, -85f, -206f)
                reflectiveQuadToRelative(-206f, -85f)
                quadToRelative(-12f, 0f, -20.5f, 8.5f)
                reflectiveQuadTo(200f, 349f)
                quadToRelative(0f, 12f, 8.5f, 20.5f)
                reflectiveQuadTo(229f, 378f)
                quadToRelative(97f, 0f, 165f, 68f)
                reflectiveQuadToRelative(68f, 165f)
                quadToRelative(0f, 12f, 8.5f, 20.5f)
                reflectiveQuadTo(491f, 640f)
                close()
                moveToRelative(-120f, 0f)
                quadToRelative(12f, 0f, 20.5f, -8.5f)
                reflectiveQuadTo(400f, 611f)
                quadToRelative(0f, -71f, -50f, -121f)
                reflectiveQuadToRelative(-121f, -50f)
                quadToRelative(-12f, 0f, -20.5f, 8.5f)
                reflectiveQuadTo(200f, 469f)
                quadToRelative(0f, 12f, 8.5f, 20.5f)
                reflectiveQuadTo(229f, 498f)
                quadToRelative(47f, 0f, 80f, 33f)
                reflectiveQuadToRelative(33f, 80f)
                quadToRelative(0f, 12f, 8.5f, 20.5f)
                reflectiveQuadTo(371f, 640f)
                close()
            }
        }.build()
        
        return _Connected_tv!!
    }

private var _Connected_tv: ImageVector? = null

