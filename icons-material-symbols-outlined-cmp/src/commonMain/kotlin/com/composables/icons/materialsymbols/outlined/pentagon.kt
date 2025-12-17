package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Pentagon: ImageVector
    get() {
        if (_Pentagon != null) return _Pentagon!!
        
        _Pentagon = ImageVector.Builder(
            name = "pentagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(298f, 760f)
                horizontalLineToRelative(364f)
                lineToRelative(123f, -369f)
                lineToRelative(-305f, -213f)
                lineToRelative(-305f, 213f)
                lineToRelative(123f, 369f)
                close()
                moveToRelative(-58f, 80f)
                lineTo(80f, 360f)
                lineToRelative(400f, -280f)
                lineToRelative(400f, 280f)
                lineToRelative(-160f, 480f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -371f)
                close()
            }
        }.build()
        
        return _Pentagon!!
    }

private var _Pentagon: ImageVector? = null

