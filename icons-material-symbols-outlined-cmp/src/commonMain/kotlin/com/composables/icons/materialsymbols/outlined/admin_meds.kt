package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Admin_meds: ImageVector
    get() {
        if (_Admin_meds != null) return _Admin_meds!!
        
        _Admin_meds = ImageVector.Builder(
            name = "admin_meds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(494f, 660f)
                quadToRelative(-40f, 40f, -97f, 40f)
                reflectiveQuadToRelative(-97f, -40f)
                quadToRelative(-40f, -40f, -40f, -96.5f)
                reflectiveQuadToRelative(40f, -96.5f)
                lineToRelative(166f, -167f)
                quadToRelative(40f, -40f, 97f, -40f)
                reflectiveQuadToRelative(97f, 40f)
                quadToRelative(40f, 40f, 40f, 96.5f)
                reflectiveQuadTo(660f, 493f)
                lineTo(494f, 660f)
                close()
                moveToRelative(-138f, -57f)
                quadToRelative(23f, 23f, 47.5f, 16.5f)
                reflectiveQuadTo(437f, 604f)
                lineToRelative(55f, -56f)
                lineToRelative(-80f, -80f)
                lineToRelative(-56f, 55f)
                quadToRelative(-17f, 17f, -17f, 40f)
                reflectiveQuadToRelative(17f, 40f)
                close()
                moveToRelative(248f, -246f)
                quadToRelative(-23f, -23f, -47.5f, -16.5f)
                reflectiveQuadTo(523f, 356f)
                lineToRelative(-55f, 56f)
                lineToRelative(80f, 80f)
                lineToRelative(56f, -55f)
                quadToRelative(17f, -17f, 17f, -40f)
                reflectiveQuadToRelative(-17f, -40f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(168f)
                quadToRelative(13f, -36f, 43.5f, -58f)
                reflectiveQuadToRelative(68.5f, -22f)
                quadToRelative(38f, 0f, 68.5f, 22f)
                reflectiveQuadToRelative(43.5f, 58f)
                horizontalLineToRelative(168f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(280f, -590f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(510f, 140f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(480f, 110f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(450f, 140f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(480f, 170f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Admin_meds!!
    }

private var _Admin_meds: ImageVector? = null

