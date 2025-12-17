package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Match_case_off: ImageVector
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
                moveTo(182f, 708f)
                quadToRelative(-19f, 0f, -29.5f, -15.5f)
                reflectiveQuadTo(149f, 660f)
                lineToRelative(109f, -290f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(506f, 618f)
                lineToRelative(16f, 43f)
                quadToRelative(7f, 17f, -3.5f, 32f)
                reflectiveQuadTo(490f, 708f)
                quadToRelative(-11f, 0f, -20.5f, -6.5f)
                reflectiveQuadTo(456f, 684f)
                lineToRelative(-31f, -88f)
                horizontalLineTo(247f)
                lineToRelative(-32f, 89f)
                quadToRelative(-4f, 11f, -13f, 17f)
                reflectiveQuadToRelative(-20f, 6f)
                close()
                moveToRelative(127f, -287f)
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
                quadToRelative(-16f, 0f, -29.5f, 5f)
                reflectiveQuadTo(630f, 473f)
                quadToRelative(-9f, 7f, -20.5f, 7f)
                reflectiveQuadToRelative(-20.5f, -8f)
                quadToRelative(-9f, -8f, -10f, -19.5f)
                reflectiveQuadToRelative(7f, -18.5f)
                quadToRelative(21f, -17f, 46f, -25.5f)
                reflectiveQuadToRelative(54f, -8.5f)
                quadToRelative(69f, 0f, 103f, 32.5f)
                reflectiveQuadToRelative(34f, 97.5f)
                verticalLineToRelative(131f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                lineToRelative(-44f, -44f)
                close()
            }
        }.build()
        
        return _Match_case_off!!
    }

private var _Match_case_off: ImageVector? = null

