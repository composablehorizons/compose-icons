package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Swap_calls: ImageVector
    get() {
        if (_Swap_calls != null) return _Swap_calls!!
        
        _Swap_calls = ImageVector.Builder(
            name = "swap_calls",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 606f)
                verticalLineToRelative(-286f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(680f, 600f)
                verticalLineToRelative(-286f)
                lineToRelative(-35f, 35f)
                quadToRelative(-12f, 12f, -28.5f, 11.5f)
                reflectiveQuadTo(588f, 348f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(852f, 348f)
                quadToRelative(-12f, 12f, -28.5f, 12.5f)
                reflectiveQuadTo(795f, 349f)
                lineToRelative(-35f, -35f)
                verticalLineToRelative(286f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(280f, 320f)
                verticalLineToRelative(286f)
                lineToRelative(35f, -35f)
                quadToRelative(12f, -12f, 28.5f, -11.5f)
                reflectiveQuadTo(372f, 572f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(372f, 628f)
                lineTo(268f, 732f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadToRelative(-15f, 2.5f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(108f, 628f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(165f, 571f)
                lineToRelative(35f, 35f)
                close()
            }
        }.build()
        
        return _Swap_calls!!
    }

private var _Swap_calls: ImageVector? = null

