package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Factory: ImageVector
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
                moveToRelative(360f, -160f)
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
                moveToRelative(272f, -380f)
                horizontalLineTo(687f)
                lineToRelative(34f, -260f)
                horizontalLineToRelative(119f)
                lineToRelative(32f, 260f)
                close()
            }
        }.build()
        
        return _Factory!!
    }

private var _Factory: ImageVector? = null

