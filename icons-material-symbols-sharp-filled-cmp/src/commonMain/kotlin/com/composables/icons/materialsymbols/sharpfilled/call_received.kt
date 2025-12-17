package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Call_received: ImageVector
    get() {
        if (_Call_received != null) return _Call_received!!
        
        _Call_received = ImageVector.Builder(
            name = "call_received",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(264f)
                lineToRelative(464f, -464f)
                lineToRelative(56f, 56f)
                lineToRelative(-464f, 464f)
                horizontalLineToRelative(264f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Call_received!!
    }

private var _Call_received: ImageVector? = null

