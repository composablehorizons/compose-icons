package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Humidity_high: ImageVector
    get() {
        if (_Humidity_high != null) return _Humidity_high!!
        
        _Humidity_high = ImageVector.Builder(
            name = "humidity_high",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 860f)
                quadToRelative(-133f, 0f, -226.5f, -92f)
                reflectiveQuadTo(160f, 544f)
                quadToRelative(0f, -63f, 24.5f, -120.5f)
                reflectiveQuadTo(254f, 322f)
                lineToRelative(226f, -222f)
                lineToRelative(226f, 222f)
                quadToRelative(45f, 44f, 69.5f, 101.5f)
                reflectiveQuadTo(800f, 544f)
                quadToRelative(0f, 132f, -93.5f, 224f)
                reflectiveQuadTo(480f, 860f)
                close()
            }
        }.build()
        
        return _Humidity_high!!
    }

private var _Humidity_high: ImageVector? = null

