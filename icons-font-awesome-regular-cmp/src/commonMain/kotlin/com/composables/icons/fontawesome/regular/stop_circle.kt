package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.StopCircle: ImageVector
    get() {
        if (_StopCircle != null) return _StopCircle!!
        
        _StopCircle = ImageVector.Builder(
            name = "stop-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 256f)
                curveTo(504f, 119f, 393f, 8f, 256f, 8f)
                reflectiveCurveTo(8f, 119f, 8f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                close()
                moveToRelative(-448f, 0f)
                curveToRelative(0f, -110.5f, 89.5f, -200f, 200f, -200f)
                reflectiveCurveToRelative(200f, 89.5f, 200f, 200f)
                reflectiveCurveToRelative(-89.5f, 200f, -200f, 200f)
                reflectiveCurveTo(56f, 366.5f, 56f, 256f)
                close()
                moveToRelative(296f, -80f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                horizontalLineTo(176f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                verticalLineTo(176f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                horizontalLineToRelative(160f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                close()
            }
        }.build()
        
        return _StopCircle!!
    }

private var _StopCircle: ImageVector? = null

