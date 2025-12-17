package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Support_agent: ImageVector
    get() {
        if (_Support_agent != null) return _Support_agent!!
        
        _Support_agent = ImageVector.Builder(
            name = "support_agent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 760f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-284f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 196f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 476f)
                verticalLineToRelative(204f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -21f, 10.5f, -39.5f)
                reflectiveQuadTo(120f, 491f)
                lineToRelative(3f, -53f)
                quadToRelative(8f, -68f, 39.5f, -126f)
                reflectiveQuadToRelative(79f, -101f)
                quadToRelative(47.5f, -43f, 109f, -67f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(68f, 0f, 129f, 24f)
                reflectiveQuadToRelative(109f, 66.5f)
                quadTo(766f, 253f, 797f, 311f)
                reflectiveQuadToRelative(40f, 126f)
                lineToRelative(3f, 52f)
                quadToRelative(19f, 9f, 29.5f, 27f)
                reflectiveQuadToRelative(10.5f, 38f)
                verticalLineToRelative(92f)
                quadToRelative(0f, 20f, -10.5f, 38f)
                reflectiveQuadTo(840f, 711f)
                verticalLineToRelative(49f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(480f)
                close()
                moveTo(360f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 560f)
                close()
                moveToRelative(-359f, -62f)
                quadToRelative(-7f, -106f, 64f, -182f)
                reflectiveQuadToRelative(177f, -76f)
                quadToRelative(89f, 0f, 156.5f, 56.5f)
                reflectiveQuadTo(720f, 441f)
                quadToRelative(-91f, -1f, -167.5f, -49f)
                reflectiveQuadTo(435f, 262f)
                quadToRelative(-16f, 80f, -67.5f, 142.5f)
                reflectiveQuadTo(241f, 498f)
                close()
            }
        }.build()
        
        return _Support_agent!!
    }

private var _Support_agent: ImageVector? = null

