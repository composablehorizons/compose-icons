package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Truck: ImageVector
    get() {
        if (_Truck != null) return _Truck!!
        
        _Truck = ImageVector.Builder(
            name = "truck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.783f, 0.378f)
                lineToRelative(0.074f, 0.108f)
                lineToRelative(3f, 5f)
                lineToRelative(0.055f, 0.103f)
                lineToRelative(0.04f, 0.107f)
                lineToRelative(0.029f, 0.109f)
                lineToRelative(0.016f, 0.11f)
                lineToRelative(0.003f, 0.085f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, -5.658f, 0f)
                horizontalLineToRelative(-4.342f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, -5.658f, 0f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-11f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
                moveToRelative(-6f, 12f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(10f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(0.434f, -9f)
                horizontalLineToRelative(-3.434f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.234f)
                close()
            }
        }.build()
        
        return _Truck!!
    }

private var _Truck: ImageVector? = null

