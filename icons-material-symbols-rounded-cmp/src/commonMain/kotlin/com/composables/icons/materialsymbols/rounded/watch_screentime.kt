package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Watch_screentime: ImageVector
    get() {
        if (_Watch_screentime != null) return _Watch_screentime!!
        
        _Watch_screentime = ImageVector.Builder(
            name = "watch_screentime",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(390f, 560f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(360f, 530f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(390f, 400f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(420f, 430f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(390f, 560f)
                close()
                moveToRelative(90f, 0f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(450f, 530f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(510f, 470f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(90f, 0f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(540f, 530f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(570f, 480f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(600f, 510f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(570f, 560f)
                close()
                moveTo(420f, 880f)
                quadToRelative(-26f, 0f, -47.5f, -15.5f)
                reflectiveQuadTo(343f, 823f)
                lineToRelative(-37f, -125f)
                quadToRelative(-48f, -38f, -77f, -95f)
                reflectiveQuadToRelative(-29f, -123f)
                quadToRelative(0f, -66f, 29f, -123f)
                reflectiveQuadToRelative(77f, -95f)
                lineToRelative(37f, -125f)
                quadToRelative(8f, -26f, 29.5f, -41.5f)
                reflectiveQuadTo(420f, 80f)
                horizontalLineToRelative(120f)
                quadToRelative(26f, 0f, 47.5f, 15.5f)
                reflectiveQuadTo(617f, 137f)
                lineToRelative(37f, 125f)
                quadToRelative(48f, 38f, 77f, 95f)
                reflectiveQuadToRelative(29f, 123f)
                quadToRelative(0f, 66f, -29f, 123f)
                reflectiveQuadToRelative(-77f, 95f)
                lineToRelative(-37f, 125f)
                quadToRelative(-8f, 26f, -29.5f, 41.5f)
                reflectiveQuadTo(540f, 880f)
                horizontalLineTo(420f)
                close()
                moveToRelative(60f, -200f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-76f, -470f)
                quadToRelative(20f, -5f, 38.5f, -8f)
                reflectiveQuadToRelative(37.5f, -3f)
                quadToRelative(19f, 0f, 37.5f, 3f)
                reflectiveQuadToRelative(38.5f, 8f)
                lineToRelative(-16f, -50f)
                horizontalLineTo(420f)
                lineToRelative(-16f, 50f)
                close()
                moveToRelative(16f, 590f)
                horizontalLineToRelative(120f)
                lineToRelative(16f, -50f)
                quadToRelative(-20f, 5f, -38.5f, 7.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(-19f, 0f, -37.5f, -2.5f)
                reflectiveQuadTo(404f, 750f)
                lineToRelative(16f, 50f)
                close()
                moveToRelative(-16f, -640f)
                horizontalLineToRelative(152f)
                horizontalLineToRelative(-152f)
                close()
                moveToRelative(16f, 640f)
                horizontalLineToRelative(-16f)
                horizontalLineToRelative(152f)
                horizontalLineToRelative(-136f)
                close()
            }
        }.build()
        
        return _Watch_screentime!!
    }

private var _Watch_screentime: ImageVector? = null

