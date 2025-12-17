package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Alexa: ImageVector
    get() {
        if (_Alexa != null) return _Alexa!!
        
        _Alexa = ImageVector.Builder(
            name = "alexa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.996f, 0f)
                arcTo(8f, 8f, 0f, false, false, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, false, 6.93f, 7.93f)
                verticalLineToRelative(-1.613f)
                arcToRelative(1.06f, 1.06f, 0f, false, false, -0.717f, -1.008f)
                arcTo(5.6f, 5.6f, 0f, false, true, 2.4f, 7.865f)
                arcTo(5.58f, 5.58f, 0f, false, true, 8.054f, 2.4f)
                arcToRelative(5.6f, 5.6f, 0f, false, true, 5.535f, 5.81f)
                lineToRelative(-0.002f, 0.046f)
                lineToRelative(-0.012f, 0.192f)
                lineToRelative(-0.005f, 0.061f)
                arcToRelative(5f, 5f, 0f, false, true, -0.033f, 0.284f)
                lineToRelative(-0.01f, 0.068f)
                curveToRelative(-0.685f, 4.516f, -6.564f, 7.054f, -6.596f, 7.068f)
                arcTo(7.998f, 7.998f, 0f, false, false, 15.992f, 8f)
                arcTo(8f, 8f, 0f, false, false, 7.996f, 0.001f)
                close()
            }
        }.build()
        
        return _Alexa!!
    }

private var _Alexa: ImageVector? = null

