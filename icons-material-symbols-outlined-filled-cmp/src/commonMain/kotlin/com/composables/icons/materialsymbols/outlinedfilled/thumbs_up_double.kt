package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Thumbs_up_double: ImageVector
    get() {
        if (_Thumbs_up_double != null) return _Thumbs_up_double!!
        
        _Thumbs_up_double = ImageVector.Builder(
            name = "thumbs_up_double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(716f, 680f)
                lineToRelative(31f, -73f)
                quadToRelative(7f, -15f, 10f, -30.5f)
                reflectiveQuadToRelative(3f, -32.5f)
                verticalLineToRelative(-24f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                horizontalLineToRelative(-66f)
                quadToRelative(5f, -42f, -5f, -76f)
                reflectiveQuadToRelative(-33f, -60f)
                lineToRelative(144f, -144f)
                lineToRelative(32f, 32f)
                quadToRelative(14f, 14f, 19.5f, 31.5f)
                reflectiveQuadTo(694f, 180f)
                lineToRelative(-14f, 100f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 360f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 8f, -1.5f, 16f)
                reflectiveQuadToRelative(-4.5f, 16f)
                lineToRelative(-93f, 216f)
                quadToRelative(-10f, 22f, -30f, 35.5f)
                reflectiveQuadTo(747f, 680f)
                horizontalLineToRelative(-31f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-400f)
                lineToRelative(200f, -200f)
                lineToRelative(32f, 32f)
                quadToRelative(14f, 14f, 19.5f, 31.5f)
                reflectiveQuadTo(454f, 340f)
                lineToRelative(-14f, 100f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 520f)
                verticalLineToRelative(24f)
                quadToRelative(0f, 8f, -1.5f, 15.5f)
                reflectiveQuadTo(674f, 575f)
                lineToRelative(-93f, 217f)
                quadToRelative(-10f, 22f, -30f, 35f)
                reflectiveQuadToRelative(-44f, 13f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Thumbs_up_double!!
    }

private var _Thumbs_up_double: ImageVector? = null

