package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Edit_arrow_down: ImageVector
    get() {
        if (_Edit_arrow_down != null) return _Edit_arrow_down!!
        
        _Edit_arrow_down = ImageVector.Builder(
            name = "edit_arrow_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -16f, 6.5f, -30.5f)
                reflectiveQuadTo(144f, 534f)
                lineToRelative(271f, -271f)
                quadToRelative(24f, -24f, 57.5f, -23f)
                reflectiveQuadToRelative(56.5f, 25f)
                lineToRelative(48f, 50f)
                quadToRelative(23f, 23f, 22.5f, 56f)
                reflectiveQuadTo(576f, 427f)
                lineTo(306f, 697f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadToRelative(-30.5f, 6f)
                horizontalLineToRelative(-90f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(50f)
                lineToRelative(162f, -162f)
                lineToRelative(-25f, -25f)
                lineToRelative(-25f, -25f)
                lineToRelative(-162f, 162f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(269f, -219f)
                lineToRelative(-50f, -50f)
                lineToRelative(50f, 50f)
                close()
                moveToRelative(283f, 351f)
                lineToRelative(-92f, -92f)
                quadToRelative(-11f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(12f, -27.5f)
                quadToRelative(12f, -11f, 28.5f, -11.5f)
                reflectiveQuadTo(717f, 624f)
                lineToRelative(23f, 23f)
                verticalLineToRelative(-447f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(780f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(820f, 200f)
                verticalLineToRelative(448f)
                lineToRelative(24f, -24f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-92f, 92f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
            }
        }.build()
        
        return _Edit_arrow_down!!
    }

private var _Edit_arrow_down: ImageVector? = null

