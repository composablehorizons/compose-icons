package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Flashlight_off: ImageVector
    get() {
        if (_Flashlight_off != null) return _Flashlight_off!!
        
        _Flashlight_off = ImageVector.Builder(
            name = "flashlight_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineTo(640f, 752f)
                verticalLineToRelative(128f)
                horizontalLineTo(320f)
                verticalLineToRelative(-448f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(400f, 800f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-128f)
                lineTo(400f, 512f)
                verticalLineToRelative(288f)
                close()
                moveToRelative(240f, -274f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-30f)
                lineToRelative(80f, -120f)
                verticalLineToRelative(-16f)
                horizontalLineTo(394f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(326f)
                verticalLineToRelative(-40f)
                horizontalLineTo(274f)
                lineToRelative(-34f, -34f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(240f)
                lineToRelative(-80f, 120f)
                verticalLineToRelative(86f)
                close()
                moveToRelative(-160f, 66f)
                close()
                moveToRelative(17f, -209f)
                close()
            }
        }.build()
        
        return _Flashlight_off!!
    }

private var _Flashlight_off: ImageVector? = null

