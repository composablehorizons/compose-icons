package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Flashlight_off: ImageVector
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
                moveTo(320f, 880f)
                verticalLineToRelative(-448f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                lineToRelative(-152f, -152f)
                verticalLineToRelative(128f)
                horizontalLineTo(320f)
                close()
                moveToRelative(-80f, -754f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(120f)
                horizontalLineTo(314f)
                lineToRelative(-74f, -74f)
                close()
                moveToRelative(400f, 400f)
                lineTo(394f, 280f)
                horizontalLineToRelative(326f)
                verticalLineToRelative(40f)
                lineToRelative(-80f, 120f)
                verticalLineToRelative(86f)
                close()
            }
        }.build()
        
        return _Flashlight_off!!
    }

private var _Flashlight_off: ImageVector? = null

