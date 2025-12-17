package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SteeringWheel: ImageVector
    get() {
        if (_SteeringWheel != null) return _SteeringWheel!!
        
        _SteeringWheel = ImageVector.Builder(
            name = "steering-wheel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                moveToRelative(-13f, 8.66f)
                arcToRelative(8f, 8f, 0f, false, false, 7f, 7.937f)
                verticalLineToRelative(-5.107f)
                arcToRelative(3f, 3f, 0f, false, true, -1.898f, -2.05f)
                lineToRelative(-5.07f, -1.504f)
                quadToRelative(-0.031f, 0.36f, -0.032f, 0.725f)
                moveToRelative(15.967f, -0.725f)
                lineToRelative(-5.069f, 1.503f)
                arcToRelative(3f, 3f, 0f, false, true, -1.897f, 2.051f)
                verticalLineToRelative(5.108f)
                arcToRelative(8f, 8f, 0f, false, false, 6.985f, -8.422f)
                close()
                moveToRelative(-11.967f, -6.204f)
                arcToRelative(8f, 8f, 0f, false, false, -3.536f, 4.244f)
                lineToRelative(4.812f, 1.426f)
                arcToRelative(3f, 3f, 0f, false, true, 5.448f, 0f)
                lineToRelative(4.812f, -1.426f)
                arcToRelative(8f, 8f, 0f, false, false, -11.536f, -4.244f)
            }
        }.build()
        
        return _SteeringWheel!!
    }

private var _SteeringWheel: ImageVector? = null

