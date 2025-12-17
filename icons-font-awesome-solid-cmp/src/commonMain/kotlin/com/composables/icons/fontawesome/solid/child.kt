package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Child: ImageVector
    get() {
        if (_Child != null) return _Child!!
        
        _Child = ImageVector.Builder(
            name = "child",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 72f)
                curveToRelative(0f, -39.765f, 32.235f, -72f, 72f, -72f)
                reflectiveCurveToRelative(72f, 32.235f, 72f, 72f)
                curveToRelative(0f, 39.764f, -32.235f, 72f, -72f, 72f)
                reflectiveCurveToRelative(-72f, -32.236f, -72f, -72f)
                close()
                moveToRelative(254.627f, 1.373f)
                curveToRelative(-12.496f, -12.497f, -32.758f, -12.497f, -45.254f, 0f)
                lineTo(242.745f, 160f)
                horizontalLineTo(141.254f)
                lineTo(54.627f, 73.373f)
                curveToRelative(-12.496f, -12.497f, -32.758f, -12.497f, -45.254f, 0f)
                curveToRelative(-12.497f, 12.497f, -12.497f, 32.758f, 0f, 45.255f)
                lineTo(104f, 213.254f)
                verticalLineTo(480f)
                curveToRelative(0f, 17.673f, 14.327f, 32f, 32f, 32f)
                horizontalLineToRelative(16f)
                curveToRelative(17.673f, 0f, 32f, -14.327f, 32f, -32f)
                verticalLineTo(368f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 17.673f, 14.327f, 32f, 32f, 32f)
                horizontalLineToRelative(16f)
                curveToRelative(17.673f, 0f, 32f, -14.327f, 32f, -32f)
                verticalLineTo(213.254f)
                lineToRelative(94.627f, -94.627f)
                curveToRelative(12.497f, -12.497f, 12.497f, -32.757f, 0f, -45.254f)
                close()
            }
        }.build()
        
        return _Child!!
    }

private var _Child: ImageVector? = null

