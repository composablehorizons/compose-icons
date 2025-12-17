package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Database: ImageVector
    get() {
        if (_Database != null) return _Database!!
        
        _Database = ImageVector.Builder(
            name = "database",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.318f, 2.687f)
                curveTo(5.234f, 2.271f, 6.536f, 2f, 8f, 2f)
                reflectiveCurveToRelative(2.766f, 0.27f, 3.682f, 0.687f)
                curveTo(12.644f, 3.125f, 13f, 3.627f, 13f, 4f)
                curveToRelative(0f, 0.374f, -0.356f, 0.875f, -1.318f, 1.313f)
                curveTo(10.766f, 5.729f, 9.464f, 6f, 8f, 6f)
                reflectiveCurveToRelative(-2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 4.875f, 3f, 4.373f, 3f, 4f)
                curveToRelative(0f, -0.374f, 0.356f, -0.875f, 1.318f, -1.313f)
                moveTo(13f, 5.698f)
                verticalLineTo(7f)
                curveToRelative(0f, 0.374f, -0.356f, 0.875f, -1.318f, 1.313f)
                curveTo(10.766f, 8.729f, 9.464f, 9f, 8f, 9f)
                reflectiveCurveToRelative(-2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 7.875f, 3f, 7.373f, 3f, 7f)
                verticalLineTo(5.698f)
                curveToRelative(0.271f, 0.202f, 0.58f, 0.378f, 0.904f, 0.525f)
                curveTo(4.978f, 6.711f, 6.427f, 7f, 8f, 7f)
                reflectiveCurveToRelative(3.022f, -0.289f, 4.096f, -0.777f)
                arcTo(5f, 5f, 0f, false, false, 13f, 5.698f)
                moveTo(14f, 4f)
                curveToRelative(0f, -1.007f, -0.875f, -1.755f, -1.904f, -2.223f)
                curveTo(11.022f, 1.289f, 9.573f, 1f, 8f, 1f)
                reflectiveCurveToRelative(-3.022f, 0.289f, -4.096f, 0.777f)
                curveTo(2.875f, 2.245f, 2f, 2.993f, 2f, 4f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.007f, 0.875f, 1.755f, 1.904f, 2.223f)
                curveTo(4.978f, 15.71f, 6.427f, 16f, 8f, 16f)
                reflectiveCurveToRelative(3.022f, -0.289f, 4.096f, -0.777f)
                curveTo(13.125f, 14.755f, 14f, 14.007f, 14f, 13f)
                close()
                moveToRelative(-1f, 4.698f)
                verticalLineTo(10f)
                curveToRelative(0f, 0.374f, -0.356f, 0.875f, -1.318f, 1.313f)
                curveTo(10.766f, 11.729f, 9.464f, 12f, 8f, 12f)
                reflectiveCurveToRelative(-2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 10.875f, 3f, 10.373f, 3f, 10f)
                verticalLineTo(8.698f)
                curveToRelative(0.271f, 0.202f, 0.58f, 0.378f, 0.904f, 0.525f)
                curveTo(4.978f, 9.71f, 6.427f, 10f, 8f, 10f)
                reflectiveCurveToRelative(3.022f, -0.289f, 4.096f, -0.777f)
                arcTo(5f, 5f, 0f, false, false, 13f, 8.698f)
                moveToRelative(0f, 3f)
                verticalLineTo(13f)
                curveToRelative(0f, 0.374f, -0.356f, 0.875f, -1.318f, 1.313f)
                curveTo(10.766f, 14.729f, 9.464f, 15f, 8f, 15f)
                reflectiveCurveToRelative(-2.766f, -0.27f, -3.682f, -0.687f)
                curveTo(3.356f, 13.875f, 3f, 13.373f, 3f, 13f)
                verticalLineToRelative(-1.302f)
                curveToRelative(0.271f, 0.202f, 0.58f, 0.378f, 0.904f, 0.525f)
                curveTo(4.978f, 12.71f, 6.427f, 13f, 8f, 13f)
                reflectiveCurveToRelative(3.022f, -0.289f, 4.096f, -0.777f)
                curveToRelative(0.324f, -0.147f, 0.633f, -0.323f, 0.904f, -0.525f)
            }
        }.build()
        
        return _Database!!
    }

private var _Database: ImageVector? = null

