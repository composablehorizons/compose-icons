package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hub: ImageVector
    get() {
        if (_Hub != null) return _Hub!!
        
        _Hub = ImageVector.Builder(
            name = "hub",
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
                moveTo(21f, 6.5f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.07f, 0f, 0.14f, 0.01f, 0.21f)
                lineToRelative(-2.03f, 0.68f)
                curveToRelative(-0.64f, -1.21f, -1.82f, -2.09f, -3.22f, -2.32f)
                verticalLineTo(5.91f)
                curveTo(14.04f, 5.57f, 15f, 4.4f, 15f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveTo(9f, 1.34f, 9f, 3f)
                curveToRelative(0f, 1.4f, 0.96f, 2.57f, 2.25f, 2.91f)
                verticalLineToRelative(2.16f)
                curveToRelative(-1.4f, 0.23f, -2.58f, 1.11f, -3.22f, 2.32f)
                lineTo(5.99f, 9.71f)
                curveTo(6f, 9.64f, 6f, 9.57f, 6f, 9.5f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                curveToRelative(1.06f, 0f, 1.98f, -0.55f, 2.52f, -1.37f)
                lineToRelative(2.03f, 0.68f)
                curveToRelative(-0.2f, 1.29f, 0.17f, 2.66f, 1.09f, 3.69f)
                lineToRelative(-1.41f, 1.77f)
                curveTo(6.85f, 17.09f, 6.44f, 17f, 6f, 17f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                curveToRelative(0f, -0.68f, -0.22f, -1.3f, -0.6f, -1.8f)
                lineToRelative(1.41f, -1.77f)
                curveToRelative(1.36f, 0.76f, 3.02f, 0.75f, 4.37f, 0f)
                lineToRelative(1.41f, 1.77f)
                curveTo(15.22f, 18.7f, 15f, 19.32f, 15f, 20f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                curveToRelative(-0.44f, 0f, -0.85f, 0.09f, -1.23f, 0.26f)
                lineToRelative(-1.41f, -1.77f)
                curveToRelative(0.93f, -1.04f, 1.29f, -2.4f, 1.09f, -3.69f)
                lineToRelative(2.03f, -0.68f)
                curveToRelative(0.53f, 0.82f, 1.46f, 1.37f, 2.52f, 1.37f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveTo(22.66f, 6.5f, 21f, 6.5f)
                close()
                moveTo(3f, 10.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(4f, 10.05f, 3.55f, 10.5f, 3f, 10.5f)
                close()
                moveTo(6f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(7f, 20.55f, 6.55f, 21f, 6f, 21f)
                close()
                moveTo(11f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveTo(11f, 3.55f, 11f, 3f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveTo(14.5f, 13.88f, 13.38f, 15f, 12f, 15f)
                close()
                moveTo(18f, 19f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveTo(17f, 19.45f, 17.45f, 19f, 18f, 19f)
                close()
                moveTo(21f, 10.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(22f, 10.05f, 21.55f, 10.5f, 21f, 10.5f)
                close()
            }
        }.build()
        
        return _Hub!!
    }

private var _Hub: ImageVector? = null

