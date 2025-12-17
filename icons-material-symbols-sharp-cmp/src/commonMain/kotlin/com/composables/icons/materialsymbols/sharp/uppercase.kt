package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Uppercase: ImageVector
    get() {
        if (_Uppercase != null) return _Uppercase!!
        
        _Uppercase = ImageVector.Builder(
            name = "uppercase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 720f)
                verticalLineToRelative(-248f)
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(248f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-540f, 0f)
                lineToRelative(165f, -440f)
                horizontalLineToRelative(79f)
                lineToRelative(165f, 440f)
                horizontalLineToRelative(-76f)
                lineToRelative(-39f, -113f)
                horizontalLineTo(236f)
                lineToRelative(-40f, 113f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(139f, -177f)
                horizontalLineToRelative(131f)
                lineToRelative(-65f, -182f)
                horizontalLineToRelative(-4f)
                lineToRelative(-62f, 182f)
                close()
            }
        }.build()
        
        return _Uppercase!!
    }

private var _Uppercase: ImageVector? = null

