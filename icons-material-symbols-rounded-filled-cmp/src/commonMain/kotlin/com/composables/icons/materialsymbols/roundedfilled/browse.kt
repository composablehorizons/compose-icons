package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Browse: ImageVector
    get() {
        if (_Browse != null) return _Browse!!
        
        _Browse = ImageVector.Builder(
            name = "browse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 520f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(400f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, -400f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(160f)
                horizontalLineTo(520f)
                verticalLineToRelative(-240f)
                close()
                moveToRelative(0f, 720f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(520f)
                close()
                moveTo(120f, 600f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(240f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-160f)
                close()
            }
        }.build()
        
        return _Browse!!
    }

private var _Browse: ImageVector? = null

