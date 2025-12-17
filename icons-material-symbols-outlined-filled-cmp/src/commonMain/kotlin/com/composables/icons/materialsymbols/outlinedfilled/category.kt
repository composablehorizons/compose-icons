package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Category: ImageVector
    get() {
        if (_Category != null) return _Category!!
        
        _Category = ImageVector.Builder(
            name = "category",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 440f)
                lineToRelative(220f, -360f)
                lineToRelative(220f, 360f)
                horizontalLineTo(260f)
                close()
                moveTo(700f, 880f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(520f, 700f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(700f, 520f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(880f, 700f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(700f, 880f)
                close()
                moveToRelative(-580f, -20f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Category!!
    }

private var _Category: ImageVector? = null

