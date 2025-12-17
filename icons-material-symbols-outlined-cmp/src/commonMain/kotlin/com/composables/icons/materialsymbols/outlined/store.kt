package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Store: ImageVector
    get() {
        if (_Store != null) return _Store!!
        
        _Store = ImageVector.Builder(
            name = "store",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, 560f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                lineToRelative(40f, -200f)
                horizontalLineToRelative(640f)
                lineToRelative(40f, 200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(560f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-38f, -240f)
                horizontalLineToRelative(556f)
                horizontalLineToRelative(-556f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(556f)
                lineToRelative(-24f, -120f)
                horizontalLineTo(226f)
                lineToRelative(-24f, 120f)
                close()
            }
        }.build()
        
        return _Store!!
    }

private var _Store: ImageVector? = null

