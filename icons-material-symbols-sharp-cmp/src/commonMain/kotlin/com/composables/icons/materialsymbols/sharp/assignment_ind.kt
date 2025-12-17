package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Assignment_ind: ImageVector
    get() {
        if (_Assignment_ind != null) return _Assignment_ind!!
        
        _Assignment_ind = ImageVector.Builder(
            name = "assignment_ind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(248f)
                quadToRelative(14f, -36f, 44f, -58f)
                reflectiveQuadToRelative(68f, -22f)
                quadToRelative(38f, 0f, 68f, 22f)
                reflectiveQuadToRelative(44f, 58f)
                horizontalLineToRelative(248f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, -670f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(510f, 140f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(480f, 110f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(450f, 140f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(480f, 170f)
                close()
                moveTo(200f, 714f)
                quadToRelative(54f, -53f, 125.5f, -83.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(83f, 0f, 154.5f, 30.5f)
                reflectiveQuadTo(760f, 714f)
                verticalLineToRelative(-514f)
                horizontalLineTo(200f)
                verticalLineToRelative(514f)
                close()
                moveToRelative(280f, -194f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveTo(280f, 760f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-10f)
                quadToRelative(-42f, -35f, -93f, -52.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-56f, 0f, -107f, 17.5f)
                reflectiveQuadTo(280f, 750f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(200f, -320f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 380f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 380f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveToRelative(0f, 17f)
                close()
            }
        }.build()
        
        return _Assignment_ind!!
    }

private var _Assignment_ind: ImageVector? = null

