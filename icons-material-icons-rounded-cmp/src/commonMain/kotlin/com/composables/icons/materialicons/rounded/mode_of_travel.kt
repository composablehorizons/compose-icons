package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mode_of_travel: ImageVector
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
                moveTo(4f, 10.2f)
                curveTo(4f, 5.22f, 7.8f, 2f, 12f, 2f)
                curveToRelative(4f, 0f, 7.64f, 2.92f, 7.97f, 7.5f)
                lineToRelative(2.32f, 0f)
                curveToRelative(0.45f, 0f, 0.67f, 0.54f, 0.35f, 0.85f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                lineToRelative(-3.29f, -3.29f)
                curveToRelative(-0.31f, -0.31f, -0.09f, -0.85f, 0.35f, -0.85f)
                lineToRelative(2.26f, 0f)
                curveTo(17.65f, 6.24f, 15.13f, 4f, 12f, 4f)
                curveToRelative(-3.35f, 0f, -6f, 2.57f, -6f, 6.2f)
                curveToRelative(0f, 2.34f, 1.95f, 5.44f, 6f, 9.14f)
                curveToRelative(0.64f, -0.59f, 1.23f, -1.16f, 1.77f, -1.71f)
                curveToRelative(-0.17f, -0.34f, -0.27f, -0.72f, -0.27f, -1.12f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(17.38f, 19f, 16f, 19f)
                curveToRelative(-0.24f, 0f, -0.47f, -0.03f, -0.69f, -0.1f)
                curveToRelative(-0.78f, 0.82f, -1.67f, 1.66f, -2.65f, 2.52f)
                curveToRelative(-0.38f, 0.33f, -0.95f, 0.33f, -1.33f, 0f)
                curveTo(6.45f, 17.12f, 4f, 13.38f, 4f, 10.2f)
                close()
            }
        }.build()
        
        return _Mode_of_travel!!
    }

private var _Mode_of_travel: ImageVector? = null

