package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Skip_next: ImageVector
    get() {
        if (_Skip_next != null) return _Skip_next!!
        
        _Skip_next = ImageVector.Builder(
            name = "skip_next",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(700f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(740f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(700f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(660f, 680f)
                close()
                moveToRelative(-440f, -35f)
                verticalLineToRelative(-330f)
                quadToRelative(0f, -18f, 12f, -29f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(5f, 0f, 11f, 1f)
                reflectiveQuadToRelative(11f, 5f)
                lineToRelative(248f, 166f)
                quadToRelative(9f, 6f, 13.5f, 14.5f)
                reflectiveQuadTo(548f, 480f)
                quadToRelative(0f, 10f, -4.5f, 18.5f)
                reflectiveQuadTo(530f, 513f)
                lineTo(282f, 679f)
                quadToRelative(-5f, 4f, -11f, 5f)
                reflectiveQuadToRelative(-11f, 1f)
                quadToRelative(-16f, 0f, -28f, -11f)
                reflectiveQuadToRelative(-12f, -29f)
                close()
            }
        }.build()
        
        return _Skip_next!!
    }

private var _Skip_next: ImageVector? = null

