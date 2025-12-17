package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Location_disabled: ImageVector
    get() {
        if (_Location_disabled != null) return _Location_disabled!!
        
        _Location_disabled = ImageVector.Builder(
            name = "location_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(784f, 674f)
                lineToRelative(-58f, -58f)
                quadToRelative(17f, -30f, 25.5f, -64f)
                reflectiveQuadToRelative(8.5f, -70f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-36f, 0f, -70f, 8.5f)
                reflectiveQuadTo(346f, 236f)
                lineToRelative(-58f, -58f)
                quadToRelative(35f, -21f, 72.5f, -35f)
                reflectiveQuadToRelative(79.5f, -19f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                quadToRelative(125f, 14f, 214.5f, 103.5f)
                reflectiveQuadTo(838f, 442f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-5f, 42f, -19f, 79.5f)
                reflectiveQuadTo(784f, 674f)
                close()
                moveTo(440f, 920f)
                verticalLineToRelative(-80f)
                quadToRelative(-125f, -14f, -214.5f, -103.5f)
                reflectiveQuadTo(122f, 522f)
                horizontalLineTo(42f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(5f, -42f, 19f, -79.5f)
                reflectiveQuadToRelative(35f, -72.5f)
                lineTo(56f, 170f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-58f, 56f)
                lineToRelative(-118f, -120f)
                quadToRelative(-35f, 21f, -72.5f, 35f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -158f)
                quadToRelative(36f, 0f, 70f, -8.5f)
                reflectiveQuadToRelative(64f, -25.5f)
                lineTo(234f, 348f)
                quadToRelative(-17f, 30f, -25.5f, 64f)
                reflectiveQuadToRelative(-8.5f, 70f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                close()
            }
        }.build()
        
        return _Location_disabled!!
    }

private var _Location_disabled: ImageVector? = null

