package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Details: ImageVector
    get() {
        if (_Details != null) return _Details!!
        
        _Details = ImageVector.Builder(
            name = "details",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(148f, 840f)
                quadToRelative(-23f, 0f, -34.5f, -19.5f)
                reflectiveQuadTo(113f, 781f)
                lineToRelative(332f, -598f)
                quadToRelative(11f, -20f, 35f, -20f)
                reflectiveQuadToRelative(35f, 20f)
                lineToRelative(332f, 598f)
                quadToRelative(11f, 20f, -0.5f, 39.5f)
                reflectiveQuadTo(812f, 840f)
                horizontalLineTo(148f)
                close()
                moveToRelative(68f, -80f)
                horizontalLineToRelative(224f)
                verticalLineToRelative(-403f)
                lineTo(216f, 760f)
                close()
                moveToRelative(304f, 0f)
                horizontalLineToRelative(224f)
                lineTo(520f, 357f)
                verticalLineToRelative(403f)
                close()
            }
        }.build()
        
        return _Details!!
    }

private var _Details: ImageVector? = null

