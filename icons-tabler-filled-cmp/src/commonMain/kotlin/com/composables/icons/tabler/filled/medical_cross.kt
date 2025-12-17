package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.MedicalCross: ImageVector
    get() {
        if (_MedicalCross != null) return _MedicalCross!!
        
        _MedicalCross = ImageVector.Builder(
            name = "medical-cross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 2f)
                lineToRelative(-0.15f, 0.005f)
                arcToRelative(2f, 2f, 0f, false, false, -1.85f, 1.995f)
                verticalLineToRelative(2.803f)
                lineToRelative(-2.428f, -1.401f)
                arcToRelative(2f, 2f, 0f, false, false, -2.732f, 0.732f)
                lineToRelative(-1f, 1.732f)
                lineToRelative(-0.073f, 0.138f)
                arcToRelative(2f, 2f, 0f, false, false, 0.805f, 2.594f)
                lineToRelative(2.427f, 1.402f)
                lineToRelative(-2.427f, 1.402f)
                arcToRelative(2f, 2f, 0f, false, false, -0.732f, 2.732f)
                lineToRelative(1f, 1.732f)
                lineToRelative(0.083f, 0.132f)
                arcToRelative(2f, 2f, 0f, false, false, 2.649f, 0.6f)
                lineToRelative(2.428f, -1.402f)
                verticalLineToRelative(2.804f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(2f)
                lineToRelative(0.15f, -0.005f)
                arcToRelative(2f, 2f, 0f, false, false, 1.85f, -1.995f)
                verticalLineToRelative(-2.804f)
                lineToRelative(2.428f, 1.403f)
                arcToRelative(2f, 2f, 0f, false, false, 2.732f, -0.732f)
                lineToRelative(1f, -1.732f)
                lineToRelative(0.073f, -0.138f)
                arcToRelative(2f, 2f, 0f, false, false, -0.805f, -2.594f)
                lineToRelative(-2.428f, -1.403f)
                lineToRelative(2.428f, -1.402f)
                arcToRelative(2f, 2f, 0f, false, false, 0.732f, -2.732f)
                lineToRelative(-1f, -1.732f)
                lineToRelative(-0.083f, -0.132f)
                arcToRelative(2f, 2f, 0f, false, false, -2.649f, -0.6f)
                lineToRelative(-2.428f, 1.4f)
                verticalLineToRelative(-2.802f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _MedicalCross!!
    }

private var _MedicalCross: ImageVector? = null

