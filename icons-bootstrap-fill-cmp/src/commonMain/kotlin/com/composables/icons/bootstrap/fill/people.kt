package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.People: ImageVector
    get() {
        if (_People != null) return _People!!
        
        _People = ImageVector.Builder(
            name = "people",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 14f)
                reflectiveCurveToRelative(-1f, 0f, -1f, -1f)
                reflectiveCurveToRelative(1f, -4f, 5f, -4f)
                reflectiveCurveToRelative(5f, 3f, 5f, 4f)
                reflectiveCurveToRelative(-1f, 1f, -1f, 1f)
                close()
                moveToRelative(4f, -6f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                moveToRelative(-5.784f, 6f)
                arcTo(2.24f, 2.24f, 0f, false, true, 5f, 13f)
                curveToRelative(0f, -1.355f, 0.68f, -2.75f, 1.936f, -3.72f)
                arcTo(6.3f, 6.3f, 0f, false, false, 5f, 9f)
                curveToRelative(-4f, 0f, -5f, 3f, -5f, 4f)
                reflectiveCurveToRelative(1f, 1f, 1f, 1f)
                close()
                moveTo(4.5f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
            }
        }.build()
        
        return _People!!
    }

private var _People: ImageVector? = null

