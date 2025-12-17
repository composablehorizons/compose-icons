package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Edit_square: ImageVector
    get() {
        if (_Edit_square != null) return _Edit_square!!
        
        _Edit_square = ImageVector.Builder(
            name = "edit_square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 560f)
                verticalLineToRelative(-97f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(344f, -344f)
                quadToRelative(12f, -12f, 27f, -18f)
                reflectiveQuadToRelative(30f, -6f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(26.5f, 18f)
                lineToRelative(56f, 57f)
                quadToRelative(11f, 12f, 17f, 26.5f)
                reflectiveQuadToRelative(6f, 29.5f)
                quadToRelative(0f, 15f, -5.5f, 29.5f)
                reflectiveQuadTo(897f, 232f)
                lineTo(553f, 576f)
                quadToRelative(-11f, 11f, -25.5f, 17.5f)
                reflectiveQuadTo(497f, 600f)
                horizontalLineToRelative(-97f)
                close()
                moveToRelative(384f, -368f)
                lineToRelative(57f, -56f)
                lineToRelative(-56f, -56f)
                lineToRelative(-57f, 56f)
                lineToRelative(56f, 56f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(260f)
                quadToRelative(14f, 0f, 23f, 7f)
                reflectiveQuadToRelative(14f, 18f)
                quadToRelative(5f, 11f, 3.5f, 22f)
                reflectiveQuadTo(489f, 188f)
                lineTo(303f, 374f)
                quadToRelative(-11f, 11f, -17f, 25.5f)
                reflectiveQuadToRelative(-6f, 30.5f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(360f, 680f)
                horizontalLineToRelative(169f)
                quadToRelative(16f, 0f, 30.5f, -6f)
                reflectiveQuadToRelative(25.5f, -17f)
                lineToRelative(187f, -187f)
                quadToRelative(10f, -10f, 21f, -11.5f)
                reflectiveQuadToRelative(22f, 3.5f)
                quadToRelative(11f, 5f, 18f, 14f)
                reflectiveQuadToRelative(7f, 23f)
                verticalLineToRelative(261f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Edit_square!!
    }

private var _Edit_square: ImageVector? = null

