package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowRightCircle: ImageVector
    get() {
        if (_ArrowRightCircle != null) return _ArrowRightCircle!!
        
        _ArrowRightCircle = ImageVector.Builder(
            name = "arrow-right-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 15f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 5.825f, -0.824f)
                horizontalLineToRelative(10.756f)
                lineToRelative(-1.292f, -1.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(3f, 3f)
                lineToRelative(0.097f, 0.112f)
                lineToRelative(0.071f, 0.11f)
                lineToRelative(0.031f, 0.062f)
                lineToRelative(0.034f, 0.081f)
                lineToRelative(0.024f, 0.076f)
                lineToRelative(0.03f, 0.148f)
                lineToRelative(0.005f, 0.118f)
                lineToRelative(-0.004f, 0.085f)
                lineToRelative(-0.016f, 0.116f)
                lineToRelative(-0.03f, 0.111f)
                lineToRelative(-0.044f, 0.111f)
                lineToRelative(-0.052f, 0.098f)
                lineToRelative(-0.074f, 0.104f)
                lineToRelative(-0.073f, 0.082f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, -1.414f)
                lineToRelative(1.292f, -1.293f)
                horizontalLineToRelative(-10.756f)
                arcToRelative(3f, 3f, 0f, false, true, -2.829f, 2f)
            }
        }.build()
        
        return _ArrowRightCircle!!
    }

private var _ArrowRightCircle: ImageVector? = null

