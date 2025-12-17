package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Local_library: ImageVector
    get() {
        if (_Local_library != null) return _Local_library!!
        
        _Local_library = ImageVector.Builder(
            name = "local_library",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 900f)
                quadToRelative(-72f, -68f, -165f, -104f)
                reflectiveQuadToRelative(-195f, -36f)
                verticalLineToRelative(-440f)
                quadToRelative(101f, 0f, 194f, 36.5f)
                reflectiveQuadTo(480f, 462f)
                quadToRelative(73f, -69f, 166f, -105.5f)
                reflectiveQuadTo(840f, 320f)
                verticalLineToRelative(440f)
                quadToRelative(-103f, 0f, -195.5f, 36f)
                reflectiveQuadTo(480f, 900f)
                close()
                moveToRelative(0f, -540f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
            }
        }.build()
        
        return _Local_library!!
    }

private var _Local_library: ImageVector? = null

