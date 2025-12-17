package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wrist: ImageVector
    get() {
        if (_Wrist != null) return _Wrist!!
        
        _Wrist = ImageVector.Builder(
            name = "wrist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 876f)
                lineTo(244f, 680f)
                horizontalLineTo(40f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(184f)
                lineToRelative(78f, -80f)
                horizontalLineToRelative(498f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(485f)
                lineToRelative(45f, 89f)
                lineToRelative(-90f, 87f)
                close()
            }
        }.build()
        
        return _Wrist!!
    }

private var _Wrist: ImageVector? = null

