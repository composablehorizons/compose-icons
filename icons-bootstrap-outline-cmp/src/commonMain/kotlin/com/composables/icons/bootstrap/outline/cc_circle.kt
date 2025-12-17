package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CcCircle: ImageVector
    get() {
        if (_CcCircle != null) return _CcCircle!!
        
        _CcCircle = ImageVector.Builder(
            name = "cc-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcTo(7f, 7f, 0f, false, false, 1f, 8f)
                moveToRelative(15f, 0f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(5.408f, 5.89f)
                curveToRelative(-0.83f, 0f, -1.318f, 0.64f, -1.318f, 1.753f)
                verticalLineToRelative(0.742f)
                curveToRelative(0f, 1.108f, 0.479f, 1.727f, 1.318f, 1.727f)
                curveToRelative(0.69f, 0f, 1.138f, -0.435f, 1.187f, -1.05f)
                horizontalLineToRelative(1.147f)
                verticalLineToRelative(0.114f)
                curveToRelative(-0.058f, 1.147f, -1.029f, 1.938f, -2.343f, 1.938f)
                curveToRelative(-1.612f, 0f, -2.518f, -1.028f, -2.518f, -2.729f)
                verticalLineToRelative(-0.747f)
                curveToRelative(0f, -1.7f, 0.914f, -2.75f, 2.518f, -2.75f)
                curveToRelative(1.319f, 0f, 2.29f, 0.812f, 2.343f, 1.999f)
                verticalLineToRelative(0.11f)
                horizontalLineTo(6.595f)
                curveToRelative(-0.049f, -0.638f, -0.506f, -1.108f, -1.187f, -1.108f)
                close()
                moveToRelative(5.404f, 0f)
                curveToRelative(-0.831f, 0f, -1.319f, 0.64f, -1.319f, 1.753f)
                verticalLineToRelative(0.742f)
                curveToRelative(0f, 1.108f, 0.48f, 1.727f, 1.319f, 1.727f)
                curveToRelative(0.69f, 0f, 1.138f, -0.435f, 1.186f, -1.05f)
                horizontalLineToRelative(1.147f)
                verticalLineToRelative(0.114f)
                curveToRelative(-0.057f, 1.147f, -1.028f, 1.938f, -2.342f, 1.938f)
                curveToRelative(-1.613f, 0f, -2.518f, -1.028f, -2.518f, -2.729f)
                verticalLineToRelative(-0.747f)
                curveToRelative(0f, -1.7f, 0.914f, -2.75f, 2.518f, -2.75f)
                curveToRelative(1.318f, 0f, 2.29f, 0.812f, 2.342f, 1.999f)
                verticalLineToRelative(0.11f)
                horizontalLineToRelative(-1.147f)
                curveToRelative(-0.048f, -0.638f, -0.505f, -1.108f, -1.186f, -1.108f)
                close()
            }
        }.build()
        
        return _CcCircle!!
    }

private var _CcCircle: ImageVector? = null

