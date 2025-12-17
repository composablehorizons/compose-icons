package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Humidity_mid: ImageVector
    get() {
        if (_Humidity_mid != null) return _Humidity_mid!!
        
        _Humidity_mid = ImageVector.Builder(
            name = "humidity_mid",
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
                moveTo(240f, 544f)
                horizontalLineToRelative(480f)
                quadToRelative(0f, -47f, -18f, -89.5f)
                reflectiveQuadTo(650f, 380f)
                lineTo(480f, 212f)
                lineTo(310f, 380f)
                quadToRelative(-34f, 32f, -52f, 74.5f)
                reflectiveQuadTo(240f, 544f)
                close()
            }
        }.build()
        
        return _Humidity_mid!!
    }

private var _Humidity_mid: ImageVector? = null

