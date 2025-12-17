package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Smoking_rooms: ImageVector
    get() {
        if (_Smoking_rooms != null) return _Smoking_rooms!!
        
        _Smoking_rooms = ImageVector.Builder(
            name = "smoking_rooms",
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
                moveTo(15.5f, 16f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveTo(2.67f, 19f, 3.5f, 19f)
                horizontalLineToRelative(12f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveToRelative(3.35f, -8.27f)
                curveToRelative(0.62f, -0.61f, 1f, -1.45f, 1f, -2.38f)
                curveToRelative(0f, -1.51f, -1f, -2.79f, -2.38f, -3.21f)
                curveToRelative(-0.48f, -0.14f, -0.97f, 0.22f, -0.97f, 0.72f)
                curveToRelative(0f, 0.33f, 0.21f, 0.62f, 0.52f, 0.71f)
                curveToRelative(0.77f, 0.23f, 1.33f, 0.94f, 1.33f, 1.78f)
                curveToRelative(0f, 0.82f, -0.53f, 1.51f, -1.27f, 1.76f)
                curveToRelative(-0.33f, 0.11f, -0.58f, 0.39f, -0.58f, 0.74f)
                verticalLineTo(8f)
                curveToRelative(0f, 0.37f, 0.27f, 0.69f, 0.64f, 0.75f)
                curveToRelative(1.93f, 0.31f, 3.36f, 2f, 3.36f, 4.02f)
                verticalLineToRelative(1.48f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-1.49f)
                curveToRelative(0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f)
                close()
                moveToRelative(-2.82f, 2.47f)
                horizontalLineToRelative(-1.3f)
                curveToRelative(-1.02f, 0f, -1.94f, -0.73f, -2.07f, -1.75f)
                curveToRelative(-0.12f, -0.95f, 0.46f, -1.7f, 1.3f, -1.93f)
                curveToRelative(0.32f, -0.09f, 0.54f, -0.38f, 0.54f, -0.72f)
                curveToRelative(0f, -0.49f, -0.46f, -0.86f, -0.93f, -0.72f)
                curveToRelative(-1.42f, 0.41f, -2.45f, 1.73f, -2.42f, 3.28f)
                curveToRelative(0.03f, 1.84f, 1.62f, 3.29f, 3.46f, 3.29f)
                horizontalLineToRelative(1.42f)
                curveToRelative(1.05f, 0f, 1.97f, 0.74f, 1.97f, 2.05f)
                verticalLineToRelative(0.55f)
                curveToRelative(0f, 0.41f, 0.33f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.41f, 0f, 0.75f, -0.33f, 0.75f, -0.75f)
                verticalLineToRelative(-0.89f)
                curveToRelative(-0.01f, -1.81f, -1.61f, -3.16f, -3.48f, -3.16f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(18f)
                close()
                moveToRelative(2.5f, 0f)
                horizontalLineTo(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }.build()
        
        return _Smoking_rooms!!
    }

private var _Smoking_rooms: ImageVector? = null

