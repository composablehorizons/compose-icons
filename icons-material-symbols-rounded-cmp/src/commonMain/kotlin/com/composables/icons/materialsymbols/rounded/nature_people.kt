package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nature_people: ImageVector
    get() {
        if (_Nature_people != null) return _Nature_people!!
        
        _Nature_people = ImageVector.Builder(
            name = "nature_people",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(180f, 440f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -26f, 17f, -43f)
                reflectiveQuadToRelative(43f, -17f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                close()
                moveToRelative(60f, 360f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-70f)
                quadToRelative(-71f, 0f, -120.5f, -49.5f)
                reflectiveQuadTo(320f, 430f)
                quadToRelative(0f, -53f, 28.5f, -94.5f)
                reflectiveQuadTo(422f, 274f)
                quadToRelative(11f, -65f, 60.5f, -109.5f)
                reflectiveQuadTo(600f, 120f)
                quadToRelative(68f, 0f, 117.5f, 44.5f)
                reflectiveQuadTo(778f, 274f)
                quadToRelative(45f, 20f, 73.5f, 61.5f)
                reflectiveQuadTo(880f, 430f)
                quadToRelative(0f, 71f, -49.5f, 120.5f)
                reflectiveQuadTo(710f, 600f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 840f)
                verticalLineToRelative(-160f)
                quadToRelative(-11f, -11f, -25.5f, -17.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 480f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 520f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 16f, -14.5f, 22.5f)
                reflectiveQuadTo(240f, 680f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(250f, -280f)
                horizontalLineToRelative(220f)
                quadToRelative(38f, 0f, 64f, -26f)
                reflectiveQuadToRelative(26f, -64f)
                quadToRelative(0f, -27f, -14.5f, -49f)
                reflectiveQuadTo(746f, 348f)
                lineToRelative(-42f, -18f)
                lineToRelative(-6f, -44f)
                quadToRelative(-6f, -37f, -33.5f, -61.5f)
                reflectiveQuadTo(600f, 200f)
                quadToRelative(-37f, 0f, -64.5f, 24.5f)
                reflectiveQuadTo(502f, 286f)
                lineToRelative(-6f, 44f)
                lineToRelative(-42f, 18f)
                quadToRelative(-25f, 11f, -39.5f, 33f)
                reflectiveQuadTo(400f, 430f)
                quadToRelative(0f, 38f, 26f, 64f)
                reflectiveQuadToRelative(64f, 26f)
                close()
                moveToRelative(110f, -160f)
                close()
            }
        }.build()
        
        return _Nature_people!!
    }

private var _Nature_people: ImageVector? = null

