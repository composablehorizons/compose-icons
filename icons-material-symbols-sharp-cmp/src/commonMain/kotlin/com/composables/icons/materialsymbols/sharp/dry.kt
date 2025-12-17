package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Dry: ImageVector
    get() {
        if (_Dry != null) return _Dry!!
        
        _Dry = ImageVector.Builder(
            name = "dry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(599f, 320f)
                quadToRelative(5f, -41f, -0.5f, -64.5f)
                reflectiveQuadTo(569f, 202f)
                quadToRelative(-31f, -40f, -41.5f, -77f)
                reflectiveQuadToRelative(-3.5f, -85f)
                horizontalLineToRelative(76f)
                quadToRelative(-8f, 51f, 5f, 75f)
                reflectiveQuadToRelative(36f, 56f)
                quadToRelative(26f, 35f, 34f, 69.5f)
                reflectiveQuadToRelative(1f, 79.5f)
                horizontalLineToRelative(-77f)
                close()
                moveToRelative(161f, 0f)
                quadToRelative(5f, -41f, -1f, -64.5f)
                reflectiveQuadTo(729f, 202f)
                quadToRelative(-31f, -40f, -41f, -77f)
                reflectiveQuadToRelative(-3f, -85f)
                horizontalLineToRelative(75f)
                quadToRelative(-8f, 51f, 5f, 75f)
                reflectiveQuadToRelative(36f, 56f)
                quadToRelative(26f, 35f, 34f, 69.5f)
                reflectiveQuadToRelative(1f, 79.5f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(0f, 560f)
                horizontalLineTo(80f)
                verticalLineToRelative(-441f)
                lineToRelative(385f, -250f)
                lineToRelative(65f, 65f)
                lineToRelative(-78f, 126f)
                horizontalLineToRelative(348f)
                verticalLineToRelative(80f)
                horizontalLineTo(308f)
                lineToRelative(77f, -124f)
                lineToRelative(-225f, 146f)
                verticalLineToRelative(318f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                close()
                moveTo(480f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, 140f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
                moveTo(320f, 618f)
                close()
            }
        }.build()
        
        return _Dry!!
    }

private var _Dry: ImageVector? = null

