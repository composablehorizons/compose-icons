package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Swap_calls: ImageVector
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
                moveTo(240f, 760f)
                lineTo(80f, 600f)
                lineToRelative(56f, -58f)
                lineToRelative(64f, 64f)
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
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -58f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 58f)
                lineToRelative(-64f, -64f)
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
                lineToRelative(64f, -64f)
                lineToRelative(56f, 58f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Swap_calls!!
    }

private var _Swap_calls: ImageVector? = null

