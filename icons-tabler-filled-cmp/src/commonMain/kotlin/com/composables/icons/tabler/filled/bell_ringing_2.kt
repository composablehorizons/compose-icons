package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BellRinging2: ImageVector
    get() {
        if (_BellRinging2 != null) return _BellRinging2!!
        
        _BellRinging2 = ImageVector.Builder(
            name = "bell-ringing-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.63f, 17.531f)
                curveToRelative(0.612f, 0.611f, 0.211f, 1.658f, -0.652f, 1.706f)
                arcToRelative(3.992f, 3.992f, 0f, false, true, -3.05f, -1.166f)
                arcToRelative(3.992f, 3.992f, 0f, false, true, -1.165f, -3.049f)
                curveToRelative(0.046f, -0.826f, 1.005f, -1.228f, 1.624f, -0.726f)
                lineToRelative(0.082f, 0.074f)
                lineToRelative(3.161f, 3.16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.071f, 3.929f)
                curveToRelative(0.96f, 0.96f, 1.134f, 2.41f, 0.52f, 3.547f)
                lineToRelative(-0.09f, 0.153f)
                lineToRelative(-0.024f, 0.036f)
                arcToRelative(8.013f, 8.013f, 0f, false, true, -1.446f, 7.137f)
                lineToRelative(-0.183f, 0.223f)
                lineToRelative(-0.191f, 0.218f)
                lineToRelative(-2.073f, 2.072f)
                lineToRelative(-0.08f, 0.112f)
                arcToRelative(3f, 3f, 0f, false, false, -0.499f, 2.113f)
                lineToRelative(0.035f, 0.201f)
                lineToRelative(0.045f, 0.185f)
                curveToRelative(0.264f, 0.952f, -0.853f, 1.645f, -1.585f, 1.051f)
                lineToRelative(-0.086f, -0.078f)
                lineToRelative(-11.313f, -11.313f)
                curveToRelative(-0.727f, -0.727f, -0.017f, -1.945f, 0.973f, -1.671f)
                arcToRelative(3f, 3f, 0f, false, false, 2.5f, -0.418f)
                lineToRelative(0.116f, -0.086f)
                lineToRelative(2.101f, -2.1f)
                arcToRelative(8f, 8f, 0f, false, true, 7.265f, -1.86f)
                lineToRelative(0.278f, 0.071f)
                lineToRelative(0.037f, -0.023f)
                arcToRelative(3.003f, 3.003f, 0f, false, true, 3.432f, 0.192f)
                lineToRelative(0.14f, 0.117f)
                lineToRelative(0.128f, 0.12f)
                close()
            }
        }.build()
        
        return _BellRinging2!!
    }

private var _BellRinging2: ImageVector? = null

