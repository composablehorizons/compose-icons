package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Globe_uk: ImageVector
    get() {
        if (_Globe_uk != null) return _Globe_uk!!
        
        _Globe_uk = ImageVector.Builder(
            name = "globe_uk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(18f, 0f, 34.5f, -2f)
                reflectiveQuadToRelative(33.5f, -6f)
                lineToRelative(-48f, -72f)
                horizontalLineTo(360f)
                verticalLineToRelative(-40f)
                lineToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-88f)
                verticalLineToRelative(-69f)
                lineToRelative(80f, -118f)
                quadToRelative(-101f, 29f, -166.5f, 113f)
                reflectiveQuadTo(160f, 480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                lineToRelative(-40f, 40f)
                verticalLineToRelative(120f)
                horizontalLineTo(203f)
                quadToRelative(42f, 72f, 115f, 116f)
                reflectiveQuadToRelative(162f, 44f)
                close()
                moveToRelative(304f, -222f)
                quadToRelative(8f, -23f, 12f, -47.5f)
                reflectiveQuadToRelative(4f, -50.5f)
                quadToRelative(0f, -112f, -68f, -197.5f)
                reflectiveQuadTo(560f, 170f)
                verticalLineToRelative(110f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(47f)
                lineToRelative(97f, 138f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
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
                close()
            }
        }.build()
        
        return _Globe_uk!!
    }

private var _Globe_uk: ImageVector? = null

