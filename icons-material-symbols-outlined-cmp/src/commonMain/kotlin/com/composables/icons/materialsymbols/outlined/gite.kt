package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Gite: ImageVector
    get() {
        if (_Gite != null) return _Gite!!
        
        _Gite = ImageVector.Builder(
            name = "gite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-360f)
                lineToRelative(160f, -160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(360f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(360f)
                horizontalLineTo(80f)
                close()
                moveToRelative(560f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-247f)
                lineToRelative(-80f, -80f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(247f)
                close()
                moveToRelative(-480f, 0f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-200f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Gite!!
    }

private var _Gite: ImageVector? = null

