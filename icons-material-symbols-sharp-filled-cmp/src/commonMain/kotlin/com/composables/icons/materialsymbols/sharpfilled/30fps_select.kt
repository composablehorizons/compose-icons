package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.`30fps_select`: ImageVector
    get() {
        if (_30fps_select != null) return _30fps_select!!
        
        _30fps_select = ImageVector.Builder(
            name = "30fps_select",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(400f)
                horizontalLineTo(160f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(400f)
                horizontalLineTo(520f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-240f)
                horizontalLineTo(600f)
                verticalLineToRelative(240f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(200f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _30fps_select!!
    }

private var _30fps_select: ImageVector? = null

