package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Globe_asia: ImageVector
    get() {
        if (_Globe_asia != null) return _Globe_asia!!
        
        _Globe_asia = ImageVector.Builder(
            name = "globe_asia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(472f, 801f)
                lineToRelative(6f, -169f)
                lineToRelative(122f, -120f)
                horizontalLineToRelative(78f)
                verticalLineToRelative(74f)
                lineToRelative(91f, 14f)
                quadToRelative(11f, -28f, 17.5f, -58f)
                reflectiveQuadToRelative(6.5f, -62f)
                quadToRelative(0f, -89f, -44.5f, -162.5f)
                reflectiveQuadTo(632f, 202f)
                verticalLineToRelative(118f)
                horizontalLineTo(512f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-81f)
                lineToRelative(-79f, -120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                lineToRelative(-71f, 79f)
                quadToRelative(26f, 104f, 112.5f, 173f)
                reflectiveQuadTo(472f, 801f)
                close()
                moveToRelative(160f, -241f)
                horizontalLineTo(512f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(81f)
                lineToRelative(-40f, 120f)
                horizontalLineToRelative(-82f)
                lineToRelative(41f, -120f)
                close()
                moveTo(472f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(189f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(72f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(189f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(472f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(755f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(872f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(755f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(472f, 880f)
                close()
            }
        }.build()
        
        return _Globe_asia!!
    }

private var _Globe_asia: ImageVector? = null

