package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Boy: ImageVector
    get() {
        if (_Boy != null) return _Boy!!
        
        _Boy = ImageVector.Builder(
            name = "boy",
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
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 340f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 420f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(200f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Boy!!
    }

private var _Boy: ImageVector? = null

