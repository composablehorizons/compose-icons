package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Rowing: ImageVector
    get() {
        if (_Rowing != null) return _Rowing!!
        
        _Rowing = ImageVector.Builder(
            name = "rowing",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.75f, 18.25f)
                curveToRelative(-0.41f, 0.41f, -0.41f, 1.09f, 0f, 1.5f)
                curveToRelative(0.41f, 0.41f, 1.09f, 0.41f, 1.5f, 0f)
                lineTo(9f, 17f)
                horizontalLineToRelative(2f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-3.75f, 3.75f)
                close()
                moveTo(15f, 5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveToRelative(5.29f, 15.3f)
                lineToRelative(-2f, -2.01f)
                curveToRelative(-0.18f, -0.18f, -0.44f, -0.29f, -0.71f, -0.29f)
                horizontalLineTo(16.5f)
                lineToRelative(-6.29f, -6.29f)
                curveToRelative(0.79f, -0.33f, 1.66f, -0.87f, 2.29f, -1.39f)
                verticalLineToRelative(2.27f)
                lineToRelative(3.58f, 3.58f)
                curveToRelative(0.57f, -0.55f, 0.92f, -1.32f, 0.92f, -2.16f)
                verticalLineTo(8.26f)
                curveTo(17f, 7.02f, 15.98f, 6f, 14.74f, 6f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.34f, 0f, -0.67f, 0.09f, -0.96f, 0.23f)
                curveToRelative(-0.26f, 0.12f, -0.5f, 0.29f, -0.69f, 0.5f)
                lineToRelative(-1.4f, 1.55f)
                curveTo(10.61f, 9.45f, 8.66f, 10.35f, 7f, 10.32f)
                curveToRelative(-0.6f, 0f, -1.08f, 0.48f, -1.08f, 1.08f)
                curveToRelative(0f, 0.6f, 0.48f, 1.08f, 1.08f, 1.08f)
                curveToRelative(0.31f, 0f, 0.61f, -0.03f, 0.9f, -0.07f)
                lineToRelative(7.11f, 7.09f)
                verticalLineToRelative(1.08f)
                curveToRelative(0f, 0.26f, 0.1f, 0.52f, 0.29f, 0.7f)
                lineToRelative(1.99f, 2.01f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0f)
                lineToRelative(1.58f, -1.58f)
                curveToRelative(0.39f, -0.38f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.build()
        
        return _Rowing!!
    }

private var _Rowing: ImageVector? = null

