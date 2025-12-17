package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Control_point_duplicate: ImageVector
    get() {
        if (_Control_point_duplicate != null) return _Control_point_duplicate!!
        
        _Control_point_duplicate = ImageVector.Builder(
            name = "control_point_duplicate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.58f, 1.4f, -4.83f, 3.48f, -6.04f)
                curveToRelative(0.32f, -0.19f, 0.53f, -0.51f, 0.53f, -0.88f)
                curveToRelative(0f, -0.77f, -0.84f, -1.25f, -1.51f, -0.86f)
                curveTo(1.82f, 5.78f, 0f, 8.68f, 0f, 12f)
                reflectiveCurveToRelative(1.82f, 6.22f, 4.5f, 7.78f)
                curveToRelative(0.67f, 0.39f, 1.51f, -0.09f, 1.51f, -0.86f)
                curveToRelative(0f, -0.37f, -0.21f, -0.69f, -0.53f, -0.88f)
                curveTo(3.4f, 16.83f, 2f, 14.58f, 2f, 12f)
                close()
                moveToRelative(13f, -9f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveToRelative(-4.04f, -9f, -9f, -9f)
                close()
                moveToRelative(0f, 16f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
            }
        }.build()
        
        return _Control_point_duplicate!!
    }

private var _Control_point_duplicate: ImageVector? = null

