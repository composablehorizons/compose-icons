package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Maps_ugc: ImageVector
    get() {
        if (_Maps_ugc != null) return _Maps_ugc!!
        
        _Maps_ugc = ImageVector.Builder(
            name = "maps_ugc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 920f)
                lineToRelative(78f, -268f)
                quadToRelative(-19f, -41f, -28.5f, -84f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-45f, 0f, -88f, -9.5f)
                reflectiveQuadTo(308f, 842f)
                lineTo(40f, 920f)
                close()
                moveToRelative(118f, -118f)
                lineToRelative(128f, -38f)
                quadToRelative(14f, -4f, 28.5f, -3f)
                reflectiveQuadToRelative(27.5f, 7f)
                quadToRelative(32f, 16f, 67f, 24f)
                reflectiveQuadToRelative(71f, 8f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 36f, 8f, 71f)
                reflectiveQuadToRelative(24f, 67f)
                quadToRelative(7f, 13f, 7.5f, 27.5f)
                reflectiveQuadTo(196f, 674f)
                lineToRelative(-38f, 128f)
                close()
                moveToRelative(282f, -162f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(39f, -159f)
                close()
            }
        }.build()
        
        return _Maps_ugc!!
    }

private var _Maps_ugc: ImageVector? = null

