package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Post: ImageVector
    get() {
        if (_Post != null) return _Post!!
        
        _Post = ImageVector.Builder(
            name = "post",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 840f)
                horizontalLineTo(200f)
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
                close()
                moveToRelative(-40f, -160f)
                horizontalLineTo(240f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(-480f, -60f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-60f)
                horizontalLineTo(240f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, -140f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 200f)
                verticalLineToRelative(60f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(0f, -60f)
                verticalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, -140f)
                verticalLineToRelative(-240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 80f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 120f)
                verticalLineToRelative(-60f)
                verticalLineToRelative(60f)
                close()
            }
        }.build()
        
        return _Post!!
    }

private var _Post: ImageVector? = null

