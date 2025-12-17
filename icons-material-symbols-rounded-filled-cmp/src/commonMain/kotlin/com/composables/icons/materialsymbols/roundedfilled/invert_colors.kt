package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Invert_colors: ImageVector
    get() {
        if (_Invert_colors != null) return _Invert_colors!!
        
        _Invert_colors = ImageVector.Builder(
            name = "invert_colors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-133f, 0f, -226.5f, -92f)
                reflectiveQuadTo(160f, 525f)
                quadToRelative(0f, -66f, 25f, -122.5f)
                reflectiveQuadTo(254f, 302f)
                lineToRelative(184f, -181f)
                quadToRelative(9f, -8f, 20f, -12.5f)
                reflectiveQuadToRelative(22f, -4.5f)
                quadToRelative(11f, 0f, 22f, 4.5f)
                reflectiveQuadToRelative(20f, 12.5f)
                lineToRelative(184f, 181f)
                quadToRelative(44f, 44f, 69f, 100.5f)
                reflectiveQuadTo(800f, 525f)
                quadToRelative(0f, 131f, -93.5f, 223f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-568f)
                lineTo(310f, 360f)
                quadToRelative(-35f, 33f, -52.5f, 75f)
                reflectiveQuadTo(240f, 525f)
                quadToRelative(0f, 97f, 70f, 166f)
                reflectiveQuadToRelative(170f, 69f)
                close()
            }
        }.build()
        
        return _Invert_colors!!
    }

private var _Invert_colors: ImageVector? = null

