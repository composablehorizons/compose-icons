package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Add_location_alt: ImageVector
    get() {
        if (_Add_location_alt != null) return _Add_location_alt!!
        
        _Add_location_alt = ImageVector.Builder(
            name = "add_location_alt",
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
                horizontalLineToRelative(20f)
                quadToRelative(10f, 0f, 20f, 2f)
                verticalLineToRelative(81f)
                quadToRelative(-10f, -2f, -19.5f, -2.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-101f, 0f, -170.5f, 69.5f)
                reflectiveQuadTo(240f, 408f)
                quadToRelative(0f, 71f, 59f, 162.5f)
                reflectiveQuadTo(480f, 774f)
                quadToRelative(122f, -112f, 181f, -203.5f)
                reflectiveQuadTo(720f, 408f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(8f)
                quadToRelative(0f, 100f, -79.5f, 217.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -400f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(240f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(800f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Add_location_alt!!
    }

private var _Add_location_alt: ImageVector? = null

