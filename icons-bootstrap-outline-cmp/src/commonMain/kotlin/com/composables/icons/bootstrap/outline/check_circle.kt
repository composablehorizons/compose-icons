package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CheckCircle: ImageVector
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
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 14f)
                moveToRelative(0f, 1f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.97f, 4.97f)
                lineToRelative(-0.02f, 0.022f)
                lineToRelative(-3.473f, 4.425f)
                lineToRelative(-2.093f, -2.094f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineTo(6.97f, 11.03f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.079f, -0.02f)
                lineToRelative(3.992f, -4.99f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.071f, -1.05f)
            }
        }.build()
        
        return _CheckCircle!!
    }

private var _CheckCircle: ImageVector? = null

