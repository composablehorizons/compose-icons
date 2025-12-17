package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Reset_exposure: ImageVector
    get() {
        if (_Reset_exposure != null) return _Reset_exposure!!
        
        _Reset_exposure = ImageVector.Builder(
            name = "reset_exposure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(94f)
                quadToRelative(-62f, -50f, -98f, -122.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(129f, 0f, 226.5f, 79.5f)
                reflectiveQuadTo(831f, 400f)
                horizontalLineToRelative(-83f)
                quadToRelative(-26f, -88f, -99f, -144f)
                reflectiveQuadToRelative(-169f, -56f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 72f, 32.5f, 132f)
                reflectiveQuadToRelative(87.5f, 98f)
                verticalLineToRelative(-110f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
                moveToRelative(380f, 40f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(480f, 820f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(540f, 480f)
                horizontalLineToRelative(280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 540f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 880f)
                horizontalLineTo(540f)
                close()
                moveToRelative(20f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                lineTo(560f, 800f)
                close()
            }
        }.build()
        
        return _Reset_exposure!!
    }

private var _Reset_exposure: ImageVector? = null

