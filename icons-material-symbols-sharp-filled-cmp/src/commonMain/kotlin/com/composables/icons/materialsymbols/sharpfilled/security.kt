package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Security: ImageVector
    get() {
        if (_Security != null) return _Security!!
        
        _Security = ImageVector.Builder(
            name = "security",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -84f)
                quadToRelative(97f, -30f, 162f, -118.5f)
                reflectiveQuadTo(718f, 480f)
                horizontalLineTo(480f)
                verticalLineToRelative(-315f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(207f)
                quadToRelative(0f, 7f, 2f, 18f)
                horizontalLineToRelative(238f)
                verticalLineToRelative(316f)
                close()
            }
        }.build()
        
        return _Security!!
    }

private var _Security: ImageVector? = null

