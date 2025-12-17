package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Cards: ImageVector
    get() {
        if (_Cards != null) return _Cards!!
        
        _Cards = ImageVector.Builder(
            name = "cards",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 460f)
                verticalLineToRelative(-220f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(220f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, 260f)
                verticalLineToRelative(-220f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(220f)
                horizontalLineTo(240f)
                close()
                moveToRelative(260f, -260f)
                verticalLineToRelative(-220f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(220f)
                horizontalLineTo(500f)
                close()
                moveToRelative(0f, 260f)
                verticalLineToRelative(-220f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(220f)
                horizontalLineTo(500f)
                close()
                moveTo(320f, 380f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(260f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveTo(320f, 640f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(260f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveTo(380f, 380f)
                close()
                moveToRelative(200f, 0f)
                close()
                moveToRelative(0f, 200f)
                close()
                moveToRelative(-200f, 0f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Cards!!
    }

private var _Cards: ImageVector? = null

