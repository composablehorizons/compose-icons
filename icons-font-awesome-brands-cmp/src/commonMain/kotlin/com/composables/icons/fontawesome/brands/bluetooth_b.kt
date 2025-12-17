package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.BluetoothB: ImageVector
    get() {
        if (_BluetoothB != null) return _BluetoothB!!
        
        _BluetoothB = ImageVector.Builder(
            name = "bluetooth-b",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(196.48f, 260.023f)
                lineToRelative(92.626f, -103.333f)
                lineTo(143.125f, 0f)
                verticalLineToRelative(206.33f)
                lineToRelative(-86.111f, -86.111f)
                lineToRelative(-31.406f, 31.405f)
                lineToRelative(108.061f, 108.399f)
                lineTo(25.608f, 368.422f)
                lineToRelative(31.406f, 31.405f)
                lineToRelative(86.111f, -86.111f)
                lineTo(145.84f, 512f)
                lineToRelative(148.552f, -148.644f)
                lineToRelative(-97.912f, -103.333f)
                close()
                moveToRelative(40.86f, -102.996f)
                lineToRelative(-49.977f, 49.978f)
                lineToRelative(-0.338f, -100.295f)
                lineToRelative(50.315f, 50.317f)
                close()
                moveTo(187.363f, 313.04f)
                lineToRelative(49.977f, 49.978f)
                lineToRelative(-50.315f, 50.316f)
                lineToRelative(0.338f, -100.294f)
                close()
            }
        }.build()
        
        return _BluetoothB!!
    }

private var _BluetoothB: ImageVector? = null

