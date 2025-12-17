package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.DatabaseLock: ImageVector
    get() {
        if (_DatabaseLock != null) return _DatabaseLock!!
        
        _DatabaseLock = ImageVector.Builder(
            name = "database-lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 5.698f)
                arcToRelative(5f, 5f, 0f, false, true, -0.904f, 0.525f)
                curveTo(11.022f, 6.711f, 9.573f, 7f, 8f, 7f)
                reflectiveCurveToRelative(-3.022f, -0.289f, -4.096f, -0.777f)
                arcTo(5f, 5f, 0f, false, true, 3f, 5.698f)
                verticalLineTo(7f)
                curveToRelative(0f, 0.374f, 0.356f, 0.875f, 1.318f, 1.313f)
                curveTo(5.234f, 8.729f, 6.536f, 9f, 8f, 9f)
                curveToRelative(0.666f, 0f, 1.298f, -0.056f, 1.876f, -0.156f)
                curveToRelative(-0.43f, 0.31f, -0.804f, 0.693f, -1.102f, 1.132f)
                arcTo(12f, 12f, 0f, false, true, 8f, 10f)
                curveToRelative(-1.573f, 0f, -3.022f, -0.289f, -4.096f, -0.777f)
                arcTo(5f, 5f, 0f, false, true, 3f, 8.698f)
                verticalLineTo(10f)
                curveToRelative(0f, 0.374f, 0.356f, 0.875f, 1.318f, 1.313f)
                curveTo(5.234f, 11.729f, 6.536f, 12f, 8f, 12f)
                horizontalLineToRelative(0.027f)
                arcToRelative(4.6f, 4.6f, 0f, false, false, -0.017f, 0.8f)
                arcTo(2f, 2f, 0f, false, false, 8f, 13f)
                curveToRelative(-1.573f, 0f, -3.022f, -0.289f, -4.096f, -0.777f)
                arcTo(5f, 5f, 0f, false, true, 3f, 11.698f)
                verticalLineTo(13f)
                curveToRelative(0f, 0.374f, 0.356f, 0.875f, 1.318f, 1.313f)
                curveTo(5.234f, 14.729f, 6.536f, 15f, 8f, 15f)
                curveToRelative(0f, 0.363f, 0.097f, 0.704f, 0.266f, 0.997f)
                quadTo(8.134f, 16.001f, 8f, 16f)
                curveToRelative(-1.573f, 0f, -3.022f, -0.289f, -4.096f, -0.777f)
                curveTo(2.875f, 14.755f, 2f, 14.007f, 2f, 13f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.007f, 0.875f, -1.755f, 1.904f, -2.223f)
                curveTo(4.978f, 1.289f, 6.427f, 1f, 8f, 1f)
                reflectiveCurveToRelative(3.022f, 0.289f, 4.096f, 0.777f)
                curveTo(13.125f, 2.245f, 14f, 2.993f, 14f, 4f)
                verticalLineToRelative(4.256f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -1.753f, -0.249f)
                curveTo(12.787f, 7.654f, 13f, 7.289f, 13f, 7f)
                close()
                moveToRelative(-8.682f, -3.01f)
                curveTo(3.356f, 3.124f, 3f, 3.625f, 3f, 4f)
                curveToRelative(0f, 0.374f, 0.356f, 0.875f, 1.318f, 1.313f)
                curveTo(5.234f, 5.729f, 6.536f, 6f, 8f, 6f)
                reflectiveCurveToRelative(2.766f, -0.27f, 3.682f, -0.687f)
                curveTo(12.644f, 4.875f, 13f, 4.373f, 13f, 4f)
                curveToRelative(0f, -0.374f, -0.356f, -0.875f, -1.318f, -1.313f)
                curveTo(10.766f, 2.271f, 9.464f, 2f, 8f, 2f)
                reflectiveCurveToRelative(-2.766f, 0.27f, -3.682f, 0.687f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 13f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _DatabaseLock!!
    }

private var _DatabaseLock: ImageVector? = null

