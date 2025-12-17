package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Reset_focus: ImageVector
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
                moveTo(540f, 540f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(510f, 640f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(480f, 610f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 480f)
                horizontalLineToRelative(90f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(640f, 510f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(610f, 540f)
                horizontalLineToRelative(-70f)
                close()
                moveToRelative(0f, 280f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(640f, 850f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(610f, 880f)
                horizontalLineToRelative(-90f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 840f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(510f, 720f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(540f, 750f)
                verticalLineToRelative(70f)
                close()
                moveToRelative(280f, -280f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(720f, 510f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(750f, 480f)
                horizontalLineToRelative(90f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 520f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(850f, 640f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(820f, 610f)
                verticalLineToRelative(-70f)
                close()
                moveToRelative(0f, 280f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(850f, 720f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(880f, 750f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                horizontalLineToRelative(-90f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(720f, 850f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(750f, 820f)
                horizontalLineToRelative(70f)
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
        
        return _Reset_focus!!
    }

private var _Reset_focus: ImageVector? = null

