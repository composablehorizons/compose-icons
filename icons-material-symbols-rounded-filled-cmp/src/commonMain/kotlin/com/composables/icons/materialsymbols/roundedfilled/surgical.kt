package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Surgical: ImageVector
    get() {
        if (_Surgical != null) return _Surgical!!
        
        _Surgical = ImageVector.Builder(
            name = "surgical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 840f)
                horizontalLineTo(500f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(460f, 800f)
                quadToRelative(0f, -15f, 10.5f, -27.5f)
                reflectiveQuadTo(501f, 760f)
                horizontalLineToRelative(339f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                close()
                moveToRelative(-450f, -68f)
                quadToRelative(-32f, 32f, -74.5f, 50f)
                reflectiveQuadTo(227f, 840f)
                horizontalLineToRelative(-24f)
                quadToRelative(-31f, 0f, -60f, -8f)
                reflectiveQuadToRelative(-55f, -23f)
                quadToRelative(-11f, -7f, -16.5f, -17.5f)
                reflectiveQuadTo(66f, 769f)
                quadToRelative(0f, -11f, 4f, -21f)
                reflectiveQuadToRelative(12f, -18f)
                lineToRelative(195f, -194f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(76f, 76f)
                quadToRelative(14f, 14f, 22f, 32f)
                reflectiveQuadToRelative(8f, 38f)
                quadToRelative(0f, 20f, -8f, 38.5f)
                reflectiveQuadTo(409f, 753f)
                lineToRelative(-19f, 19f)
                close()
                moveToRelative(134f, -186f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-94f, -94f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(290f, -290f)
                quadToRelative(9f, -9f, 20.5f, -13.5f)
                reflectiveQuadTo(707f, 128f)
                quadToRelative(11f, 0f, 22f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(65f, 65f)
                quadToRelative(9f, 9f, 13.5f, 20.5f)
                reflectiveQuadTo(832f, 254f)
                quadToRelative(0f, 11f, -4.5f, 22f)
                reflectiveQuadTo(814f, 296f)
                lineTo(524f, 586f)
                close()
            }
        }.build()
        
        return _Surgical!!
    }

private var _Surgical: ImageVector? = null

