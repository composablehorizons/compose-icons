package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Edit_location_alt: ImageVector
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
                lineTo(360f, 323f)
                verticalLineToRelative(197f)
                horizontalLineToRelative(197f)
                lineToRelative(225f, -225f)
                quadToRelative(9f, 26f, 13.5f, 54f)
                reflectiveQuadToRelative(4.5f, 59f)
                quadToRelative(0f, 100f, -79.5f, 217.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-40f, -440f)
                verticalLineToRelative(-84f)
                lineToRelative(248f, -248f)
                lineToRelative(84f, 84f)
                lineToRelative(-248f, 248f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(360f, -276f)
                lineToRelative(-84f, -84f)
                lineToRelative(28f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(28f, 28f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-28f, 28f)
                close()
            }
        }.build()
        
        return _Edit_location_alt!!
    }

private var _Edit_location_alt: ImageVector? = null

