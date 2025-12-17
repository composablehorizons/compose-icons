package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Edit_location: ImageVector
    get() {
        if (_Edit_location != null) return _Edit_location!!
        
        _Edit_location = ImageVector.Builder(
            name = "edit_location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(554f, 383f)
                lineToRelative(-57f, -57f)
                lineToRelative(-145f, 144f)
                quadToRelative(-6f, 6f, -9f, 13.5f)
                reflectiveQuadToRelative(-3f, 15.5f)
                verticalLineToRelative(21f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                horizontalLineToRelative(21f)
                quadToRelative(8f, 0f, 15.5f, -3f)
                reflectiveQuadToRelative(13.5f, -9f)
                lineToRelative(144f, -145f)
                close()
                moveToRelative(29f, -29f)
                lineToRelative(28f, -28f)
                quadToRelative(5f, -5f, 5f, -10.5f)
                reflectiveQuadToRelative(-5f, -10.5f)
                lineToRelative(-36f, -36f)
                quadToRelative(-5f, -5f, -10.5f, -5f)
                reflectiveQuadToRelative(-10.5f, 5f)
                lineToRelative(-28f, 28f)
                lineToRelative(57f, 57f)
                close()
                moveTo(480f, 774f)
                quadToRelative(122f, -112f, 181f, -203.5f)
                reflectiveQuadTo(720f, 408f)
                quadToRelative(0f, -109f, -69.5f, -178.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-101f, 0f, -170.5f, 69.5f)
                reflectiveQuadTo(240f, 408f)
                quadToRelative(0f, 71f, 59f, 162.5f)
                reflectiveQuadTo(480f, 774f)
                close()
                moveToRelative(0f, 79f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -15f)
                quadToRelative(-65f, -60f, -115f, -117f)
                reflectiveQuadToRelative(-83.5f, -110.5f)
                quadToRelative(-33.5f, -53.5f, -51f, -103f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(800f, 408f)
                quadToRelative(0f, 45f, -17.5f, 94.5f)
                reflectiveQuadToRelative(-51f, 103f)
                quadTo(698f, 659f, 648f, 716f)
                reflectiveQuadTo(533f, 833f)
                quadToRelative(-11f, 10f, -25f, 15f)
                reflectiveQuadToRelative(-28f, 5f)
                close()
                moveToRelative(0f, -453f)
                close()
            }
        }.build()
        
        return _Edit_location!!
    }

private var _Edit_location: ImageVector? = null

