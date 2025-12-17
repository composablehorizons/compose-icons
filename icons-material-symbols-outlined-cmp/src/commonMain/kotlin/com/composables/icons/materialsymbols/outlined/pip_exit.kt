package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Pip_exit: ImageVector
    get() {
        if (_Pip_exit != null) return _Pip_exit!!
        
        _Pip_exit = ImageVector.Builder(
            name = "pip_exit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(523f, -140f)
                lineToRelative(57f, -57f)
                lineToRelative(-124f, -123f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(-80f)
                horizontalLineTo(480f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-103f)
                lineToRelative(123f, 123f)
                close()
                moveTo(80f, 360f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, 120f)
                close()
            }
        }.build()
        
        return _Pip_exit!!
    }

private var _Pip_exit: ImageVector? = null

