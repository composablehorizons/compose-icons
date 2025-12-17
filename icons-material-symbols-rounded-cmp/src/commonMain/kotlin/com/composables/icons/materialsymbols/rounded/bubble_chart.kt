package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bubble_chart: ImageVector
    get() {
        if (_Bubble_chart != null) return _Bubble_chart!!
        
        _Bubble_chart = ImageVector.Builder(
            name = "bubble_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 840f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(620f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(580f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(540f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(580f, 760f)
                close()
                moveToRelative(80f, -200f)
                quadToRelative(-92f, 0f, -156f, -64f)
                reflectiveQuadToRelative(-64f, -156f)
                quadToRelative(0f, -92f, 64f, -156f)
                reflectiveQuadToRelative(156f, -64f)
                quadToRelative(92f, 0f, 156f, 64f)
                reflectiveQuadToRelative(64f, 156f)
                quadToRelative(0f, 92f, -64f, 156f)
                reflectiveQuadToRelative(-156f, 64f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(59f, 0f, 99.5f, -40.5f)
                reflectiveQuadTo(800f, 340f)
                quadToRelative(0f, -59f, -40.5f, -99.5f)
                reflectiveQuadTo(660f, 200f)
                quadToRelative(-59f, 0f, -99.5f, 40.5f)
                reflectiveQuadTo(520f, 340f)
                quadToRelative(0f, 59f, 40.5f, 99.5f)
                reflectiveQuadTo(660f, 480f)
                close()
                moveTo(280f, 720f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(360f, 560f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 640f)
                close()
                moveToRelative(300f, 80f)
                close()
                moveToRelative(80f, -380f)
                close()
                moveTo(280f, 560f)
                close()
            }
        }.build()
        
        return _Bubble_chart!!
    }

private var _Bubble_chart: ImageVector? = null

