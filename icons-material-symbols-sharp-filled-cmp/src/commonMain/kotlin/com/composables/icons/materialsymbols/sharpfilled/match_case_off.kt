package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Match_case_off: ImageVector
    get() {
        if (_Match_case_off != null) return _Match_case_off!!
        
        _Match_case_off = ImageVector.Builder(
            name = "match_case_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(131f, 708f)
                lineToRelative(127f, -338f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                lineToRelative(-286f, -286f)
                lineToRelative(34f, 90f)
                horizontalLineToRelative(-76f)
                lineToRelative(-39f, -112f)
                horizontalLineTo(247f)
                lineToRelative(-40f, 112f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(178f, -287f)
                lineToRelative(-39f, 111f)
                horizontalLineToRelative(131f)
                lineToRelative(-10f, -29f)
                lineToRelative(-82f, -82f)
                close()
                moveToRelative(436f, 210f)
                quadToRelative(8f, -10f, 12f, -22f)
                reflectiveQuadToRelative(4f, -25f)
                quadToRelative(-14f, -8f, -33.5f, -12.5f)
                reflectiveQuadTo(689f, 567f)
                horizontalLineToRelative(-8f)
                lineToRelative(-45f, -45f)
                quadToRelative(10f, -2f, 20f, -3.5f)
                reflectiveQuadToRelative(21f, -1.5f)
                quadToRelative(23f, 0f, 45f, 4f)
                reflectiveQuadToRelative(38f, 11f)
                verticalLineToRelative(-12f)
                quadToRelative(0f, -29f, -20.5f, -47f)
                reflectiveQuadTo(685f, 455f)
                quadToRelative(-23f, 0f, -42f, 9.5f)
                reflectiveQuadTo(610f, 492f)
                lineToRelative(-43f, -39f)
                quadToRelative(23f, -27f, 52.5f, -40f)
                reflectiveQuadToRelative(66.5f, -13f)
                quadToRelative(69f, 0f, 103f, 32.5f)
                reflectiveQuadToRelative(34f, 97.5f)
                verticalLineToRelative(179f)
                lineToRelative(-78f, -78f)
                close()
            }
        }.build()
        
        return _Match_case_off!!
    }

private var _Match_case_off: ImageVector? = null

