package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Cake: ImageVector
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
                moveTo(12f, 6f)
                curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.38f, -0.1f, -0.73f, -0.29f, -1.03f)
                lineTo(12f, 0f)
                lineToRelative(-1.71f, 2.97f)
                curveToRelative(-0.19f, 0.3f, -0.29f, 0.65f, -0.29f, 1.03f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveToRelative(4.53f, 9.92f)
                lineToRelative(-1f, -1f)
                lineToRelative(-1.08f, 1.07f)
                curveToRelative(-1.3f, 1.3f, -3.58f, 1.31f, -4.89f, 0f)
                lineToRelative(-1.07f, -1.07f)
                lineToRelative(-1.09f, 1.07f)
                curveTo(6.75f, 16.64f, 5.88f, 17f, 4.96f, 17f)
                curveToRelative(-0.73f, 0f, -1.4f, -0.23f, -1.96f, -0.61f)
                verticalLineTo(22f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-5.61f)
                curveToRelative(-0.75f, 0.51f, -1.71f, 0.75f, -2.74f, 0.52f)
                curveToRelative(-0.66f, -0.14f, -1.25f, -0.51f, -1.73f, -0.99f)
                close()
                moveTo(18f, 9f)
                horizontalLineToRelative(-5f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(1.54f)
                curveToRelative(0f, 1.08f, 0.88f, 1.96f, 1.96f, 1.96f)
                curveToRelative(0.52f, 0f, 1.02f, -0.2f, 1.38f, -0.57f)
                lineToRelative(2.14f, -2.13f)
                lineToRelative(2.13f, 2.13f)
                curveToRelative(0.74f, 0.74f, 2.03f, 0.74f, 2.77f, 0f)
                lineToRelative(2.14f, -2.13f)
                lineToRelative(2.13f, 2.13f)
                curveToRelative(0.37f, 0.37f, 0.86f, 0.57f, 1.38f, 0.57f)
                curveToRelative(1.08f, 0f, 1.96f, -0.88f, 1.96f, -1.96f)
                verticalLineTo(12f)
                curveTo(21f, 10.34f, 19.66f, 9f, 18f, 9f)
                close()
            }
        }.build()
        
        return _Cake!!
    }

private var _Cake: ImageVector? = null

