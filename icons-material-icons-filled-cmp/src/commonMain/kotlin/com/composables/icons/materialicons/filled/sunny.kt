package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sunny: ImageVector
    get() {
        if (_Sunny != null) return _Sunny!!
        
        _Sunny = ImageVector.Builder(
            name = "sunny",
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
                moveTo(11f, 4f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveTo(11f, 4.55f, 11f, 4f)
                close()
                moveTo(18.36f, 7.05f)
                lineToRelative(1.41f, -1.42f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-1.41f, 1.42f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveTo(17.34f, 7.44f, 17.97f, 7.44f, 18.36f, 7.05f)
                close()
                moveTo(22f, 11f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveTo(22.55f, 11f, 22f, 11f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveTo(13f, 19.45f, 12.55f, 19f, 12f, 19f)
                close()
                moveTo(5.64f, 7.05f)
                lineTo(4.22f, 5.64f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.03f, 0f, -1.41f)
                reflectiveCurveToRelative(1.03f, -0.39f, 1.41f, 0f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.03f, 0f, 1.41f)
                reflectiveCurveTo(6.02f, 7.44f, 5.64f, 7.05f)
                close()
                moveTo(16.95f, 16.95f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0f, 1.41f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0f, -1.41f)
                lineToRelative(-1.41f, -1.41f)
                curveTo(17.98f, 16.56f, 17.34f, 16.56f, 16.95f, 16.95f)
                close()
                moveTo(2f, 13f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveTo(1.45f, 13f, 2f, 13f)
                close()
                moveTo(5.64f, 19.78f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.03f, -0.39f, -1.41f, 0f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0f, 1.41f)
                curveTo(4.61f, 20.17f, 5.25f, 20.17f, 5.64f, 19.78f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(15.31f, 6f, 12f, 6f)
                close()
            }
        }.build()
        
        return _Sunny!!
    }

private var _Sunny: ImageVector? = null

