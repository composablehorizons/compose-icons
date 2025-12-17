package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.XboxX: ImageVector
    get() {
        if (_XboxX != null) return _XboxX!!
        
        _XboxX = ImageVector.Builder(
            name = "xbox-x",
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
                moveToRelative(3.6f, 5.2f)
                arcToRelative(1f, 1f, 0f, false, false, -1.4f, 0.2f)
                lineToRelative(-2.2f, 2.933f)
                lineToRelative(-2.2f, -2.933f)
                arcToRelative(1f, 1f, 0f, true, false, -1.6f, 1.2f)
                lineToRelative(2.55f, 3.4f)
                lineToRelative(-2.55f, 3.4f)
                arcToRelative(1f, 1f, 0f, true, false, 1.6f, 1.2f)
                lineToRelative(2.2f, -2.933f)
                lineToRelative(2.2f, 2.933f)
                arcToRelative(1f, 1f, 0f, false, false, 1.6f, -1.2f)
                lineToRelative(-2.55f, -3.4f)
                lineToRelative(2.55f, -3.4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.2f, -1.4f)
            }
        }.build()
        
        return _XboxX!!
    }

private var _XboxX: ImageVector? = null

