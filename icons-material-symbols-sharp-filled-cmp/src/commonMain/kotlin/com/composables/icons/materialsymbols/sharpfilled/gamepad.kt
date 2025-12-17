package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Gamepad: ImageVector
    get() {
        if (_Gamepad != null) return _Gamepad!!
        
        _Gamepad = ImageVector.Builder(
            name = "gamepad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 420f)
                lineTo(360f, 300f)
                verticalLineToRelative(-220f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(220f)
                lineTo(480f, 420f)
                close()
                moveToRelative(180f, 180f)
                lineTo(540f, 480f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(240f)
                horizontalLineTo(660f)
                close()
                moveToRelative(-580f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(220f)
                lineToRelative(120f, 120f)
                lineToRelative(-120f, 120f)
                horizontalLineTo(80f)
                close()
                moveTo(360f, 880f)
                verticalLineToRelative(-220f)
                lineToRelative(120f, -120f)
                lineToRelative(120f, 120f)
                verticalLineToRelative(220f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Gamepad!!
    }

private var _Gamepad: ImageVector? = null

