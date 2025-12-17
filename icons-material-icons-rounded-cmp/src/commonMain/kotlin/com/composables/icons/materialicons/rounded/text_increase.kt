package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Text_increase: ImageVector
    get() {
        if (_Text_increase != null) return _Text_increase!!
        
        _Text_increase = ImageVector.Builder(
            name = "text_increase",
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
                moveTo(2.61f, 19f)
                lineTo(2.61f, 19f)
                curveToRelative(0.48f, 0f, 0.91f, -0.3f, 1.06f, -0.75f)
                lineToRelative(1.01f, -2.83f)
                horizontalLineToRelative(5.65f)
                lineToRelative(0.99f, 2.82f)
                curveTo(11.48f, 18.7f, 11.91f, 19f, 12.39f, 19f)
                curveToRelative(0.79f, 0f, 1.33f, -0.79f, 1.05f, -1.52f)
                lineTo(9.19f, 6.17f)
                curveTo(8.93f, 5.47f, 8.25f, 5f, 7.5f, 5f)
                reflectiveCurveTo(6.07f, 5.47f, 5.81f, 6.17f)
                lineTo(1.56f, 17.48f)
                curveTo(1.28f, 18.21f, 1.83f, 19f, 2.61f, 19f)
                close()
                moveTo(7.44f, 7.6f)
                horizontalLineToRelative(0.12f)
                lineToRelative(2.03f, 5.79f)
                horizontalLineTo(5.41f)
                lineTo(7.44f, 7.6f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveTo(15.45f, 13f, 15f, 12.55f, 15f, 12f)
                close()
            }
        }.build()
        
        return _Text_increase!!
    }

private var _Text_increase: ImageVector? = null

