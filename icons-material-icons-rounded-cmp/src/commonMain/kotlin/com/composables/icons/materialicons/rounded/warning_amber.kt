package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Warning_amber: ImageVector
    get() {
        if (_Warning_amber != null) return _Warning_amber!!
        
        _Warning_amber = ImageVector.Builder(
            name = "warning_amber",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 5.99f)
                lineTo(19.53f, 19f)
                horizontalLineTo(4.47f)
                lineTo(12f, 5.99f)
                moveTo(2.74f, 18f)
                curveToRelative(-0.77f, 1.33f, 0.19f, 3f, 1.73f, 3f)
                horizontalLineToRelative(15.06f)
                curveToRelative(1.54f, 0f, 2.5f, -1.67f, 1.73f, -3f)
                lineTo(13.73f, 4.99f)
                curveToRelative(-0.77f, -1.33f, -2.69f, -1.33f, -3.46f, 0f)
                lineTo(2.74f, 18f)
                close()
                moveTo(11f, 11f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveToRelative(0f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Warning_amber!!
    }

private var _Warning_amber: ImageVector? = null

