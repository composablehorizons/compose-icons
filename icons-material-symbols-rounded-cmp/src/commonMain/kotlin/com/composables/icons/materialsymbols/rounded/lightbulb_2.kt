package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Lightbulb_2: ImageVector
    get() {
        if (_Lightbulb_2 != null) return _Lightbulb_2!!
        
        _Lightbulb_2 = ImageVector.Builder(
            name = "lightbulb_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 640f)
                verticalLineToRelative(-50f)
                quadToRelative(-57f, -39f, -88.5f, -100f)
                reflectiveQuadTo(200f, 360f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(0f, 69f, -31.5f, 129.5f)
                reflectiveQuadTo(640f, 590f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 720f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-71f)
                quadToRelative(0f, -10f, 4.5f, -19f)
                reflectiveQuadToRelative(12.5f, -14f)
                lineToRelative(17f, -12f)
                quadToRelative(41f, -28f, 63.5f, -71.5f)
                reflectiveQuadTo(680f, 360f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(0f, 49f, 22.5f, 92.5f)
                reflectiveQuadTo(366f, 524f)
                lineToRelative(17f, 12f)
                quadToRelative(8f, 5f, 12.5f, 14f)
                reflectiveQuadToRelative(4.5f, 19f)
                verticalLineToRelative(71f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, -520f)
                close()
            }
        }.build()
        
        return _Lightbulb_2!!
    }

private var _Lightbulb_2: ImageVector? = null

