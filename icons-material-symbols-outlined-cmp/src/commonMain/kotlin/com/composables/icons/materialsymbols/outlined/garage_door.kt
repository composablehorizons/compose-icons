package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Garage_door: ImageVector
    get() {
        if (_Garage_door != null) return _Garage_door!!
        
        _Garage_door = ImageVector.Builder(
            name = "garage_door",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-406f)
                lineTo(88f, 520f)
                lineToRelative(-48f, -64f)
                lineToRelative(440f, -336f)
                lineToRelative(440f, 336f)
                lineToRelative(-48f, 64f)
                lineToRelative(-112f, -86f)
                verticalLineToRelative(406f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-400f)
                horizontalLineTo(280f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(-23f, -200f)
                horizontalLineToRelative(366f)
                lineTo(480f, 221f)
                lineTo(297f, 360f)
                close()
            }
        }.build()
        
        return _Garage_door!!
    }

private var _Garage_door: ImageVector? = null

