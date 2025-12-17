package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.`6k`: ImageVector
    get() {
        if (_6k != null) return _6k!!
        
        _6k = ImageVector.Builder(
            name = "6k",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 510f)
                lineToRelative(62f, 79f)
                quadToRelative(2f, 3f, 22f, 11f)
                quadToRelative(17f, 0f, 25f, -15.5f)
                reflectiveQuadToRelative(-3f, -29.5f)
                lineToRelative(-56f, -75f)
                lineToRelative(57f, -76f)
                quadToRelative(11f, -14f, 3f, -29f)
                reflectiveQuadToRelative(-26f, -15f)
                quadToRelative(-7f, 0f, -12.5f, 3f)
                reflectiveQuadToRelative(-9.5f, 8f)
                lineToRelative(-62f, 79f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(550f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(520f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(550f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(580f, 570f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(-280f, 90f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 560f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 460f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(90f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 390f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 360f)
                horizontalLineTo(300f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(260f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(300f, 600f)
                close()
                moveToRelative(20f, -40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _6k!!
    }

private var _6k: ImageVector? = null

