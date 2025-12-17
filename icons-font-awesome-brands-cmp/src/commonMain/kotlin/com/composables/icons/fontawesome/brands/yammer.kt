package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Yammer: ImageVector
    get() {
        if (_Yammer != null) return _Yammer!!
        
        _Yammer = ImageVector.Builder(
            name = "yammer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(421.78f, 152.17f)
                arcTo(23.06f, 23.06f, 0f, false, false, 400.9f, 112f)
                curveToRelative(-0.83f, 0.43f, -1.71f, 0.9f, -2.63f, 1.4f)
                curveToRelative(-15.25f, 8.4f, -118.33f, 80.62f, -106.69f, 88.77f)
                reflectiveCurveToRelative(82.04f, -23.61f, 130.2f, -50f)
                close()
                moveToRelative(0f, 217.17f)
                curveToRelative(-48.16f, -26.38f, -118.64f, -58.1f, -130.2f, -50f)
                reflectiveCurveToRelative(91.42f, 80.35f, 106.69f, 88.74f)
                curveToRelative(0.92f, 0.51f, 1.8f, 1f, 2.63f, 1.41f)
                arcToRelative(23.07f, 23.07f, 0f, false, false, 20.88f, -40.15f)
                close()
                moveTo(464.21f, 237f)
                curveToRelative(-0.95f, 0f, -1.95f, -0.06f, -3f, -0.06f)
                curveToRelative(-17.4f, 0f, -142.52f, 13.76f, -136.24f, 26.51f)
                reflectiveCurveToRelative(83.3f, 18.74f, 138.21f, 18.76f)
                arcToRelative(23f, 23f, 0f, false, false, 1f, -45.21f)
                close()
                moveTo(31f, 96.65f)
                arcToRelative(24.88f, 24.88f, 0f, false, true, 46.14f, -18.4f)
                lineToRelative(81f, 205.06f)
                horizontalLineToRelative(1.21f)
                lineToRelative(77f, -203.53f)
                arcToRelative(23.52f, 23.52f, 0f, false, true, 44.45f, 15.27f)
                lineTo(171.2f, 368.44f)
                curveTo(152.65f, 415.66f, 134.08f, 448f, 77.91f, 448f)
                arcToRelative(139.67f, 139.67f, 0f, false, true, -23.81f, -1.95f)
                arcToRelative(21.31f, 21.31f, 0f, false, true, 6.9f, -41.77f)
                curveToRelative(0.66f, 0.06f, 10.91f, 0.66f, 13.86f, 0.66f)
                curveToRelative(30.47f, 0f, 43.74f, -18.94f, 58.07f, -59.41f)
                close()
            }
        }.build()
        
        return _Yammer!!
    }

private var _Yammer: ImageVector? = null

