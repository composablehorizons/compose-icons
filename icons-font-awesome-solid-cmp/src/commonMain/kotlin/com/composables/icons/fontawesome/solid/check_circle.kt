package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CheckCircle: ImageVector
    get() {
        if (_CheckCircle != null) return _CheckCircle!!
        
        _CheckCircle = ImageVector.Builder(
            name = "check-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 256f)
                curveToRelative(0f, 136.967f, -111.033f, 248f, -248f, 248f)
                reflectiveCurveTo(8f, 392.967f, 8f, 256f)
                reflectiveCurveTo(119.033f, 8f, 256f, 8f)
                reflectiveCurveToRelative(248f, 111.033f, 248f, 248f)
                close()
                moveTo(227.314f, 387.314f)
                lineToRelative(184f, -184f)
                curveToRelative(6.248f, -6.248f, 6.248f, -16.379f, 0f, -22.627f)
                lineToRelative(-22.627f, -22.627f)
                curveToRelative(-6.248f, -6.249f, -16.379f, -6.249f, -22.628f, 0f)
                lineTo(216f, 308.118f)
                lineToRelative(-70.059f, -70.059f)
                curveToRelative(-6.248f, -6.248f, -16.379f, -6.248f, -22.628f, 0f)
                lineToRelative(-22.627f, 22.627f)
                curveToRelative(-6.248f, 6.248f, -6.248f, 16.379f, 0f, 22.627f)
                lineToRelative(104f, 104f)
                curveToRelative(6.249f, 6.249f, 16.379f, 6.249f, 22.628f, 0.001f)
                close()
            }
        }.build()
        
        return _CheckCircle!!
    }

private var _CheckCircle: ImageVector? = null

