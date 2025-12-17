package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Source_notes: ImageVector
    get() {
        if (_Source_notes != null) return _Source_notes!!
        
        _Source_notes = ImageVector.Builder(
            name = "source_notes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 360f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-73f, 0f, -127.5f, -45.5f)
                reflectiveQuadTo(524f, 760f)
                horizontalLineToRelative(62f)
                quadToRelative(13f, 44f, 49.5f, 72f)
                reflectiveQuadToRelative(84.5f, 28f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-29f, 0f, -54f, 10.5f)
                reflectiveQuadTo(622f, 620f)
                horizontalLineToRelative(58f)
                verticalLineToRelative(60f)
                horizontalLineTo(520f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(57f)
                quadToRelative(27f, -26f, 63f, -41.5f)
                reflectiveQuadToRelative(77f, -15.5f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(-297f, -80f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(223f)
                quadToRelative(-29f, -11f, -59f, -17f)
                reflectiveQuadToRelative(-61f, -6f)
                quadToRelative(-42f, 0f, -81f, 10.5f)
                reflectiveQuadTo(565f, 440f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(190f)
                quadToRelative(-14f, 18f, -26f, 38f)
                reflectiveQuadToRelative(-21f, 42f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(122f)
                quadToRelative(-2f, 10f, -2f, 19.5f)
                verticalLineToRelative(20.5f)
                quadToRelative(0f, 31f, 6f, 61f)
                reflectiveQuadToRelative(17f, 59f)
                close()
            }
        }.build()
        
        return _Source_notes!!
    }

private var _Source_notes: ImageVector? = null

