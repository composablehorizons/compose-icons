package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Calendar_meal: ImageVector
    get() {
        if (_Calendar_meal != null) return _Calendar_meal!!
        
        _Calendar_meal = ImageVector.Builder(
            name = "calendar_meal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(140f, -409f)
                verticalLineToRelative(-131f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(143f)
                quadToRelative(0f, 27f, 17f, 48.5f)
                reflectiveQuadToRelative(43f, 28.5f)
                verticalLineToRelative(130f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(390f, 680f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(420f, 650f)
                verticalLineToRelative(-130f)
                quadToRelative(26f, -7f, 43f, -28.5f)
                reflectiveQuadToRelative(17f, -48.5f)
                verticalLineToRelative(-143f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(131f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-131f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(131f)
                horizontalLineToRelative(-30f)
                close()
                moveToRelative(260f, 89f)
                verticalLineToRelative(130f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(630f, 680f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(660f, 650f)
                verticalLineToRelative(-347f)
                quadToRelative(0f, -11f, -7.5f, -17f)
                reflectiveQuadToRelative(-19.5f, -6f)
                quadToRelative(-13f, 0f, -28.5f, 7f)
                reflectiveQuadTo(575f, 308f)
                quadToRelative(-17f, 17f, -26f, 38.5f)
                reflectiveQuadToRelative(-9f, 46.5f)
                verticalLineToRelative(87f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(580f, 520f)
                horizontalLineToRelative(20f)
                close()
            }
        }.build()
        
        return _Calendar_meal!!
    }

private var _Calendar_meal: ImageVector? = null

