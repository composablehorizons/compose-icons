package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Line_curve: ImageVector
    get() {
        if (_Line_curve != null) return _Line_curve!!
        
        _Line_curve = ImageVector.Builder(
            name = "line_curve",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 800f)
                quadToRelative(0f, -116f, -44f, -218f)
                reflectiveQuadTo(556f, 404f)
                quadToRelative(-76f, -76f, -178f, -120f)
                reflectiveQuadToRelative(-218f, -44f)
                verticalLineToRelative(-80f)
                quadToRelative(132f, 0f, 248.5f, 50.5f)
                reflectiveQuadTo(612f, 348f)
                quadToRelative(87f, 87f, 137.5f, 203.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Line_curve!!
    }

private var _Line_curve: ImageVector? = null

