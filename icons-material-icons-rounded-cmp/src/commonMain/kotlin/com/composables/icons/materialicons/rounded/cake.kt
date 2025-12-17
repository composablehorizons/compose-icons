package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cake: ImageVector
    get() {
        if (_Cake != null) return _Cake!!
        
        _Cake = ImageVector.Builder(
            name = "cake",
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
                moveTo(12.68f, 5.88f)
                curveToRelative(0.7f, -0.24f, 1.22f, -0.9f, 1.3f, -1.64f)
                curveToRelative(0.05f, -0.47f, -0.05f, -0.91f, -0.28f, -1.27f)
                lineTo(12.42f, 0.75f)
                curveToRelative(-0.19f, -0.33f, -0.67f, -0.33f, -0.87f, 0f)
                lineToRelative(-1.28f, 2.22f)
                curveToRelative(-0.17f, 0.3f, -0.27f, 0.65f, -0.27f, 1.03f)
                curveToRelative(0f, 1.32f, 1.3f, 2.35f, 2.68f, 1.88f)
                close()
                moveToRelative(3.85f, 10.04f)
                lineToRelative(-1f, -1f)
                lineToRelative(-1.08f, 1.07f)
                curveToRelative(-1.3f, 1.3f, -3.58f, 1.31f, -4.89f, 0f)
                lineToRelative(-1.07f, -1.07f)
                lineToRelative(-1.09f, 1.07f)
                curveTo(6.75f, 16.64f, 5.88f, 17f, 4.96f, 17f)
                curveToRelative(-0.73f, 0f, -1.4f, -0.23f, -1.96f, -0.61f)
                verticalLineTo(20f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3.61f)
                curveToRelative(-0.75f, 0.51f, -1.71f, 0.75f, -2.74f, 0.52f)
                curveToRelative(-0.66f, -0.14f, -1.25f, -0.51f, -1.73f, -0.99f)
                close()
                moveTo(18f, 9f)
                horizontalLineToRelative(-5f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(6f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(1.46f)
                curveToRelative(0f, 0.85f, 0.5f, 1.67f, 1.31f, 1.94f)
                curveToRelative(0.73f, 0.24f, 1.52f, 0.06f, 2.03f, -0.46f)
                lineToRelative(2.14f, -2.13f)
                lineToRelative(2.13f, 2.13f)
                curveToRelative(0.76f, 0.76f, 2.01f, 0.76f, 2.77f, 0f)
                lineToRelative(2.14f, -2.13f)
                lineToRelative(2.13f, 2.13f)
                curveToRelative(0.43f, 0.43f, 1.03f, 0.63f, 1.65f, 0.55f)
                curveToRelative(0.99f, -0.13f, 1.69f, -1.06f, 1.69f, -2.06f)
                verticalLineToRelative(-1.42f)
                curveTo(21f, 10.34f, 19.66f, 9f, 18f, 9f)
                close()
            }
        }.build()
        
        return _Cake!!
    }

private var _Cake: ImageVector? = null

