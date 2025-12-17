package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nature_people: ImageVector
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
                moveTo(120f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineTo(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
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
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Nature_people!!
    }

private var _Nature_people: ImageVector? = null

