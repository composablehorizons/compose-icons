package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mode_of_travel: ImageVector
    get() {
        if (_Mode_of_travel != null) return _Mode_of_travel!!
        
        _Mode_of_travel = ImageVector.Builder(
            name = "mode_of_travel",
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
                moveTo(15.31f, 18.9f)
                curveToRelative(-0.96f, 1f, -2.06f, 2.03f, -3.31f, 3.1f)
                curveToRelative(-5.33f, -4.55f, -8f, -8.48f, -8f, -11.8f)
                curveTo(4f, 5.22f, 7.8f, 2f, 12f, 2f)
                curveToRelative(4f, 0f, 7.64f, 2.92f, 7.97f, 7.5f)
                lineToRelative(3.53f, 0f)
                lineTo(19f, 14f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(3.47f, 0f)
                curveTo(17.65f, 6.24f, 15.13f, 4f, 12f, 4f)
                curveToRelative(-3.35f, 0f, -6f, 2.57f, -6f, 6.2f)
                curveToRelative(0f, 2.34f, 1.95f, 5.44f, 6f, 9.14f)
                curveToRelative(0.64f, -0.59f, 1.23f, -1.16f, 1.77f, -1.71f)
                curveToRelative(-0.17f, -0.34f, -0.27f, -0.72f, -0.27f, -1.12f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(17.38f, 19f, 16f, 19f)
                curveTo(15.76f, 19f, 15.53f, 18.97f, 15.31f, 18.9f)
                close()
            }
        }.build()
        
        return _Mode_of_travel!!
    }

private var _Mode_of_travel: ImageVector? = null

