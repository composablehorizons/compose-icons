package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wash: ImageVector
    get() {
        if (_Wash != null) return _Wash!!
        
        _Wash = ImageVector.Builder(
            name = "wash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 320f)
                quadToRelative(-39f, 0f, -69.5f, -30.5f)
                reflectiveQuadTo(600f, 220f)
                quadToRelative(0f, -35f, 23f, -77.5f)
                reflectiveQuadTo(700f, 40f)
                quadToRelative(54f, 60f, 77f, 102.5f)
                reflectiveQuadToRelative(23f, 77.5f)
                quadToRelative(0f, 39f, -30.5f, 69.5f)
                reflectiveQuadTo(700f, 320f)
                close()
                moveToRelative(60f, 560f)
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
        
        return _Wash!!
    }

private var _Wash: ImageVector? = null

