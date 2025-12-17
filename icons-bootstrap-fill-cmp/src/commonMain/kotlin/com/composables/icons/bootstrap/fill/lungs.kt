package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Lungs: ImageVector
    get() {
        if (_Lungs != null) return _Lungs!!
        
        _Lungs = ImageVector.Builder(
            name = "lungs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(5.243f)
                lineTo(9f, 7.1f)
                verticalLineTo(4.72f)
                curveTo(9f, 3.77f, 9.77f, 3f, 10.72f, 3f)
                curveToRelative(0.524f, 0f, 1.023f, 0.27f, 1.443f, 0.592f)
                curveToRelative(0.431f, 0.332f, 0.847f, 0.773f, 1.216f, 1.229f)
                curveToRelative(0.736f, 0.908f, 1.347f, 1.946f, 1.58f, 2.48f)
                curveToRelative(0.176f, 0.405f, 0.393f, 1.16f, 0.556f, 2.011f)
                curveToRelative(0.165f, 0.857f, 0.283f, 1.857f, 0.24f, 2.759f)
                curveToRelative(-0.04f, 0.867f, -0.232f, 1.79f, -0.837f, 2.33f)
                curveToRelative(-0.67f, 0.6f, -1.622f, 0.556f, -2.741f, -0.004f)
                lineToRelative(-1.795f, -0.897f)
                arcTo(2.5f, 2.5f, 0f, false, true, 9f, 11.264f)
                verticalLineTo(8.329f)
                lineToRelative(-1f, -0.715f)
                lineToRelative(-1f, 0.715f)
                verticalLineTo(7.214f)
                curveToRelative(-0.1f, 0f, -0.202f, 0.03f, -0.29f, 0.093f)
                lineToRelative(-2.5f, 1.786f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.58f, 0.814f)
                lineTo(7f, 8.329f)
                verticalLineToRelative(2.935f)
                arcTo(2.5f, 2.5f, 0f, false, true, 5.618f, 13.5f)
                lineToRelative(-1.795f, 0.897f)
                curveToRelative(-1.12f, 0.56f, -2.07f, 0.603f, -2.741f, 0.004f)
                curveToRelative(-0.605f, -0.54f, -0.798f, -1.463f, -0.838f, -2.33f)
                curveToRelative(-0.042f, -0.902f, 0.076f, -1.902f, 0.24f, -2.759f)
                curveToRelative(0.164f, -0.852f, 0.38f, -1.606f, 0.558f, -2.012f)
                curveToRelative(0.232f, -0.533f, 0.843f, -1.571f, 1.579f, -2.479f)
                curveToRelative(0.37f, -0.456f, 0.785f, -0.897f, 1.216f, -1.229f)
                curveTo(4.257f, 3.27f, 4.756f, 3f, 5.28f, 3f)
                curveTo(6.23f, 3f, 7f, 3.77f, 7f, 4.72f)
                verticalLineTo(7.1f)
                lineToRelative(0.5f, -0.357f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 1f)
                moveToRelative(3.21f, 8.907f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.58f, -0.814f)
                lineToRelative(-2.5f, -1.786f)
                arcTo(0.5f, 0.5f, 0f, false, false, 9f, 7.214f)
                verticalLineTo(8.33f)
                close()
            }
        }.build()
        
        return _Lungs!!
    }

private var _Lungs: ImageVector? = null

