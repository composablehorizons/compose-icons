package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Reset_exposure: ImageVector
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
                moveTo(880f, 540f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 880f)
                horizontalLineTo(540f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(480f, 820f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(540f, 480f)
                horizontalLineToRelative(280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 540f)
                close()
                moveTo(560f, 800f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                lineTo(560f, 800f)
                close()
                moveToRelative(-80f, -600f)
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
                quadToRelative(113f, 0f, 203.5f, 63f)
                reflectiveQuadTo(814f, 345f)
                quadToRelative(6f, 16f, 0f, 31f)
                reflectiveQuadToRelative(-22f, 21f)
                quadToRelative(-16f, 6f, -31.5f, 0f)
                reflectiveQuadTo(739f, 375f)
                quadToRelative(-31f, -78f, -100.5f, -126.5f)
                reflectiveQuadTo(480f, 200f)
                close()
            }
        }.build()
        
        return _Reset_exposure!!
    }

private var _Reset_exposure: ImageVector? = null

