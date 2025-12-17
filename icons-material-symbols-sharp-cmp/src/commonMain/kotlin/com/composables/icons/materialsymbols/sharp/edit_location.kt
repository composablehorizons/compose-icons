package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Edit_location: ImageVector
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
                moveTo(340f, 540f)
                horizontalLineToRelative(58f)
                lineToRelative(156f, -157f)
                lineToRelative(-57f, -57f)
                lineToRelative(-157f, 156f)
                verticalLineToRelative(58f)
                close()
                moveToRelative(243f, -186f)
                lineToRelative(39f, -39f)
                lineToRelative(-57f, -57f)
                lineToRelative(-39f, 39f)
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
                moveToRelative(0f, 106f)
                quadTo(319f, 743f, 239.5f, 625.5f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(800f, 408f)
                quadToRelative(0f, 100f, -79.5f, 217.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -480f)
                close()
            }
        }.build()
        
        return _Edit_location!!
    }

private var _Edit_location: ImageVector? = null

