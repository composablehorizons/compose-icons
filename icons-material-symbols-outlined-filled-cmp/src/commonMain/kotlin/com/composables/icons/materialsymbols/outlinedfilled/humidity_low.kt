package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Humidity_low: ImageVector
    get() {
        if (_Humidity_low != null) return _Humidity_low!!
        
        _Humidity_low = ImageVector.Builder(
            name = "humidity_low",
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
                lineToRelative(170f, -167f)
                quadToRelative(12f, -11f, 26.5f, -17f)
                reflectiveQuadToRelative(29.5f, -6f)
                quadToRelative(15f, 0f, 29.5f, 6f)
                reflectiveQuadToRelative(26.5f, 17f)
                lineToRelative(170f, 167f)
                quadToRelative(45f, 44f, 69.5f, 101.5f)
                reflectiveQuadTo(800f, 544f)
                quadToRelative(0f, 132f, -93.5f, 224f)
                reflectiveQuadTo(480f, 860f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(100f, 0f, 170f, -68.5f)
                reflectiveQuadTo(720f, 544f)
                quadToRelative(0f, -47f, -18f, -89.5f)
                reflectiveQuadTo(650f, 380f)
                lineTo(480f, 212f)
                lineTo(310f, 380f)
                quadToRelative(-34f, 32f, -52f, 74.5f)
                reflectiveQuadTo(240f, 544f)
                quadToRelative(0f, 99f, 70f, 167.5f)
                reflectiveQuadTo(480f, 780f)
                close()
            }
        }.build()
        
        return _Humidity_low!!
    }

private var _Humidity_low: ImageVector? = null

