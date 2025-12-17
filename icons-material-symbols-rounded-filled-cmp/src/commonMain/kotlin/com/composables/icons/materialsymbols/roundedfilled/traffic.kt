package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Traffic: ImageVector
    get() {
        if (_Traffic != null) return _Traffic!!
        
        _Traffic = ImageVector.Builder(
            name = "traffic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(0f, -180f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(0f, -180f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveTo(280f, 600f)
                verticalLineToRelative(-46f)
                quadToRelative(-41f, -11f, -72f, -40.5f)
                reflectiveQuadTo(166f, 443f)
                quadToRelative(-2f, -17f, 9f, -30f)
                reflectiveQuadToRelative(28f, -13f)
                horizontalLineToRelative(77f)
                verticalLineToRelative(-46f)
                quadToRelative(-41f, -11f, -72f, -40.5f)
                reflectiveQuadTo(166f, 243f)
                quadToRelative(-2f, -17f, 9f, -30f)
                reflectiveQuadToRelative(28f, -13f)
                horizontalLineToRelative(77f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 120f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 200f)
                horizontalLineToRelative(77f)
                quadToRelative(17f, 0f, 28f, 13f)
                reflectiveQuadToRelative(9f, 30f)
                quadToRelative(-11f, 41f, -42f, 70.5f)
                reflectiveQuadTo(680f, 354f)
                verticalLineToRelative(46f)
                horizontalLineToRelative(77f)
                quadToRelative(17f, 0f, 28f, 13f)
                reflectiveQuadToRelative(9f, 30f)
                quadToRelative(-11f, 41f, -42f, 70.5f)
                reflectiveQuadTo(680f, 554f)
                verticalLineToRelative(46f)
                horizontalLineToRelative(77f)
                quadToRelative(17f, 0f, 28f, 13f)
                reflectiveQuadToRelative(9f, 30f)
                quadToRelative(-11f, 41f, -42f, 70.5f)
                reflectiveQuadTo(680f, 754f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 760f)
                verticalLineToRelative(-6f)
                quadToRelative(-41f, -11f, -72f, -40.5f)
                reflectiveQuadTo(166f, 643f)
                quadToRelative(-2f, -17f, 9f, -30f)
                reflectiveQuadToRelative(28f, -13f)
                horizontalLineToRelative(77f)
                close()
            }
        }.build()
        
        return _Traffic!!
    }

private var _Traffic: ImageVector? = null

