package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Radio: ImageVector
    get() {
        if (_Radio != null) return _Radio!!
        
        _Radio = ImageVector.Builder(
            name = "radio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(3.75f, 7.5f)
                lineToRelative(16.5f, -4.125f)
                moveTo(12f, 6.75f)
                curveToRelative(-2.708f, 0f, -5.363f, 0.224f, -7.948f, 0.655f)
                curveTo(2.999f, 7.58f, 2.25f, 8.507f, 2.25f, 9.574f)
                verticalLineToRelative(9.176f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.5f, 21f)
                horizontalLineToRelative(15f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineTo(9.574f)
                curveToRelative(0f, -1.067f, -0.75f, -1.994f, -1.802f, -2.169f)
                arcTo(48.329f, 48.329f, 0f, false, false, 12f, 6.75f)
                close()
                moveToRelative(-1.683f, 6.443f)
                lineToRelative(-0.005f, 0.005f)
                lineToRelative(-0.006f, -0.005f)
                lineToRelative(0.006f, -0.005f)
                lineToRelative(0.005f, 0.005f)
                close()
                moveToRelative(-0.005f, 2.127f)
                lineToRelative(-0.005f, -0.006f)
                lineToRelative(0.005f, -0.005f)
                lineToRelative(0.005f, 0.005f)
                lineToRelative(-0.005f, 0.005f)
                close()
                moveToRelative(-2.116f, -0.006f)
                lineToRelative(-0.005f, 0.006f)
                lineToRelative(-0.006f, -0.006f)
                lineToRelative(0.005f, -0.005f)
                lineToRelative(0.006f, 0.005f)
                close()
                moveToRelative(-0.005f, -2.116f)
                lineToRelative(-0.006f, -0.005f)
                lineToRelative(0.006f, -0.005f)
                lineToRelative(0.005f, 0.005f)
                lineToRelative(-0.005f, 0.005f)
                close()
                moveTo(9.255f, 10.5f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(0.008f)
                close()
                moveToRelative(3.249f, 1.88f)
                lineToRelative(-0.007f, 0.004f)
                lineToRelative(-0.003f, -0.007f)
                lineToRelative(0.006f, -0.003f)
                lineToRelative(0.004f, 0.006f)
                close()
                moveToRelative(-1.38f, 5.126f)
                lineToRelative(-0.003f, -0.006f)
                lineToRelative(0.006f, -0.004f)
                lineToRelative(0.004f, 0.007f)
                lineToRelative(-0.006f, 0.003f)
                close()
                moveToRelative(0.007f, -6.501f)
                lineToRelative(-0.003f, 0.006f)
                lineToRelative(-0.007f, -0.003f)
                lineToRelative(0.004f, -0.007f)
                lineToRelative(0.006f, 0.004f)
                close()
                moveToRelative(1.37f, 5.129f)
                lineToRelative(-0.007f, -0.004f)
                lineToRelative(0.004f, -0.006f)
                lineToRelative(0.006f, 0.003f)
                lineToRelative(-0.004f, 0.007f)
                close()
                moveToRelative(0.504f, -1.877f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.007f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.007f)
                close()
                moveTo(9.255f, 18f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineTo(18f)
                horizontalLineToRelative(0.008f)
                close()
                moveToRelative(-3.246f, -1.87f)
                lineToRelative(-0.007f, 0.004f)
                lineTo(6f, 16.127f)
                lineToRelative(0.006f, -0.003f)
                lineToRelative(0.004f, 0.006f)
                close()
                moveToRelative(1.366f, -5.119f)
                lineToRelative(-0.004f, -0.006f)
                lineToRelative(0.006f, -0.004f)
                lineToRelative(0.004f, 0.007f)
                lineToRelative(-0.006f, 0.003f)
                close()
                moveTo(7.38f, 17.5f)
                lineToRelative(-0.003f, 0.006f)
                lineToRelative(-0.007f, -0.003f)
                lineToRelative(0.004f, -0.007f)
                lineToRelative(0.006f, 0.004f)
                close()
                moveToRelative(-1.376f, -5.116f)
                lineTo(6f, 12.38f)
                lineToRelative(0.003f, -0.007f)
                lineToRelative(0.007f, 0.004f)
                lineToRelative(-0.004f, 0.007f)
                close()
                moveToRelative(-0.5f, 1.873f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.007f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.007f)
                close()
                moveTo(17.25f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                close()
                moveToRelative(0f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                close()
            }
        }.build()
        
        return _Radio!!
    }

private var _Radio: ImageVector? = null

