package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Person: ImageVector
    get() {
        if (_Person != null) return _Person!!
        
        _Person = ImageVector.Builder(
            name = "person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 8f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                moveToRelative(2f, -3f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                moveToRelative(4f, 8f)
                curveToRelative(0f, 1f, -1f, 1f, -1f, 1f)
                horizontalLineTo(3f)
                reflectiveCurveToRelative(-1f, 0f, -1f, -1f)
                reflectiveCurveToRelative(1f, -4f, 6f, -4f)
                reflectiveCurveToRelative(6f, 3f, 6f, 4f)
                moveToRelative(-1f, -0.004f)
                curveToRelative(-0.001f, -0.246f, -0.154f, -0.986f, -0.832f, -1.664f)
                curveTo(11.516f, 10.68f, 10.289f, 10f, 8f, 10f)
                reflectiveCurveToRelative(-3.516f, 0.68f, -4.168f, 1.332f)
                curveToRelative(-0.678f, 0.678f, -0.83f, 1.418f, -0.832f, 1.664f)
                close()
            }
        }.build()
        
        return _Person!!
    }

private var _Person: ImageVector? = null

