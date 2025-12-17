package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.GlobeAmericas: ImageVector
    get() {
        if (_GlobeAmericas != null) return _GlobeAmericas!!
        
        _GlobeAmericas = ImageVector.Builder(
            name = "globe-americas",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(6.115f, 5.19f)
                lineToRelative(0.319f, 1.913f)
                arcTo(6f, 6f, 0f, false, false, 8.11f, 10.36f)
                lineTo(9.75f, 12f)
                lineToRelative(-0.387f, 0.775f)
                curveToRelative(-0.217f, 0.433f, -0.132f, 0.956f, 0.21f, 1.298f)
                lineToRelative(1.348f, 1.348f)
                curveToRelative(0.21f, 0.21f, 0.329f, 0.497f, 0.329f, 0.795f)
                verticalLineToRelative(1.089f)
                curveToRelative(0f, 0.426f, 0.24f, 0.815f, 0.622f, 1.006f)
                lineToRelative(0.153f, 0.076f)
                curveToRelative(0.433f, 0.217f, 0.956f, 0.132f, 1.298f, -0.21f)
                lineToRelative(0.723f, -0.723f)
                arcToRelative(8.7f, 8.7f, 0f, false, false, 2.288f, -4.042f)
                arcToRelative(1.087f, 1.087f, 0f, false, false, -0.358f, -1.099f)
                lineToRelative(-1.33f, -1.108f)
                curveToRelative(-0.251f, -0.21f, -0.582f, -0.299f, -0.905f, -0.245f)
                lineToRelative(-1.17f, 0.195f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -0.98f, -0.314f)
                lineToRelative(-0.295f, -0.295f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 0f, -1.591f)
                lineToRelative(0.13f, -0.132f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 1.3f, -0.21f)
                lineToRelative(0.603f, 0.302f)
                arcToRelative(0.809f, 0.809f, 0f, false, false, 1.086f, -1.086f)
                lineTo(14.25f, 7.5f)
                lineToRelative(1.256f, -0.837f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 1.528f, -1.732f)
                lineToRelative(0.146f, -0.292f)
                moveTo(6.115f, 5.19f)
                arcTo(9f, 9f, 0f, true, false, 17.18f, 4.64f)
                moveTo(6.115f, 5.19f)
                arcTo(8.965f, 8.965f, 0f, false, true, 12f, 3f)
                curveToRelative(1.929f, 0f, 3.716f, 0.607f, 5.18f, 1.64f)
            }
        }.build()
        
        return _GlobeAmericas!!
    }

private var _GlobeAmericas: ImageVector? = null

