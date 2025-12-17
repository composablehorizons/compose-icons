package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Nurse: ImageVector
    get() {
        if (_Nurse != null) return _Nurse!!
        
        _Nurse = ImageVector.Builder(
            name = "nurse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.002f, 4f)
                curveToRelative(2.866f, 0f, 6.7f, 1.365f, 9.532f, 3.155f)
                arcToRelative(1f, 1f, 0f, false, true, 0.45f, 1.024f)
                lineToRelative(-2f, 11f)
                arcToRelative(1f, 1f, 0f, false, true, -0.984f, 0.821f)
                horizontalLineToRelative(-14f)
                arcToRelative(1f, 1f, 0f, false, true, -0.984f, -0.821f)
                lineToRelative(-2f, -11f)
                arcToRelative(1f, 1f, 0f, false, true, 0.45f, -1.024f)
                curveToRelative(2.834f, -1.792f, 6.724f, -3.16f, 9.536f, -3.155f)
                moveToRelative(-0.002f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                close()
            }
        }.build()
        
        return _Nurse!!
    }

private var _Nurse: ImageVector? = null

