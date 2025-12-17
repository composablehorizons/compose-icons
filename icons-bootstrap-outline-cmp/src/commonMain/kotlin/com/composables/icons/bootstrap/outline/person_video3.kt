package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonVideo3: ImageVector
    get() {
        if (_PersonVideo3 != null) return _PersonVideo3!!
        
        _PersonVideo3 = ImageVector.Builder(
            name = "person-video3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 9.5f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                moveToRelative(-6f, 5.7f)
                curveToRelative(0f, 0.8f, 0.8f, 0.8f, 0.8f, 0.8f)
                horizontalLineToRelative(6.4f)
                reflectiveCurveToRelative(0.8f, 0f, 0.8f, -0.8f)
                reflectiveCurveToRelative(-0.8f, -3.2f, -4f, -3.2f)
                reflectiveCurveToRelative(-4f, 2.4f, -4f, 3.2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(5.243f)
                curveToRelative(0.122f, -0.326f, 0.295f, -0.668f, 0.526f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(7.81f)
                curveToRelative(0.353f, 0.23f, 0.656f, 0.496f, 0.91f, 0.783f)
                quadTo(16f, 12.312f, 16f, 12f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _PersonVideo3!!
    }

private var _PersonVideo3: ImageVector? = null

