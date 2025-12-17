package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pulmonology: ImageVector
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
                verticalLineToRelative(-153f)
                quadToRelative(0f, -8f, 1.5f, -14.5f)
                reflectiveQuadTo(85f, 539f)
                lineToRelative(100f, -267f)
                quadToRelative(12f, -33f, 42f, -52.5f)
                reflectiveQuadToRelative(65f, -19.5f)
                quadToRelative(26f, 0f, 49f, 13f)
                reflectiveQuadToRelative(38f, 35f)
                verticalLineToRelative(112f)
                lineToRelative(-81f, 81f)
                quadToRelative(-9f, 9f, -8.5f, 21f)
                reflectiveQuadToRelative(9.5f, 21f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                lineToRelative(99f, -99f)
                verticalLineToRelative(-264f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                verticalLineToRelative(264f)
                lineToRelative(99f, 99f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                quadToRelative(9f, -9f, 9f, -21f)
                reflectiveQuadToRelative(-9f, -21f)
                lineToRelative(-81f, -81f)
                verticalLineToRelative(-112f)
                quadToRelative(15f, -22f, 38f, -35f)
                reflectiveQuadToRelative(49f, -13f)
                quadToRelative(35f, 0f, 64.5f, 19.5f)
                reflectiveQuadTo(774f, 272f)
                lineToRelative(100f, 267f)
                quadToRelative(2f, 7f, 3.5f, 13.5f)
                reflectiveQuadTo(879f, 567f)
                verticalLineToRelative(153f)
                quadToRelative(0f, 51f, -35f, 85.5f)
                reflectiveQuadTo(759f, 840f)
                horizontalLineTo(639f)
                quadToRelative(-50f, 0f, -84.5f, -34.5f)
                reflectiveQuadTo(520f, 720f)
                verticalLineToRelative(-75f)
                quadToRelative(0f, -2f, 0.5f, -5f)
                reflectiveQuadToRelative(0.5f, -5f)
                lineToRelative(14f, -122f)
                lineToRelative(-55f, -56f)
                lineToRelative(-56f, 56f)
                lineToRelative(15f, 122f)
                quadToRelative(0f, 2f, 0.5f, 5f)
                reflectiveQuadToRelative(0.5f, 5f)
                verticalLineToRelative(75f)
                quadToRelative(0f, 51f, -35f, 85.5f)
                reflectiveQuadTo(320f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Pulmonology!!
    }

private var _Pulmonology: ImageVector? = null

