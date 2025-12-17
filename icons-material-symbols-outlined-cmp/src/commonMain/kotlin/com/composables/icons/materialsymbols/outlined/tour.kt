package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tour: ImageVector
    get() {
        if (_Tour != null) return _Tour!!
        
        _Tour = ImageVector.Builder(
            name = "tour",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(560f)
                lineToRelative(-80f, 200f)
                lineToRelative(80f, 200f)
                horizontalLineTo(280f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, -640f)
                verticalLineToRelative(240f)
                verticalLineToRelative(-240f)
                close()
                moveToRelative(220f, 200f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(580f, 360f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(500f, 280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(420f, 360f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(500f, 440f)
                close()
                moveToRelative(-220f, 40f)
                horizontalLineToRelative(442f)
                lineToRelative(-48f, -120f)
                lineToRelative(48f, -120f)
                horizontalLineTo(280f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Tour!!
    }

private var _Tour: ImageVector? = null

