package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Browse: ImageVector
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
                moveTo(120f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(400f)
                horizontalLineTo(520f)
                close()
                moveTo(360f, 680f)
                close()
                moveToRelative(240f, -160f)
                close()
                moveToRelative(-480f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(400f)
                horizontalLineTo(120f)
                close()
                moveToRelative(240f, -80f)
                close()
                moveToRelative(160f, -80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(240f)
                horizontalLineTo(520f)
                close()
                moveToRelative(80f, -80f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(400f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-240f)
                horizontalLineTo(600f)
                verticalLineToRelative(240f)
                close()
                moveTo(200f, 440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-240f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(400f, -160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Browse!!
    }

private var _Browse: ImageVector? = null

