package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Arrow_back_ios: ImageVector
    get() {
        if (_Arrow_back_ios != null) return _Arrow_back_ios!!
        
        _Arrow_back_ios = ImageVector.Builder(
            name = "arrow_back_ios",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(142f, 480f)
                lineToRelative(294f, 294f)
                quadToRelative(15f, 15f, 14.5f, 35f)
                reflectiveQuadTo(435f, 844f)
                quadToRelative(-15f, 15f, -35f, 15f)
                reflectiveQuadToRelative(-35f, -15f)
                lineTo(57f, 537f)
                quadToRelative(-12f, -12f, -18f, -27f)
                reflectiveQuadToRelative(-6f, -30f)
                quadToRelative(0f, -15f, 6f, -30f)
                reflectiveQuadToRelative(18f, -27f)
                lineToRelative(308f, -308f)
                quadToRelative(15f, -15f, 35.5f, -14.5f)
                reflectiveQuadTo(436f, 116f)
                quadToRelative(15f, 15f, 15f, 35f)
                reflectiveQuadToRelative(-15f, 35f)
                lineTo(142f, 480f)
                close()
            }
        }.build()
        
        return _Arrow_back_ios!!
    }

private var _Arrow_back_ios: ImageVector? = null

