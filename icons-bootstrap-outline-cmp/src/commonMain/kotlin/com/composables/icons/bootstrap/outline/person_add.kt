package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonAdd: ImageVector
    get() {
        if (_PersonAdd != null) return _PersonAdd!!
        
        _PersonAdd = ImageVector.Builder(
            name = "person-add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                moveToRelative(0.5f, -5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(-2f, -6f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                moveTo(8f, 7f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.256f, 14f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -0.229f, -1.004f)
                horizontalLineTo(3f)
                curveToRelative(0.001f, -0.246f, 0.154f, -0.986f, 0.832f, -1.664f)
                curveTo(4.484f, 10.68f, 5.711f, 10f, 8f, 10f)
                quadToRelative(0.39f, 0f, 0.74f, 0.025f)
                curveToRelative(0.226f, -0.341f, 0.496f, -0.65f, 0.804f, -0.918f)
                quadTo(8.844f, 9.002f, 8f, 9f)
                curveToRelative(-5f, 0f, -6f, 3f, -6f, 4f)
                reflectiveCurveToRelative(1f, 1f, 1f, 1f)
                close()
            }
        }.build()
        
        return _PersonAdd!!
    }

private var _PersonAdd: ImageVector? = null

