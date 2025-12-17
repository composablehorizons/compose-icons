package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pulmonology: ImageVector
    get() {
        if (_Pulmonology != null) return _Pulmonology!!
        
        _Pulmonology = ImageVector.Builder(
            name = "pulmonology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-51f, 0f, -85.5f, -34.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-167f)
                lineToRelative(105f, -281f)
                quadToRelative(12f, -33f, 42f, -52.5f)
                reflectiveQuadToRelative(65f, -19.5f)
                quadToRelative(26f, 0f, 49f, 13f)
                reflectiveQuadToRelative(38f, 35f)
                verticalLineToRelative(112f)
                lineTo(277f, 462f)
                lineToRelative(43f, 42f)
                lineToRelative(120f, -120f)
                verticalLineToRelative(-304f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(304f)
                lineToRelative(120f, 120f)
                lineToRelative(42f, -42f)
                lineToRelative(-102f, -102f)
                verticalLineToRelative(-112f)
                quadToRelative(15f, -22f, 38f, -35f)
                reflectiveQuadToRelative(49f, -13f)
                quadToRelative(35f, 0f, 64.5f, 19.5f)
                reflectiveQuadTo(774f, 272f)
                lineToRelative(105f, 281f)
                verticalLineToRelative(167f)
                quadToRelative(0f, 51f, -35f, 85.5f)
                reflectiveQuadTo(759f, 840f)
                horizontalLineTo(639f)
                quadToRelative(-50f, 0f, -84.5f, -34.5f)
                reflectiveQuadTo(520f, 720f)
                verticalLineToRelative(-80f)
                lineToRelative(15f, -127f)
                lineToRelative(-55f, -56f)
                lineToRelative(-56f, 56f)
                lineToRelative(16f, 127f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 51f, -35f, 85.5f)
                reflectiveQuadTo(320f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Pulmonology!!
    }

private var _Pulmonology: ImageVector? = null

