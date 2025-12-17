package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Factory: ImageVector
    get() {
        if (_Factory != null) return _Factory!!
        
        _Factory = ImageVector.Builder(
            name = "factory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-481f)
                lineToRelative(280f, -119f)
                verticalLineToRelative(80f)
                lineToRelative(200f, -80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(480f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-320f)
                horizontalLineTo(480f)
                verticalLineToRelative(-82f)
                lineToRelative(-200f, 80f)
                verticalLineToRelative(-78f)
                lineToRelative(-120f, 53f)
                verticalLineToRelative(347f)
                close()
                moveToRelative(280f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(320f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(280f, -320f)
                horizontalLineTo(680f)
                lineToRelative(40f, -320f)
                horizontalLineToRelative(120f)
                lineToRelative(40f, 320f)
                close()
                moveTo(160f, 800f)
                horizontalLineToRelative(640f)
                horizontalLineToRelative(-640f)
                close()
            }
        }.build()
        
        return _Factory!!
    }

private var _Factory: ImageVector? = null

