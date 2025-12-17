package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Local_parking: ImageVector
    get() {
        if (_Local_parking != null) return _Local_parking!!
        
        _Local_parking = ImageVector.Builder(
            name = "local_parking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(280f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                horizontalLineTo(400f)
                verticalLineToRelative(240f)
                horizontalLineTo(240f)
                close()
                moveToRelative(160f, -400f)
                horizontalLineToRelative(128f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(608f, 360f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(528f, 280f)
                horizontalLineTo(400f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Local_parking!!
    }

private var _Local_parking: ImageVector? = null

