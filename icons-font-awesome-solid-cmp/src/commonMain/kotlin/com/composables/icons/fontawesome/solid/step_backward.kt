package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StepBackward: ImageVector
    get() {
        if (_StepBackward != null) return _StepBackward!!
        
        _StepBackward = ImageVector.Builder(
            name = "step-backward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(64f, 468f)
                verticalLineTo(44f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(48f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(176.4f)
                lineToRelative(195.5f, -181f)
                curveTo(352.1f, 22.3f, 384f, 36.6f, 384f, 64f)
                verticalLineToRelative(384f)
                curveToRelative(0f, 27.4f, -31.9f, 41.7f, -52.5f, 24.6f)
                lineTo(136f, 292.7f)
                verticalLineTo(468f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineTo(76f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                close()
            }
        }.build()
        
        return _StepBackward!!
    }

private var _StepBackward: ImageVector? = null

