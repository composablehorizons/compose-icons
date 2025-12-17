package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonExclamation: ImageVector
    get() {
        if (_PersonExclamation != null) return _PersonExclamation!!
        
        _PersonExclamation = ImageVector.Builder(
            name = "person-exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                moveTo(8f, 7f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                moveToRelative(0.256f, 7f)
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 7f, 0f)
                moveToRelative(-3.5f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                moveToRelative(0f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
            }
        }.build()
        
        return _PersonExclamation!!
    }

private var _PersonExclamation: ImageVector? = null

