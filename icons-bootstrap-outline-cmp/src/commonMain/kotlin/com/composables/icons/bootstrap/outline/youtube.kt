package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Youtube: ImageVector
    get() {
        if (_Youtube != null) return _Youtube!!
        
        _Youtube = ImageVector.Builder(
            name = "youtube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.051f, 1.999f)
                horizontalLineToRelative(0.089f)
                curveToRelative(0.822f, 0.003f, 4.987f, 0.033f, 6.11f, 0.335f)
                arcToRelative(2.01f, 2.01f, 0f, false, true, 1.415f, 1.42f)
                curveToRelative(0.101f, 0.38f, 0.172f, 0.883f, 0.22f, 1.402f)
                lineToRelative(0.01f, 0.104f)
                lineToRelative(0.022f, 0.26f)
                lineToRelative(0.008f, 0.104f)
                curveToRelative(0.065f, 0.914f, 0.073f, 1.77f, 0.074f, 1.957f)
                verticalLineToRelative(0.075f)
                curveToRelative(-0.001f, 0.194f, -0.01f, 1.108f, -0.082f, 2.06f)
                lineToRelative(-0.008f, 0.105f)
                lineToRelative(-0.009f, 0.104f)
                curveToRelative(-0.05f, 0.572f, -0.124f, 1.14f, -0.235f, 1.558f)
                arcToRelative(2.01f, 2.01f, 0f, false, true, -1.415f, 1.42f)
                curveToRelative(-1.16f, 0.312f, -5.569f, 0.334f, -6.18f, 0.335f)
                horizontalLineToRelative(-0.142f)
                curveToRelative(-0.309f, 0f, -1.587f, -0.006f, -2.927f, -0.052f)
                lineToRelative(-0.17f, -0.006f)
                lineToRelative(-0.087f, -0.004f)
                lineToRelative(-0.171f, -0.007f)
                lineToRelative(-0.171f, -0.007f)
                curveToRelative(-1.11f, -0.049f, -2.167f, -0.128f, -2.654f, -0.26f)
                arcToRelative(2.01f, 2.01f, 0f, false, true, -1.415f, -1.419f)
                curveToRelative(-0.111f, -0.417f, -0.185f, -0.986f, -0.235f, -1.558f)
                lineTo(0.09f, 9.82f)
                lineToRelative(-0.008f, -0.104f)
                arcTo(31f, 31f, 0f, false, true, 0f, 7.68f)
                verticalLineToRelative(-0.123f)
                curveToRelative(0.002f, -0.215f, 0.01f, -0.958f, 0.064f, -1.778f)
                lineToRelative(0.007f, -0.103f)
                lineToRelative(0.003f, -0.052f)
                lineToRelative(0.008f, -0.104f)
                lineToRelative(0.022f, -0.26f)
                lineToRelative(0.01f, -0.104f)
                curveToRelative(0.048f, -0.519f, 0.119f, -1.023f, 0.22f, -1.402f)
                arcToRelative(2.01f, 2.01f, 0f, false, true, 1.415f, -1.42f)
                curveToRelative(0.487f, -0.13f, 1.544f, -0.21f, 2.654f, -0.26f)
                lineToRelative(0.17f, -0.007f)
                lineToRelative(0.172f, -0.006f)
                lineToRelative(0.086f, -0.003f)
                lineToRelative(0.171f, -0.007f)
                arcTo(100f, 100f, 0f, false, true, 7.858f, 2f)
                close()
                moveTo(6.4f, 5.209f)
                verticalLineToRelative(4.818f)
                lineToRelative(4.157f, -2.408f)
                close()
            }
        }.build()
        
        return _Youtube!!
    }

private var _Youtube: ImageVector? = null

