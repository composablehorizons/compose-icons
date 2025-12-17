package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Keep: ImageVector
    get() {
        if (_Keep != null) return _Keep!!
        
        _Keep = ImageVector.Builder(
            name = "keep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 200f)
                verticalLineToRelative(280f)
                lineToRelative(68f, 68f)
                quadToRelative(6f, 6f, 9f, 13.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 640f)
                horizontalLineTo(520f)
                verticalLineToRelative(223f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadTo(508f, 892f)
                lineToRelative(-14f, 14f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-14f, -14f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadTo(440f, 863f)
                verticalLineToRelative(-223f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 600f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(68f, -68f)
                verticalLineToRelative(-280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 120f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 200f)
                close()
                moveTo(354f, 560f)
                horizontalLineToRelative(252f)
                lineToRelative(-46f, -46f)
                verticalLineToRelative(-314f)
                horizontalLineTo(400f)
                verticalLineToRelative(314f)
                lineToRelative(-46f, 46f)
                close()
                moveToRelative(126f, 0f)
                close()
            }
        }.build()
        
        return _Keep!!
    }

private var _Keep: ImageVector? = null

