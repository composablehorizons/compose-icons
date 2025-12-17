package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Edit_location_alt: ImageVector
    get() {
        if (_Edit_location_alt != null) return _Edit_location_alt!!
        
        _Edit_location_alt = ImageVector.Builder(
            name = "edit_location_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadTo(319f, 743f, 239.5f, 625.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(27f, 0f, 53.5f, 4.5f)
                reflectiveQuadTo(585f, 97f)
                lineToRelative(-65f, 66f)
                quadToRelative(-10f, -2f, -19.5f, -2.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-101f, 0f, -170.5f, 69.5f)
                reflectiveQuadTo(240f, 408f)
                quadToRelative(0f, 71f, 59f, 162.5f)
                reflectiveQuadTo(480f, 774f)
                quadToRelative(122f, -112f, 181f, -203.5f)
                reflectiveQuadTo(720f, 408f)
                quadToRelative(0f, -12f, -1f, -24f)
                reflectiveQuadToRelative(-3f, -23f)
                lineToRelative(66f, -66f)
                quadToRelative(9f, 26f, 13.5f, 54f)
                reflectiveQuadToRelative(4.5f, 59f)
                quadToRelative(0f, 100f, -79.5f, 217.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -472f)
                close()
                moveToRelative(254f, -254f)
                lineToRelative(-46f, -46f)
                lineToRelative(-248f, 248f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(84f)
                lineToRelative(248f, -248f)
                lineToRelative(-38f, -38f)
                close()
                moveToRelative(66f, 10f)
                lineToRelative(28f, -28f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                lineToRelative(-28f, -28f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineToRelative(-28f, 28f)
                lineToRelative(84f, 84f)
                close()
            }
        }.build()
        
        return _Edit_location_alt!!
    }

private var _Edit_location_alt: ImageVector? = null

