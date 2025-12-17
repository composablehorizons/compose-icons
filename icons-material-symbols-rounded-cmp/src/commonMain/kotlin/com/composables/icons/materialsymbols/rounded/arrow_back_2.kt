package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Arrow_back_2: ImageVector
    get() {
        if (_Arrow_back_2 != null) return _Arrow_back_2!!
        
        _Arrow_back_2 = ImageVector.Builder(
            name = "arrow_back_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(253f, 514f)
                quadToRelative(-9f, -6f, -13.5f, -15f)
                reflectiveQuadToRelative(-4.5f, -19f)
                quadToRelative(0f, -10f, 4.5f, -19f)
                reflectiveQuadToRelative(13.5f, -15f)
                lineToRelative(326f, -207f)
                quadToRelative(5f, -3f, 10.5f, -4.5f)
                reflectiveQuadTo(600f, 233f)
                quadToRelative(16f, 0f, 28f, 11.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                verticalLineToRelative(414f)
                quadToRelative(0f, 17f, -12f, 28.5f)
                reflectiveQuadTo(600f, 727f)
                quadToRelative(-5f, 0f, -10.5f, -1.5f)
                reflectiveQuadTo(579f, 721f)
                lineTo(253f, 514f)
                close()
                moveToRelative(307f, -34f)
                close()
                moveToRelative(0f, 134f)
                verticalLineToRelative(-268f)
                lineTo(350f, 480f)
                lineToRelative(210f, 134f)
                close()
            }
        }.build()
        
        return _Arrow_back_2!!
    }

private var _Arrow_back_2: ImageVector? = null

