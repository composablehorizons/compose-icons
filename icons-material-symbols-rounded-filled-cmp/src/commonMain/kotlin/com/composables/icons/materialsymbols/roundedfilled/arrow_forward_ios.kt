package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Arrow_forward_ios: ImageVector
    get() {
        if (_Arrow_forward_ios != null) return _Arrow_forward_ios!!
        
        _Arrow_forward_ios = ImageVector.Builder(
            name = "arrow_forward_ios",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(579f, 480f)
                lineTo(285f, 186f)
                quadToRelative(-15f, -15f, -14.5f, -35.5f)
                reflectiveQuadTo(286f, 115f)
                quadToRelative(15f, -15f, 35.5f, -15f)
                reflectiveQuadToRelative(35.5f, 15f)
                lineToRelative(307f, 308f)
                quadToRelative(12f, 12f, 18f, 27f)
                reflectiveQuadToRelative(6f, 30f)
                quadToRelative(0f, 15f, -6f, 30f)
                reflectiveQuadToRelative(-18f, 27f)
                lineTo(356f, 845f)
                quadToRelative(-15f, 15f, -35f, 14.5f)
                reflectiveQuadTo(286f, 844f)
                quadToRelative(-15f, -15f, -15f, -35.5f)
                reflectiveQuadToRelative(15f, -35.5f)
                lineToRelative(293f, -293f)
                close()
            }
        }.build()
        
        return _Arrow_forward_ios!!
    }

private var _Arrow_forward_ios: ImageVector? = null

