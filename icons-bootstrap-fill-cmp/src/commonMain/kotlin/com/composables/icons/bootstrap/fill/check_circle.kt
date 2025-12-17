package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CheckCircle: ImageVector
    get() {
        if (_CheckCircle != null) return _CheckCircle!!
        
        _CheckCircle = ImageVector.Builder(
            name = "check-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveToRelative(-3.97f, -3.03f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.08f, 0.022f)
                lineTo(7.477f, 9.417f)
                lineTo(5.384f, 7.323f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineTo(6.97f, 11.03f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.079f, -0.02f)
                lineToRelative(3.992f, -4.99f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.01f, -1.05f)
                close()
            }
        }.build()
        
        return _CheckCircle!!
    }

private var _CheckCircle: ImageVector? = null

