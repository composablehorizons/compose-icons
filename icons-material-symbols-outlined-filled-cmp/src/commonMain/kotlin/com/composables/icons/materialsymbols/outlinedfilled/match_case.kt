package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Match_case: ImageVector
    get() {
        if (_Match_case != null) return _Match_case!!
        
        _Match_case = ImageVector.Builder(
            name = "match_case",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(131f, 708f)
                lineToRelative(165f, -440f)
                horizontalLineToRelative(79f)
                lineToRelative(165f, 440f)
                horizontalLineToRelative(-76f)
                lineToRelative(-39f, -112f)
                horizontalLineTo(247f)
                lineToRelative(-40f, 112f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(139f, -176f)
                horizontalLineToRelative(131f)
                lineToRelative(-64f, -182f)
                horizontalLineToRelative(-4f)
                lineToRelative(-63f, 182f)
                close()
                moveToRelative(395f, 186f)
                quadToRelative(-51f, 0f, -81f, -27.5f)
                reflectiveQuadTo(554f, 618f)
                quadToRelative(0f, -44f, 34.5f, -72.5f)
                reflectiveQuadTo(677f, 517f)
                quadToRelative(23f, 0f, 45f, 4f)
                reflectiveQuadToRelative(38f, 11f)
                verticalLineToRelative(-12f)
                quadToRelative(0f, -29f, -20.5f, -47f)
                reflectiveQuadTo(685f, 455f)
                quadToRelative(-23f, 0f, -42f, 9.5f)
                reflectiveQuadTo(610f, 492f)
                lineToRelative(-47f, -35f)
                quadToRelative(24f, -29f, 54.5f, -43f)
                reflectiveQuadToRelative(68.5f, -14f)
                quadToRelative(69f, 0f, 103f, 32.5f)
                reflectiveQuadToRelative(34f, 97.5f)
                verticalLineToRelative(178f)
                horizontalLineToRelative(-63f)
                verticalLineToRelative(-37f)
                horizontalLineToRelative(-4f)
                quadToRelative(-14f, 23f, -38f, 35f)
                reflectiveQuadToRelative(-53f, 12f)
                close()
                moveToRelative(12f, -54f)
                quadToRelative(35f, 0f, 59.5f, -24f)
                reflectiveQuadToRelative(24.5f, -56f)
                quadToRelative(-14f, -8f, -33.5f, -12.5f)
                reflectiveQuadTo(689f, 567f)
                quadToRelative(-32f, 0f, -50f, 14f)
                reflectiveQuadToRelative(-18f, 37f)
                quadToRelative(0f, 20f, 16f, 33f)
                reflectiveQuadToRelative(40f, 13f)
                close()
            }
        }.build()
        
        return _Match_case!!
    }

private var _Match_case: ImageVector? = null

