package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.XboxA: ImageVector
    get() {
        if (_XboxA != null) return _XboxA!!
        
        _XboxA = ImageVector.Builder(
            name = "xbox-a",
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
                moveToRelative(0.936f, 5.649f)
                curveToRelative(-0.324f, -0.865f, -1.548f, -0.865f, -1.872f, 0f)
                lineToRelative(-3f, 8f)
                arcToRelative(1f, 1f, 0f, false, false, 0.585f, 1.287f)
                lineToRelative(0.111f, 0.035f)
                arcToRelative(1f, 1f, 0f, false, false, 1.176f, -0.62f)
                lineToRelative(0.507f, -1.351f)
                horizontalLineToRelative(3.114f)
                lineToRelative(0.507f, 1.351f)
                arcToRelative(1f, 1f, 0f, true, false, 1.872f, -0.702f)
                close()
                moveToRelative(-0.936f, 3.199f)
                lineToRelative(0.807f, 2.152f)
                horizontalLineToRelative(-1.614f)
                close()
            }
        }.build()
        
        return _XboxA!!
    }

private var _XboxA: ImageVector? = null

