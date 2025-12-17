package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Token: ImageVector
    get() {
        if (_Token != null) return _Token!!
        
        _Token = ImageVector.Builder(
            name = "token",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(120f, 680f)
                verticalLineToRelative(-400f)
                lineToRelative(360f, -200f)
                lineToRelative(360f, 200f)
                verticalLineToRelative(400f)
                lineTo(480f, 880f)
                close()
                moveTo(364f, 370f)
                quadToRelative(23f, -24f, 53f, -37f)
                reflectiveQuadToRelative(63f, -13f)
                quadToRelative(33f, 0f, 63f, 13f)
                reflectiveQuadToRelative(53f, 37f)
                lineToRelative(120f, -67f)
                lineToRelative(-236f, -131f)
                lineToRelative(-236f, 131f)
                lineToRelative(120f, 67f)
                close()
                moveToRelative(76f, 396f)
                verticalLineToRelative(-131f)
                quadToRelative(-54f, -14f, -87f, -57f)
                reflectiveQuadToRelative(-33f, -98f)
                quadToRelative(0f, -11f, 1f, -20.5f)
                reflectiveQuadToRelative(4f, -19.5f)
                lineToRelative(-125f, -70f)
                verticalLineToRelative(263f)
                lineToRelative(240f, 133f)
                close()
                moveToRelative(40f, -206f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(40f, 206f)
                lineToRelative(240f, -133f)
                verticalLineToRelative(-263f)
                lineToRelative(-125f, 70f)
                quadToRelative(3f, 10f, 4f, 19.5f)
                reflectiveQuadToRelative(1f, 20.5f)
                quadToRelative(0f, 55f, -33f, 98f)
                reflectiveQuadToRelative(-87f, 57f)
                verticalLineToRelative(131f)
                close()
            }
        }.build()
        
        return _Token!!
    }

private var _Token: ImageVector? = null

