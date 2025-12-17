package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Pill: ImageVector
    get() {
        if (_Pill != null) return _Pill!!
        
        _Pill = ImageVector.Builder(
            name = "pill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.207f, 3.793f)
                arcToRelative(5.95f, 5.95f, 0f, false, true, 0f, 8.414f)
                lineToRelative(-8f, 8f)
                arcToRelative(5.95f, 5.95f, 0f, false, true, -8.414f, -8.414f)
                lineToRelative(8f, -8f)
                arcToRelative(5.95f, 5.95f, 0f, false, true, 8.414f, 0f)
                moveToRelative(-7f, 1.414f)
                lineToRelative(-4.294f, 4.293f)
                lineToRelative(5.586f, 5.586f)
                lineToRelative(4.294f, -4.292f)
                arcToRelative(3.95f, 3.95f, 0f, true, false, -5.586f, -5.586f)
            }
        }.build()
        
        return _Pill!!
    }

private var _Pill: ImageVector? = null

