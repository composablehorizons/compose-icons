package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Indeterminate_question_box: ImageVector
    get() {
        if (_Indeterminate_question_box != null) return _Indeterminate_question_box!!
        
        _Indeterminate_question_box = ImageVector.Builder(
            name = "indeterminate_question_box",
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
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(560f, 0f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                close()
                moveTo(120f, 200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                close()
                moveToRelative(720f, 0f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                close()
                moveTo(480f, 720f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(530f, 670f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(430f, 670f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(-36f, -153f)
                horizontalLineToRelative(73f)
                quadToRelative(0f, -34f, 8f, -52f)
                reflectiveQuadToRelative(35f, -45f)
                quadToRelative(35f, -35f, 46.5f, -56.5f)
                reflectiveQuadTo(618f, 362f)
                quadToRelative(0f, -54f, -39f, -88f)
                reflectiveQuadToRelative(-99f, -34f)
                quadToRelative(-50f, 0f, -86f, 26f)
                reflectiveQuadToRelative(-52f, 74f)
                lineToRelative(66f, 27f)
                quadToRelative(7f, -26f, 26.5f, -42.5f)
                reflectiveQuadTo(480f, 308f)
                quadToRelative(29f, 0f, 46.5f, 15.5f)
                reflectiveQuadTo(544f, 365f)
                quadToRelative(0f, 20f, -9.5f, 37.5f)
                reflectiveQuadTo(502f, 439f)
                quadToRelative(-33f, 29f, -45.5f, 56f)
                reflectiveQuadTo(444f, 567f)
                close()
            }
        }.build()
        
        return _Indeterminate_question_box!!
    }

private var _Indeterminate_question_box: ImageVector? = null

