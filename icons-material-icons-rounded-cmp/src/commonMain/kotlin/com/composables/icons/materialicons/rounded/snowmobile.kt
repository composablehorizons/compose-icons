package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Snowmobile: ImageVector
    get() {
        if (_Snowmobile != null) return _Snowmobile!!
        
        _Snowmobile = ImageVector.Builder(
            name = "snowmobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.25f)
                lineToRelative(1.45f, 1.3f)
                lineTo(11f, 11f)
                lineToRelative(-9.12f, -0.96f)
                curveTo(0.88f, 9.93f, 0f, 10.72f, 0f, 11.73f)
                curveToRelative(0f, 0.75f, 0.49f, 1.41f, 1.21f, 1.63f)
                lineToRelative(3.33f, 1f)
                lineToRelative(-3.49f, 1.88f)
                curveTo(-0.77f, 17.22f, -0.07f, 20f, 2f, 20f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(4f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(1.13f, 0f, 2.11f, -0.62f, 2.63f, -1.55f)
                curveToRelative(0.36f, -0.65f, -0.15f, -1.45f, -0.9f, -1.45f)
                curveToRelative(-0.34f, 0f, -0.68f, 0.16f, -0.84f, 0.47f)
                curveTo(21.72f, 17.78f, 21.38f, 18f, 21f, 18f)
                horizontalLineToRelative(-0.17f)
                lineToRelative(-2.2f, -2.2f)
                curveTo(20.58f, 15.37f, 22f, 14.4f, 22f, 13f)
                curveToRelative(0f, -0.89f, -7.72f, -7.75f, -7.72f, -7.75f)
                curveTo(14.1f, 5.09f, 13.87f, 5f, 13.62f, 5f)
                horizontalLineTo(12f)
                curveTo(11.45f, 5f, 11f, 5.45f, 11f, 6f)
                close()
                moveTo(8f, 18f)
                horizontalLineTo(2f)
                lineToRelative(5.25f, -2.83f)
                lineTo(10f, 16f)
                curveTo(10f, 17.1f, 9.11f, 18f, 8f, 18f)
                close()
            }
        }.build()
        
        return _Snowmobile!!
    }

private var _Snowmobile: ImageVector? = null

