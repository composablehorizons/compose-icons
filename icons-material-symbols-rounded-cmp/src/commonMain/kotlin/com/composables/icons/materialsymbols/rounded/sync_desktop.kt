package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sync_desktop: ImageVector
    get() {
        if (_Sync_desktop != null) return _Sync_desktop!!
        
        _Sync_desktop = ImageVector.Builder(
            name = "sync_desktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 680f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-20f, 80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(520f, 700f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(580f, 520f)
                horizontalLineToRelative(240f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 580f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 760f)
                horizontalLineTo(580f)
                close()
                moveTo(520f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineToRelative(360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 880f)
                horizontalLineTo(520f)
                close()
                moveToRelative(80f, -200f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(240f, 480f)
                quadToRelative(0f, 54f, 21.5f, 99.5f)
                reflectiveQuadTo(320f, 658f)
                verticalLineToRelative(-58f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 720f)
                horizontalLineToRelative(69f)
                quadToRelative(-51f, -44f, -80f, -106f)
                reflectiveQuadToRelative(-29f, -134f)
                quadToRelative(0f, -95f, 49.5f, -171f)
                reflectiveQuadTo(338f, 193f)
                quadToRelative(14f, -8f, 29f, -0.5f)
                reflectiveQuadToRelative(20f, 23.5f)
                quadToRelative(5f, 16f, -1.5f, 31f)
                reflectiveQuadTo(365f, 270f)
                quadToRelative(-56f, 31f, -90.5f, 86.5f)
                reflectiveQuadTo(240f, 480f)
                close()
                moveToRelative(400f, -178f)
                verticalLineToRelative(58f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 360f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 160f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 240f)
                horizontalLineToRelative(-69f)
                quadToRelative(33f, 29f, 57.5f, 66.5f)
                reflectiveQuadTo(786f, 388f)
                quadToRelative(5f, 16f, -4f, 29f)
                reflectiveQuadToRelative(-26f, 16f)
                quadToRelative(-17f, 3f, -30.5f, -6.5f)
                reflectiveQuadTo(706f, 401f)
                quadToRelative(-10f, -29f, -27f, -54f)
                reflectiveQuadToRelative(-39f, -45f)
                close()
            }
        }.build()
        
        return _Sync_desktop!!
    }

private var _Sync_desktop: ImageVector? = null

