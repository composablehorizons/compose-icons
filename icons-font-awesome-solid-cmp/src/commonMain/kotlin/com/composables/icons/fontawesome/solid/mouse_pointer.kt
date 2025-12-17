package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MousePointer: ImageVector
    get() {
        if (_MousePointer != null) return _MousePointer!!
        
        _MousePointer = ImageVector.Builder(
            name = "mouse-pointer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(302.189f, 329.126f)
                horizontalLineTo(196.105f)
                lineToRelative(55.831f, 135.993f)
                curveToRelative(3.889f, 9.428f, -0.555f, 19.999f, -9.444f, 23.999f)
                lineToRelative(-49.165f, 21.427f)
                curveToRelative(-9.165f, 4f, -19.443f, -0.571f, -23.332f, -9.714f)
                lineToRelative(-53.053f, -129.136f)
                lineToRelative(-86.664f, 89.138f)
                curveTo(18.729f, 472.71f, 0f, 463.554f, 0f, 447.977f)
                verticalLineTo(18.299f)
                curveTo(0f, 1.899f, 19.921f, -6.096f, 30.277f, 5.443f)
                lineToRelative(284.412f, 292.542f)
                curveToRelative(11.472f, 11.179f, 3.007f, 31.141f, -12.5f, 31.141f)
                close()
            }
        }.build()
        
        return _MousePointer!!
    }

private var _MousePointer: ImageVector? = null

