package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fiber_pin: ImageVector
    get() {
        if (_Fiber_pin != null) return _Fiber_pin!!
        
        _Fiber_pin = ImageVector.Builder(
            name = "fiber_pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 600f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(250f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(110f, 0f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-140f)
                lineToRelative(102f, 140f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(140f)
                lineTo(610f, 360f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(240f)
                close()
                moveTo(260f, 460f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Fiber_pin!!
    }

private var _Fiber_pin: ImageVector? = null

