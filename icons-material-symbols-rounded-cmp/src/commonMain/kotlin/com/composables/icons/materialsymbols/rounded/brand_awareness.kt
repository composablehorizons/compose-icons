package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Brand_awareness: ImageVector
    get() {
        if (_Brand_awareness != null) return _Brand_awareness!!
        
        _Brand_awareness = ImageVector.Builder(
            name = "brand_awareness",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 520f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 520f)
                close()
                moveTo(584f, 672f)
                quadToRelative(10f, -14f, 26f, -16f)
                reflectiveQuadToRelative(30f, 8f)
                lineToRelative(64f, 48f)
                quadToRelative(14f, 10f, 16f, 26f)
                reflectiveQuadToRelative(-8f, 30f)
                quadToRelative(-10f, 14f, -26f, 16f)
                reflectiveQuadToRelative(-30f, -8f)
                lineToRelative(-64f, -48f)
                quadToRelative(-14f, -10f, -16f, -26f)
                reflectiveQuadToRelative(8f, -30f)
                close()
                moveToRelative(120f, -424f)
                lineToRelative(-64f, 48f)
                quadToRelative(-14f, 10f, -30f, 8f)
                reflectiveQuadToRelative(-26f, -16f)
                quadToRelative(-10f, -14f, -8f, -30f)
                reflectiveQuadToRelative(16f, -26f)
                lineToRelative(64f, -48f)
                quadToRelative(14f, -10f, 30f, -8f)
                reflectiveQuadToRelative(26f, 16f)
                quadToRelative(10f, 14f, 8f, 30f)
                reflectiveQuadToRelative(-16f, 26f)
                close()
                moveTo(280f, 600f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(120f)
                lineToRelative(132f, -132f)
                quadToRelative(19f, -19f, 43.5f, -8.5f)
                reflectiveQuadTo(480f, 257f)
                verticalLineToRelative(446f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(412f, 732f)
                lineTo(280f, 600f)
                close()
                moveToRelative(120f, -246f)
                lineToRelative(-86f, 86f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(114f)
                lineToRelative(86f, 86f)
                verticalLineToRelative(-252f)
                close()
                moveTo(300f, 480f)
                close()
            }
        }.build()
        
        return _Brand_awareness!!
    }

private var _Brand_awareness: ImageVector? = null

