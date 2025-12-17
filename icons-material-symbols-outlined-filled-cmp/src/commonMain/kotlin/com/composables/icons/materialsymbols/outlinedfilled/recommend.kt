package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Recommend: ImageVector
    get() {
        if (_Recommend != null) return _Recommend!!
        
        _Recommend = ImageVector.Builder(
            name = "recommend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 720f)
                horizontalLineToRelative(220f)
                quadToRelative(17f, 0f, 31.5f, -8.5f)
                reflectiveQuadTo(632f, 688f)
                lineToRelative(84f, -196f)
                quadToRelative(2f, -5f, 3f, -10f)
                reflectiveQuadToRelative(1f, -10f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 400f)
                horizontalLineTo(496f)
                lineToRelative(24f, -136f)
                quadToRelative(2f, -10f, -1f, -19f)
                reflectiveQuadToRelative(-10f, -16f)
                lineToRelative(-29f, -29f)
                lineToRelative(-184f, 200f)
                quadToRelative(-8f, 8f, -12f, 18f)
                reflectiveQuadToRelative(-4f, 22f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(360f, 720f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Recommend!!
    }

private var _Recommend: ImageVector? = null

