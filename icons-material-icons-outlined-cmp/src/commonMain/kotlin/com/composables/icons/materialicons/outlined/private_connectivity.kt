package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Private_connectivity: ImageVector
    get() {
        if (_Private_connectivity != null) return _Private_connectivity!!
        
        _Private_connectivity = ImageVector.Builder(
            name = "private_connectivity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 7f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(9.24f, 7f, 12f, 7f)
                close()
                moveTo(5.07f, 13f)
                curveToRelative(0.49f, 3.39f, 3.4f, 6f, 6.93f, 6f)
                curveToRelative(3.53f, 0f, 6.44f, -2.61f, 6.93f, -6f)
                lineTo(22f, 13f)
                verticalLineToRelative(-2f)
                lineToRelative(-3.07f, 0f)
                curveToRelative(-0.49f, -3.39f, -3.4f, -6f, -6.93f, -6f)
                lineToRelative(0f, 0f)
                curveToRelative(-3.53f, 0f, -6.44f, 2.61f, -6.93f, 6f)
                curveToRelative(0f, 0f, -3.07f, 0f, -3.07f, 0f)
                verticalLineToRelative(2f)
                lineTo(5.07f, 13f)
                close()
                moveTo(14f, 10.5f)
                verticalLineTo(9.61f)
                curveToRelative(0f, -1f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveTo(11.08f, 7.32f, 10f, 8.29f, 10f, 9.5f)
                verticalLineToRelative(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveTo(15f, 10.95f, 14.55f, 10.5f, 14f, 10.5f)
                close()
                moveTo(12f, 13.75f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12f, 13.75f)
                close()
                moveTo(13f, 10.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()
        
        return _Private_connectivity!!
    }

private var _Private_connectivity: ImageVector? = null

