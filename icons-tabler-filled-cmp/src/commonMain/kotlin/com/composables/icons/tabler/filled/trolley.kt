package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Trolley: ImageVector
    get() {
        if (_Trolley != null) return _Trolley!!
        
        _Trolley = ImageVector.Builder(
            name = "trolley",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.555f, 4.168f)
                arcToRelative(1f, 1f, 0f, false, true, 0.277f, 1.387f)
                lineToRelative(-2.621f, 3.932f)
                lineToRelative(1.236f, 0.619f)
                arcToRelative(1f, 1f, 0f, false, true, -0.894f, 1.788f)
                lineToRelative(-1.46f, -0.73f)
                lineToRelative(-3.876f, 5.815f)
                arcToRelative(3f, 3f, 0f, true, true, -5.217f, 2.021f)
                lineToRelative(0.005f, -0.176f)
                quadToRelative(0.008f, -0.135f, 0.027f, -0.267f)
                lineToRelative(-2.587f, -1.725f)
                arcToRelative(1f, 1f, 0f, false, true, 1.11f, -1.664f)
                lineToRelative(2.424f, 1.615f)
                arcToRelative(2.99f, 2.99f, 0f, false, true, 2.464f, -0.75f)
                lineToRelative(7.725f, -11.588f)
                arcToRelative(1f, 1f, 0f, false, true, 1.387f, -0.277f)
                moveToRelative(-10.567f, -0.399f)
                lineToRelative(0.14f, 0.082f)
                lineToRelative(3.307f, 2.104f)
                arcToRelative(2.3f, 2.3f, 0f, false, true, 0.7f, 3.185f)
                lineToRelative(-3.094f, 4.81f)
                arcToRelative(2.3f, 2.3f, 0f, false, true, -3.17f, 0.698f)
                lineToRelative(-3.306f, -2.104f)
                arcToRelative(2.3f, 2.3f, 0f, false, true, -0.7f, -3.185f)
                lineToRelative(3.094f, -4.81f)
                arcToRelative(2.3f, 2.3f, 0f, false, true, 3.029f, -0.78f)
            }
        }.build()
        
        return _Trolley!!
    }

private var _Trolley: ImageVector? = null

