package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Pin: ImageVector
    get() {
        if (_Pin != null) return _Pin!!
        
        _Pin = ImageVector.Builder(
            name = "pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.146f, 0.146f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 0f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                curveToRelative(0f, 0.68f, -0.342f, 1.174f, -0.646f, 1.479f)
                curveToRelative(-0.126f, 0.125f, -0.25f, 0.224f, -0.354f, 0.298f)
                verticalLineToRelative(4.431f)
                lineToRelative(0.078f, 0.048f)
                curveToRelative(0.203f, 0.127f, 0.476f, 0.314f, 0.751f, 0.555f)
                curveTo(12.36f, 7.775f, 13f, 8.527f, 13f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.276f, -0.224f, 1.5f, -0.5f, 1.5f)
                reflectiveCurveToRelative(-0.5f, -1.224f, -0.5f, -1.5f)
                verticalLineTo(10f)
                horizontalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                curveToRelative(0f, -0.973f, 0.64f, -1.725f, 1.17f, -2.189f)
                arcTo(6f, 6f, 0f, false, true, 5f, 6.708f)
                verticalLineTo(2.277f)
                arcToRelative(3f, 3f, 0f, false, true, -0.354f, -0.298f)
                curveTo(4.342f, 1.674f, 4f, 1.179f, 4f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.146f, -0.354f)
                moveToRelative(1.58f, 1.408f)
                lineToRelative(-0.002f, -0.001f)
                close()
                moveToRelative(-0.002f, -0.001f)
                lineToRelative(0.002f, 0.001f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.276f, 0.447f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.012f, 0.007f)
                lineToRelative(-0.054f, 0.03f)
                arcToRelative(5f, 5f, 0f, false, false, -0.827f, 0.58f)
                curveToRelative(-0.318f, 0.278f, -0.585f, 0.596f, -0.725f, 0.936f)
                horizontalLineToRelative(7.792f)
                curveToRelative(-0.14f, -0.34f, -0.407f, -0.658f, -0.725f, -0.936f)
                arcToRelative(5f, 5f, 0f, false, false, -0.881f, -0.61f)
                lineToRelative(-0.012f, -0.006f)
                horizontalLineToRelative(-0.002f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 7f)
                verticalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.295f, -0.458f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, 0.351f, -0.271f)
                curveToRelative(0.08f, -0.08f, 0.155f, -0.17f, 0.214f, -0.271f)
                horizontalLineTo(5.14f)
                quadToRelative(0.091f, 0.15f, 0.214f, 0.271f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, 0.37f, 0.282f)
            }
        }.build()
        
        return _Pin!!
    }

private var _Pin: ImageVector? = null

