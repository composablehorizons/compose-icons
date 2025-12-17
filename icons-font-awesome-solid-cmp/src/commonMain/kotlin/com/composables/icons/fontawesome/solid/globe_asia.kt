package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GlobeAsia: ImageVector
    get() {
        if (_GlobeAsia != null) return _GlobeAsia!!
        
        _GlobeAsia = ImageVector.Builder(
            name = "globe-asia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111.03f, 8f, 0f, 119.03f, 0f, 256f)
                reflectiveCurveToRelative(111.03f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.03f, 248f, -248f)
                reflectiveCurveTo(384.97f, 8f, 248f, 8f)
                close()
                moveToRelative(-11.34f, 240.23f)
                curveToRelative(-2.89f, 4.82f, -8.1f, 7.77f, -13.72f, 7.77f)
                horizontalLineToRelative(-0.31f)
                curveToRelative(-4.24f, 0f, -8.31f, 1.69f, -11.31f, 4.69f)
                lineToRelative(-5.66f, 5.66f)
                curveToRelative(-3.12f, 3.12f, -3.12f, 8.19f, 0f, 11.31f)
                lineToRelative(5.66f, 5.66f)
                curveToRelative(3f, 3f, 4.69f, 7.07f, 4.69f, 11.31f)
                verticalLineTo(304f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-6.11f)
                curveToRelative(-6.06f, 0f, -11.6f, -3.42f, -14.31f, -8.85f)
                lineToRelative(-22.62f, -45.23f)
                curveToRelative(-2.44f, -4.88f, -8.95f, -5.94f, -12.81f, -2.08f)
                lineToRelative(-19.47f, 19.46f)
                curveToRelative(-3f, 3f, -7.07f, 4.69f, -11.31f, 4.69f)
                horizontalLineTo(50.81f)
                curveTo(49.12f, 277.55f, 48f, 266.92f, 48f, 256f)
                curveToRelative(0f, -110.28f, 89.72f, -200f, 200f, -200f)
                curveToRelative(21.51f, 0f, 42.2f, 3.51f, 61.63f, 9.82f)
                lineToRelative(-50.16f, 38.53f)
                curveToRelative(-5.11f, 3.41f, -4.63f, 11.06f, 0.86f, 13.81f)
                lineToRelative(10.83f, 5.41f)
                curveToRelative(5.42f, 2.71f, 8.84f, 8.25f, 8.84f, 14.31f)
                verticalLineTo(216f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-3.06f)
                curveToRelative(-3.03f, 0f, -5.8f, -1.71f, -7.15f, -4.42f)
                curveToRelative(-1.56f, -3.12f, -5.96f, -3.29f, -7.76f, -0.3f)
                lineToRelative(-17.37f, 28.95f)
                close()
                moveTo(408f, 358.43f)
                curveToRelative(0f, 4.24f, -1.69f, 8.31f, -4.69f, 11.31f)
                lineToRelative(-9.57f, 9.57f)
                curveToRelative(-3f, 3f, -7.07f, 4.69f, -11.31f, 4.69f)
                horizontalLineToRelative(-15.16f)
                curveToRelative(-4.24f, 0f, -8.31f, -1.69f, -11.31f, -4.69f)
                lineToRelative(-13.01f, -13.01f)
                arcToRelative(26.767f, 26.767f, 0f, false, false, -25.42f, -7.04f)
                lineToRelative(-21.27f, 5.32f)
                curveToRelative(-1.27f, 0.32f, -2.57f, 0.48f, -3.88f, 0.48f)
                horizontalLineToRelative(-10.34f)
                curveToRelative(-4.24f, 0f, -8.31f, -1.69f, -11.31f, -4.69f)
                lineToRelative(-11.91f, -11.91f)
                arcToRelative(8.008f, 8.008f, 0f, false, true, -2.34f, -5.66f)
                verticalLineToRelative(-10.2f)
                curveToRelative(0f, -3.27f, 1.99f, -6.21f, 5.03f, -7.43f)
                lineToRelative(39.34f, -15.74f)
                curveToRelative(1.98f, -0.79f, 3.86f, -1.82f, 5.59f, -3.05f)
                lineToRelative(23.71f, -16.89f)
                arcToRelative(7.978f, 7.978f, 0f, false, true, 4.64f, -1.48f)
                horizontalLineToRelative(12.09f)
                curveToRelative(3.23f, 0f, 6.15f, 1.94f, 7.39f, 4.93f)
                lineToRelative(5.35f, 12.85f)
                arcToRelative(4f, 4f, 0f, false, false, 3.69f, 2.46f)
                horizontalLineToRelative(3.8f)
                curveToRelative(1.78f, 0f, 3.35f, -1.18f, 3.84f, -2.88f)
                lineToRelative(4.2f, -14.47f)
                curveToRelative(0.5f, -1.71f, 2.06f, -2.88f, 3.84f, -2.88f)
                horizontalLineToRelative(6.06f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(12.93f)
                curveToRelative(0f, 2.12f, 0.84f, 4.16f, 2.34f, 5.66f)
                lineToRelative(11.91f, 11.91f)
                curveToRelative(3f, 3f, 4.69f, 7.07f, 4.69f, 11.31f)
                verticalLineToRelative(24.6f)
                close()
            }
        }.build()
        
        return _GlobeAsia!!
    }

private var _GlobeAsia: ImageVector? = null

