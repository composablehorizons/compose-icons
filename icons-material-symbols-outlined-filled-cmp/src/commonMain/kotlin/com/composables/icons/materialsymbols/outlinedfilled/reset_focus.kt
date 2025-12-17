package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Reset_focus: ImageVector
    get() {
        if (_Reset_focus != null) return _Reset_focus!!
        
        _Reset_focus = ImageVector.Builder(
            name = "reset_focus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(540f, 480f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(60f)
                horizontalLineTo(540f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(60f, 240f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(480f, 820f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(60f)
                horizontalLineTo(540f)
                close()
                moveToRelative(280f, -240f)
                verticalLineToRelative(-100f)
                horizontalLineTo(720f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(100f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 540f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(720f, 880f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 880f)
                horizontalLineTo(720f)
                close()
                moveToRelative(111f, -480f)
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
                close()
            }
        }.build()
        
        return _Reset_focus!!
    }

private var _Reset_focus: ImageVector? = null

