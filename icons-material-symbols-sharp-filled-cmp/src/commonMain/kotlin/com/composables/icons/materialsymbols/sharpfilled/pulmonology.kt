package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pulmonology: ImageVector
    get() {
        if (_Pulmonology != null) return _Pulmonology!!
        
        _Pulmonology = ImageVector.Builder(
            name = "pulmonology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(304f)
                lineToRelative(120f, 120f)
                lineToRelative(42f, -42f)
                lineToRelative(-101f, -102f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(167f)
                lineToRelative(132f, 353f)
                verticalLineToRelative(287f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                lineToRelative(16f, -128f)
                lineToRelative(-56f, -56f)
                lineToRelative(-56f, 56f)
                lineToRelative(16f, 128f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                verticalLineToRelative(-287f)
                lineToRelative(132f, -353f)
                horizontalLineToRelative(168f)
                verticalLineToRelative(160f)
                lineTo(278f, 462f)
                lineToRelative(42f, 42f)
                lineToRelative(120f, -120f)
                verticalLineToRelative(-304f)
                close()
            }
        }.build()
        
        return _Pulmonology!!
    }

private var _Pulmonology: ImageVector? = null

