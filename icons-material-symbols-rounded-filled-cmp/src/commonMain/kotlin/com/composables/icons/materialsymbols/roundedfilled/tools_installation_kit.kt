package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tools_installation_kit: ImageVector
    get() {
        if (_Tools_installation_kit != null) return _Tools_installation_kit!!
        
        _Tools_installation_kit = ImageVector.Builder(
            name = "tools_installation_kit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                horizontalLineToRelative(240f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 134f, -93f, 227f)
                reflectiveQuadToRelative(-227f, 93f)
                horizontalLineTo(360f)
                close()
                moveToRelative(120f, -240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(-40f, -200f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(520f, 280f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(440f, 360f)
                close()
                moveToRelative(0f, 320f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(560f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(520f, 600f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(400f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(440f, 680f)
                close()
                moveToRelative(200f, -120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 520f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(640f, 560f)
                close()
                moveToRelative(-320f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(360f, 520f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(320f, 400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 560f)
                close()
            }
        }.build()
        
        return _Tools_installation_kit!!
    }

private var _Tools_installation_kit: ImageVector? = null

