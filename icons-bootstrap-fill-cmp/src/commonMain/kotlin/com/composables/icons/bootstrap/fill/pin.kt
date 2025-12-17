package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Pin: ImageVector
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
            }
        }.build()
        
        return _Pin!!
    }

private var _Pin: ImageVector? = null

