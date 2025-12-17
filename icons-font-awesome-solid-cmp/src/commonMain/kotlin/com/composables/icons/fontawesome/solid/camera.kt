package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(512f, 144f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(144f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(88f)
                lineToRelative(12.3f, -32.9f)
                curveToRelative(7f, -18.7f, 24.9f, -31.1f, 44.9f, -31.1f)
                horizontalLineToRelative(125.5f)
                curveToRelative(20f, 0f, 37.9f, 12.4f, 44.9f, 31.1f)
                lineTo(376f, 96f)
                horizontalLineToRelative(88f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveTo(376f, 288f)
                curveToRelative(0f, -66.2f, -53.8f, -120f, -120f, -120f)
                reflectiveCurveToRelative(-120f, 53.8f, -120f, 120f)
                reflectiveCurveToRelative(53.8f, 120f, 120f, 120f)
                reflectiveCurveToRelative(120f, -53.8f, 120f, -120f)
                close()
                moveToRelative(-32f, 0f)
                curveToRelative(0f, 48.5f, -39.5f, 88f, -88f, 88f)
                reflectiveCurveToRelative(-88f, -39.5f, -88f, -88f)
                reflectiveCurveToRelative(39.5f, -88f, 88f, -88f)
                reflectiveCurveToRelative(88f, 39.5f, 88f, 88f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

