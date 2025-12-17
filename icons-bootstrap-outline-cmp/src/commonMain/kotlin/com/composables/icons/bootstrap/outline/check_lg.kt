package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CheckLg: ImageVector
    get() {
        if (_CheckLg != null) return _CheckLg!!
        
        _CheckLg = ImageVector.Builder(
            name = "check-lg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.736f, 3.97f)
                arcToRelative(0.733f, 0.733f, 0f, false, true, 1.047f, 0f)
                curveToRelative(0.286f, 0.289f, 0.29f, 0.756f, 0.01f, 1.05f)
                lineTo(7.88f, 12.01f)
                arcToRelative(0.733f, 0.733f, 0f, false, true, -1.065f, 0.02f)
                lineTo(3.217f, 8.384f)
                arcToRelative(0.757f, 0.757f, 0f, false, true, 0f, -1.06f)
                arcToRelative(0.733f, 0.733f, 0f, false, true, 1.047f, 0f)
                lineToRelative(3.052f, 3.093f)
                lineToRelative(5.4f, -6.425f)
                close()
            }
        }.build()
        
        return _CheckLg!!
    }

private var _CheckLg: ImageVector? = null

