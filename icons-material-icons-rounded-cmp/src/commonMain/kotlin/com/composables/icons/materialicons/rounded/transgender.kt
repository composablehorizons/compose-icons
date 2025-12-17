package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Transgender: ImageVector
    get() {
        if (_Transgender != null) return _Transgender!!
        
        _Transgender = ImageVector.Builder(
            name = "transgender",
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
                moveTo(21.5f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.58f)
                lineToRelative(-3.97f, 3.97f)
                curveTo(14.23f, 6.36f, 13.16f, 6f, 12f, 6f)
                reflectiveCurveTo(9.77f, 6.36f, 8.89f, 6.97f)
                lineTo(8.24f, 6.32f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-0.7f, 0.7f)
                lineTo(4.92f, 3f)
                horizontalLineTo(6.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(4.42f)
                lineToRelative(1.91f, 1.9f)
                lineTo(4.7f, 7.03f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(0.65f, 0.65f)
                curveTo(6.86f, 9.27f, 6.5f, 10.34f, 6.5f, 11.5f)
                curveToRelative(0f, 2.7f, 1.94f, 4.94f, 4.5f, 5.41f)
                verticalLineTo(19f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.09f)
                curveToRelative(2.56f, -0.47f, 4.5f, -2.71f, 4.5f, -5.41f)
                curveToRelative(0f, -1.16f, -0.36f, -2.23f, -0.97f, -3.12f)
                lineToRelative(3.97f, -3.96f)
                verticalLineTo(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(2f)
                curveTo(22.5f, 1.45f, 22.05f, 1f, 21.5f, 1f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveTo(8.5f, 9.57f, 10.07f, 8f, 12f, 8f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveTo(15.5f, 13.43f, 13.93f, 15f, 12f, 15f)
                close()
            }
        }.build()
        
        return _Transgender!!
    }

private var _Transgender: ImageVector? = null

