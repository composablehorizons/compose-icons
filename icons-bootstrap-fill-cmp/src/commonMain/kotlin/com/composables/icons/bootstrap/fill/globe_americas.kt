package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.GlobeAmericas: ImageVector
    get() {
        if (_GlobeAmericas != null) return _GlobeAmericas!!
        
        _GlobeAmericas = ImageVector.Builder(
            name = "globe-americas",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                lineToRelative(0.412f, 0.01f)
                arcTo(7.97f, 7.97f, 0f, false, true, 13.29f, 2f)
                arcToRelative(8.04f, 8.04f, 0f, false, true, 2.548f, 4.382f)
                arcToRelative(8f, 8f, 0f, true, true, -15.674f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 1.361f, -3.078f)
                arcTo(8f, 8f, 0f, false, true, 2.711f, 2f)
                arcTo(7.96f, 7.96f, 0f, false, true, 8f, 0f)
                moveToRelative(0f, 1f)
                arcToRelative(7f, 7f, 0f, false, false, -5.958f, 3.324f)
                curveTo(2.497f, 6.192f, 6.669f, 7.827f, 6.5f, 8f)
                curveToRelative(-0.5f, 0.5f, -1.034f, 0.884f, -1f, 1.5f)
                curveToRelative(0.07f, 1.248f, 2.259f, 0.774f, 2.5f, 2f)
                curveToRelative(0.202f, 1.032f, -1.051f, 3f, 0f, 3f)
                curveToRelative(1.5f, -0.5f, 3.798f, -3.186f, 4f, -5f)
                curveToRelative(0.138f, -1.242f, -2f, -2f, -3.5f, -2.5f)
                curveToRelative(-0.828f, -0.276f, -1.055f, 0.648f, -1.5f, 0.5f)
                reflectiveCurveTo(4.5f, 5.5f, 5.5f, 5f)
                reflectiveCurveToRelative(1f, 0f, 1.5f, 0.5f)
                curveToRelative(1f, 0.5f, 0.5f, -1f, 1f, -1.5f)
                curveToRelative(0.838f, -0.838f, 3.16f, -1.394f, 3.605f, -2.001f)
                arcTo(6.97f, 6.97f, 0f, false, false, 8f, 1f)
            }
        }.build()
        
        return _GlobeAmericas!!
    }

private var _GlobeAmericas: ImageVector? = null

