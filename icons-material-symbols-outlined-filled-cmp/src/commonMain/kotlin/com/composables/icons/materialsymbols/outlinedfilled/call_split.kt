package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Call_split: ImageVector
    get() {
        if (_Call_split != null) return _Call_split!!
        
        _Call_split = ImageVector.Builder(
            name = "call_split",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 800f)
                verticalLineToRelative(-304f)
                lineTo(240f, 296f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(296f)
                lineToRelative(224f, 224f)
                verticalLineToRelative(336f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(154f, -376f)
                lineToRelative(-58f, -58f)
                lineToRelative(128f, -126f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-104f)
                lineTo(594f, 424f)
                close()
            }
        }.build()
        
        return _Call_split!!
    }

private var _Call_split: ImageVector? = null

