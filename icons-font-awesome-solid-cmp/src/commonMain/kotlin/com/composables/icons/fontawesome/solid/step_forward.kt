package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StepForward: ImageVector
    get() {
        if (_StepForward != null) return _StepForward!!
        
        _StepForward = ImageVector.Builder(
            name = "step-forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 44f)
                verticalLineToRelative(424f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-48f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineTo(291.6f)
                lineToRelative(-195.5f, 181f)
                curveTo(95.9f, 489.7f, 64f, 475.4f, 64f, 448f)
                verticalLineTo(64f)
                curveToRelative(0f, -27.4f, 31.9f, -41.7f, 52.5f, -24.6f)
                lineTo(312f, 219.3f)
                verticalLineTo(44f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(48f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                close()
            }
        }.build()
        
        return _StepForward!!
    }

private var _StepForward: ImageVector? = null

