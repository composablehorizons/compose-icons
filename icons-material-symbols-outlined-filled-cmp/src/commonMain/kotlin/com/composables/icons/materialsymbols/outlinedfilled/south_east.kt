package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.South_east: ImageVector
    get() {
        if (_South_east != null) return _South_east!!
        
        _South_east = ImageVector.Builder(
            name = "south_east",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(264f)
                lineTo(160f, 216f)
                lineToRelative(56f, -56f)
                lineToRelative(464f, 464f)
                verticalLineToRelative(-264f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _South_east!!
    }

private var _South_east: ImageVector? = null

