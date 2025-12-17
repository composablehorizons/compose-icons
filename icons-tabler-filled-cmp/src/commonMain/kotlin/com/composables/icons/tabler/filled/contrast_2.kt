package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Contrast2: ImageVector
    get() {
        if (_Contrast2 != null) return _Contrast2!!
        
        _Contrast2 = ImageVector.Builder(
            name = "contrast-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveToRelative(0f, 2f)
                horizontalLineToRelative(-14f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 0.769f, 0.973f)
                curveToRelative(3.499f, -0.347f, 7.082f, -4.127f, 7.226f, -7.747f)
                lineToRelative(0.005f, -0.226f)
                curveToRelative(0f, -3.687f, 3.66f, -7.619f, 7.232f, -7.974f)
                arcToRelative(1f, 1f, 0f, false, false, -0.232f, -0.026f)
            }
        }.build()
        
        return _Contrast2!!
    }

private var _Contrast2: ImageVector? = null

