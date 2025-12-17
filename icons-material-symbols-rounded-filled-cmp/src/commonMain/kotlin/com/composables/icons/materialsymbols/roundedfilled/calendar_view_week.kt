package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Calendar_view_week: ImageVector
    get() {
        if (_Calendar_view_week != null) return _Calendar_view_week!!
        
        _Calendar_view_week = ImageVector.Builder(
            name = "calendar_view_week",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(550f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(510f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(550f, 200f)
                horizontalLineToRelative(55f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(645f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(605f, 760f)
                horizontalLineToRelative(-55f)
                close()
                moveToRelative(-195f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(315f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(355f, 200f)
                horizontalLineToRelative(55f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(450f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(410f, 760f)
                horizontalLineToRelative(-55f)
                close()
                moveToRelative(-195f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(55f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(255f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(215f, 760f)
                horizontalLineToRelative(-55f)
                close()
                moveToRelative(585f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(705f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(745f, 200f)
                horizontalLineToRelative(55f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineToRelative(-55f)
                close()
            }
        }.build()
        
        return _Calendar_view_week!!
    }

private var _Calendar_view_week: ImageVector? = null

