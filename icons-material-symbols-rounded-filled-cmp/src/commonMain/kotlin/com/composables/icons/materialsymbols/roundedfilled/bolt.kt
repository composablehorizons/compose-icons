package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bolt: ImageVector
    get() {
        if (_Bolt != null) return _Bolt!!
        
        _Bolt = ImageVector.Builder(
            name = "bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 600f)
                horizontalLineTo(236f)
                quadToRelative(-24f, 0f, -35.5f, -21.5f)
                reflectiveQuadTo(203f, 537f)
                lineToRelative(299f, -430f)
                quadToRelative(10f, -14f, 26f, -19.5f)
                reflectiveQuadToRelative(33f, 0.5f)
                quadToRelative(17f, 6f, 25f, 21f)
                reflectiveQuadToRelative(6f, 32f)
                lineToRelative(-32f, 259f)
                horizontalLineToRelative(155f)
                quadToRelative(26f, 0f, 36.5f, 23f)
                reflectiveQuadToRelative(-6.5f, 43f)
                lineTo(416f, 860f)
                quadToRelative(-11f, 13f, -27f, 17f)
                reflectiveQuadToRelative(-31f, -3f)
                quadToRelative(-15f, -7f, -23.5f, -21.5f)
                reflectiveQuadTo(328f, 821f)
                lineToRelative(32f, -221f)
                close()
            }
        }.build()
        
        return _Bolt!!
    }

private var _Bolt: ImageVector? = null

