package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Family_home: ImageVector
    get() {
        if (_Family_home != null) return _Family_home!!
        
        _Family_home = ImageVector.Builder(
            name = "family_home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 120f)
                lineToRelative(440f, 330f)
                lineToRelative(-48f, 64f)
                lineToRelative(-72f, -54f)
                verticalLineToRelative(380f)
                horizontalLineTo(160f)
                verticalLineToRelative(-380f)
                lineToRelative(-72f, 54f)
                lineToRelative(-48f, -64f)
                lineToRelative(440f, -330f)
                close()
                moveTo(294f, 482f)
                quadToRelative(0f, 53f, 57f, 113f)
                reflectiveQuadToRelative(129f, 125f)
                quadToRelative(72f, -65f, 129f, -125f)
                reflectiveQuadToRelative(57f, -113f)
                quadToRelative(0f, -44f, -30f, -73f)
                reflectiveQuadToRelative(-72f, -29f)
                quadToRelative(-26f, 0f, -47.5f, 10.5f)
                reflectiveQuadTo(480f, 418f)
                quadToRelative(-15f, -17f, -37.5f, -27.5f)
                reflectiveQuadTo(396f, 380f)
                quadToRelative(-42f, 0f, -72f, 29f)
                reflectiveQuadToRelative(-30f, 73f)
                close()
                moveToRelative(426f, 278f)
                verticalLineToRelative(-360f)
                lineTo(480f, 220f)
                lineTo(240f, 400f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineTo(240f)
                horizontalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Family_home!!
    }

private var _Family_home: ImageVector? = null

