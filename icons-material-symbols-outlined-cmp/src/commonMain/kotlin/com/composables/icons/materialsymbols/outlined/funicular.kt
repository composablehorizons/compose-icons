package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Funicular: ImageVector
    get() {
        if (_Funicular != null) return _Funicular!!
        
        _Funicular = ImageVector.Builder(
            name = "funicular",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 920f)
                verticalLineToRelative(-80f)
                lineToRelative(200f, -55f)
                verticalLineToRelative(-105f)
                horizontalLineTo(120f)
                verticalLineToRelative(-440f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(360f)
                horizontalLineTo(720f)
                verticalLineToRelative(55f)
                lineToRelative(200f, -55f)
                verticalLineToRelative(80f)
                lineTo(40f, 920f)
                close()
                moveToRelative(320f, -167f)
                lineToRelative(240f, -66f)
                verticalLineToRelative(-87f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                verticalLineToRelative(73f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(320f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineTo(520f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-320f, -40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(320f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-80f, 200f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Funicular!!
    }

private var _Funicular: ImageVector? = null

