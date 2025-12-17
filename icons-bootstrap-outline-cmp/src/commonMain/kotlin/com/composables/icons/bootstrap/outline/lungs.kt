package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Lungs: ImageVector
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
                moveTo(8.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                verticalLineToRelative(5.243f)
                lineTo(7f, 7.1f)
                verticalLineTo(4.72f)
                curveTo(7f, 3.77f, 6.23f, 3f, 5.28f, 3f)
                curveToRelative(-0.524f, 0f, -1.023f, 0.27f, -1.443f, 0.592f)
                curveToRelative(-0.431f, 0.332f, -0.847f, 0.773f, -1.216f, 1.229f)
                curveToRelative(-0.736f, 0.908f, -1.347f, 1.946f, -1.58f, 2.48f)
                curveToRelative(-0.176f, 0.405f, -0.393f, 1.16f, -0.556f, 2.011f)
                curveToRelative(-0.165f, 0.857f, -0.283f, 1.857f, -0.241f, 2.759f)
                curveToRelative(0.04f, 0.867f, 0.233f, 1.79f, 0.838f, 2.33f)
                curveToRelative(0.67f, 0.6f, 1.622f, 0.556f, 2.741f, -0.004f)
                lineToRelative(1.795f, -0.897f)
                arcTo(2.5f, 2.5f, 0f, false, false, 7f, 11.264f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(0.764f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.83f, 1.342f)
                lineToRelative(-1.794f, 0.897f)
                curveToRelative(-0.978f, 0.489f, -1.415f, 0.343f, -1.628f, 0.152f)
                curveToRelative(-0.28f, -0.25f, -0.467f, -0.801f, -0.505f, -1.63f)
                curveToRelative(-0.037f, -0.795f, 0.068f, -1.71f, 0.224f, -2.525f)
                curveToRelative(0.157f, -0.82f, 0.357f, -1.491f, 0.491f, -1.8f)
                curveToRelative(0.19f, -0.438f, 0.75f, -1.4f, 1.44f, -2.25f)
                curveToRelative(0.342f, -0.422f, 0.703f, -0.799f, 1.049f, -1.065f)
                curveToRelative(0.358f, -0.276f, 0.639f, -0.385f, 0.833f, -0.385f)
                arcToRelative(0.72f, 0.72f, 0f, false, true, 0.72f, 0.72f)
                verticalLineToRelative(3.094f)
                lineToRelative(-1.79f, 1.28f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.58f, 0.813f)
                lineTo(8f, 7.614f)
                lineToRelative(3.21f, 2.293f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.58f, -0.814f)
                lineTo(10f, 7.814f)
                verticalLineTo(4.72f)
                arcToRelative(0.72f, 0.72f, 0f, false, true, 0.72f, -0.72f)
                curveToRelative(0.194f, 0f, 0.475f, 0.11f, 0.833f, 0.385f)
                curveToRelative(0.346f, 0.266f, 0.706f, 0.643f, 1.05f, 1.066f)
                curveToRelative(0.688f, 0.85f, 1.248f, 1.811f, 1.439f, 2.249f)
                curveToRelative(0.134f, 0.309f, 0.334f, 0.98f, 0.491f, 1.8f)
                curveToRelative(0.156f, 0.814f, 0.26f, 1.73f, 0.224f, 2.525f)
                curveToRelative(-0.038f, 0.829f, -0.224f, 1.38f, -0.505f, 1.63f)
                curveToRelative(-0.213f, 0.19f, -0.65f, 0.337f, -1.628f, -0.152f)
                lineToRelative(-1.795f, -0.897f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 11.264f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(0.764f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 1.382f, 2.236f)
                lineToRelative(1.795f, 0.897f)
                curveToRelative(1.12f, 0.56f, 2.07f, 0.603f, 2.741f, 0.004f)
                curveToRelative(0.605f, -0.54f, 0.798f, -1.463f, 0.838f, -2.33f)
                curveToRelative(0.042f, -0.902f, -0.076f, -1.902f, -0.24f, -2.759f)
                curveToRelative(-0.164f, -0.852f, -0.38f, -1.606f, -0.558f, -2.012f)
                curveToRelative(-0.232f, -0.533f, -0.843f, -1.571f, -1.579f, -2.479f)
                curveToRelative(-0.37f, -0.456f, -0.785f, -0.897f, -1.216f, -1.229f)
                curveTo(11.743f, 3.27f, 11.244f, 3f, 10.72f, 3f)
                curveTo(9.77f, 3f, 9f, 3.77f, 9f, 4.72f)
                verticalLineTo(7.1f)
                lineToRelative(-0.5f, -0.357f)
                close()
            }
        }.build()
        
        return _Lungs!!
    }

private var _Lungs: ImageVector? = null

