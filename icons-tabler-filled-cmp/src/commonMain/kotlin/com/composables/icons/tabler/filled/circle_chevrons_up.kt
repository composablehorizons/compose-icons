package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleChevronsUp: ImageVector
    get() {
        if (_CircleChevronsUp != null) return _CircleChevronsUp!!
        
        _CircleChevronsUp = ImageVector.Builder(
            name = "circle-chevrons-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.867f, 2.001f)
                curveToRelative(5.495f, 0f, 9.96f, 4.432f, 10f, 9.926f)
                reflectiveCurveToRelative(-4.359f, 9.993f, -9.852f, 10.073f)
                horizontalLineToRelative(-0.295f)
                curveToRelative(-5.493f, -0.081f, -9.893f, -4.579f, -9.852f, -10.073f)
                curveToRelative(0.04f, -5.494f, 4.505f, -9.926f, 10f, -9.926f)
                moveToRelative(0.84f, 9.292f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(2.292f, -2.292f)
                lineToRelative(2.293f, 2.292f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, -1.414f)
                close()
                moveToRelative(0f, -4f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(2.292f, -2.292f)
                lineToRelative(2.293f, 2.292f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, -1.414f)
                close()
            }
        }.build()
        
        return _CircleChevronsUp!!
    }

private var _CircleChevronsUp: ImageVector? = null

