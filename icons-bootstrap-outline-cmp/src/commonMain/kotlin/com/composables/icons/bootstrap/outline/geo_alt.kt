package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.GeoAlt: ImageVector
    get() {
        if (_GeoAlt != null) return _GeoAlt!!
        
        _GeoAlt = ImageVector.Builder(
            name = "geo-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.166f, 8.94f)
                curveToRelative(-0.524f, 1.062f, -1.234f, 2.12f, -1.96f, 3.07f)
                arcTo(32f, 32f, 0f, false, true, 8f, 14.58f)
                arcToRelative(32f, 32f, 0f, false, true, -2.206f, -2.57f)
                curveToRelative(-0.726f, -0.95f, -1.436f, -2.008f, -1.96f, -3.07f)
                curveTo(3.304f, 7.867f, 3f, 6.862f, 3f, 6f)
                arcToRelative(5f, 5f, 0f, false, true, 10f, 0f)
                curveToRelative(0f, 0.862f, -0.305f, 1.867f, -0.834f, 2.94f)
                moveTo(8f, 16f)
                reflectiveCurveToRelative(6f, -5.686f, 6f, -10f)
                arcTo(6f, 6f, 0f, false, false, 2f, 6f)
                curveToRelative(0f, 4.314f, 6f, 10f, 6f, 10f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 8f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
                moveToRelative(0f, 1f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
            }
        }.build()
        
        return _GeoAlt!!
    }

private var _GeoAlt: ImageVector? = null

