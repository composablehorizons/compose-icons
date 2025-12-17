package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Follow_the_signs: ImageVector
    get() {
        if (_Follow_the_signs != null) return _Follow_the_signs!!
        
        _Follow_the_signs = ImageVector.Builder(
            name = "follow_the_signs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 220f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(300f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(380f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(460f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(380f, 220f)
                close()
                moveTo(120f, 920f)
                lineToRelative(110f, -564f)
                lineToRelative(-70f, 30f)
                verticalLineToRelative(134f)
                horizontalLineTo(80f)
                verticalLineToRelative(-188f)
                lineToRelative(210f, -86f)
                quadToRelative(27f, -11f, 55f, -2.5f)
                reflectiveQuadToRelative(43f, 34.5f)
                lineToRelative(38f, 64f)
                quadToRelative(27f, 44f, 72.5f, 71f)
                reflectiveQuadTo(600f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(-66f, 0f, -122.5f, -28f)
                reflectiveQuadTo(382f, 416f)
                lineToRelative(-24f, 120f)
                lineToRelative(82f, 82f)
                verticalLineToRelative(302f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                lineToRelative(-86f, -80f)
                lineToRelative(-70f, 320f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(550f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineTo(520f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(280f)
                horizontalLineTo(730f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(51f, -601f)
                lineToRelative(99f, -99f)
                lineToRelative(-99f, -99f)
                lineToRelative(-43f, 43f)
                lineToRelative(26f, 26f)
                horizontalLineTo(580f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(124f)
                lineToRelative(-26f, 26f)
                lineToRelative(43f, 43f)
                close()
            }
        }.build()
        
        return _Follow_the_signs!!
    }

private var _Follow_the_signs: ImageVector? = null

