package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Fire: ImageVector
    get() {
        if (_Fire != null) return _Fire!!
        
        _Fire = ImageVector.Builder(
            name = "fire",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.074f, 0.945f)
                arcTo(4.993f, 4.993f, 0f, false, false, 6f, 5f)
                verticalLineToRelative(0.032f)
                curveToRelative(0.004f, 0.6f, 0.114f, 1.176f, 0.311f, 1.709f)
                curveToRelative(0.16f, 0.428f, -0.204f, 0.91f, -0.61f, 0.7f)
                arcToRelative(5.023f, 5.023f, 0f, false, true, -1.868f, -1.677f)
                curveToRelative(-0.202f, -0.304f, -0.648f, -0.363f, -0.848f, -0.058f)
                arcToRelative(6f, 6f, 0f, true, false, 8.017f, -1.901f)
                lineToRelative(-0.004f, -0.007f)
                arcToRelative(4.98f, 4.98f, 0f, false, true, -2.18f, -2.574f)
                curveToRelative(-0.116f, -0.31f, -0.477f, -0.472f, -0.744f, -0.28f)
                close()
                moveToRelative(0.78f, 6.178f)
                arcToRelative(3.001f, 3.001f, 0f, true, true, -3.473f, 4.341f)
                curveToRelative(-0.205f, -0.365f, 0.215f, -0.694f, 0.62f, -0.59f)
                arcToRelative(4.008f, 4.008f, 0f, false, false, 1.873f, 0.03f)
                curveToRelative(0.288f, -0.065f, 0.413f, -0.386f, 0.321f, -0.666f)
                arcTo(3.997f, 3.997f, 0f, false, true, 8f, 8.999f)
                curveToRelative(0f, -0.585f, 0.126f, -1.14f, 0.351f, -1.641f)
                arcToRelative(0.42f, 0.42f, 0f, false, true, 0.503f, -0.235f)
                close()
            }
        }.build()
        
        return _Fire!!
    }

private var _Fire: ImageVector? = null

