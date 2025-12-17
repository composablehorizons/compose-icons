package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.No_meals: ImageVector
    get() {
        if (_No_meals != null) return _No_meals!!
        
        _No_meals = ImageVector.Builder(
            name = "no_meals",
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
                moveTo(21f, 18.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(14f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.49f, 1.6f, -3.32f, 3.76f, -3.85f)
                curveTo(20.39f, 2f, 21f, 2.48f, 21f, 3.13f)
                verticalLineTo(18.17f)
                close()
                moveTo(21.19f, 22.61f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-9.76f, -9.76f)
                curveTo(9.69f, 12.94f, 9.36f, 13f, 9f, 13f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineTo(5.83f)
                lineTo(1.39f, 4.22f)
                curveTo(1f, 3.83f, 1f, 3.2f, 1.39f, 2.81f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(18.38f, 18.38f)
                curveTo(21.58f, 21.58f, 21.58f, 22.22f, 21.19f, 22.61f)
                close()
                moveTo(6.17f, 9f)
                lineTo(5f, 7.83f)
                verticalLineTo(9f)
                horizontalLineTo(6.17f)
                close()
                moveTo(13f, 9f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5.17f)
                lineToRelative(1.85f, 1.85f)
                curveTo(12.94f, 9.69f, 13f, 9.36f, 13f, 9f)
                close()
                moveTo(9f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(7f, 2.45f, 7f, 3f)
                verticalLineToRelative(1.17f)
                lineToRelative(2f, 2f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _No_meals!!
    }

private var _No_meals: ImageVector? = null

