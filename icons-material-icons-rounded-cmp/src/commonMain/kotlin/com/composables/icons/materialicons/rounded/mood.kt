package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mood: ImageVector
    get() {
        if (_Mood != null) return _Mood!!
        
        _Mood = ImageVector.Builder(
            name = "mood",
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
                moveTo(11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                reflectiveCurveToRelative(3.58f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                reflectiveCurveToRelative(-3.58f, 8f, -8f, 8f)
                close()
                moveToRelative(3.5f, -9f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(16.33f, 8f, 15.5f, 8f)
                reflectiveCurveTo(14f, 8.67f, 14f, 9.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveToRelative(-7f, 0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(9.33f, 8f, 8.5f, 8f)
                reflectiveCurveTo(7f, 8.67f, 7f, 9.5f)
                reflectiveCurveTo(7.67f, 11f, 8.5f, 11f)
                close()
                moveToRelative(3.5f, 6.5f)
                curveToRelative(2.03f, 0f, 3.8f, -1.11f, 4.75f, -2.75f)
                curveToRelative(0.19f, -0.33f, -0.05f, -0.75f, -0.44f, -0.75f)
                horizontalLineTo(7.69f)
                curveToRelative(-0.38f, 0f, -0.63f, 0.42f, -0.44f, 0.75f)
                curveToRelative(0.95f, 1.64f, 2.72f, 2.75f, 4.75f, 2.75f)
                close()
            }
        }.build()
        
        return _Mood!!
    }

private var _Mood: ImageVector? = null

