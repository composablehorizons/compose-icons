package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Call_made: ImageVector
    get() {
        if (_Call_made != null) return _Call_made!!
        
        _Call_made = ImageVector.Builder(
            name = "call_made",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 800f)
                lineToRelative(-56f, -56f)
                lineToRelative(464f, -464f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-264f)
                lineTo(216f, 800f)
                close()
            }
        }.build()
        
        return _Call_made!!
    }

private var _Call_made: ImageVector? = null

