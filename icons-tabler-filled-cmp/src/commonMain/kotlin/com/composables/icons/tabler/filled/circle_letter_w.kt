package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleLetterW: ImageVector
    get() {
        if (_CircleLetterW != null) return _CircleLetterW!!
        
        _CircleLetterW = ImageVector.Builder(
            name = "circle-letter-w",
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
                moveToRelative(2.008f, 5.876f)
                lineToRelative(-0.52f, 4.153f)
                lineToRelative(-0.56f, -1.4f)
                curveToRelative(-0.319f, -0.799f, -1.41f, -0.837f, -1.803f, -0.114f)
                lineToRelative(-0.053f, 0.114f)
                lineToRelative(-0.561f, 1.4f)
                lineToRelative(-0.519f, -4.153f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -0.876f)
                lineToRelative(-0.116f, 0.008f)
                arcToRelative(1f, 1f, 0f, false, false, -0.868f, 1.116f)
                lineToRelative(1f, 8f)
                curveToRelative(0.128f, 1.025f, 1.537f, 1.207f, 1.92f, 0.247f)
                lineToRelative(1.072f, -2.678f)
                lineToRelative(1.072f, 2.678f)
                curveToRelative(0.383f, 0.96f, 1.792f, 0.778f, 1.92f, -0.247f)
                lineToRelative(1f, -8f)
                arcToRelative(1f, 1f, 0f, false, false, -1.984f, -0.248f)
            }
        }.build()
        
        return _CircleLetterW!!
    }

private var _CircleLetterW: ImageVector? = null

