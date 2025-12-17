package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.DatabaseExclamation: ImageVector
    get() {
        if (_DatabaseExclamation != null) return _DatabaseExclamation!!
        
        _DatabaseExclamation = ImageVector.Builder(
            name = "database-exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.096f, 6.223f)
                arcTo(5f, 5f, 0f, false, false, 13f, 5.698f)
                verticalLineTo(7f)
                curveToRelative(0f, 0.289f, -0.213f, 0.654f, -0.753f, 1.007f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 1.753f, 0.25f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.007f, -0.875f, -1.755f, -1.904f, -2.223f)
                curveTo(11.022f, 1.289f, 9.573f, 1f, 8f, 1f)
                reflectiveCurveToRelative(-3.022f, 0.289f, -4.096f, 0.777f)
                curveTo(2.875f, 2.245f, 2f, 2.993f, 2f, 4f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.007f, 0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 15.71f, 6.427f, 16f, 8f, 16f)
                curveToRelative(0.536f, 0f, 1.058f, -0.034f, 1.555f, -0.097f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -0.813f, -0.927f)
                quadTo(8.378f, 15f, 8f, 15f)
                curveToRelative(-1.464f, 0f, -2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 13.875f, 3f, 13.373f, 3f, 13f)
                verticalLineToRelative(-1.302f)
                curveToRelative(0.271f, 0.202f, 0.58f, 0.378f, 0.904f, 0.525f)
                curveTo(4.978f, 12.71f, 6.427f, 13f, 8f, 13f)
                horizontalLineToRelative(0.027f)
                arcToRelative(4.6f, 4.6f, 0f, false, true, 0f, -1f)
                horizontalLineTo(8f)
                curveToRelative(-1.464f, 0f, -2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 10.875f, 3f, 10.373f, 3f, 10f)
                verticalLineTo(8.698f)
                curveToRelative(0.271f, 0.202f, 0.58f, 0.378f, 0.904f, 0.525f)
                curveTo(4.978f, 9.71f, 6.427f, 10f, 8f, 10f)
                quadToRelative(0.393f, 0f, 0.774f, -0.024f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 1.102f, -1.132f)
                curveTo(9.298f, 8.944f, 8.666f, 9f, 8f, 9f)
                curveToRelative(-1.464f, 0f, -2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 7.875f, 3f, 7.373f, 3f, 7f)
                verticalLineTo(5.698f)
                curveToRelative(0.271f, 0.202f, 0.58f, 0.378f, 0.904f, 0.525f)
                curveTo(4.978f, 6.711f, 6.427f, 7f, 8f, 7f)
                reflectiveCurveToRelative(3.022f, -0.289f, 4.096f, -0.777f)
                moveTo(3f, 4f)
                curveToRelative(0f, -0.374f, 0.356f, -0.875f, 1.318f, -1.313f)
                curveTo(5.234f, 2.271f, 6.536f, 2f, 8f, 2f)
                reflectiveCurveToRelative(2.766f, 0.27f, 3.682f, 0.687f)
                curveTo(12.644f, 3.125f, 13f, 3.627f, 13f, 4f)
                curveToRelative(0f, 0.374f, -0.356f, 0.875f, -1.318f, 1.313f)
                curveTo(10.766f, 5.729f, 9.464f, 6f, 8f, 6f)
                reflectiveCurveToRelative(-2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 4.875f, 3f, 4.373f, 3f, 4f)
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
        
        return _DatabaseExclamation!!
    }

private var _DatabaseExclamation: ImageVector? = null

