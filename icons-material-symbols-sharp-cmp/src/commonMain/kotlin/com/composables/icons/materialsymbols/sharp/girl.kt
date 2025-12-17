package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Girl: ImageVector
    get() {
        if (_Girl != null) return _Girl!!
        
        _Girl = ImageVector.Builder(
            name = "girl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 300f)
                quadToRelative(-29f, 0f, -49.5f, -20.5f)
                reflectiveQuadTo(410f, 230f)
                quadToRelative(0f, -29f, 20.5f, -49.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(29f, 0f, 49.5f, 20.5f)
                reflectiveQuadTo(550f, 230f)
                quadToRelative(0f, 29f, -20.5f, 49.5f)
                reflectiveQuadTo(480f, 300f)
                close()
                moveToRelative(-80f, 500f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                lineToRelative(95f, -255f)
                quadToRelative(8f, -20f, 25.5f, -32.5f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(22f, 0f, 39.5f, 12.5f)
                reflectiveQuadTo(545f, 385f)
                lineToRelative(95f, 255f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Girl!!
    }

private var _Girl: ImageVector? = null

