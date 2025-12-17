package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleLetterV: ImageVector
    get() {
        if (_CircleLetterV != null) return _CircleLetterV!!
        
        _CircleLetterV = ImageVector.Builder(
            name = "circle-letter-v",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                reflectiveCurveToRelative(-10f, -4.477f, -10f, -10f)
                reflectiveCurveToRelative(4.477f, -10f, 10f, -10f)
                moveToRelative(2.243f, 5.03f)
                arcToRelative(1f, 1f, 0f, false, false, -1.213f, 0.727f)
                lineToRelative(-1.03f, 4.118f)
                lineToRelative(-1.03f, -4.118f)
                arcToRelative(1f, 1f, 0f, true, false, -1.94f, 0.486f)
                lineToRelative(2f, 8f)
                curveToRelative(0.252f, 1.01f, 1.688f, 1.01f, 1.94f, 0f)
                lineToRelative(2f, -8f)
                arcToRelative(1f, 1f, 0f, false, false, -0.727f, -1.213f)
            }
        }.build()
        
        return _CircleLetterV!!
    }

private var _CircleLetterV: ImageVector? = null

