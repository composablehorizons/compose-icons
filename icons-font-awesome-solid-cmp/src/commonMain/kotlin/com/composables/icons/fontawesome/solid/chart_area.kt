package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChartArea: ImageVector
    get() {
        if (_ChartArea != null) return _ChartArea!!
        
        _ChartArea = ImageVector.Builder(
            name = "chart-area",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 384f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineTo(12f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineTo(76f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(308f)
                horizontalLineToRelative(436f)
                close()
                moveTo(372.7f, 159.5f)
                lineTo(288f, 216f)
                lineToRelative(-85.3f, -113.7f)
                curveToRelative(-5.1f, -6.8f, -15.5f, -6.3f, -19.9f, 1f)
                lineTo(96f, 248f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(384f)
                lineToRelative(-89.9f, -187.8f)
                curveToRelative(-3.2f, -6.5f, -11.4f, -8.7f, -17.4f, -4.7f)
                close()
            }
        }.build()
        
        return _ChartArea!!
    }

private var _ChartArea: ImageVector? = null

